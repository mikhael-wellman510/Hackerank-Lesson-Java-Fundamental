package HackerRank;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DesignerPdfViewer {

    public static Integer designerPdfViewer(List<Integer> h , String word){
        String abjad = "abcdefghijklmnopqrstuvwxyz";
        String [] arrWord = word.split("");
        List<Integer> temp = new ArrayList<>();
        for (Integer i = 0 ; i < arrWord.length ; i++){
            Integer idx = abjad.indexOf(arrWord[i]);

            temp.add(h.get(idx));
        }

        Integer a = 0 ;

        for (Integer i = 0 ; i < temp.size(); i++){

            if (a < temp.get(i) ){
                a = temp.get(i);
            }
        }
        return a * temp.size();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> h =  Stream.of(sc.nextLine().split(" ")).map(num -> Integer.parseInt(num)).collect(Collectors.toList());
        String word = sc.nextLine();

        System.out.println(DesignerPdfViewer.designerPdfViewer(h,word));



        // Todo -> Untuk membuat menjadi List langsung


    }
}
