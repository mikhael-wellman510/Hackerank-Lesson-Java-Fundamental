package JavaComparator;

import java.util.*;


public class Data {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer length = in.nextInt();

        in.nextLine();
        List<Biodata> data = new ArrayList<>();

        for (Integer i = 0 ; i < length ; i++){
            String bio = in.nextLine();
            String [] a = bio.split(" ");
            data.add(new Biodata(a[0], Integer.parseInt(a[1])));
        }



        Collections.sort(data,new SortName());
        Collections.sort(data , new SortScore());

        for (Biodata a : data){
            System.out.println(a.getName()+ " " + a.getScore());
        }
    }
}
