package HackerRank;

public class BinnarySearch {

//    public static Integer binarySearch1(Integer[] data ,Integer len,Integer target ,Integer start ){
//
//        while (len > start){
//
//            // Todo -> ttl 10 , karena 10 / 2 == 5
//            Integer mid = (len + start)/2;
//
//            if (data[mid] == target ){
//                System.out.println(mid);
//                break;
//            }else if (data[mid] < target){
//                len++; // Todo -> 10
//            }else {
//                start--; // Todo -> 0
//            }
//        }
//
//
//        return null;
//    }


    // todo -> rekursiv
    public static void binarySearch2(Integer [] data , Integer len , Integer target , Integer start){


            Integer mid = (len + start) / 2 ;

            if (start * 2 > len || len*2 < 0  ){
                System.out.println("invalid");
            }
            else if (data[mid] == target){
                System.out.println(mid);

            } else if (data[mid] < target) {
                binarySearch2(data , len, target , start+1);
            }else {
                binarySearch2(data, len-1, target ,start);
            }




    }


    public static void main(String[] args) {

        Integer [] data = {1,2,3,4,5};
        Integer len = data.length -1;
        Integer target = 2;
        Integer start = 0;

        binarySearch2(data , len , target ,start);



    }
}
