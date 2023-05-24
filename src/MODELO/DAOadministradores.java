
package MODELO;

import java.sql.*;



public class DAOadministradores extends Conexion{
    
    public boolean registrar(Administrador admin){
         PreparedStatement ps=null;
         Connection con =getConnection();
         try{
                  ps=con.prepareStatement("INSERT INTO Administradores(admin_dni, admin_nombre,admin_apellido_paterno,admin_apellido_materno,admin_correo,admin_contraseña) VALUES(?,?,?,?,?,?)");
                  ps.setString(1,admin.getDni());
                  ps.setString(2,admin.getNombre());
                  ps.setString(3,admin.getApellidoPaterno());
                  ps.setString(4,admin.getApellidoMaterno());
                  ps.setString(5, admin.getCorreo());
                  ps.setString(6, admin.getContraseña());
                  ps.execute();
                  return true;
         }catch(SQLException ex){
                  System.out.println(ex);
                  return false;
         }finally{
                 try {
                           con.close();
                  } catch (SQLException ex) {
                           System.out.println(ex);
                  }
         }
        
    }
    
    public boolean Modificar(Administrador usuario){
            return true;
    }
    
    public boolean Eliminar(Administrador usuario){
            return true;
    }
    
}
