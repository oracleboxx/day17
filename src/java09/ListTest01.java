package java09;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

/* java.util 패키지의 map컬렉션 인터페이스를 구현한 컬렉션 클래스 hashtable의 특징
 * 1.키 ,값 쌍으로 저장하는 사전적인 자료구조이다
 * 2.키를 통해서 값을 저장하기 떄문에 검색속도가 빠르다.
 * 3.저장되는 순서 유지하지 않는다.
 * 
 */
public class ListTest01 {

	public static void main(String[] args) {
		Hashtable ht =new Hashtable();
		ht.put("apple","사과");
		ht.put("banana","바나나");
		ht.put("grape","포도");
		String val= (String) ht.get("grape");
		if(val != null) {
			System.out.println("grape:"+val);
		}
		Enumeration<String> enum2 =ht.keys();
		while(enum2.hasMoreElements()) {
			Object k=enum2.nextElement();
			Object v=ht.get(k);
			System.out.println(k+":"+v);

		}
	}

}
