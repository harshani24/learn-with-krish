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
   
   
   public void addFirst(T data) {              //newLink is always first(The very first inserted one is last in the list)
	   Link<T> newLink = new Link<T>(data);
	   
	   if(first == null) {
		   first =newLink;
	   }
	   else {
		   newLink.next = first;               
		   first = newLink;
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
    
   public void reverse1()
   {
	    Link<T> previous = null;
		Link<T> current = first;
		Link<T> next = first.next;
		
		while(current != null){
			next = current.next;
			
			first = current;
			first.next = previous;     
			previous = current;
			
			current = next;            
	    }
		
		System.out.println("Reversed LinkList using method1: ");
		display();
    }
   
   public void reverse2()
   {
	    Link<T> previous = null;
		Link<T> current = first;
		Link<T> next = first.next;
		
		while(current != null){
			next = current.next;
			
			current.next = previous;     
			previous = current;
			
			current = next;            //go one by one through list first to end.set the current next as previous current.-->Ex: current =75, current.next = 65 and the set 75 as previous
		}
		first = previous;
		
		System.out.println("Reversed LinkList using method2: ");
		display();
    }
	

   
	public Link<T> deleteFirst()
	{
		 Link<T> temp = first;
		 first = first.next;
		  
		 return temp;
	}

}
