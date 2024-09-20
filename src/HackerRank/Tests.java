package HackerRank;

public class Tests {

    public static void main(String[] args) {

        // Todo -> Binary Search

        Integer [] arr = {1,2,3,4,5,6,7,8};
        Integer find = 0;
        Boolean cek = true;
        Integer mid = arr.length / 2;


        while (cek){

            if (mid > arr.length - 1 || mid < 0 ){
                System.out.println("Tidak ditemukan");
               break;
            }
            if (arr[mid] == find){
                System.out.println("hasil : " + arr[mid]);
                cek = false;
            } else if (arr[mid] < find) {
                mid++;
            }else {
                mid--;
            }
        }

    }
}
