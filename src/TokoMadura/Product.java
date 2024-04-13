package TokoMadura;

import java.util.ArrayList;
import java.util.List;

public class Product {

    private List<Barang> listProduct;

    public Product() {
        listProduct = new ArrayList<>();
    }

    public void addProduct(Barang barang){
        this.listProduct.add(barang);
    }

    public void cekProduct(){

        for (Barang barang : this.listProduct){
            System.out.println(barang);
        }
    }

    public List<Barang> getListProduct() {
        return listProduct;
    }

    public void setListProduct(List<Barang> listProduct) {
        this.listProduct = listProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "listProduct=" + listProduct +
                '}';
    }
}
