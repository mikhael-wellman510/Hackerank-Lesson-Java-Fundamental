package Comparabless;

import java.util.ArrayList;
import java.util.List;

//Todo -> Untuk mengurutkan data berdasarkan huruf depan
public class Persons  {

    List<Biodata> data =new ArrayList<>();

    public Persons() {
    }

    public void addData(Biodata biodata){
        this.data.add(biodata);
    }

    public List<Biodata> getData() {
        return data;
    }
}
