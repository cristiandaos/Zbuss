
package CONTROLADOR;

import VISTA.*;
public class Main {


    public static void main(String[] args) {
        Login login=new Login();
        Interfaz_Principal principal=new Interfaz_Principal();
        CTRL_InterfazPrincipal ctrl_Principal=new CTRL_InterfazPrincipal(principal);
        CTRL_Login ctrl_login=new CTRL_Login(login,ctrl_Principal);
        ctrl_login.Iniciar();
    }
    
}
