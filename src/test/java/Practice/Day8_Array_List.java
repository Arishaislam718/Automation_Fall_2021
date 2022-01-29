package Practice;

import java.util.ArrayList;

public class Day8_Array_List {
    public static void main(String[] args){
        //create a string ArrayList
        ArrayList<String> counties = new ArrayList<>();
        counties.add("BD");
        counties.add("PR");
        counties.add("DR");

        //create an integer ArrayList
        ArrayList<Integer> houseNumber = new ArrayList<>();
        houseNumber.add(100);
        houseNumber.add(200);
        houseNumber.add(300);



        //print the countries and house number
        System.out.println("My country is "+counties.get(2)+ " and my house number is "+houseNumber.get(2));
    }//end of main method
}//end of java class
