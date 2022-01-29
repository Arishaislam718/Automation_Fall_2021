package Practice;

public class Class4_LoopArray_Conditions {
    public static void main(String[] args){
        // create a dynamic array for 4 different cities, iterate through the values but only print when city is
        // either brooklyn or queens
        String[] cities = new String[4];
        cities[0]="Bronx";
        cities[1]="Brooklyn";
        cities[2]="Queens";
        cities[3]="Manhattan";

        //set the for loop
        for(int i = 0; i< cities.length;i++){

            //set the conditions
            if(cities[i]=="Brooklyn"){
                System.out.println("My city is Brooklyn");
            } else if (cities[i] == "Queens") {
                System.out.println("My city is Queens");

            }//end of conditions

        }//end of loop
    }//end of main method
}//end of java class
