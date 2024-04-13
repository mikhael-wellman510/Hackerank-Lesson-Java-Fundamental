package ArrayList.TokoMikhael;

public class Main {
    public static void main(String[] args) {

      Store storeMikhael = new Store();
        storeMikhael.addData(new Product("Sabun" , 2000 , 5));
        storeMikhael.addData(new Product("Sampo" , 8000 , 4));
        storeMikhael.addData(new Product("Minyak" , 8000 , 4));
        storeMikhael.getAllData();
        System.out.println( storeMikhael.getStock("Sabun"));
        storeMikhael.editData("Sampo" , 7000 , 6);
        storeMikhael.getAllData();
        storeMikhael.deletedData("Sabun");
        storeMikhael.getAllData();

    }
}
