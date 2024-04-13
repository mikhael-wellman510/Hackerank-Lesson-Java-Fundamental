package TestDotNetParking;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Parkir parkir = new Parkir();
        parkir.maxSlot(6);

        parkir.parking(new DeskripsiKendaraan("B 8777 ABA" ,"HITAM" , "MOBIL"));
        parkir.parking(new DeskripsiKendaraan("A 1267 OQA" ,"HITAM" , "MOBIL"));
        parkir.parking(new DeskripsiKendaraan("D 4848 CBA" ,"PUTIH" , "MOTOR"));

        parkir.parking(new DeskripsiKendaraan("Z 8989 RBA" ,"PUTIH" , "MOTOR"));
        parkir.parking(new DeskripsiKendaraan("B 1989 RBA" ,"PUTIH" , "MOTOR"));
        parkir.parking(new DeskripsiKendaraan("Z 4984 RTA" ,"MERAH" , "MOTOR"));

        parkir.keluarParkir(4);
        parkir.getStatusParkir();
        parkir.parking(new DeskripsiKendaraan("AB 4984 RTA" ,"MERAH" , "MOTOR"));

        parkir.keluarParkir(2);

//        parkir.parking(new DeskripsiKendaraan("AD 4984 RTA" ,"MERAH" , "MOTOR"));
        parkir.searchTotalTypeKendaraan("MOTOR");
        parkir.searchTotalTypeKendaraan("MOBIL");
        parkir.searchPlatGanjil();
        parkir.searchPlatGenap();
        parkir.searchByColour("HITAM");
        parkir.searchByColour("PUTIH");


    }
}
