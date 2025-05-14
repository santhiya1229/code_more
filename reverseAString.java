import java.sql.Time;

public class reverseAString {
      public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        String input = "navi";
        StringBuilder outputChar = new StringBuilder();
        for(int i=input.length()-1;i>=0;i--){
            outputChar.append(input.charAt(i));
        }
        System.out.println("reverse of the given string is "+outputChar);
    }
    
//Time Complexity: O(n) for backward traversal
//Auxiliary Space: O(n) for storing the reversed string.
}
