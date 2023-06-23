package java09;

import java.util.ArrayList;

/*  java collection generics
 * 1. 컬렉션은 복수개의 자료형 값이 동시 저장되다 보니 자료의 안정성도 떨어진다. 
 *    저장되는 값도 모두 자바 최상위 부모클래스인 object 타입으로
 *    업캐스팅이 되어져서 저장된다. 그러다 보니 불필요한 업캐스팅과 다운캐스팅
 *    레퍼런스간의 형변환이 발생해서 프로그램 실행속도를 저하시키는 원인이 된다
 * 
 * 2. 제네릭을 지정하지 않으면 원하는 자료형 값 추출도 어렵다
 * 
 */
public class ListTest02 {

	public static void main(String[] args) {
		ArrayList<String> cityList = new ArrayList<String>();
		cityList.add("seoul");
		cityList.add("busan");
		cityList.add("suwon");
		System.out.println("도시 개수"+cityList.size());
		for(int i =0 ; i<cityList.size(); i++) {
			String result =cityList.get(i);
			System.out.println("도시 이름 :"+result.toUpperCase());
		}
	}

}
