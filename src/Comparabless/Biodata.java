package Comparabless;

public class Biodata implements Comparable<Biodata> {
    private String name;
    private String address;

    public Biodata(String name, String address) {
        this.name = name;
        this.address = address;
    }
    // Todo -> Jadi Setiap data yang masuk akan di urutkan berdasarkan attribute yg di pilih
    @Override
    public int compareTo(Biodata biodata) {
        return this.getName().compareTo(biodata.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Biodata{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }


}
