package rmiya.com.labcal2.repositories;

import com.orm.SugarRecord;

import java.util.List;

import rmiya.com.labcal2.models.Product;

/**
 * Created by Alumno on 20/04/2018.
 */

public class ProductRepository {

    public static List<Product> list(){
        List<Product> products = SugarRecord.listAll(Product.class);
        return products;
    }

    public static Product read(Long id){
        Product product = SugarRecord.findById(Product.class, id);
        return product;
    }

    public static void create(String nombre, String categoria, String precio, String descripcion){
        Product product = new Product(nombre, categoria, precio, descripcion);
        SugarRecord.save(product);
    }

    public static void update(String nombre, String categoria, String precio, String descripcion, Long id){
        Product product = SugarRecord.findById(Product.class, id);
        product.setNombre(nombre);
        product.setCategoria(categoria);
        product.setPrecio(precio);
        product.setDescripcion(descripcion);
        SugarRecord.save(product);
    }

    public static void delete(Long id){
        Product product = SugarRecord.findById(Product.class, id);
        SugarRecord.delete(product);
    }


}
