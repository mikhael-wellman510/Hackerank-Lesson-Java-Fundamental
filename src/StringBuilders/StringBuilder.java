package StringBuilders;

import java.util.Arrays;
import java.util.List;

public class StringBuilder {
    private String [] data ;
    private Integer size = 0;

    public StringBuilder(){
        this.data = new String[this.size];
    }

    public void append(Object data){
        String [] arrCopy = Arrays.copyOf(this.data , this.size+1);
        arrCopy[this.size] = String.valueOf(data);
        this.data = arrCopy;
        this.size++;
    }

    public void reverse(){

        String [] fix = new String[this.data.length];
        for (Integer i = 0 ; i < this.data.length ; i++){
            String [] arr = this.data[i].split("");
            String temp = "";

            for (Integer j = arr.length -1 ; j >=  0 ; j--){
                temp = temp + arr[j];
            }
            fix[i] = temp;
        }
        String res =  Arrays.stream(fix).reduce("",(a, b)-> a + b);
        System.out.println(res);
    }

    public void print(){
        String result = "";
        for (Integer i = 0 ; i < this.data.length ; i++){
            result = result + this.data[i];
        }
        System.out.println(result);
    }

    public void insert(Integer i , Object data){
        String newData = String.valueOf(data);
        String [] arrNewData = newData.split("");
        String datas =  Arrays.stream(this.data).reduce("",(a,b)-> a+b);
        String [] arrDatas = datas.split("");
        String result = "";
        for (Integer  j = 0 ; j < arrDatas.length; j++){

            if (i == j){
                String tampung = "";
                for (Integer k = 0 ; k < arrNewData.length ; k++){

                    tampung = tampung + arrNewData[k];
                }

                result = result + tampung;
            }
            result = result + arrDatas[j];
        }

        this.data = result.split("");
    }
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Mik");

        stringBuilder.append("l");

        stringBuilder.insert(3,"hae");
        stringBuilder.insert(0,"mr ");
//        stringBuilder.reverse();
        stringBuilder.print();



    }
}
