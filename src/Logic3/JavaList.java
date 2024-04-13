package Logic3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class JavaList {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        List<Integer> data = new ArrayList<>();
        for (int i = 0 ; i < n ; i++){

            data.add(scanner.nextInt());
        }
        int exe = scanner.nextInt();

        for (int i = 0 ; i < exe ; i++){


            String queryType = scanner.next();
            if (queryType.equals("Insert")){

                int idx = scanner.nextInt();

                int value = scanner.nextInt();
                data.add(idx,value);


            }else if(queryType.equals("Delete")) {


                int index =  scanner.nextInt();


               data.remove(index);
            }
        }

        for (int num : data){
            System.out.println(num);
        }


    }
}
