
package MODELO;


public class Viajes {
        private String terminalSalida;
        private String terminalLlegada;
        private String fechaSalida;
        private String fechaLlegada;
        private String distancia;
        private int AsientosDispo;
        private double Precio;
        private byte [] img;

    public Viajes( String terminalSalida, String terminalLlegada, String fechaSalida, String fechaLlegada, String distancia, int AsientosDispo, double Precio, byte[] img) {
                 this.terminalSalida = terminalSalida;
                 this.terminalLlegada = terminalLlegada;
                 this.fechaSalida = fechaSalida;
                 this.fechaLlegada = fechaLlegada;
                 this.distancia = distancia;
                 this.AsientosDispo = AsientosDispo;
                 this.Precio = Precio;
                 this.img = img;
    }
        
        
        
    public String getTerminalSalida() {
        return terminalSalida;
    }

    public void setTerminalSalida(String terminalSalida) {
        this.terminalSalida = terminalSalida;
    }

    public String getTerminalLlegada() {
        return terminalLlegada;
    }

    public void setTerminalLlegada(String terminalLlegada) {
        this.terminalLlegada = terminalLlegada;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(String fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public String getDistancia() {
        return distancia;
    }

    public void setDistancia(String distancia) {
        this.distancia = distancia;
    }

    public int getAsientosDispo() {
        return AsientosDispo;
    }

    public void setAsientosDispo(int AsientosDispo) {
        this.AsientosDispo = AsientosDispo;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }
    
    public boolean ConAtributosVacios() {
    return !(terminalSalida != null && !terminalSalida.isBlank())
                || !(terminalLlegada != null && !terminalLlegada.isBlank())
                || !(fechaSalida != null && !fechaSalida.isBlank())
                || !(distancia != null && !distancia.isBlank())
                || !(Precio != 0.00)
                || !(img != null );
                }
        
        
}
