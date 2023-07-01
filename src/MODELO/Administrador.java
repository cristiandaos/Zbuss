
package MODELO;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Administrador {
    private String dni;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String correo;
    private String contraseña;

    public Administrador(String dni, String nombre, String apellidoPaterno, String apellidoMaterno, String correo, String contraseña) {
         this.dni = dni;
         this.nombre = nombre;
         this.apellidoPaterno = apellidoPaterno;
         this.apellidoMaterno = apellidoMaterno;
         this.correo = correo;
         this.contraseña = contraseña;
    }

         public String getDni() {
                  return dni;
         }

         public void setDni(String dni) {
                  this.dni = dni;
         }

         public String getNombre() {
                  return nombre;
         }

         public void setNombre(String nombre) {
                 this.nombre = nombre;
         }

         public String getApellidoPaterno() {
                 return apellidoPaterno;
         }

         public void setApellidoPaterno(String apellidoPaterno) {
                 this.apellidoPaterno = apellidoPaterno;
         }

            public String getApellidoMaterno() {
                 return apellidoMaterno;
            }

         public void setApellidoMaterno(String apellidoMaterno) {
                 this.apellidoMaterno = apellidoMaterno;
         }

         public String getCorreo() {
                 return correo;
         }

         public void setCorreo(String correo) {
                 this.correo = correo;
         }

        public String getContraseña() {
                  return contraseña;
         }

         public void setContraseña(String contraseña) {
                  this.contraseña = contraseña;
         }
         public boolean ConAtributosVacios() {
                  return !(nombre != null && !nombre.isEmpty())
                           || !(apellidoPaterno != null && !apellidoPaterno.isEmpty())
                           || !(apellidoMaterno != null && !apellidoMaterno.isEmpty())
                           || !(correo != null && !correo.isEmpty())
                           || !(contraseña != null && !contraseña.isEmpty());
         }
         
         public boolean CorreoValido(){
                  if (correo.indexOf('@') != correo.lastIndexOf('@')) {
                           return false;
                  }
                  int punto = correo.lastIndexOf('.');
                  return punto > correo.indexOf('@') + 1 && punto < correo.length() - 1;
         }
         
         public boolean dniValido(){
                  String patron="[0-9]+$";
                  Pattern pattern=Pattern.compile(patron);
                  Matcher matcher=pattern.matcher(dni);
                  if (dni.length()==8 & matcher.matches()) {
                           return true;
                  }
                  return false;
         }
    
}
