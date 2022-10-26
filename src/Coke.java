public class Coke extends Food{
    double volumeLiters;
    boolean isSparkling;

    public Coke(){
        this.volumeLiters = 0;
        this.isSparkling = false;
    }
    public Coke(int volumeLiters){
        this.volumeLiters = volumeLiters;
    }
    public double getCalories() {
        if (isSparkling = true){
            return volumeLiters * 400;
        }else if (isSparkling = false){
            return volumeLiters * 100;
        }
        return 0;
    }
}
