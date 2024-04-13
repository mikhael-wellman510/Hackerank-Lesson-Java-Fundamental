package Logic2;

public class SumArray {
    public static void main(String[] args) {
        Integer [] arr = {2,5,4,1,7};

        boolean stop =true;
        Integer result = 0;
        Integer i = 0;
        while (stop){
            result = result + arr[i];
            i++;
            if (i >= arr.length){
                stop = false;
            }
        }

        System.out.println(result);
    }
}
