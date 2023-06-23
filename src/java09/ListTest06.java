package java09;

import java.util.ArrayList;

public class ListTest06 {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("apple");
		arr.add("grape");
		
		ArrayList<? extends Object> objlist;
		objlist = arr;
		System.out.println(objlist);
		for(Object obj : objlist) {
			String Arr = (String)obj;
			System.out.println(Arr.toUpperCase());
		}
	}

}
