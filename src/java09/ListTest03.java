package java09;
/* 자바의 컬렉션 자료구조에 제네릭(지네릭스) 문법을 적용
 *  형식)
 *  List<String> nameList= new ArrayList<String>();
 *  <String>이 제네릭 타입이다. 즉 문자열 값만 저장 가능하다.
 *  3.제네릭 타입을 지정하면 불필요한 업캐스팅, 다운캐스팅을 안해서 프로그램 
 *    실행속도가 향상된다. 그리공 원하는 자료 추출도 쉬워져서 자료의 안정성도 보장
 *    
 */

import java.util.ArrayList;

public class ListTest03 {

	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<String>();
		nameList.add("HONG"); // ADD() 메서드로 원소값을 추가
		nameList.add("PACK");
		nameList.add("LEE");
		for(int i =0 ; i<nameList.size(); i++) {
			String	result = nameList.get(i);
			System.out.println(result.toLowerCase());
			
		}
	}

}
