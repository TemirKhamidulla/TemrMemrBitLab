package Arraylist;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList p = new ArrayList<Integer>();
        p.add("Temir");
        p.add("Dan");
        p.add("Temir");
        p.add("Dan");
        p.add("Temir");
        p.add("Dan");
        p.add("Temir");
        p.add("Dan");
        p.add("Temir");
        p.add("Dan");

        for(int i=0;i<p.size();i++){
            System.out.println("Element in (" + i + ") = " + p.get(i));
        }
        System.out.println(p.toString());
    }
}