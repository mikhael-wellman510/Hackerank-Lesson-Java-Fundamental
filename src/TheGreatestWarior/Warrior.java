package TheGreatestWarior;

import java.util.ArrayList;
import java.util.List;

public class Warrior {

    private Integer exp ;
    private List<String> achievment;
    private Integer rank;
    public Warrior() {
        this.achievment = new ArrayList<>();
        this.exp = 100;
    }

    public void level(){
        Integer level = this.exp/100 ;
        this.rank = level;
        System.out.println(level);
    }
    public void experience(){

        System.out.println(this.exp);
    }
    public void rank(){


        if (rank < 10){
            System.out.println("Pushover");
        } else if (rank < 20) {
            System.out.println("Novice");
        }else if(rank < 30){
            System.out.println("Fighter");
        }else if(rank < 40){
            System.out.println("Warrior");
        }else if(rank < 50){
            System.out.println("Veteran");
        } else if (rank < 60) {
            System.out.println("Sage");
        } else if (rank < 70) {
            System.out.println("Elite");
        }else if(rank < 80){
            System.out.println("Conqueror");
        }else if (rank < 90){
            System.out.println("Champion");
        } else if (rank < 99) {
            System.out.println("Master");
        }else if (rank ==100){
            System.out.println("Greatest");
        }
    }

    public void achievment(){
        System.out.println(this.achievment);
    }

    public void training(String tr , Integer exp ,Integer lvl){
       if (lvl > 0){
           this.achievment.add(tr);
           this.exp = this.exp + exp;
       }else {
           System.out.println("Not strong enough");
       }

    }

    public void battle(Integer level){
        if ( this.rank >= level +2){
            System.out.println("Easy Fight");
            if (this.rank - level >= 4){
                this.exp = this.exp + 4 * 5;
            }


        }else if (this.rank >= level +1 || this.rank == level){
            System.out.println("A good fight");
            Integer gaps = this.rank - level;
            if (this.rank == level){
                this.exp = this.exp + 10;
            }else if (level < this.rank){
                this.exp = this.exp + (gaps * 5);
            }else {
                Integer gap = this.rank - level;
                this.exp = this.exp + (20 * gap * gap);
            }

        }else {
            System.out.println("An Intense fight");
            Integer gap = this.rank - level;
            this.exp = this.exp + (20 * gap * gap);
        }


    }

    public static void main(String[] args) {

        Warrior bruce_lee = new Warrior();
        bruce_lee.level();
        bruce_lee.experience();
        bruce_lee.rank();
        bruce_lee.achievment();
        bruce_lee.training("Defeat Chuck noris" , 9000, 1);

        bruce_lee.experience();
        bruce_lee.level();
        bruce_lee.rank();
        bruce_lee.battle(90);
        bruce_lee.experience();
        bruce_lee.achievment();

    }
}
