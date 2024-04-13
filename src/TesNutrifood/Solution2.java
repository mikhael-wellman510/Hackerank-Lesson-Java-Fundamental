package TesNutrifood;

public class Solution2 {

    public Solution2() {
    }

    public void findLarge(){
        Integer [] arr = {1,5,3,7,2};

        Integer tampung = 0 ;
        for (Integer i = 0 ; i < arr.length ; i++){
            if (tampung < arr[i]){
                tampung = arr[i];
            }
        }
        // Todo -> Hasil nya
        System.out.println("Hasil bilangan terbesar : " + tampung);
    }

    public static void main(String[] args) {
        Solution2 a = new Solution2();
        a.findLarge();
    }
}
