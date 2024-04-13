package ShortSolution;


import java.util.*;

class Name{

    private String id;
    private String name;
    private Double gpa;


    public Name(String id, String name, Double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Name{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}



public class ShortData {

    List<Name> biodatas ;

    public ShortData() {
        this.biodatas = new ArrayList<>();
    }


    public void add(Name name){
        this.biodatas.add(name);
    }

    public void result(){

        Collections.sort(this.biodatas,Comparator.comparingDouble(Name::getGpa).reversed().thenComparing(Name::getName));

        for (Name name : this.biodatas){

            System.out.println(name.getName());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShortData sd = new ShortData();

        System.out.println("total");
        Integer i = sc.nextInt();
        sc.nextLine();

        while (i > 0){
            System.out.println("Masukan kata : ");
            String bio = sc.nextLine();
            String [] bioData = bio.split(" " );

            sd.add( new Name(bioData[0] , bioData[1] , Double.parseDouble(bioData[2]) ));
            i--;
        }
         sd.result();


    }
}
