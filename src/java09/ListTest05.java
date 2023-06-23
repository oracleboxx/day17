package java09;
/* 제네릭 클래스 설계
 * 
 * 
 */
class GenericClass<T>{ // 가상의 제네릭 t타입 
	private T member;

	public T getMember() {
		return member;
	}

	public void setMember(T member) {
		this.member = member;
	}
	
}
public class ListTest05 {

	public static void main(String[] args) {
		GenericClass<String> g =new GenericClass<>();// 제네릭 타입에 기본 타입은 안됨
		//타입은 자료형을 의한다.
		g.setMember("ㅋ");
		System.out.println(g.getMember());
	}

}
