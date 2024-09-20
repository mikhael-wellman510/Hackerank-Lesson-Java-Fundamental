package Interface;


public class BiodataImpl implements Biodata {

    private String nama;
    private Integer usia;
    private final  RepositoriImpl repositoriImpl;
    public BiodataImpl(RepositoriImpl repositoriImpl){
        this.repositoriImpl = repositoriImpl;
    }
    @Override
    public void addName(String name) {

        this.nama = name;
    }

    @Override
    public Integer addUsia(Integer umur) {
        Integer res =  repositoriImpl.number(umur);
        return res;
    }

    public void print(){
        System.out.println(this.nama);
    }
    public static void main(String[] args) {
        RepositoriImpl repositori1 = new RepositoriImpl();
        BiodataImpl biodata = new BiodataImpl(repositori1);
        System.out.println(biodata.addUsia(20));


    }
}
