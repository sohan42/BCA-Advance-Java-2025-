//Model
package MVC;

public class User {
    private String un;
    private String ps;
    
    User(String username, String password){
        this.un = username;
        this.ps = password;
    }
    public String getUsername(){
        return un;
    }
    public String getPassword(){
        return ps;
    }
    public boolean validate(){
        return un.equals("admin") && ps.equals("password");
    }
}
