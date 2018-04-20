package rmiya.com.labcal2.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.List;

import rmiya.com.labcal2.R;
import rmiya.com.labcal2.adapters.ProductAdapter;
import rmiya.com.labcal2.models.Product;
import rmiya.com.labcal2.repositories.ProductRepository;

public class ProductosActivity extends AppCompatActivity {

    private static final int REGISTER_FORM_REQUEST = 100;
    private RecyclerView productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productos);

//        productList = (RecyclerView) findViewById(R.id.product_list);
//        productList.setLayoutManager(new LinearLayoutManager(this));
//
//        List<Product> products = ProductRepository.list();
//        productList.setAdapter(new ProductAdapter(products));

    }

    public void callRegisterFormProducts(View view) {
    }

//    public void callRegisterFormProducts(View view){
//        startActivityForResult(new Intent(this, RegisterProductActivity.class), REGISTER_FORM_REQUEST);
//    }
//
//    // return from RegisterActivity
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//
//        ProductAdapter adapter = (ProductAdapter)productList.getAdapter();
//
//        List<Product> products = ProductRepository.list();
//        adapter.setProducts(products);
//        adapter.notifyDataSetChanged();
//
//    }
}
