package Plaindrome;
public class LinkList<T> {
   private Link<T> first;
   private Link<T> last; 
   
   public LinkList() {
	   first = null;
	   last = null;
   }
   
   public void add(T data) {                   //add to the end (The very first inserted one is first in the list)
	   Link<T> newLink = new Link<T>(data);
	   
       if(first == null) {
    	   first = newLink;                      //very first link is our first and last
    	   last = newLink;
       }
       else {
    	   last.next = newLink;                  //1.add each and every last's next
    	   last = newLink;                       //2.Then add the newLink as last one   
       }  
       
   }
   
   
   public void display()
   {
	   Link<T> current = first;
	   
	   while(current != null){		   
		   System.out.print(current.data+ " ");
		   current = current.next;
		   
	   }
   }
    
   public Link<T> reverse(Link<T> r)
   {	    
	    Link<T> previous = null;
		Link<T> current = r;
		Link<T> next = r.next;
		
		while(current != null){
			next = current.next;
			
			r = current;
			r.next = previous;     
			previous = current;
			
			current = next;            
	    }
		
		return r;

    }


	public boolean isPalindrome() {
		
	Link<T> linkList = first;
	Link<T> reverseList =first;
	
	reverseList = reverse(reverseList);
	
	while(linkList != null) {
		
		if( linkList.data != reverseList.data) {
			System.out.println("This is not a Palindrome");
			return false;
		}
		
		linkList = linkList.next;
		reverseList = reverseList.next;
	}
	System.out.println("This is a Palindrome");
	return true;    
	}

}
