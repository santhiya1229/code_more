// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        System.out.println("Test program");
        
        String palindrome ="santhiya";
        char[] palindromeChar = palindrome.toCharArray();
        int start=0;
        int end=palindrome.length()-1;
        boolean isPalindrome = true;
        for(int i=0; i<palindrome.length();i++){
            if(palindromeChar[start] == palindromeChar[end]){
                start++;
                end--;
            } else {
                isPalindrome = false;
                System.out.println("Not palindrome");
                break;
            }
             
        }
        if(isPalindrome==true){
             System.out.println(" palindrome");
        }
    }
}