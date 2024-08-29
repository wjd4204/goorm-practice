package javaEx06.collection;

import java.util.Scanner;

public class LoginMain {

    public static void main(String[] args) {
        LoginController controller = new LoginController();
        Scanner sc = new Scanner(System.in);
        String id, passwd;
        boolean result;

        while(true){
            System.out.print("아이디 입력: ");
            id = sc.nextLine();
            System.out.print("패스워드 입력: ");
            passwd = sc.nextLine();

            result = controller.loginCheck(id, passwd);
            if(result){
                System.out.println("LoginMain: 로그인 성공");
                System.out.println("프로그램 종료");
                break;
            } else{
                System.out.println("LoginMain: 로그인 실피");
                System.out.println();
                System.out.println("다시 입력하세요-------");
            }
        }
        sc.close();

    }
}
