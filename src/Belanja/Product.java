package Belanja;

public class Product {

    private String product;
    private Integer price;
    private Integer stock;
    private Categories categories;

    public Product(String product, Integer price, Integer stock , Categories categories) {
        this.product = product;
        this.price = price;
        this.stock = stock;
        this.categories = categories;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }

    @Override
    public String toString() {
        return "Product{" +
                "product='" + product + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", categories=" + categories +
                '}';
    }
}
