package OOP.Injection;

public class BiodataService {

    private final Repositori repositori;

    public BiodataService(Repositori repositori) {
        this.repositori = repositori;
    }

    void display(){
        repositori.saveAll();
    }

    public static void main(String[] args) {
        Repositori repositori = new RepositoriImpl();
        BiodataService biodataService = new BiodataService(repositori);
        biodataService.display();
    }

}
