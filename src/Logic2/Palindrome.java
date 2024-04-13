package Logic2;

public class Palindrome {
    public static void main(String[] args) {
        String palindrom = "ussu";


        String cekPalindrom = "";
        for (int i = palindrom.length() ; i > 0 ;i--){
            cekPalindrom += palindrom.charAt(i-1);
        }

        if (palindrom.equals(cekPalindrom)){
            System.out.println(palindrom + " Adalah Palindrom");
        }else {
            System.out.println(palindrom + " Bukan Palindrom");
        }


    }
}
