package Practice;

public class Day2_forLoopDynamicArray {
    public static void main(String[] args){
        //declare the variable for dynamic array
        //define the variable
        String[] countries = new String[3];
        countries[0]="BD";
        countries[1]="PR";
        countries[2]="DR";

        //define the integer variable for dynamic array
        //define the integer variable
        int[] streetNumber = new int[3];
        streetNumber[0]= 11;
        streetNumber[1]=22;
        streetNumber[2]=33;


        for(int i= 0; i< countries.length;i++){
            // print statement using dynamic array
            System.out.println("My current borough is " + countries[i] + " and my street number is "+streetNumber[i]);

        }//end of for loop
    }//end of main method
}//end of java class
