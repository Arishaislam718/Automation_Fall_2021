package ActionItem_2;

public class Assignment1_ConditionalStatement {

        public static void main(String[] args) {
            //define set of variables
            int grade = 55;
            if(grade>=90 && grade <=100){
                System.out.println("Print grade as A");
            }else if(grade>=80 && grade <90){
                System.out.println("Print grade as B");
            }else if(grade>=70 && grade <80){
                System.out.println("Print grade as C");
            }else if(grade>=60 && grade <70){
                System.out.println("Print grade as D");
            }else{
                System.out.println("Print grade as F");
            }//end of else if
        }// end of main method
    }// end of java class
