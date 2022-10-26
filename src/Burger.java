public class Burger extends Food{
    int meatAmount;
    int meatType;

    public Burger(){
        this.meatAmount = 0;
        this.meatType = 0;
    }

    public Burger(int meatAmount){
        this.meatAmount = meatAmount;
    }
    public double getCalories(){
        if(meatType == 1) {
            return meatAmount * 840;
        }
            return meatAmount * 560;
    }
}
