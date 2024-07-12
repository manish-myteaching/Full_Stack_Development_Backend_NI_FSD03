package linkedlist;

import java.util.LinkedList;
import java.util.List;

public class LinkedDemo {

	public static void main(String[] args) {
		List list = new LinkedList();
		list.add(12);  //Auto boxing and upcasting 
		list.add(14);
		list.add(48);
		list.add(12);
		list.add(44);
		list.add(33);
		list.add(44);
		list.add(120);
		System.out.println(list);
		
		list.add(121);
		System.out.println(list);

	}

}
