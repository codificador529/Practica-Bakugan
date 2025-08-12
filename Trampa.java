public class Trampa {
    private String nombre;
    private String tipo;
    private String atributo;
    private String subAtributo;
    private String subAtributo2;
    private String subAtributo3;
    private int numAtributos;
    
    public Trampa(String nombre, String tipo, String atributo, String subAtributo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.atributo = atributo;
        this.subAtributo = subAtributo;
        this.numAtributos = 1; // Assuming one sub-attribute for simplicity
    }

    public Trampa(String nombre, String tipo, String atributo, String subAtributo, String subAtributo2) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.atributo = atributo;
        this.subAtributo = subAtributo;
        this.subAtributo2 = subAtributo2;
        this.numAtributos = 2; // Assuming one sub-attribute for simplicity
    }

    public Trampa(String nombre, String tipo, String atributo, String subAtributo, String subAtributo2, String subAtributo3) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.atributo = atributo;
        this.subAtributo = subAtributo;
        this.subAtributo2 = subAtributo2;
        this.subAtributo3 = subAtributo3;
        this.numAtributos = 3; // Assuming one sub-attribute for simplicity
    }

    @Override
    public String toString() {
        String mensaje;
        if (numAtributos == 1) {
            mensaje = "Trampa con un sub-atributo: " + subAtributo;
        } else if (numAtributos == 2) {
            mensaje = "Trampa con dos sub-atributos: " + subAtributo + ", " + subAtributo2;
        } else if (numAtributos == 3) {
            mensaje = "Trampa con tres sub-atributos: " + subAtributo + ", " + subAtributo2 + ", " + subAtributo3;
        } else {
            mensaje = "Trampa sin sub-atributos";
        }
        return "Trampa{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", atributo='" + atributo + '\'' +
                "," + mensaje +
                '}';
    }

    // Getters and Setters can be added here if needed
    
}
