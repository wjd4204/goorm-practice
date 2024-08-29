package javaEx06.collection;

import java.util.HashMap;

public class LoginDAO {

    public static final String KEY_ID = "id";
    public static final String KEY_PW = "passwd";

    private String memId;
    private String memPasswd;

    public LoginDAO() {
        memId = "abcd";
        memPasswd = "1234";
    }

    public boolean loginCheck(HashMap<String, String> map){
        if(map.get(KEY_ID).equals(memId) && map.get(KEY_PW).equals(memPasswd)){
            System.out.println("LoginDAO: 아이디와 패스워드가 일치합니다.");
            return true;
        }
        else {
            System.out.println("LoginDAO: 아이다와 패스워드가 불일치합니다.");
            return false;
        }
    }
}
