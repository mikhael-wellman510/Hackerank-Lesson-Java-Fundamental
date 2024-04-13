package HackerRank.JavaComparator2;

public class Biodata {

    private String name;
    private Integer usia;

    public Biodata(String name, Integer usia) {
        this.name = name;
        this.usia = usia;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getUsia() {
        return usia;
    }

    public void setUsia(Integer usia) {
        this.usia = usia;
    }

    @Override
    public String toString() {
        return "Biodata{" +
                "name='" + name + '\'' +
                ", usia=" + usia +
                '}';
    }
}


