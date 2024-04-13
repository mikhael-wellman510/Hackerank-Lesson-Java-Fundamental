package Logic3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
  Integer a = 4224;
  //Todo -> convert string
  String convert = a.toString();
  // Todo -> Jadika Array
 String []angka = convert.split("");
    //Todo -> reverse
    Collections.reverse(Arrays.asList(angka));
    // Todo -> Ubah ke String
String hasilReverse = String.join("",angka);

    if (convert.equals(hasilReverse)){
        System.out.println("ini Palindrom");
    }else {
        System.out.println("Ini Bukan Plindrom");
    }
}}
