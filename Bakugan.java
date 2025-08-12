public class Bakugan{
     // Atributos
     private String nombre;
     private String tipo;
     private String atributo;
     private int poderG;

     // Métodos
     public Bakugan() {
         // Constructor por defecto
         this.nombre = "Desconocido";
         this.tipo = "Desconocido";
         this.atributo = "Desconocido";
         this.poderG = 0;
     }
     public Bakugan(String nombre, String tipo, String atributo, int poderG){
         this.nombre = nombre;
         this.tipo = tipo;
         this.atributo = atributo;
         this.poderG = poderG;
     } 

     //Métodos getters y setters
     @Override
     public String toString() {
         return "Bakugan{" +
                 "nombre='" + nombre + '\'' +
                 ", tipo='" + tipo + '\'' +
                 ", atributo='" + atributo + '\'' +
                 ", poderG=" + poderG +
                 '}';
     }
     public String getNombre() {
         return nombre;
     }
     public void setNombre(String nombre) {
         this.nombre = nombre;
     }
     public String getTipo() {
         return tipo;
     }
     public void setTipo(String tipo) {
         this.tipo = tipo;
     }
     public String getAtributo() {
         return atributo;
     }
     public void setAtributo(String atributo) {
         this.atributo = atributo;
     }
     public int getPoderG() {
         return poderG;
     }
     public void setPoderG(int poderG) {
         this.poderG = poderG;
     }

}