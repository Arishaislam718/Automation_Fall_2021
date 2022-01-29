package Practice;

public class Day2_DynamicArray {
    public static void main(String[] args){
        //create dynamic array for countries and cities
        //define the variable
        String[] countries = new String[3];
        countries[0]= "BD";
        countries[1]="DR";
        countries[2]="PR";

        //define the values of cities
        String[] cities = new String[3];
        cities[0]= "Bronx";
        cities[1]= "Brooklyn";
        cities[2]= "Queens";

        //create dynamic array for streetNumber
        //define the values of streetNumber
        int[] streetNumber = new int[3];
        streetNumber[0]=11;
        streetNumber[1]=22;
        streetNumber[2]=33;

        //print the 3rd country, city and streetNumber
        System.out.print("My 3rd country is "+countries[2]+", my 3rd city is "+cities[2]+" and my 3rd streetNumber is "+streetNumber[2]);

    }//end of main method
}//end of java class
