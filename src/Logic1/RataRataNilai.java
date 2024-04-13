package Logic1;

public class RataRataNilai {
    public static void main(String[] args) {
        int [] dataNnilai = {10,50,60,70,80};

        int tampung = 0 ;
        for(int i = 0 ; i< dataNnilai.length ; i++){
            tampung = tampung + dataNnilai[i];
        }

        int hasil = tampung / dataNnilai.length;
        System.out.println("Hasil rata2 = " + hasil);
    }
}
