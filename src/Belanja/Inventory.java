package Belanja;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Product> allProduct;
    private List<Product> makanan;
    private List<Product> minuman;

    public Inventory() {
        this.allProduct = new ArrayList<>();
        this.makanan = new ArrayList<>();
        this.minuman = new ArrayList<>();
    }

    public void setAllProduct(Product product){
        this.allProduct.add(product);
    }

    public void setMakanan(Product product){
        this.makanan.add(product);
    }

    public void setMinuman(Product product){
        this.minuman.add(product);
    }

    public List<Product> getAllProduct() {
        return allProduct;
    }

    public List<Product> getMakanan() {
        return makanan;
    }

    public List<Product> getMinuman() {
        return minuman;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "allProduct=" + allProduct +
                ", makanan=" + makanan +
                ", minuman=" + minuman +
                '}';
    }
}
