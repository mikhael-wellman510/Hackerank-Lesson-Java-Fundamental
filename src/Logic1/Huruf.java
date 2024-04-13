package Logic1;

public class Huruf {
    public static void main(String[] args) {
        String[] huruf = {"a","b","c","d","e" ,"f" ,"g" ,"h" ,"i" , "j" ,"k" ,"l" ,"m" ,"n" ,"o" ,"p" ,"q", "r", "s" ,"t", "u"};
        int batas = 5;
        int counter = 0 ;

        // Harus di bagi
        for (int i = 0 ; i< huruf.length/batas ;i++){
            for (int j = 0 ; j < batas ; j++){
                System.out.print(huruf[counter]+ " ");
                counter++;
            }
            System.out.print("\n");
        }
    }
}
