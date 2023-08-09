public class InfixToPrefix {
    public static void main(String[] args) {
        String expression = "((a/b)+c)-(d+(e*f))";
        inToPrefix(expression);
    }
    public static void inToPrefix(String exp){
        exp = revers(exp);
        exp = InFixToPostFix.inToPostFix(exp);
        exp = revers(exp);
        System.out.println(exp);
    }
    public static String revers(String exp) {
        char[] arr = new char[exp.length()];
        for(int i = 0 ; i < exp.length() ; i++){
            if(exp.charAt(exp.length()-1-i)==')'){
                arr[i]='(';
            }
            else if(exp.charAt(exp.length()-1-i)=='(') {
                arr[i]=')';
            }
            else {
                arr[i]=exp.charAt(exp.length()-1-i);
            }
        }
        exp = String.valueOf(arr);
        return exp;
    }
}
