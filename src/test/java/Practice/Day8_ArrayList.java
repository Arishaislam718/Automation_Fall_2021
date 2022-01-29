package Practice;

import java.util.ArrayList;

public class Day8_ArrayList {
    public static void main(String[] args){

        //declare a string arrayList
        ArrayList<String> countries = new ArrayList<>();
        countries.add("BD");
        countries.add("India");

        //declare a integer arrayList
        ArrayList<Integer> streetNumber = new ArrayList<>();
        streetNumber.add(11);
        streetNumber.add(22);



        System.out.print("My country is "+countries.get(1)+" and my street is "+streetNumber.get(1));



    }//end of main method
}//end of java class
