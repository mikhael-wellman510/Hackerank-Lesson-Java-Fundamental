package HackerRank;

import java.util.Scanner;

public class GenericArray {

    public static <T> void printArray(T[] array){

        for (T data : array){
            System.out.println(data);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] a = {"1","2","3" , "hello" , "world"};

        GenericArray.printArray(a);
    }
}
