package Logic3;

import java.util.Arrays;

public class QueueTime {

    public static Integer  solveSupermarketQueue(Integer [] customers , int n){
        System.out.println(Arrays.toString(customers));
        Integer temp = 0;
        if (n ==1 ){

            for (Integer i = 0 ; i < customers.length ; i++){
                    temp += customers[i];
            }
        }
        else if (customers[0] == customers[1]) {

            for (Integer j = 0; j < customers.length / n; j++) {
                temp = temp + customers[j * 2];
                Integer tempA = customers[n + j];

                customers[0] = tempA;
                customers[1] = tempA;
            }
        }
        else {
            for (Integer i = 0 ; i < customers.length -n; i++){
                if (customers[0] > customers[1]){
                    // todo swap
                    if (customers[0] < customers[n+i]){
                        temp = customers[0];
                        Integer datas = customers[1];
                        customers[1] = customers[n+i];
                        customers[n+i] =datas;
                    }else {
                        temp = customers[0] ;

                    }


                }else if (customers[0] < customers[1]){
                    // todo swap
                    temp = customers[0] + customers[n+i ];
                    Integer data = customers[0];
                    customers[0] = customers[n+i];
                    customers[n+i] = data;

                }else {
                    temp =temp +  customers[i*2];
                    Integer tempA = customers[n+i];

                    customers[0] = tempA;
                    customers[1] = tempA;

                 }
            }
        }

        return temp;
    }

    public static void main(String[] args) {
        Integer[] data = {2,2,3,3,4,4};

        System.out.println(solveSupermarketQueue(data,2));

    }
}
