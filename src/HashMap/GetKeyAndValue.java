package HashMap;

import java.util.HashMap;
import java.util.Map;

public class GetKeyAndValue {
    public static void main(String[] args) {
        Map<String , Integer> product = new HashMap<>();

        product.put("Mie" , 5000);
        product.put("Nasi" , 10000);

        System.out.println(product);

        for (Map.Entry<String,Integer> data : product.entrySet()){

            // Todo - > Mendapatkan Key & Value
            System.out.println("Nama : " + data.getKey() + " ,Harga : " + data.getValue());
        }
    }
}
