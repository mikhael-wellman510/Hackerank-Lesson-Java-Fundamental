package Logic3;

import java.util.Arrays;

public class SumsOfParts {

    public static Integer [] sumParts(Integer [] datas){

        Integer [] result = new Integer[datas.length +1];

        Integer sum = 0;
        for (Integer i = 0 ; i < datas.length ; i++){
            sum = sum + datas[i];
        }


        Integer temp = 0 ;
        for (Integer j = 0 ; j < datas.length+1 ; j++){
            if (temp == 0) {
                result[j] = sum;
                temp=sum;
            }else {
                temp = temp - datas[j-1];
                result[j] = temp ;
            }


        }

        return result;
    }

    public static void main(String[] args) {
        Integer [] ls = {1,2,3,4,5,6};


        System.out.println(Arrays.toString(sumParts(ls)));
    }
}
