package HackerRank;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


class Sets<T> {

   private List<T> collectData = new ArrayList<>();
    public Sets(){

    }

    public void add(T data){

        if (!this.collectData.contains(data)){
            collectData.add(data);
        }
    }

    public Boolean contains(T data){

        if (this.collectData.contains(data)){
            return true;
        }

        return false;
    }

    public void print(){
        System.out.println(this.collectData);
    }

}
public class MySet {


    public static void main(String[] args) {
        Sets<String> bio = new Sets<>();
        bio.add("Mike");
        bio.add("Deni");
        bio.add("Anies");
        bio.add("Mike");
        bio.print();
        System.out.println("Hasil Pencarian :" +  bio.contains("Mikes"));

    }
}
