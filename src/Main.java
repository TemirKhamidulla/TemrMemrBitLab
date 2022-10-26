public class Main {
    public static void main(String[] args) {
        Chocolate Snickers = new Chocolate(5);
        Chocolate Twix = new Chocolate(5);
        Burger BurgerKing = new Burger(15);
        Burger McDonalds = new Burger(15);
        Coke CocaCola = new Coke(15);
        Coke FuseTea = new Coke(15);
        Food calories[] = {Snickers, Twix, BurgerKing, McDonalds, CocaCola, FuseTea};
        for(int i=0;i<calories.length;i++){
            calories[i].printCalories();
        }
        double max = 0;
        for (int i = 0; i < calories.length; i++) {
            if(calories[i].getCalories() > max) {
                max = calories[i].getCalories();
            }
        }
        System.out.println(max);
    }
}