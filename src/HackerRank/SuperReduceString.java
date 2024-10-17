package HackerRank;



import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class SuperReduceString {

    public static String superReduceString(String n){

        Stack<String> data = new Stack<>();

        String[] arrN = n.split("");
        for (String x : arrN){
            if (data.isEmpty()){
                data.push(x);
            } else if (data.peek().equals(x)) {
                data.pop();
            } else if (!data.peek().equals(x)) {
                data.push(x);
            }
        }

        if (data.isEmpty()){
            return "Empty String";
        }

        java.lang.StringBuilder stb = new java.lang.StringBuilder();

        for (String aa : data){
            stb.append(aa);
        }
        return stb.toString();
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String result =  superReduceString(n);
        System.out.println(result);
    }
}
