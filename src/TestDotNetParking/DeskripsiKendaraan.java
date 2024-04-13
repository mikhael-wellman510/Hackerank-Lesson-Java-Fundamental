package TestDotNetParking;


// Todo -> Membuat Template Blue Print
public class DeskripsiKendaraan {

    private String noPlatKendaraan ;
    private String warnaKendaraan ;
    private String typeKendaraan;

    public DeskripsiKendaraan(String noPlatKendaraan, String warnaKendaraan, String typeKendaraan) {
        this.noPlatKendaraan = noPlatKendaraan;
        this.warnaKendaraan = warnaKendaraan;
        this.typeKendaraan = typeKendaraan;
    }

    public String getNoPlatKendaraan() {
        return noPlatKendaraan;
    }

    public void setNoPlatKendaraan(String noPlatKendaraan) {
        this.noPlatKendaraan = noPlatKendaraan;
    }

    public String getWarnaKendaraan() {
        return warnaKendaraan;
    }

    public void setWarnaKendaraan(String warnaKendaraan) {
        this.warnaKendaraan = warnaKendaraan;
    }

    public String getTypeKendaraan() {
        return typeKendaraan;
    }

    public void setTypeKendaraan(String typeKendaraan) {
        this.typeKendaraan = typeKendaraan;
    }

    @Override
    public String toString() {
        return "DeskripsiKendaraan{" +
                "noPlatKendaraan='" + noPlatKendaraan + '\'' +
                ", warnaKendaraan='" + warnaKendaraan + '\'' +
                ", typeKendaraan='" + typeKendaraan + '\'' +
                '}';
    }
}
