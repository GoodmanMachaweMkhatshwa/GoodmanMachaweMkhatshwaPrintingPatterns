// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner; 

class vStringPtterns{
  
    public void descPattern(int number , String word){
        String str = word;
        for( int i = number ; i > 0 ; i--){
            String repeated = str.repeat(i);
            System.out.println(repeated);
            number = number -1;
        }
    }
    public void ascPattern(int number, String word){
        String str = word;
        for(int i = 1; i <= number ; i++){
            String repeated = str.repeat(i);
            System.out.println(repeated);
        }
    }
}

class Main {
   public static void main(String args[]) {
     Scanner inputObj = new Scanner(System.in);
     System.out.print("Enter your Number : ");
     String text = inputObj.nextLine();
     System.out.print("Enter your Character : ");
      String words = inputObj.nextLine();
     if (text.matches("[1-9]+")) {
          int number = Integer.parseInt(text); 
          vStringPtterns ls = new vStringPtterns();
          ls.descPattern(number,words);
          System.out.println("---------------------------------");
          ls.ascPattern(number,words);
        }
     else{
          System.out.println("Invalid Input : Please Enter a number  from 1>>>>>>>>>>9");
        }
   }
}