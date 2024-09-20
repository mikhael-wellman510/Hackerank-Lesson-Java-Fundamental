package Belanja;

import java.util.List;
import java.util.stream.Collectors;

public class Toko {

    private String storeName ;
    private String address;
    private Inventory inventory;

    public Toko(String storeName, String address){
        this.storeName = storeName;
        this.address = address;
    }

    public void setStoreName(String storeName){
        this.storeName = storeName;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getAddress(){
        return this.address;
    }

    public String getStoreName(){
        return this.getStoreName();
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }


    @Override
    public String toString() {
        return "Toko{" +
                "storeName='" + storeName + '\'' +
                ", address='" + address + '\'' +
                ", inventory=" + inventory +
                '}';
    }

    public static void main(String[] args) {

        Inventory inventory = new Inventory();
        Inventory inventory2 = new Inventory();
        Product indomie = new Product("Indomie" , 3000 , 100 , Categories.MAKANAN);
        Product roti = new Product("Roti" , 10000 , 80 , Categories.MAKANAN);
        Product susu = new Product("Susu" , 5000 , 90 , Categories.MINUMAN);
        Product airMineral = new Product("Air Mineral", 2000, 200, Categories.MINUMAN);
        Product kopi = new Product("Kopi", 15000, 50, Categories.MINUMAN);
        Product teh = new Product("Teh", 12000, 60, Categories.MINUMAN);
        Product cokelat = new Product("Cokelat", 800 , 200 , Categories.MINUMAN);

        Toko cabang1 = new Toko("Alfamart1" ,"Bogor");
        Toko cabang2 = new Toko("Alfamart2" , "Depok");

        inventory.setAllProduct(indomie);
        inventory.setAllProduct(roti);
        inventory.setAllProduct(susu);
        inventory.setAllProduct(airMineral);
        inventory.setAllProduct(kopi);
        inventory.setAllProduct(teh);
        inventory.setAllProduct(cokelat);

        inventory2.setAllProduct(indomie);
        inventory2.setAllProduct(roti);
        inventory2.setAllProduct(susu);
        inventory2.setAllProduct(airMineral);


        cabang1.setInventory(inventory);
        cabang2.setInventory(inventory2);

        // Todo -> dapatkan dari toko 1 total harga

        cabang1.getInventory().getAllProduct().stream().filter(val -> val.getCategories() == Categories.MAKANAN).forEach(inventory::setMakanan);

        // Todo -> Print response Minuman

//        System.out.println(inventory2);



    List<MinumanResponse> result =  inventory.getAllProduct().stream().filter(val -> val.getCategories() == Categories.MINUMAN).map(val -> {
        MinumanResponse minumanResponse = new MinumanResponse();
        minumanResponse.setNama(val.getProduct());
        minumanResponse.setHarga(val.getPrice());

        return minumanResponse;
    }).collect(Collectors.toList());

        System.out.println("Cabang 1 : " + cabang1.getInventory().getAllProduct());

    Integer totalAset = cabang1.getInventory().getAllProduct().stream().map(val -> val.getPrice()).reduce(0 , (a,b) -> a+b);
        System.out.println(totalAset);

        Integer totalHarga = cabang1.getInventory().getAllProduct().stream().map(val -> {
            Integer total = val.getPrice() * val.getStock();
            return total;
        }).reduce(0 ,(a,b) -> a+b);

        System.out.println(totalHarga);

    }
}
