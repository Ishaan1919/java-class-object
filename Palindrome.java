class PalindromeChecker{
    String text;
    PalindromeChecker(String str){
        this.text = str;
    }

    boolean checkPalindrome(){
        int i=0;
        int j=this.text.length() - 1;
        while(i<j){
            if(text.charAt(i) != text.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    void display(){
        boolean result = checkPalindrome();
        System.out.printf("The string %s is ",text);
        if(result){
            System.out.println("a palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
    }
}

public class Palindrome {
    public static void main(String[] args) {
        String text = "hello_olleh";
        PalindromeChecker obj = new PalindromeChecker(text);
        obj.display();
    }
}