import java.util.Scanner;
import java.util.Stack;

public class balanced_paranthesis {
    public static void main(String[] args) {
        input();
    }

    public static void input(){

        System.out.println("Enter stop in place of parenthesis to stop the program.\n");
        String input;
        Scanner sc = new Scanner(System.in);
        for( ; ; ){
            System.out.print("Enter sequence of parenthesis that you want to check : ");
            input = sc.nextLine();
            if(input.equals("Stop")||input.equals("stop"))
            {
                System.out.println("\nAdios Amigos !\n");
                sc.close();
                break;
            }
            System.out.println();
            char[] arr = input.toCharArray();
            checkBalanced(arr);
            //we can use string directly also without converting it into charArray to reduce space complexity.
        }
        
    }
        


    public static void checkBalanced (char[] arr){

        Stack <Character> stack = new Stack<>();
        for(Character x : arr){
            if( x == '(' || x == '{' || x == '[') {
                stack.push(x);
            }
            else if(x == ')' || x == '}' || x == ']'){
                if(!stack.isEmpty()) {
                    if( checkPair(x, stack.peek())){
                        stack.pop();
                    }
                    else {
                        System.out.println("This pair of parenthesis is not balanced.\n");
                        return;
                    }
                }
                else {
                    System.out.println("This pair of parenthesis is not balanced.\n");
                    return;
                }
            }
            else {
                System.out.println("You have not entered a correct pair of parenthesis , Please enter a correct pair.\n");
                return;
            }
        }
        if(stack.isEmpty()) {
            System.out.println("This pair of parenthesis is balanced.\n");
        }
        else {
            System.out.println("This pair of parenthesis is not balanced.\n");
        }
    }

    public static boolean checkPair(char ch1,Character ch2) {
        return ( ch1 == ')' && ch2.equals('(') || ch1 == '}' && ch2.equals('{') || ch1 == ']' && ch2.equals('[') ) ;
    }

}
