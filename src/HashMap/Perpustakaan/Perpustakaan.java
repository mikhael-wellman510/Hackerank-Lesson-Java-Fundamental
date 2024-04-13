package HashMap.Perpustakaan;

import java.util.HashMap;

public class  Perpustakaan {

    private HashMap<Integer,Book> buku;

    public Perpustakaan(){
        this.buku = new HashMap<>();
    }
    public void addBook(Integer no , Book book){
        this.buku.put(no,book);
    }

    public HashMap<Integer, Book> getBuku() {
        return buku;
    }

    public void setBuku(HashMap<Integer, Book> buku) {
        this.buku = buku;
    }

    @Override
    public String toString() {
        return "Perpustakaan{" +
                "buku=" + buku +
                '}';
    }
}
