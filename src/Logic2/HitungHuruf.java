package Logic2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Hitung {

    private ArrayList<Integer> angka;
    private String kalimat;

    public Hitung(ArrayList<Integer> angka, String kalimat) {
        this.angka = angka;
        this.kalimat = kalimat;
    }

    public Hitung(String kalimat) {
        this.kalimat = kalimat;
    }

    public Hitung() {
    }

    Integer hasil() {
        Integer hasil = 0;
        for (int i = 0; i < this.angka.size(); i++) {
            if (this.angka.get(i) >= hasil) {
                hasil = this.angka.get(i);
            }
        }
        return hasil;
    }
    void logic (){
        String a = this.kalimat;

        a = a.replaceAll("[,?.]", "");
        // Todo -> convert array to string
        String[] convert = a.split(" ");

        // Todo -> Tampung Kalimat untuk validasi kesamaan
        ArrayList<String> tempKalimat = new ArrayList<>();
        ArrayList<String> terbanyak = new ArrayList<>();
        ArrayList<Integer> angka = new ArrayList<>(); // 2 , 1 , 2 , 2

        for (Integer i = 0; i < convert.length; i++) {

            Integer count = 0;
            //Todo -> buat Count nya
            for (Integer j = i; j < convert.length; j++) {
                if (convert[i].contains(convert[j])) {
                    count++;
                }
            }

            // Todo -> buat untuk
            Integer temp = 0;

            if (!tempKalimat.contains(convert[i])) {
                tempKalimat.add(convert[i]);
                System.out.println(convert[i] + " ada sebanyak : " + count);
                angka.add(count);

                Integer hasil = 0;
                for (int aa = 0 ; aa <  angka.size() ; aa++){
                    if (angka.get(aa) <= count){  // 2
                            hasil++;
                    }
                }
                System.out.println(hasil);
                if(hasil == angka.size()){
                    terbanyak.add(convert[i]);
                }


            }


            // Todo -> membandingkan terbesar
        }

        System.out.println(terbanyak);

    }


    public ArrayList<Integer> getAngka() {
        return angka;
    }

    public void setAngka(ArrayList<Integer> angka) {
        this.angka = angka;
    }

    public String getKalimat() {
        return kalimat;
    }

    public void setKalimat(String kalimat) {
        this.kalimat = kalimat;
    }
}

public class HitungHuruf {
    public static void main(String[] args) {


        String a = "aku seorang bajak laut di tengah laut Somalia, sedang merompak kapal para penjajah Afrika .Namun aku takut dengan seorang penjajah dari Afrika keturunan India.";
        Hitung hitung = new Hitung(a);

        // Todo -> masukan ke object untuk melakukan operasi

        // HAs

//        hitung.setAngka(angka);
//        System.out.println(hitung.hasil());
        hitung.logic();


    }
}
