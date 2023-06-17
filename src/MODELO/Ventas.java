
package MODELO;


public class Ventas {
    private String fecha;
    private String hora;
    private Viajes viaje;
    private PasajeroPrincipal pasajeroPrincipal;
    private int numAsientos;
    private String asientos;
    private double ganancia;

    public Ventas( String fecha, String hora, Viajes viaje, PasajeroPrincipal pasajeroPrincipal, int numAsientos, String asientos, double ganancia) {
        this.fecha = fecha;
        this.hora = hora;
        this.viaje = viaje;
        this.pasajeroPrincipal = pasajeroPrincipal;
        this.numAsientos = numAsientos;
        this.asientos = asientos;
        this.ganancia = ganancia;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Viajes getViaje() {
        return viaje;
    }

    public void setViaje(Viajes viaje) {
        this.viaje = viaje;
    }

    public PasajeroPrincipal getPasajeroPrincipal() {
        return pasajeroPrincipal;
    }

    public void setPasajeroPrincipal(PasajeroPrincipal pasajeroPrincipal) {
        this.pasajeroPrincipal = pasajeroPrincipal;
    }

    

    public int getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(int numAsientos) {
        this.numAsientos = numAsientos;
    }

    public String getAsientos() {
        return asientos;
    }

    public void setAsientos(String asientos) {
        this.asientos = asientos;
    }

    public double getGanancia() {
        return ganancia;
    }

    public void setGanancia(double ganancia) {
        this.ganancia = ganancia;
    }
    
    public boolean ConAtributosVacios() {
                  return !(fecha != null && !fecha.isEmpty())
                           || !(hora != null && !hora.isEmpty())
                           || !(viaje!= null)
                           || !(pasajeroPrincipal != null )
                           || !(numAsientos != 0)
                           || !(asientos != null && !asientos.isEmpty())
                           || !(ganancia != 0);
    

    }
}
   
