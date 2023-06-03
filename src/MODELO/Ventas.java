/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;


public class Ventas {
    private String ruc;
    private String fecha;
    private String hora;
    private int viajeId;
    private String pasajeroPrinId;
    private int numAsientos;
    private String asientos;
    private double ganancia;

    public Ventas(String ruc, String fecha, String hora, int viajeId, String pasajeroPrinId, int numAsientos, String asientos, double ganancia) {
        this.ruc = ruc;
        this.fecha = fecha;
        this.hora = hora;
        this.viajeId = viajeId;
        this.pasajeroPrinId = pasajeroPrinId;
        this.numAsientos = numAsientos;
        this.asientos = asientos;
        this.ganancia = ganancia;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
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

    public int getViajeId() {
        return viajeId;
    }

    public void setViajeId(int viajeId) {
        this.viajeId = viajeId;
    }

    public String getPasajeroPrinId() {
        return pasajeroPrinId;
    }

    public void setPasajeroPrinId(String pasajeroPrinId) {
        this.pasajeroPrinId = pasajeroPrinId;
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
                  return !(ruc != null && !ruc.isEmpty())
                           || !(fecha != null && !fecha.isEmpty())
                           || !(hora != null && !hora.isEmpty())
                           || !(viajeId != 0)
                           || !(pasajeroPrinId != null && !pasajeroPrinId.isEmpty())
                           || !(numAsientos != 0)
                           || !(asientos != null && !asientos.isEmpty())
                           || !(ganancia != 0);
    

    }
}
   
