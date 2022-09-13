package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionSample {
	public void list() {
		ArrayList al= new ArrayList();//non generic
		al.add(10);
		al.add("Nimmy");
		al.add(10.0f);
		System.out.println(al);
		
		al.remove(1);
		System.out.println(al);
		
		ArrayList<String> al2= new ArrayList<String>();//generic
		al2.add("Nimmy");
		al2.add("Neena");
		al2.add("Riya");
		al2.add("Aathira");
	
		//al2.add(10);
		System.out.println(al2);
		
		ArrayList<String> al3= new ArrayList<String>();
		al3.addAll(al2);
		System.out.println(al3);
		al2.removeAll(al2);
		System.out.println(al2);
		
		
		System.out.println("Size of al3  " + al3.size());
		
		System.out.println(al3.get(2));
		boolean b=al3.contains("nnn");
		System.out.println(b);
		
		Iterator itr=al3.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		itr.remove();
		System.out.println(al3);
		}

	public static void main(String[] args) {
		
		CollectionSample obj= new CollectionSample();
	obj.list();	
	}

}
