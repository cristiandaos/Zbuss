
package CONTROLADOR;

import VISTA.*;
public class Main {


    public static void main(String[] args) {
        Login login=new Login();
        CTRL_Login ctrl_login=new CTRL_Login(login);
        ctrl_login.Iniciar();
    }
    
}
