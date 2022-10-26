public class Chocolate extends Food{
    int weight;

    public Chocolate(){
        this.weight = 0;
    }
    public Chocolate(int weight){
        this.weight = weight;
    }
    public double getCalories(){
        return weight * 740;
    }
}
