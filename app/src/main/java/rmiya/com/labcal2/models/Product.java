package rmiya.com.labcal2.models;

/**
 * Created by Alumno on 20/04/2018.
 */

public class Product {

    private Long id;
    private String Nombre;
    private String categoria;
    private String precio;
    private String descripcion;

    public Product(String nombre, String categoria, String precio, String descripcion) {
    }

    public Product(Long id, String nombre, String categoria, String precio, String descripcion) {
        this.id = id;
        Nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", Nombre='" + Nombre + '\'' +
                ", categoria='" + categoria + '\'' +
                ", precio='" + precio + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
