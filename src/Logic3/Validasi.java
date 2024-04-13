package Logic3;

public class Validasi {
     Integer data(){
        return 3;
    }

    public static void main(String[] args) {
         String num = "12345";
         String huruf ="adaszdwe";
        String regexNumber = "^[0-4]+$";
        String regexString ="^a...z..e$";

        if (num.matches(regexNumber)){
            System.out.println("valid");
        }else {
            System.out.println("invalid");
        }

        if (huruf.matches(regexString)){
            System.out.println("valid");
        }else {
            System.out.println("tidak valid");
        }
    }
}
