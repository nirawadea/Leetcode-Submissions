class Solution {
    public String reverseWords(String s) {

        StringBuilder sb = new StringBuilder();

        String[] words = s.split(" +");

        for(int i= words.length - 1; i >= 0; i--){
            sb.append(words[i]);
            sb.append(" ");
        }

        return sb.toString().trim();





        // Stack<Character> stack = new Stack<>();
        // for(char c : s.toCharArray()){
        //     stack.push(c);
        // }

        // while(!stack.isEmpty()){
        //  sb.append(stack.pop());
        // }
 
        // for(int i=s.length()-1; i >= 0; i--){
        //     sb.append(s.charAt(i));
        // }
        // return sb.toString();
        // return sb.toString();

    }
}