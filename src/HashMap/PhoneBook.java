package HashMap;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    Map<String , String> data = new HashMap<>();

    public PhoneBook() {
    }

    public void addNumberPhone(String name , String noHp){
        System.out.println("Succes add : " + name);
        this.data.put(name,noHp);
    }

    public void deleteNumberPhone(String name){
        if (this.data.containsKey(name)){
            System.out.println("Deleted Data");
            System.out.println("Succes Delete data : " + name);
            this.data.remove(name);
        }else {
            System.out.println("Data " + name + " tidak ditemukan");
        }

        this.data.remove(name);
    }

    public void getAllPhone(){
        System.out.println("=== Get All Phone ===");
        Integer total = 0;
        for (Map.Entry<String,String> getData: this.data.entrySet()){
            System.out.println("Name : " + getData.getKey() + " , No Hp : " + getData.getValue());
            total++;
        }

        if (total == 0 ){
            System.out.println("Data Masih Kosong");
        }else {

        }
    }

    public void editPhone(String name , String noHp){
        if (this.data.containsKey(name)){
            this.data.replace(name,noHp);

        }else {
            System.out.println("Data "  + name +  " tidak ditemukan , Gagal Update");
        }

    }

    public void totalData(){
        System.out.println(this.data.size());
    }

    public static void main(String[] args) {
    PhoneBook phoneBook = new PhoneBook();
    phoneBook.addNumberPhone("Mikhael" , "089615154343");
    phoneBook.addNumberPhone("Heru" , "0878787875656");
    phoneBook.addNumberPhone("heru" , "0878787875656");
    phoneBook.getAllPhone();
    phoneBook.editPhone("heru" , "123");
    phoneBook.getAllPhone();
    phoneBook.deleteNumberPhone("Heru");
    phoneBook.getAllPhone();
    phoneBook.totalData();
    }
}
