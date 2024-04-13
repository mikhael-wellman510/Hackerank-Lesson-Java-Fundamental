package Logic3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimplePigLatin {

    public static String pigIt(String str){

        String [] arrStr = str.split(" ");


        String resultKalimat = "";

        for (Integer i = 0 ;i < arrStr.length ; i++){

            String [] arrKalimat = arrStr[i].split("");
            String hasil = "";
            for (Integer j = 0 ; j < arrKalimat.length  ; j++){

                if (j < arrKalimat.length -1 ){
                    hasil = hasil + arrKalimat[j+1];
                }else {


                    if (i == arrStr.length -1 ){
                        hasil = hasil + arrKalimat[j- (arrKalimat.length-1)] + "ay";
                    }else {
                        hasil = hasil + arrKalimat[j- (arrKalimat.length-1)] + "ay ";
                    }
                }

            }

            resultKalimat += hasil;
        }


        return resultKalimat;
    }

    public static void main(String[] args) {
        System.out.println(SimplePigLatin.pigIt("This is my string"));
    }
}
