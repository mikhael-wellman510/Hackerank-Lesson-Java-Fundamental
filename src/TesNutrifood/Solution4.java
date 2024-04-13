package TesNutrifood;

import java.util.*;

public class Solution4 {

    private Map<String ,Integer> data ;

    public Solution4() {
        this.data = new HashMap<>();
    }

    public void count(String kata){
        String [] arrKata = kata.split("");

        List<String> cek = new ArrayList<>();

        for (Integer i = 0 ; i < arrKata.length ; i++){

            Integer a = 1;
            for (Integer j = i+1 ; j < arrKata.length ; j++){

                if (arrKata[i].equals(arrKata[j])){
                    a++;
                }
            }
            if (cek.isEmpty()){
                cek.add(arrKata[i]);
                this.data.put(arrKata[i], a);
            } else if (!cek.contains(arrKata[i])) {
                cek.add(arrKata[i]);
                this.data.put(arrKata[i], a );

            }else {
                continue;

            }
        }
    }
    public String getResult(){

        String hasil = "";
        Integer ttl = 0 ;
        for (Map.Entry<String,Integer> result : data.entrySet()){

            if (ttl < result.getValue()){
                ttl= result.getValue();
                hasil = result.getKey();
            }

        }
        String result = "Huruf terbanyak : " + hasil + " dengan total : " + ttl;
        return result;

    }

    public static void main(String[] args) {
        String kata = "hello";
        Solution4 cekKata = new Solution4();
        cekKata.count(kata);
        System.out.println( cekKata.getResult());
    }
}
