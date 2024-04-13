package HackerRank;

public class Simbol {
    public static void main(String[] args) {
        String name = "mik@$ , hael?>";
        System.out.println(name.replaceAll("[A-Za-z]+", ""));
        String result = name.replaceAll("[^A-Za-z]+", "");
        System.out.println(result);
    }
}
