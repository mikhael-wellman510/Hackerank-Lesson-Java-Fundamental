package Logic2;

public class MencariMinDanMax {
    public static void main(String[] args) {
        int [] data = {6,1,0,-2,-6,13,24,57,4 };

        int max = data[0];
        for (int i = 1 ; i < data.length ; i++ ){
            if (max < data[i]){
               max = data[i];
            }
        }

        System.out.println(max);

        int min = data[0];
        for (int j = 1 ;j < data.length ; j++){
            if (min > data[j]){
                min = data[j];
            }
        }

        System.out.println(min);
    }
}
