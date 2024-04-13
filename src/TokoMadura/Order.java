package TokoMadura;

import java.util.List;

public class Order {

    private List<Barang> barangList;

    public Order() {
    }


    public void masukanKeranjang(Barang barang){
        this.barangList.add(barang);
    }

    public void cekKeranjang(){
        System.out.println(this.barangList);
    }

}
