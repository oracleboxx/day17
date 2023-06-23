package java09;

import java.util.Scanner;

class Login{
	int id;
	String pwd;
	String name;
	public void Login() {
		
	}
public void Login(int id , String pwd,String name) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
	}
}



public class TryCatch_1 {

	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		   try {
			   String login_id= null;
			   String login_pwd= null;
			   System.out.println("아이디 입력");
			   login_id = scan.next();
			   if(login_id.equals("Lee")) {
				   System.out.println("비밀번호 입력:");
				   login_pwd = scan.next();
				   System.out.println("로그인 성공");
			   }
			   else {
				   throw new Exception("아이디 혹은 패스워드가 틀렸다");
			   }
			 
			   
	        } catch (Exception e) {
	        	System.out.println("Error Message");
	            
	            
	        }
	}

}
