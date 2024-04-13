package Generic;

import java.util.LinkedList;

public class Angkot <T>{
    private LinkedList<T>data;

    public Angkot(){
        this.data = new LinkedList<>();
    }

    public LinkedList<T> getData() {
        return data;
    }

    public void setData(LinkedList<T> data) {
        this.data = data;
    }

    public void naikanPenumpang(T penumpang){
        this.data.add(penumpang);
    }

    @Override
    public String toString() {
        return "Angkot{" +
                "data=" + data +
                '}';
    }
}
