
package MODELO;

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
    
    
}
