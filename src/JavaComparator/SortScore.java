package JavaComparator;

import java.util.Comparator;

public class SortScore implements Comparator<Biodata> {

    public int compare(Biodata a , Biodata b){
            return b.getScore() - a.getScore();
    }

//    public int compareName(Biodata a, Biodata b)
//    {
//
//        return a.getName().compareTo(a.getName());
//    }
}
