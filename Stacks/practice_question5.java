public class practice_question5 {
    public static void main(String[] args) {
        String str="cbacdcbc";
        String str1 = removeDuplicate(str);
        System.out.println(str1);
    }

    public static String removeDuplicate(String str){
        boolean[] presentAlpha = new boolean[26];
        StringBuilder s = new StringBuilder();
        for(int i = 0 ; i < str.length() ; i++){
            presentAlpha[str.charAt(i)-'a']= true;
        }
        for(int i = 0 ; i < presentAlpha.length ; i++){
            if(presentAlpha[i]){
                s.append((char)('a'+i));
            }
        }
        return s.toString();

    }
}
