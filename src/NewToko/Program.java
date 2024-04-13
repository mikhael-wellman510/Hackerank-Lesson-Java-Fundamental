package NewToko;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Todo CRUD
public class Program {
    private Scanner scanner = new Scanner(System.in);
    private List<DataUser> dataMember = new ArrayList<>();
    private List<DataUser> dataUmum = new ArrayList<>();

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
        scanner.nextLine(); // Consume newline character

        // Todo -> umum
        if (xp < 1000000){
            System.out.println("Apakah anda ingin mengisi KTP ? y/n");
            String response  = scanner.nextLine();
            if (response.equals("y")){
                System.out.print("masukan noKtp : ");
                Integer noKtp = scanner.nextInt();
                scanner.nextLine();
                System.out.print("masukan alamat rumah : ");
                String alamatRumah = scanner.nextLine();
                setData(username, email, password, gender, usia, xp, noKtp, alamatRumah,generatedID());
                System.out.println();
                System.out.println();
            }else {
                Integer noKtp = null;
                String alamatRumah = null;
                setData(username, email, password, gender, usia, xp, noKtp, alamatRumah,generatedID());
                System.out.println();
                System.out.println();
            }
        }else {
            //Todo -> Member
            System.out.print("masukan noKtp : ");
            Integer noKtp = scanner.nextInt();
            scanner.nextLine();
            System.out.print("masukan alamat rumah : ");
            String alamatRumah = scanner.nextLine();
            setData(username, email, password, gender, usia, xp, noKtp, alamatRumah,generatedID());
            System.out.println();
            System.out.println();
        }





    }

    // Todo -> Set Data (Insert datas)
    void setData(String username, String email, String password, String gender, Integer usia,
                 Double xp, Integer noKTP, String alamatRumah,String id
    ) {
        if (xp > 1000000){
            setDataMember(new DataUser(id,username,email,password,gender,usia,xp ,noKTP,alamatRumah));
        }else {

            setDataUmum(new DataUser(id,username,email,password,gender,usia,xp ,noKTP,alamatRumah));
        }


    }

    // Todo -> Edit data
    void editDataMember(){
        Integer idx = 0;
        System.out.print("masukan username yang mau di edit : ");
        String nama = scanner.nextLine();
        for (DataUser cek : getDataMember()){
            if (cek.getUsername().equals(nama)){
                //Todo -> Cari dulu yg mau di edit
                DataUser user = dataMember.get(idx);

                System.out.print("Masukan username");
                String username = scanner.nextLine();
                System.out.print("Masukkan email baru: ");
                String newEmail = scanner.nextLine();
                System.out.print("Masukkan password baru: ");
                String newPassword = scanner.nextLine();
                System.out.print("Masukkan gender baru: ");
                String newGender = scanner.nextLine();
                System.out.print("Masukkan usia baru: ");
                Integer newUsia = scanner.nextInt();
                System.out.print("Masukkan xp baru: ");
                Double newXp = scanner.nextDouble();
                scanner.nextLine(); // Consume newline character
                System.out.print("Masukkan noKtp baru: ");
                Integer newNoKtp = scanner.nextInt();
                scanner.nextLine(); // Consume newline character
                System.out.print("Masukkan alamat rumah baru: ");
                String newAlamatRumah = scanner.nextLine();

                user.setUsername(username);
                user.setEmail(newEmail);
                user.setPassword(newPassword);
                user.setGender(newGender);
                user.setAge(newUsia);
                user.setXp(newXp);
                user.setNoKtp(newNoKtp);
                user.setAlamatRumah(newAlamatRumah);

                System.out.println();
                System.out.println("Update Succesfuk");
                System.out.println();

            }
            idx++;
        }

    }


    void getAllDataMember(){
        // Get Data Member
        Integer idx = 1;
        for (DataUser user : getDataMember()){
            System.out.println("==== Data Member " +idx + "=======");
            System.out.println("id : " + user.getId());
            System.out.println("username : " + user.getUsername());
            System.out.println("email : " + user.getEmail());
            System.out.println("password : " + user.getPassword());
            System.out.println("gender : " + user.getGender());
            System.out.println("age : " + user.getAge());
            System.out.println("xp : " + user.getXp());
            System.out.println("noKtp : " + user.getNoKtp());
            System.out.println("alamatRumah : " + user.getAlamatRumah());
            System.out.println();
            System.out.println();
            idx++;
        }
    }

    void getAllDataUmum(){
        Integer idx = 1;
        for (DataUser user : getDataUmum()){
            System.out.println("==== Data Umum " +idx + "=======");
            System.out.println("id : " + user.getId());
            System.out.println("username : " + user.getUsername());
            System.out.println("email : " + user.getEmail());
            System.out.println("password : " + user.getPassword());
            System.out.println("gender : " + user.getGender());
            System.out.println("age : " + user.getAge());
            System.out.println("xp : " + user.getXp());
            System.out.println("noKtp : " + user.getNoKtp());
            System.out.println("alamatRumah : " + user.getAlamatRumah());
            System.out.println();
            System.out.println();
            idx++;
        }
    }

    void deletedUserMember(){

        System.out.print(" Masukan nama yang ingin di cari : ");
        String name = scanner.nextLine();

        Integer idx = 0 ;
        for (DataUser cek : getDataMember()){

            if (cek.getUsername().equals(name)){
                // Todo -> remove object , jgn index
                dataMember.remove(cek);
                System.out.println("Berhasil menghapus data : " + cek.getUsername());
                System.out.println();

            }else {
                System.out.println("data Tidak Di temukan");
            }
            idx++;
        }
    }


    public List<DataUser> getDataMember() {
        return dataMember;
    }

    public void setDataMember(DataUser dataMember) {
        this.dataMember.add(dataMember);
    }

    public List<DataUser> getDataUmum() {
        return dataUmum;
    }

    public void setDataUmum(DataUser dataUmum) {
        this.dataUmum.add(dataUmum);
    }
}
