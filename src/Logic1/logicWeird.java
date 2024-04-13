package Logic1;

import java.util.ArrayList;

public class logicWeird {
    public static void main(String[] args) {
        int batas = 30;
        ArrayList<String> hasil = new ArrayList<String>();

        for(int i = 0 ; i < batas ; i++){
            if (i % 2 == 1 ){
                hasil.add("Weird");
            }else if(i >= 2 && i <= 5){
                hasil.add("not weird");
            } else if (i >= 6 && i <= 20) {
                hasil.add("weirds");
            }else {
                hasil.add("Not Weirds");
            }
        }
        System.out.println(hasil);
    }
}
