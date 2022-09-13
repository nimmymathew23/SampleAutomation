package listcollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListSample {
	
	public void list() {
		List<Integer> li = new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		System.out.println(li);
		System.out.println(li.size());
		
		
		li.remove(3);
		System.out.println(li);
		System.out.println(li.size());
		
		
		List<Integer> li2= new ArrayList<Integer>();
		li2.addAll(li);
		System.out.println(li2);
		
		li2.add(40);
		li2.add(50);
		
		Iterator itr=li2.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		ListSample obj=new ListSample();
		obj.list();
	}

}
