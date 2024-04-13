package ArrayList.TokoMikhael;

public class Product {
    private String nama;
    private Integer harga;
    private Integer stok;

    public Product(String nama, Integer harga, Integer stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
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

    public Integer getStok() {
        return stok;
    }

    public void setStok(Integer stok) {
        this.stok = stok;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nama='" + nama + '\'' +
                ", harga=" + harga +
                ", stok=" + stok +
                '}';
    }
}
