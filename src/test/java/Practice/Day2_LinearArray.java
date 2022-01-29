package Practice;

public class Day2_LinearArray {
    public static void main(String[] args){

        //create a string linear array for cities and zipcodes
        //declare the variables
        String[] cities, zipcodes;
        //define the variables
        cities= new String[]{"Brooklyn","Bronx","Manhattan"};
        zipcodes= new String[]{"11111","22222","33333"};

        //create integer linear array for streetNumber
        //declare the variable
        int[] streetNumber;
        streetNumber= new int[]{11,22,33};

        //print the 2nd city, zipcodes and streetNumber
        System.out.print("My second city is "+cities[1]+",my second zipcode is "+zipcodes[1]+" and my second street number is "+streetNumber[1]);


    }//end of main method
}//end of java class
