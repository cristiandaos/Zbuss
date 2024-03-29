
package MODELO;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Acompañantes {
    private String dni;
    private PasajeroPrincipal pasajeroPrincipal;
    private int viajeId;
    private String nombre;
    private String apePaterno;
    private String apeMaterno;
    private int edad;
    private String asiento;

    public Acompañantes(String dni, PasajeroPrincipal pasajeroPrincipal, int viajeId, String nombre, String apePaterno, String apeMaterno, int edad, String asiento) {
        this.dni = dni;
        this.pasajeroPrincipal = pasajeroPrincipal;
        this.viajeId = viajeId;
        this.nombre = nombre;
        this.apePaterno = apePaterno;
        this.apeMaterno = apeMaterno;
        this.edad = edad;
        this.asiento = asiento;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public PasajeroPrincipal getPasajeroPrincipal() {
        return pasajeroPrincipal;
    }

    public void setPasajeroPrincipal(PasajeroPrincipal pasajeroPrincipal) {
        this.pasajeroPrincipal = pasajeroPrincipal;
    }



    public int getViajeId() {
        return viajeId;
    }

    public void setViajeId(int viajeId) {
        this.viajeId = viajeId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApePaterno() {
        return apePaterno;
    }

    public void setApePaterno(String apePaterno) {
        this.apePaterno = apePaterno;
    }

    public String getApeMaterno() {
        return apeMaterno;
    }

    public void setApeMaterno(String apeMaterno) {
        this.apeMaterno = apeMaterno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }
    
    public boolean igualDNI(){
         if (getDni().equals(pasajeroPrincipal.getDni())) {
                return true;
         }
         return false;
    }
    
         public boolean ConAtributosVacios() {
                  return !(nombre != null && !nombre.isEmpty())
                           || !(apePaterno != null && !apePaterno.isEmpty())
                           || !(apeMaterno != null && !apeMaterno.isEmpty())
                           || !(pasajeroPrincipal != null )
                           || !(dni != null && !dni.isEmpty())
                           || !(asiento != null && !asiento.isEmpty())
                           || !(edad != 0)
                           || !(viajeId != 0);
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
