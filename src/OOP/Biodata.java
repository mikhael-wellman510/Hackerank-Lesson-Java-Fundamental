package OOP;

public class Biodata {

    private String name;
    private String umur;
    private String gender;

    public Biodata(String name, String umur, String gender) {
        this.name = name;
        this.umur = umur;
        this.gender = gender;
    }

    public void display(){
        System.out.println("Nama : " + getName());
        System.out.println("umur : " + getUmur());
        System.out.println("Gender : " + getGender());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUmur() {
        return umur;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
