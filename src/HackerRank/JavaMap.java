package HackerRank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {

    Map<String ,Integer> phoneBook = new HashMap<>();

    public JavaMap() {
    }

    void addToPhoneBook(String name , Integer phoneBook){
        this.phoneBook.put(name,phoneBook);
    }



    void filterData(String name){

      Integer phone = phoneBook.getOrDefault(name,-1);
        System.out.println("hasil :: " + phone);

        if (phone != -1){
            System.out.println(name + "=" + phone );
        }else {
            System.out.println("Not found");
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        JavaMap data = new JavaMap();

        System.out.print("Masukan mau Berapa kali ? ");
        int n=in.nextInt();
        in.nextLine();

        for(int i=0;i<n;i++)
        {
            System.out.print("Masukan Nama : ");
            String name=in.nextLine();
            System.out.print("Masukan No Hp : ");
            int phone=in.nextInt();

            data.addToPhoneBook(name,phone);

            in.nextLine();

        }
        Integer count = 0;

        while (in.hasNextLine() && count < n ) {
            String name = in.nextLine();
            if (!name.isEmpty()) {
                data.filterData(name);
                count++;
            }

        }





    }
}
