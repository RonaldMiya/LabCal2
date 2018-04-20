package rmiya.com.labcal2.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import rmiya.com.labcal2.R;
import rmiya.com.labcal2.models.Product;

/**
 * Created by Alumno on 20/04/2018.
 */

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ViewHolder>  {

    private List<Product> products;

    public ProductAdapter(List<Product> products){
        this.products = products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView picture;
        public TextView name_product;
        public TextView product_category;
        public TextView product_description;

        public ViewHolder(View itemView) {
            super(itemView);
            picture = itemView.findViewById(R.id.picture_image);
            name_product = itemView.findViewById(R.id.name_product);
            product_category = itemView.findViewById(R.id.categoty_product);
            product_description = itemView.findViewById(R.id.description_product);
        }
    }

    @Override
    public ProductAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_list, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ProductAdapter.ViewHolder viewHolder, int position) {
        Product user = this.products.get(position);
        viewHolder.name_product.setText(user.getNombre());
        viewHolder.product_category.setText(user.getCategoria());
        viewHolder.product_description.setText(user.getDescripcion());

    }

    @Override
    public int getItemCount() {
        return this.products.size();
    }

}