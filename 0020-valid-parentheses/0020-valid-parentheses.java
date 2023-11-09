class Solution {
    public boolean isValid(String s) {
      Stack<Character> str=new Stack<>();
       for(int i=0;i<s.length();i++){
            if(str.empty()){
                str.push(s.charAt(i));
                continue;
            }
            switch (s.charAt(i)){
                case ')':
                    if('('==str.peek())
                        str.pop();
                    else
                    return false;
                break;
                case '}':
                    if('{'==str.peek())
                        str.pop();
                    else
                        return false;
                break;
                case ']':
                    if('['==str.peek())
                        str.pop();
                    else
                        return false;
                break;
                default :
                    str.push(s.charAt(i));
                break;
            }
       // System.out.println(str);
        }
    return str.empty(); 
    }
}