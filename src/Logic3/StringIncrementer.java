package Logic3;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringIncrementer {

    public static  String incrementString(String str){


        Pattern pattern = Pattern.compile("(.+?)(\\d*)$");
        Matcher matcher = pattern.matcher(str);

        String huruf = "";


        String number = "";



        if (matcher.find()){
            huruf = matcher.group(1);
            String strNumber = matcher.group(2) ;

            if (strNumber.isEmpty()){
                System.out.println("hahaha");
                number= "1";

            }else {

                Integer num = Integer.parseInt(strNumber);
                String hasil = String.valueOf(num+1);
                Integer result = Integer.parseInt(hasil);
                String fixResult = String.format("%0" + strNumber.length() + "d" , result );

                number = fixResult;
            }

        }

        if (str.isEmpty()){
            return "1";
        }

        return  huruf+number;
    }

    public static void main(String[] args) {
        System.out.println(incrementString("11"));
    }
}
