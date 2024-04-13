package NewToko;

public class DataUser {
    private String id ;
    private String username;
    private String email;
    private String password;
    private String gender;
    private Integer age;
    private Double xp;
    private Integer noKtp;
    private String alamatRumah;

    public DataUser(String id, String username, String email, String password, String gender, Integer age, Double xp, Integer noKtp, String alamatRumah) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.age = age;
        this.xp = xp;
        this.noKtp = noKtp;
        this.alamatRumah = alamatRumah;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getXp() {
        return xp;
    }

    public void setXp(Double xp) {
        this.xp = xp;
    }

    public Integer getNoKtp() {
        return noKtp;
    }

    public void setNoKtp(Integer noKtp) {
        this.noKtp = noKtp;
    }

    public String getAlamatRumah() {
        return alamatRumah;
    }

    public void setAlamatRumah(String alamatRumah) {
        this.alamatRumah = alamatRumah;
    }

    @Override
    public String toString() {
        return "DataUser{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", xp=" + xp +
                ", noKtp=" + noKtp +
                ", alamatRumah='" + alamatRumah + '\'' +
                '}';
    }
}
