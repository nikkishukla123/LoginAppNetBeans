import java.util.HashMap;

public class authorisation {
    HashMap<String, String> loginInfo = new HashMap<String, String>();
    
    authorisation() {
        loginInfo.put("123","123");
    }

    protected HashMap getLoginInfo() {
        return loginInfo;
    }
}
