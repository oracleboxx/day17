package java09;

import java.util.ArrayList;
import java.util.ListIterator;

/*  java.util 패키지의 ListIterator 인터페이스 특징)
 *  1.java.util 패키지의 Iterator interface를 상속 받아서 기능을 향상 시킨 인터페이스다.
 *  2.컬렉션의 원소에 접근할 떄 Iterator는 한쪽 방향 즉 다음 방향으로만 이동이 가능한 것에 비해 
 *    ListIterator는 양방향으로 가능하다
 *  하지만 java.util패키지의 컬렉션 list인터페이스를 구현 상속받은 자손에서만 사용이 가능하다라는 특징이 있다
 *  3. 이 인터페이스도 컬렉션에 저장된 복수개의 원소값을 쉽게 읽어노는 용도로 활용된다.
 */
public class ListTest09 {

	

		public static void main(String[] args) {
	        ArrayList<Integer> arr_list = new ArrayList<>();
	        arr_list.add(1);
	        arr_list.add(2);
	        arr_list.add(3);
	        arr_list.add(4);
	 
	        // ListIterator
	        ListIterator<Integer> it = arr_list.listIterator();
	        	while(it.hasNext()) {
	        		
	        	        System.out.println(it.next()+ " ");
	        	}
	        		while(it.hasPrevious()) {
	        			System.out.println(it.previous()+" ");
	        		}

	        
	        
	
	        
	        
	 
	        System.out.println();
	        System.out.println(arr_list);
	        	
	    }
	}

