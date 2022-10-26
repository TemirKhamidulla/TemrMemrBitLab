package TryCatch1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        User[] user = new User[5];
        int age;
        for(int i=0;i<5;i++){
            System.out.println("Name");
            String name = in.next();
            System.out.println("Surname");
            String surname = in.next();
            try{
                System.out.println("Age");
                age = Integer.parseInt(in.nextLine());
            }
            catch(Exception e){
                age = 0;
                e.printStackTrace();
            }
            User u = new User(name, surname, age);
            user[i] = u;
        }
    }
}