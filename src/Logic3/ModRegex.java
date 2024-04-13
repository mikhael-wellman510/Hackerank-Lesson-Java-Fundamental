package Logic3;

import java.util.Arrays;

public class ModRegex {
    public static void cekValid(String [] data){



        for (Integer i = 0 ; i < data.length ; i++){

            String [] cek =  data[i].split(" ");

            if (cek.length <= 1 ){
                System.out.println("---Data 1---");
                String res = data[i].replaceAll("[^\\d-]", "");
                String fix = res.replaceFirst("^0+","");
                if (Integer.parseInt(fix) % 4 == 0){
                    System.out.println(fix + " is divisible by 4 (valid)");
                }else {
                    System.out.println(fix + " is not divisible by 4 (invalid)");
                }
            }else {

                // Todo -> Mengambil yang bukan String
                for (Integer j= 0 ; j < cek.length ; j++){
                    if (cek[j].matches("\\[(-?\\d+)\\]")){
                        System.out.println(cek[j].replaceFirst("^0+","").replaceAll("[^\\d]",""));
                    }else if (cek[j].matches("\\[(\\+?-?\\d+)\\]")){
                        String result = cek[j].replaceAll("[^\\d]","");
                        String fix = result.replaceFirst("^0+","");
                        System.out.println(fix);
                    }
                }
            }
        }

    }

    public static void main(String[] args) {

        String [] datas = {"[+05620]","[+05621]", "[-55622]", "[005623]", "[005624]", "[-05628]", "[005632]",
                "the beginning [0] ... [invalid] numb[3]rs ... the end", "No, [2014] isn't a multiple of 4..."  ,"...may be [+002016] will be."};

        ModRegex.cekValid(datas);
    }
}
