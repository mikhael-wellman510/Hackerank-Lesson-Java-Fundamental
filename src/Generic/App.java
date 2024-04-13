package Generic;

public class App {
    public static void main(String[] args) {
        Angkot<String> penumpang = new Angkot<>();
        penumpang.naikanPenumpang("Aldi");
        System.out.println(penumpang.getData());
    }
}
