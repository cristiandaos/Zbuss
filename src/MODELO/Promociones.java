
package MODELO;


public class Promociones {
    private int id;
    private double descuento;
    private String descrip;

    public Promociones(int id, double descuento, String descrip) {
        this.id = id;
        this.descuento = descuento;
        this.descrip = descrip;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }
    
    public boolean ConAtributosVacios() {
                  return !(descrip != null && !descrip.isEmpty())
                           || !(descuento != 0);

    }
}
