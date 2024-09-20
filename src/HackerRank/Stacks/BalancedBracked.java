package HackerRank.Stacks;

import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;
import java.util.stream.IntStream;

public class BalancedBracked {

    public static String isBalanced(String s){
        Stack<Character> stack = new Stack<>();

        for (char a : s.toCharArray()){
            if (a == '{' || a == '[' || a == '('){
                stack.push(a);
            } else {
                if (stack.isEmpty()){
                    return "NO";
                }
                char top = stack.pop();
                if (top == '{' && a == '}' || top == '[' && a == ']' || top == '(' && a == ')'){

                   continue;

                }else {

                    return "NO";
                }
            }
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Integer total = sc.nextInt();

        sc.nextLine();
        IntStream.range(0,total).mapToObj(val->{
            String data = sc.nextLine();

            return data;
        }).forEach(val ->{
            System.out.println(isBalanced(val));
        });

    }
}
