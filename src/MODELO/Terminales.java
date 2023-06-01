
package MODELO;

import java.util.Objects;


public class Terminales {
         private String nombre;
         private String direccion;
         private String estado;

         public Terminales( String nombre, String direccion, String estado) {
                  this.nombre = nombre;
                  this.direccion = direccion;
                  this.estado = estado;
         }

         public String getNombre() {
                  return nombre;
         }

         public void setNombre(String nombre) {
                  this.nombre = nombre;
         }

         public String getDireccion() {
                  return direccion;
         }

         public void setDireccion(String direccion) {
                  this.direccion = direccion;
         }

         public String getEstado() {
                  return estado;
         }

         public void setEstado(String estado) {
                  this.estado = estado;
         }

         public boolean ConAtributosVacios() {
                  return  !(nombre != null && !nombre.isBlank())
                           || !(direccion != null && !direccion.isBlank())
                           || !(estado != null && !estado.isBlank());
}
         
         
         
}
