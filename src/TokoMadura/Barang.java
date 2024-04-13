package TokoMadura;


import java.time.LocalDateTime;

public class Barang {
    private String namaBarang;
    private Integer harga;
    private Integer stok;

    public Barang(String namaBarang, Integer harga, Integer stok) {
        this.namaBarang = namaBarang;
        this.harga = harga;
        this.stok = stok;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public Integer getHarga() {
        return harga;
    }

    public void setHarga(Integer harga) {
        this.harga = harga;
    }

    public Integer getStok() {
        return stok;
    }

    public void setStok(Integer stok) {
        this.stok = stok;
    }

    @Override
    public String toString() {
        return "Barang{" +
                "namaBarang='" + namaBarang + '\'' +
                ", harga=" + harga +
                ", stok=" + stok +
                '}';
    }
}
