package StringBuilder;

public class Replace {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("andi");
        sb.replace(1,2 , "dedi");
        System.out.println(sb);// adedidi
    }
}
