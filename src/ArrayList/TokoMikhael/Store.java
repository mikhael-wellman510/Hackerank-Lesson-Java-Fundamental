package ArrayList.TokoMikhael;

import com.sun.source.tree.BreakTree;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> dataProduct ;

    public Store() {
        this.dataProduct = new ArrayList<>();
    }

   public void addData(Product product){
        this.dataProduct.add(product);
   }

   public Integer getStock(String name){

       System.out.println("=== Cek Stock ===");
        Integer stock = 0;
        for (Product data : dataProduct){
            if (data.getNama().equals(name)){
                stock = data.getStok();
            }
        }

        if (stock == 0){
            System.out.println("Stok Habis / Tidak Tersedia");
        }

        return stock;
   }

   public void getAllData(){
       System.out.println("=== Get All Data ====");
        for (Product datas : this.dataProduct){
            System.out.println("Nama Product : " + datas.getNama() + " Harga: " + datas.getHarga() + " stock : " + datas.getStok());

        }
   }

    public Product findProductName(String name){

        for (Product product : this.dataProduct){
            if (product.getNama().equals(name)){
                return product;
            }
        }

        return null;
    }


   public void editData(String nameProduct , Integer harga , Integer stock){
        //Todo => Search data di List
        Product product = findProductName(nameProduct);
        if (product == null){
            System.out.println("Product tidak ditemukan");
        }else {
            // Todo -> Set Harga
            product.setHarga(harga);
            product.setStok(stock);
        }

   }

   public void deletedData(String name){
       System.out.println("=== Deleted Data ====");

       List<Product> delete = new ArrayList<>();
       for (Product data : this.dataProduct){
           if (data.getNama().equals(name)){
            delete.add(data);
           }
       }

       for (Product product : delete){
           System.out.println(product);
           // Todo -> Delete from Object
           this.dataProduct.remove(product);
       }


    }



}
