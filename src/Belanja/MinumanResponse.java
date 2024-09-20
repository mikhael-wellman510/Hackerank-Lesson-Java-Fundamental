package Belanja;

public class MinumanResponse {
    private String nama ;
    private Integer harga ;

    public MinumanResponse() {
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Integer getHarga() {
        return harga;
    }

    public void setHarga(Integer harga) {
        this.harga = harga;
    }

    @Override
    public String toString() {
        return "MinumanResponse{" +
                "nama='" + nama + '\'' +
                ", harga=" + harga +
                '}';
    }
}
