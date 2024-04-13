package Logic1;

public class NamaDouble {
    public static void main(String[] args) {
        String [] data = {"mikhael" , "adi" , "budi" , "leo", "adi" , "budi"};

        for (int i = 0 ; i<data.length ; i++){
            for (int j = i + 1 ; j < data.length ; j++){
                if(data[i].equals(data[j])){
                    System.out.println("Ditemukan nama yang sama " + data[i]);
                }
            }
        }
    }
}
