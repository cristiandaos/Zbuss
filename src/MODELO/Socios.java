
package MODELO;


public class Socios {
         private String dni;
         private String nombre;
         private String apellidoPaterno;
         private String apellidoMaterno;
         private String correo;
         private String nacimiento;
         private String numero;
         private String contraseña;
         private  int puntos;

    public Socios(String dni, String nombre, String apellidoPaterno, String apellidoMaterno, String correo, String nacimiento, String numero, String contraseña, int puntos) {
         this.dni = dni;
         this.nombre = nombre;
         this.apellidoPaterno = apellidoPaterno;
         this.apellidoMaterno = apellidoMaterno;
         this.correo = correo;
         this.nacimiento = nacimiento;
         this.numero = numero;
         this.contraseña = contraseña;
         this.puntos = puntos;
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

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    
         
}
