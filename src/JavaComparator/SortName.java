package JavaComparator;

import java.util.Comparator;

public class SortName implements Comparator<Biodata> {

public int compare(Biodata a , Biodata b){
    return a.getName().compareTo(b.getName());
}
}
