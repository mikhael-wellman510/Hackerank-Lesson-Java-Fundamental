package Logic2;

public class mencariAngkaYangHilang {
    public static void main(String[] args) {
        System.out.println(findMin(new Integer[] { 0, 2, 4, -3 , -4 , -6 }));
    }

    public static Integer findMin(Integer[] arr){
        int currentMin  = 0 ;
        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] > 0) continue;
            if (i < arr.length-1){ // 3 != 5 ; 4 != 5
                if (arr[i + 1]  != arr[i] -1){ // -3 != 0 ; -4 ! -2 ;
                    currentMin = arr[i] -1; // 0 , -2
                }
            }
        }

        return currentMin;

    }


}
