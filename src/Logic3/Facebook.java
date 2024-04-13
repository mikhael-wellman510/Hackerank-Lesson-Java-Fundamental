package Logic3;




public class Facebook {

    public  static String names(String [] name){
        if (name.length == 0){
            return "No one likes this";
        }else if (name.length == 1){
            return name[0] + " likes this";

        } else if (name.length ==2) {
            return name[0] + " and " + name[1] + " like this";
        } else if(name.length == 3){
            return name[0]+ ", " + name[1] + " and " + name[2] + " like this";
        }else {
            return name[0] + ", " + name[1] + " and " + (name.length-2) + " others like this" ;
        }
    };

    public static void main(String[] args) {
         String [] like = {"jodi" ," joni"};
         System.out.println( names(like));
    }
}
