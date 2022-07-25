package Plaindrome;
public class ReverseLinkListDemo {

	public static void main(String[] args) {
		
		LinkList<Integer> list1 = new LinkList<>();
		LinkList<Integer> list2 = new LinkList<>();
		LinkList<String> list3 = new LinkList<>();
		
		list1.add(5);
		list1.add(15);
		list1.add(25);
		list1.add(35);
		list1.add(45);
		list1.add(55);
		list1.add(65);
		list1.add(75);
		
		System.out.println("--------------------------------------------------------");
		System.out.println("LinkList1: ");
		list1.display();
		
		System.out.println("\n");
		list1.isPalindrome();
		
		System.out.println();

		
		System.out.println("--------------------------------------------------------");
		list2.add(10);
		list2.add(20);
		list2.add(30);
		list2.add(50);
		list2.add(50);
		list2.add(30);
		list2.add(20);
		list2.add(10);

		
		System.out.println("LinkList2: ");
		list2.display();
		
		System.out.println("\n");
		list2.isPalindrome();
		
	    System.out.println();

		
		System.out.println("--------------------------------------------------------");
		list3.add("A");
		list3.add("B");
		list3.add("C");
		list3.add("E");
		list3.add("C");
		list3.add("B");
		list3.add("A");

		
		System.out.println("LinkList3: ");
		list3.display();
		
		System.out.println("\n");
		list3.isPalindrome();

	}

}
