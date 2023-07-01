
package MODELO;


public class Viajes {
    private int Id;
        private int terminalSalida;
        private int terminalLlegada;
        private String T_salida;
        private String T_llegada;
        private String fechaSalida;
        private String fechaLlegada;
        private String horaSalida;
        private String horaLlegada;
        private String duracion;
        private String distancia;
        private int AsientosDispo;
        private double Precio;
        private byte [] img;

        public Viajes(int terminalSalida, int terminalLlegada, String fechaSalida, String fechaLlegada, String horaSalida, String horaLlegada,String duracion, String distancia, int AsientosDispo, double Precio, byte[] img) {
                this.terminalSalida = terminalSalida;
                this.terminalLlegada = terminalLlegada;
                this.fechaSalida = fechaSalida;
                this.fechaLlegada = fechaLlegada;
                this.horaSalida = horaSalida;
                this.horaLlegada = horaLlegada;
                this.duracion=duracion;
                this.distancia = distancia;
                this.AsientosDispo = AsientosDispo;
                this.Precio = Precio;
                this.img = img;
        }
        
        public Viajes(int ID,String  T_salida, String T_llegada, String fechaSalida, String fechaLlegada, String horaSalida, String horaLlegada, String distancia, int AsientosDispo, double Precio, byte[] img) {
                this.Id=ID;
                this.T_salida=T_salida;
                this.T_llegada=T_llegada;
                this.fechaSalida = fechaSalida;
                this.fechaLlegada = fechaLlegada;
                this.horaSalida = horaSalida;
                this.horaLlegada = horaLlegada;
                this.distancia = distancia;
                this.AsientosDispo = AsientosDispo;
                this.Precio = Precio;
                this.img = img;
        }
    
    public Viajes(){
    }
    

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }
    
    public int getTerminalSalida() {
        return terminalSalida;
    }

    public void setTerminalSalida(int terminalSalida) {
        this.terminalSalida = terminalSalida;
    }

    public String getT_salida() {
        return T_salida;
    }

    public void setT_salida(String T_salida) {
        this.T_salida = T_salida;
    }

    public String getT_llegada() {
        return T_llegada;
    }

    public void setT_llegada(String T_llegada) {
        this.T_llegada = T_llegada;
    }

    public int getTerminalLlegada() {
        return terminalLlegada;
    }

    public void setTerminalLlegada(int terminalLlegada) {
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

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
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
        
        
     
         
         public void RestarAsientosDisponibles(int cantidad){
                  int nuevaCantidad=AsientosDispo-cantidad;
                  setAsientosDispo(nuevaCantidad);
        }
         
         public boolean ConAtributosVacios() {
                  return !(terminalSalida != 0)
                            || !(terminalLlegada != 0)
                            || !(fechaSalida != null && !fechaSalida.isBlank())
                            || !(horaLlegada != null && !horaLlegada.isBlank())
                            || !(duracion != null && !duracion.isBlank())
                            || !(distancia != null && !distancia.isBlank())
                            || !(Precio != 0.00)
                            || !(img != null );
         }
         
         public boolean TerminalesValidas(){
                  if (terminalSalida!=terminalLlegada) {
                           return true;
                  }
                  return false;
         }
        
        
}
