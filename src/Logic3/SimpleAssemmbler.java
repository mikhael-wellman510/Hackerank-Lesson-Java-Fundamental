package Logic3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SimpleAssemmbler {

    public static Map<String, Integer> interpret(String[] program){


        Map<String, Integer> result = new HashMap<>();
        Integer a = 0;

        for (Integer i = 0 ; i < program.length ; i++){

            String [] data = program[i].split(" ");
            System.out.println( Arrays.toString(data));

            if (data[0].equals("mov")){


                if (data[1].equals("a")){
                    result.put("a" , Integer.parseInt(data[2]));

                    if (Integer.parseInt(data[2]) < 0){
                        a = Integer.parseInt(data[2]);
                    }else {
                        a =1;
                    }

                }else {
                    result.put("b" , a);
                }



            } else if (data[0].equals("mov")) {
                if (data[1].equals("a")){
                    result.put("a" , Integer.parseInt(data[2]));
                    a =1;
                }
            } else if (data[0].equals("inc")) {


                if (data[1].equals("a")){
                    Integer currData = result.get("a");
                    result.replace("a" , currData + a);
                }else {
                    Integer currData = result.get("b");
                    result.replace("b" , currData + a);
                }

            }else if (data[0].equals("dec")){
                if (data[1].equals("a")){
                    Integer nowData = result.get("a");
                    result.replace("a" , nowData + a );
                }else {
                    Integer nowData = result.get("b");
                    result.replace("b" , nowData + a);
                }


            }else if (data[0].equals("jnz")){

                if (data[1].equals("a")){
                    result.replace("a", 0);
                }else {
                    result.replace("b", 0);
                }


            }

        }

        return result;
    }

    public static void main(String[] args) {
        String [] program = {"mov a 5","inc a","dec a","dec a","jnz a -1","inc a"};
        String [] testCase2 = {"mov a -10","mov b a","inc a","dec b","jnz a -2"};

        System.out.println(SimpleAssemmbler.interpret(testCase2));
        System.out.println(SimpleAssemmbler.interpret(program));
    }
}

