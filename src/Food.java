public abstract class Food {
    String name;
    public abstract double getCalories();

    public void printCalories() {
        System.out.println("the calories are: " + getCalories());
    }
}