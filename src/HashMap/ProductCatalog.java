package HashMap;

import java.util.HashMap;
import java.util.Map;

public class ProductCatalog {

    Map<String , Integer> daftarProduk = new HashMap<>();

    public ProductCatalog() {
    }

    public void addProduct(String name , Integer price){
       this.daftarProduk.put(name, price);
    }

    public void editHarga(String name , Integer price){
        this.daftarProduk.replace(name , price);
    }

    public void removeProduct(String name){
        if (this.daftarProduk.containsKey(name)){

            System.out.println(" === Succes Delete : " + name + " ======");
            this.daftarProduk.remove(name);
        }else {
            System.out.println("produk " + name + " tidak ditemukan");
        }

    }

    public Integer getHarga(String name){
        // Todo -> Contains key mencari key yang sama
        if (this.daftarProduk.containsKey(name)){
            return daftarProduk.get(name);
        }else {
            System.out.println("data tidak ditemukan");
            return null;
        }

    }

    public void getAllTotalHarga(Integer harga){
        System.out.println("========= dapatkan product dengan harga " +  harga + "  ======");
        for (Map.Entry<String , Integer> getHarga : this.daftarProduk.entrySet()){
            if (getHarga.getValue().equals(harga)){

                System.out.println("Nama Product : " + getHarga.getKey() + " , Harga : " + getHarga.getValue());
            }else {
                System.out.println("tidak ditemukan");
            }

        }
    }

    public void getProdukByHarga(Integer price){
        System.out.println("===== Hasil get produk by harga =====");
       for (Map.Entry<String, Integer> data : daftarProduk.entrySet()){

           if (data.getValue().equals(price)){

               System.out.println("nama produk : " + data.getKey() + " , harga : " + data.getValue());
           }
       }
    }


    public void getProduct(String name){

        for (Map.Entry<String,Integer> getProductByName : this.daftarProduk.entrySet()){
            if (getProductByName.getKey().equals(name)){
                System.out.println("==== Get Product By Key =====");
                System.out.println("Nama Product : " + getProductByName.getKey() + " , Harga :  " + getProductByName.getValue() );
            }

        }
    }

    public void printAllProduct(){
        System.out.println(" === Product Catalog ==== ");

        for (Map.Entry<String,Integer> getAll : this.daftarProduk.entrySet()){
            System.out.println("Nama produk : " + getAll.getKey() + " , Harga :  " + getAll.getValue());
        }
    }

    public void getTotalHarga(){
        System.out.println("=== Get Total Harga ====");
        Integer total = 0;
        for (Integer i : this.daftarProduk.values()){
            total = total + i;
        }

        System.out.println("Total : " + total);
    }

    public static void main(String[] args) {
        ProductCatalog productCatalog = new ProductCatalog();

        productCatalog.addProduct("Mie" , 10000);
        productCatalog.addProduct("Sabun" , 5000);
        productCatalog.addProduct("Permen" , 1000);
        productCatalog.addProduct("Susu" , 5000);
        productCatalog.addProduct("Gula" , 5000);

        productCatalog.printAllProduct();
        System.out.println(productCatalog.getHarga("Sabun"));
        productCatalog.editHarga("Mie" , 15000);
        productCatalog.getProduct("Mie");

        productCatalog.removeProduct("Permen");
        productCatalog.printAllProduct();
        productCatalog.getAllTotalHarga(5000);
        productCatalog.getTotalHarga();
        productCatalog.getProdukByHarga(5000);
    }
}
