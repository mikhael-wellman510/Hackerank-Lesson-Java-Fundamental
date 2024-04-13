package Logic2;

public class PolaAngka {
    public static void main(String[] args) {
        Integer n = 5 ;

        for (Integer i = 0 ; i <  n ; i++){

            for (Integer j =  i * 5 +1  ; j <= n * (i+1) ; j++){// 1 ,

                if(j < 10){
                    System.out.print("0" + j + " ");
                }else {
                    System.out.print(j+ " ");
                }
            }


            System.out.println();


        }

    }
}
