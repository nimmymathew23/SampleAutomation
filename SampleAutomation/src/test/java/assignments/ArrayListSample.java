package assignments;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListSample{
	ArrayList<String> al=new ArrayList<String>();
	public void createArrayList() {
		
		al.add("White");
		al.add("Black");
		al.add("Red");
		al.add("Green");
		al.add("Blue");
		System.out.println(al);
	}
	
	public void retrieveElement() {
	System.out.println(al.get(4));
	}
	
	public void iteration() {
		Iterator it= al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
	
	public void removeElement() {
		System.out.println("The removed element is  "+ al.remove(2));
	}
	
	
	public void searchElement() {
		System.out.println(al.contains("Red"));
	}
	
	public static void main(String[] args) {
		ArrayListSample obj= new ArrayListSample();
		obj.createArrayList();
		obj.retrieveElement();
		obj.iteration();
		obj.removeElement();
		obj.searchElement();
		

	}

}
