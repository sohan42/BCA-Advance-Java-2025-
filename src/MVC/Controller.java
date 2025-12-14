//Controller
package MVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    private User user;
    private View view;
    
    Controller(User u, View v){
        this.user = u;
        this.view = v;
        this.view.getLoginButton().addActionListener(new LoginButtonListener());
    }

    class LoginButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            user = new User(view.getUsername(),view.getPassword());
            if(user.validate()){
                view.setMessage("Login Successful!");
            }
            else{
                view.setMessage("Invalid Username or Password!");
            }
        }
    }  
}
