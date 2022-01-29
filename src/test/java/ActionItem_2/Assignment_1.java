package ActionItem_2;

public class Assignment_1 {
    public static void main(String[] args) {
        // create a dynamic array for 4 different cities, iterate through the values but only print when country is
        // either Bangladesh or India
        String[] countries = new String[4];
        countries[0] = "Bangladesh";
        countries[1] = "USA";
        countries[2] = "India";
        countries[3] = "Canada";

        int i = 0;
        while(i <countries.length){
            //two if conditions
            if(countries[i]== "Bangladesh"){
                System.out.println("City is " + countries[i]);
            }else if(countries[i] == "India") {
                System.out.println("City is " + countries[i]);
            }//end of conditions
            i++;//incrementing
        }//end of while loop
    }// end of main method
}// end of java class


