package TryCatch1;

public class User {
    private String name;
    private String surname;
    private int age;

    public User(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        if(age>0){
            this.age = age;
        }else
            this.age = 0;
    }
}
