package HackerRank;

import java.util.Scanner;

public class DrawingBook {

    public static Integer pageCount(Integer n , Integer p){



        Integer frontPage = p/ 2  ;
        Integer endPage = 0;
        if (p % 2 == 0){
            endPage = (n-p) / 2 ;
        }else {
            endPage = (n - p ) / 2 ;
        }


        if (frontPage < endPage){
            return frontPage;
        }
            return endPage;




    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer n = sc.nextInt();
        Integer p = sc.nextInt();

        System.out.println(DrawingBook.pageCount(n, p));
    }

}
