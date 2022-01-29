package ActionItem1;

public class forLoop_DynamicArray {
    public static void main(String[] args){

        //create a String dynamic array for zipcodes
        String[] zipCodes = new String[4]; //set the boundaries for the dynamic array
        //now I can define the values by variable indexing
        zipCodes[0] = "10462";
        zipCodes[1] = "10465";
        zipCodes[2] = "10467";
        zipCodes[3] = "10468";

        //create an Integer dynamic array for streetNumber
        int[] streetNumber = new int[4]; //set boundaries for the dynamic array
        streetNumber[0] = 204;
        streetNumber[1] = 205;
        streetNumber[2] = 206;
        streetNumber[3] = 207;

        //create for loop and state starting and ending point
        for (int i=0; i < zipCodes.length;i++){

            System.out.println("My zipcode is " + zipCodes[i] + " and my street number is " + streetNumber[i]);

        }// end of zipcodes for loop
    }//end of main
}//end of java class
