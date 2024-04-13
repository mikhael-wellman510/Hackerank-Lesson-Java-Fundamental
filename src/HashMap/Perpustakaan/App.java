package HashMap.Perpustakaan;

public class App {
    public static void main(String[] args) {
        Perpustakaan perpus = new Perpustakaan();
        Book buku1 = new Book("Filosofi Teras" ,"Angel" , 1999);
        Book buku2 = new Book("Marxisme" ,"Karl Max" , 1890);
        perpus.addBook(1,buku1);
        perpus.addBook(2,buku2);
        System.out.println(perpus.getBuku());
      ;
    }
}
