package Logic2;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Integer [] a = {1,2,3,4};

        ArrayList<Integer> temp = new ArrayList<>();
        for (int i= 0 ; i < a.length ; i++){
            temp.add(a[i]);
        }

        System.out.println(temp);

        System.out.println(temp.contains(5));

        Integer [] datas= {2,5,3,6,7,4,6,7 ,7,3,5};
        Integer result = 0;
        for(Integer i = 0 ; i < datas.length ; i++){
                if (datas[i] > result){
                    result = datas[i];
                }
        }

        System.out.println(result);

    }
}
