package java09;

import java.util.HashMap;

/* java.util패키지의 컬렉션 Map인터페이스를 구현 상속한 HashMap컬렉션 클래스 특징
 * 1.키,값 쌍으로 저장하는 사전적인 컬렉션 자료구조이다.
 * 2.저장되는 순서를 보장하지 않는다. 키를 통해서 값을 검색해서 검색 속도가 빠르다.
 * 
 * 
 * 
 */
public class ListTest04 {

	public static void main(String[] args) {
		HashMap<String,Integer> m = new HashMap<String,Integer>();
		String[] sample = {"to","be","or","not","to","be","is","a","problem"};
		for(String a : sample) {
			Integer freg = m.get(a);
			m.put(a,(freg == null)?1:freg+1);
			System.out.println(m.size()+"단어가 있습니다");
			System.out.println(m.containsKey("to"));
			System.out.println(m.isEmpty());
			System.out.println(m.keySet());
			System.out.println(m.values());
		}
	
		

	}

}
