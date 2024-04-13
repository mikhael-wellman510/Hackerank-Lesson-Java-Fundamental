package TestDotNetParking;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Formattable;
import java.util.List;

public class Parkir {


    private Integer slot ;
    private Integer incrementSlot = 0; ;
    private DeskripsiKendaraan [] dataKendaraan  ;

    // Ini akan dibaca pertama kali
    public Parkir() {

    }
    // Todo -> Buat maxSlot
    public void maxSlot(Integer maxSlot){
        this.dataKendaraan = new DeskripsiKendaraan[maxSlot];
        this.slot = maxSlot;

    }

    public Integer getSlot() {
        return slot;
    }



    public void setSlot(Integer slot) {
        this.slot = slot;
    }

    public void parking(DeskripsiKendaraan deskripsiKendaraan){

            if (incrementSlot < getSlot()){
                dataKendaraan[incrementSlot] = deskripsiKendaraan;
                System.out.println("Slot parkir no : " + (incrementSlot +1));
                this.incrementSlot ++;
            }else if ( dataKendaraan.length <= 6){
                for (Integer i = 0 ; i <  incrementSlot ; i++){
                    if (dataKendaraan[i] == null){
                        dataKendaraan[i] = deskripsiKendaraan;
                        System.out.println("Slot parkir no : " + (i +1));
                    }
                }
            }
            else {
                System.out.println("penuh");

            }
    }

    public void keluarParkir(Integer noSlot){
           dataKendaraan[noSlot] = null;
        System.out.println("Slot no " + (noSlot + 1) + " Kosong");
    }

    public DeskripsiKendaraan[] getDataKendaraan() {
        return dataKendaraan;
    }

    public void setDataKendaraan(DeskripsiKendaraan[] dataKendaraan) {
        this.dataKendaraan = dataKendaraan;
    }



    public void getStatusParkir () {
        Integer no = 1;
        System.out.println("Slot     No Polisi    Tipe Kendaraan    Warna "     );

        for (DeskripsiKendaraan deskripsiKendaraan : this.getDataKendaraan()){
            if (deskripsiKendaraan != null){

                System.out.println(no + "       " + deskripsiKendaraan.getNoPlatKendaraan() + "         " + deskripsiKendaraan.getTypeKendaraan() + "       " + deskripsiKendaraan.getWarnaKendaraan());
            }else {
                System.out.println("Slot no : " + no + " kosong ");
            }
            no++;
        }


    }

    public void searchTotalTypeKendaraan(String name){
        Integer temp = 0;
        for (DeskripsiKendaraan desc : getDataKendaraan()){
            if (desc != null && desc.getTypeKendaraan().equals(name)){
              temp++;
            }

        }

        System.out.println("jumlah " + name + " total :  " + temp);
    }

    public void searchPlatGanjil(){
       String hasil = "";

        for (DeskripsiKendaraan desc : getDataKendaraan()){
            if (desc != null){

                String [] data = desc.getNoPlatKendaraan().split(" ");

                if (Integer.parseInt(data[1]) % 2 == 1){
                    hasil += desc.getNoPlatKendaraan() + " ,";
                }
            }
        }

        System.out.println("Jumlah total plat Ganjil : " + hasil);
    }

    public void searchPlatGenap(){
        String hasil = "" ;

        for (DeskripsiKendaraan deskripsiKendaraan : getDataKendaraan()){
            if (deskripsiKendaraan != null){
                String [] data = deskripsiKendaraan.getNoPlatKendaraan().split(" ");
                if (Integer.parseInt(data[1])  % 2 == 0){
                    hasil += deskripsiKendaraan.getNoPlatKendaraan();
                }
            }

        }

        System.out.println("Hasil plat Genap :" + hasil);
    }

    public  void searchByColour(String warna){
        List<Integer> result = new ArrayList<>(); ;
//       String result = "";
        Integer slot = 1;
        for (DeskripsiKendaraan deskripsiKendaraan : getDataKendaraan()){
            if (deskripsiKendaraan != null && deskripsiKendaraan.getWarnaKendaraan().equals(warna)){
               if (slot == getDataKendaraan().length){
                    result.add(slot);
               }else {
                   result.add(slot);
               }

            }

            slot++;
        }
        System.out.println(result);
    }

}
