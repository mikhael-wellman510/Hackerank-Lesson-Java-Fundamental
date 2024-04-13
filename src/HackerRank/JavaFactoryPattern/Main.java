package HackerRank.JavaFactoryPattern;


interface Food {
    String getType();
}

class Pizza implements Food {
    @Override
    public String getType() {
        return "Someone ordered Fast Food!";
    }
}

class Cake implements Food {
    @Override
    public String getType() {
        return "Someone ordered a Dessert!";
    }
}

class FoodFactory {
    public Food getFood(String order) {
        if (order.equalsIgnoreCase("pizza")) {
            return new Pizza();
        } else if (order.equalsIgnoreCase("cake")) {
            return new Cake();
        } else {
            return null;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        FoodFactory foodFactory = new FoodFactory();

        Food food1 = foodFactory.getFood("cake");
        System.out.println("The factory returned class " + food1.getClass().getSimpleName());
        System.out.println(food1.getType());
        System.out.println("Hasil : " + food1.getClass().getSimpleName());
        Food food2 = foodFactory.getFood("pizza");
        System.out.println("The factory returned class " + food2.getClass().getSimpleName());
        System.out.println(food2.getType());
    }
}
