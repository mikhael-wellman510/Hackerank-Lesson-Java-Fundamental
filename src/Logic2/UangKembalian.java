package Logic2;

public class UangKembalian {
    public static void main(String[] args) {
        int [] pecahan = {50000,20000,10000,5000,2000,1000,500,200,100};

        int uang = 100000;
        int totalBelanja = 42000;

        int kembalian = uang - totalBelanja; // 58000

        for (int i = 0 ;i < pecahan.length ; i++){
            if (kembalian > pecahan[i]){
                int lembar = kembalian / pecahan[i]; // Berapa lembar ??
                // Tetap pakai modulus , supaya bisa menghasilkan 2 lembar
                kembalian = kembalian % pecahan[i];

                System.out.println("Pecahan : " + pecahan[i] + " " + lembar + " : Lembar");

            }


        }


    }
}
