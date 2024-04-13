package HackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimpleAddition {

    private List<Integer> listNum ;

    public SimpleAddition() {
        this.listNum = new ArrayList<>();
    }

    public void addNum(Integer datas){
        listNum.add(datas);
    }

    public void sum(){
        System.out.println("hasil" + this.listNum);

        Integer temp = 0 ;
        for (Integer i = 0 ; i < this.listNum.size() ; i++){

            if (this.listNum.size()-1 == (i)){
                System.out.print(this.listNum.get(i) + "=" );
            }else {
                System.out.print(this.listNum.get(i) + "+" );
            }
            temp+= listNum.get(i);
        }
        System.out.print(temp);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleAddition add = new SimpleAddition();

        Integer a = sc.nextInt();
        add.addNum(a);

        Integer b = sc.nextInt();
        add.addNum(b);
        add.sum();
        Integer c = sc.nextInt();
        add.addNum(c);
        add.sum();
        Integer d = sc.nextInt();
        add.addNum(d);

        Integer e = sc.nextInt();
        add.addNum(e);
        add.sum();
        Integer f = sc.nextInt();
        add.addNum(f);

        add.sum();





    }
}
