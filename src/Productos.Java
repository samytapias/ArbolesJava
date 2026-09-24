public class Producto {

    // Datos del producto
    private int id; // numero en el que se ordena el arbol
    private String nombre; // nombre del producto

     // Puntero al hijo izquierdo (ID menor)
    private Producto izquierdo; 

     // Puntero al hijo derecho (ID mayor)
    private Producto derecho; 

    // Constructor del producto
    public Producto(int id, String nombre) {

        this.id = id;
        this.nombre = nombre;

        // Al crear el producto todavía no tiene hijos
        this.izquierdo = null;
        this.derecho = null;
    }
}