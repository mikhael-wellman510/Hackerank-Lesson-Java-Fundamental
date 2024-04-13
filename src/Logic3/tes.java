package Logic3;

import java.util.Arrays;

public class tes {

    public static boolean scramble(String str1 , String str2){

        String [] data1 = str1.split("");
        String [] data2 = str2.split("");

        if (data1.length > data2.length){
            String [] hasil = new String[data2.length];
            System.out.println("has");
            for (Integer i = 0 ; i < data1.length ; i++){
                for (Integer j = i ; j < data2.length ; j++){
                    if (data1[i].equals(data2[j])){
                        hasil[i] =data1[j];
                        break;
                    }
                }
            }
            System.out.println(Arrays.toString(hasil));
        }else {
            String [] hasil = new String[data1.length];
            System.out.println("mas");
            for (Integer i = 0 ; i < data1.length ; i++){
                for (Integer j = i ; j < data2.length ; j++){
                    if (data1[i].equals(data2[j])){
                        hasil[i] =data1[j];
                        break;
                    }
                }
            }
            System.out.println(Arrays.toString(hasil));
        }




    return false;
    }
    public static void main(String[] args) {
        scramble("scriptsjava","javascripts");

    }
}
