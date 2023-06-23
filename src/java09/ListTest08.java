package java09;

import java.util.Arrays;
import java.util.List;

/* 제네릭 타입간의 형변화 세번째 와일드 카드
 * <?> : 모든 객체 타입 배치 가능
 * 
 */
class MyList{
	public static void printList(List<?> list) {
		for(Object obj:list) {
			System.out.println(""+obj);
		}
	}
}
public class ListTest08 {

	public static void main(String[] args) {
		List<Double> li = Arrays.asList(2.2,3.3);
		List<Boolean> li2 = Arrays.asList(true,false);
		MyList.printList(li);
		MyList.printList(li2);
		
	}

}
