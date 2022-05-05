import java.util.Scanner;
class Linkedlist1{
	static Node head;
	static class Node{
		int data;
		Node next;
		Node (int d)
		{
			this.data =d;
			next =null;
			
		}
	}
	Node reverse(Node node)
	{
		Node prev =null;
		Node current =node;
		Node next =null;
		while(current != null){
			next = current.next;
			current.next = prev;
			prev = current ;
			current = next;
		}
		node = prev;
		return node;
		
	}
	void printList(Node node2)
	{
		while(node2!=null){
			System.out.print(node2.data+ " ");
            node2 =node2.next;					
		}
	}
	public static void main(String[]args)
	{
	
		Linkedlist1 list = new Linkedlist1();
		Scanner sc = new Scanner(System.in);
		int testNo = sc.nextInt();
		int arraySize = sc.nextInt();
		int element1 = sc.nextInt();
		int element2 = sc.nextInt();
		int element3 = sc.nextInt();
		int element4 = sc.nextInt();
		int element5 = sc.nextInt();
		
		list.head = new Node(element1);
		list.head.next=new Node (element2);
		list.head.next.next=new Node(element3);
		list.head.next.next.next=new Node(element4);
		list.head.next.next.next.next=new Node(element5);

		System.out.println("Given link list");
		//list.printList(head);
		head = list.reverse(head);
		System.out.println("Reversed linked list");
		list.printList(head);
		
	}
}