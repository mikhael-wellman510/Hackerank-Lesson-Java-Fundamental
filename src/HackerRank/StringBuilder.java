package HackerRank;

import java.util.Arrays;

public class StringBuilder {

    private  Object [] str;
    private Integer size = 0 ;
    public StringBuilder(){
        this.str = new Object[this.size];

    }

    void append(Object data){
        Object[] arrCopy = Arrays.copyOf(this.str , this.size +1);
        arrCopy[this.size] = data;
        this.str = arrCopy;
        this.size++;

    }

    void reverse(){
        System.out.println(Arrays.toString(this.str));


    }
    void print(){
        String res = "";
        for (Object data :this.str){
            res = res + data;
        }

        System.out.println(res);
    }

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        str.append("ada");
        str.append("koe");
        str.append("cuk");
        str.append(12);
        str.reverse();


    }
}
