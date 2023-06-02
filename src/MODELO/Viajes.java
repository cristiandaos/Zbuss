
package MODELO;


public class Viajes {
        private int id;
        private String terminalSalida;
        private String terminalLlegada;
        private String fechaSalida;
        private String fechaLlegada;
        private String horaSalida;
        private String horaLlegada;
        private String distancia;
        private int AsientosDispo;
        private double Precio;
        private byte [] img;

    public Viajes(int id,String terminalSalida, String terminalLlegada, String fechaSalida, String fechaLlegada, String horaSalida, String horaLlegada, String distancia, int AsientosDispo, double Precio, byte[] img) {
                this.id=id;
                this.terminalSalida = terminalSalida;
                this.terminalLlegada = terminalLlegada;
                this.fechaSalida = fechaSalida;
                this.fechaLlegada = fechaLlegada;
                this.horaSalida = horaSalida;
                this.horaLlegada = horaLlegada;
                this.distancia = distancia;
                this.AsientosDispo = AsientosDispo;
                this.Precio = Precio;
                this.img = img;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(String horaLlegada) {
        this.horaLlegada = horaLlegada;
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
                            || !(horaSalida != null && !horaLlegada.isBlank())
                            || !(distancia != null && !distancia.isBlank())
                            || !(Precio != 0.00)
                            || !(img != null );
         }
        
        
}
