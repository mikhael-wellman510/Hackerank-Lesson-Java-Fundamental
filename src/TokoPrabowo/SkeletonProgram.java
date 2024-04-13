package TokoPrabowo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SkeletonProgram {
    private Scanner scanner = new Scanner(System.in);
    private List<User> golonganMember = new ArrayList<>();
    private List<User> golonganUmum = new ArrayList<>();

    public String generatedID(){
        Integer angka = (int)(Math.random() * 900) +100;
        String kode = "AAB";
        String codeFix = kode+angka;


        return codeFix;

    }

    void addData() {
        System.out.print("masukan username : ");
        String username = scanner.nextLine();
        System.out.print("masukan email : ");
        String email = scanner.nextLine();
        System.out.print("masukan password : ");
        String password = scanner.nextLine();
        System.out.print("masukan gender : ");
        String gender = scanner.nextLine();
        System.out.print("masukan usia : ");
        Integer usia = scanner.nextInt();
        System.out.print("masukan xp : ");
        Double xp = scanner.nextDouble();
        System.out.print("masukan noKtp : ");
        Integer noKtp = scanner.nextInt();
        scanner.nextLine();
        System.out.print("masukan alamat rumah : ");
        String alamatRumah = scanner.nextLine();


        setData(username, email, password, gender, usia, xp, noKtp, alamatRumah,generatedID());

    }


    // Todo -> Add Data
    void setData(String username, String email, String password, String gender, Integer usia,
                 Double xp, Integer noKTP, String alamatRumah,String id
    ) {






    }

}
