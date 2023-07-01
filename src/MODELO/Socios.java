
package MODELO;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


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
        return dni; //get ->obtenr el atributo del objeto
    }

    public void setDni(String dni) {
        this.dni = dni; //set -> modificar
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
    
   
    //calcula la edad mediante el dato de nacimiento
    public int calcularEdad(){
         LocalDate fechaActual = LocalDate.now();
         DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
         LocalDate fechaNac = LocalDate.parse(nacimiento, formato);
         Period periodo = Period.between(fechaNac, fechaActual);
         return periodo.getYears();
    }
    
    public void  AcumularPuntos(double gasto){
             int pts=(int) (gasto*0.05);
             int ptsActualizados=puntos+pts;
             setPuntos(ptsActualizados);
    }
    
    //retorna true si algun atributo es una cadena vacia o un null
         public boolean ConAtributosVacios() {
                  return !(nombre != null && !nombre.isEmpty())
                           || !(apellidoPaterno != null && !apellidoPaterno.isEmpty())
                           || !(apellidoMaterno != null && !apellidoMaterno.isEmpty())
                           || !(correo != null && !correo.isEmpty())
                           || !(nacimiento != null && !nacimiento.isEmpty())
                           || !(numero != null && !numero.isEmpty())
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
         
         public boolean NumeroValido(){
                  String patron="[0-9]+$";
                  Pattern pattern=Pattern.compile(patron);
                  Matcher matcher=pattern.matcher(numero);
                  if (numero.length()==9 & matcher.matches()) {
                           return true;
                  }
                  return false;
         }
         
         public boolean FNacValido(){
                  LocalDate fechaActual = LocalDate.now();
                  
                  DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                  LocalDate fechaNac = LocalDate.parse(nacimiento, formato);
                  
                  Period edad = Period.between(fechaNac, fechaActual);
                  
                  return edad.getYears()>=18 && edad.getYears()<=100;
         }
         
    
         
}
