import java.util.Stack;

public class InFixToPostFix {
    public static void main(String[] args) {
        String infix = "A*B/C";
        String postfix = inToPostFix(infix);
        System.out.println(postfix);
    }
    public static String inToPostFix(String infix) {
        String postFix="";
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < infix.length(); i++) {
            
            char temp = infix.charAt(i);
            if (Character.isAlphabetic(infix.charAt(i))) {
                postFix+=temp;
            }
            else if(temp=='('){
                s.push(temp);
            }
            else if(temp=='+' || temp=='-' || temp=='*' || temp=='/' || temp=='%'){
                if(s.isEmpty()){
                    s.push(temp);
                    continue;
                }
                if(temp=='+' || temp=='-'){
                    while(s.isEmpty()==false && s.peek()!='('){
                    postFix+=s.pop();
                }
                s.push(temp);
                }
                else if((temp=='*' || temp=='/' || temp=='%')&&(s.peek()=='+'||s.peek()=='-')){
                    s.push(temp);
                }
                else {
                    while(s.isEmpty()==false && s.peek()!='('){
                    postFix+=s.pop();
                }
                s.push(temp);
                }
            }
            else if(temp==')'){
                while(s.isEmpty()==false && s.peek()!='('){
                    postFix+=s.pop();
                }
                if(s.peek()=='('){
                    s.pop();
                }
            }
        }
        while(s.isEmpty()==false ){
            postFix+=s.pop();
        }
        return postFix;
    }
}