package javaEx06.collection;

import java.util.HashMap;

public class LoginController {

    LoginDAO loginDAO = new LoginDAO();

    public boolean loginCheck(String id, String passwd){

        HashMap<String, String> map = new HashMap<>();
        map.put(LoginDAO.KEY_ID, id);
        map.put(LoginDAO.KEY_PW, passwd);

        // DAO에게 HashMap 전달: DAO의 메서드 호출하면서 인자로 전달
        return loginDAO.loginCheck(map);

    }
}
