public class ReverseLinkListDemo {

	public static void main(String[] args) {
		
		LinkList<Integer> list1 = new LinkList<>();
		LinkList<Integer> list2 = new LinkList<>();
		
		list1.add(5);
		list1.add(15);
		list1.add(25);
		list1.add(35);
		list1.add(45);
		list1.add(55);
		list1.add(65);
		list1.add(75);
		
		System.out.println("------------------------------Using First method-------------------------------\n");
		System.out.println("Original LinkList: ");
		list1.display();
		
		System.out.println("\n");
		list1.reverse1();
		
		System.out.println();

		
		System.out.println("------------------------------Using second method-------------------------------\n");
		list2.add(74);
		list2.add(14);
		list2.add(54);
		list2.add(34);
		list2.add(89);
		list2.add(52);
		list2.add(78);
		list2.add(69);
		
		System.out.println("Original LinkList: ");
		list2.display();
		
		System.out.println("\n");
		list2.reverse2();

	}

}
