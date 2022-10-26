package Arraylist;

public class Players {
    private String name;
    private double price;
    private int age;

    public Players(String name, double price, int age){
        this.name = name;
        if(price>0){
            this.price = price;
        }else{
            this.price = 0;
        }
        if(age>0){
            this.age = age;
        }else{
            this.age = 0;
        }
    }

    public Players(){}

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }

    public int getAge(){
        return age;
    }
    public void setPrice(int age){
        this.age = age;
    }
}
