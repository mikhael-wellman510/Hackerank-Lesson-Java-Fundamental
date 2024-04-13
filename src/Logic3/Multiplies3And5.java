package Logic3;

public class Multiplies3And5 {
    public Integer solution(Integer a){

        Integer temp = 0 ;
        for (Integer i = 0 ; i< a ; i++) {
            if (i % 3 == 0 || i % 5 == 0){
                temp =temp + i;
            }
        }

        return temp;
    }

    public static void main(String[] args) {
        Multiplies3And5 hasil = new Multiplies3And5();
        System.out.println(hasil.solution(10));
    }
}
