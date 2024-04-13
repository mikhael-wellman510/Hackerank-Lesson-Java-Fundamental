package HashMap;

import java.util.HashMap;
import java.util.Map;

public class TestgetOrDefault {

    // Todo -> Compare , apakah String a mengandung string b
    public static Boolean solution(String a , String b){

        Map<String,Integer> dataA = new HashMap<>();
        Map<String,Integer> dataB = new HashMap<>();

        String [] arrA = a.split("");
        String [] arrB = b.split("");

        for (String loop : arrA){
            // Todo -> Jika key tdk ada , maka default = 1 , jika ada + 1
            dataA.put(loop,dataA.getOrDefault(loop,0) + 1);
        }

        for (String loops : arrB ){
            dataB.put(loops, dataB.getOrDefault(loops,0)+1);
        }

        for (Map.Entry<String,Integer> cek : dataB.entrySet()){
           String ceks = cek.getKey();
           Integer count = cek.getValue();

           if (dataA.getOrDefault(ceks,0) < count){
               // Todo -> Dia akan false jika tidak menemukan huruf dari core nya , maka 0< count
               return false;
           }


        }
        return true;

    }


    public static void main(String[] args) {

        System.out.println(TestgetOrDefault.solution("shedklelon","deni"));  ;
    }
}
