package HackerRank.JavaComparator2;

import java.util.Comparator;

public class SortByUsia implements Comparator<Biodata> {

    public int compare(Biodata a , Biodata b){
        return a.getUsia().compareTo(b.getUsia());
    }
}
