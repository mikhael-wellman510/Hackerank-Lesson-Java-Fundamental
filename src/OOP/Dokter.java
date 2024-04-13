package OOP;

public class Dokter extends Biodata{

    private String profesi ;
    private String lokasi;

    public Dokter(String name, String umur, String gender ) {
        super(name, umur, gender);
        this.profesi = "Dokter";
        this.lokasi = "Jakarta";
    }

    public void say(){
        super.display();
        System.out.println("Profesi : " + getProfesi());
        System.out.println("Lokasi : " + getLokasi());
    }

    public String getProfesi() {
        return profesi;
    }

    public void setProfesi(String profesi) {
        this.profesi = profesi;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }
}
