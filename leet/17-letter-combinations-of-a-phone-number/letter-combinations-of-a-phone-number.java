class Solution {
    public List<String> letterCombinations(String digits) {
        String dig[]={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> out=new ArrayList<String>(); 
        if(digits.isEmpty())
            return out;
        goBack("",digits,dig,out);
        return out;
    }

    private void goBack(String combo,String next,String[]dig,List<String> out){
        if(next.isEmpty()){
            out.add(combo);
        }else{
            String letter=dig[next.charAt(0)-'2'];
            for(char let:letter.toCharArray()){
                goBack(combo+let,next.substring(1),dig,out);
            }
        }
    }
}