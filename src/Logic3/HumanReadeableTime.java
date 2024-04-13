package Logic3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HumanReadeableTime {

    public static String makeReadable(Integer seconds){

        String hasil = "";
       //Todo detik di bawah 60
        if (seconds < 60){
            if (seconds < 10){
                hasil = "00:00:0"+seconds;
            }else {
                hasil= "00:00:"+seconds;
            }
            //Todo -> Detik di atas 60
        } else if (seconds < 3600) {
            Integer detik = seconds % 60;
            Integer menit = seconds /60;
           
            // Todo 00:01:00
            if (menit < 10 && detik <10){
                hasil ="00:0"+menit + ":0" +detik;

            } else if (menit < 10 && detik >9) {
                hasil ="00:0"+menit + ":" +detik;
            }else if (menit > 10 && detik <10){
                hasil ="00:"+menit + ":0" +detik;
            }else if(menit > 10 && detik >9){
                hasil ="00:"+menit + ":" +detik;
            }
        } else if (seconds < 359999) {
            Integer jam = seconds / 3600;
            Integer bulatkan = seconds % 3600;
            Integer menit = bulatkan / 60;
            Integer detik = bulatkan % 60;

            if (jam < 10 ){
                if (menit < 10 && detik < 10){
                    hasil = "0"+jam +":0" + menit +":0" + detik;
                } else if (menit < 10 && detik > 9) {
                    hasil = "0"+jam +":0" + menit +":" + detik;
                } else if (menit > 9 && detik < 10) {
                    hasil = "0"+jam +":" + menit +":0" + detik;
                } else if (menit > 9 && detik > 9) {
                    hasil = "0"+jam +":" + menit +":" + detik;
                }
            }else {
                if (menit < 10 && detik < 10){
                    hasil = jam +":0" + menit +":0" + detik;
                } else if (menit < 10 && detik > 9) {
                    hasil = jam +":0" + menit +":" + detik;
                } else if (menit > 9 && detik < 10) {
                    hasil = jam +":" + menit +":0" + detik;
                } else if (menit > 9 && detik > 9) {
                    hasil = jam +":" + menit +":" + detik;
                }
            }
        }


        return hasil;
    }

    public static void main(String[] args) {
        System.out.println(makeReadable(86399));


    }
}
