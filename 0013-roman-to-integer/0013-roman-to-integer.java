class Solution {
    public int romanToInt(String s) {
        enum Roman{
            I(1),V(5),X(10),L(50),C(100),D(500),M(1000);
            private int value;
            private Roman(int value){
                this.value=value;
            }
            public int getValue(){
                return this.value;
            }
        }
        char arr[]=s.toCharArray();
        int no=0;
        for(int i=1;i<arr.length;i++){
            int a=Roman.valueOf(""+arr[i-1]).getValue();
            int b=Roman.valueOf(""+arr[i]).getValue();
            if(a<b){
                no-=a;
            }
            else{
                no+=a;
            }
        }
        no+=Roman.valueOf(""+arr[arr.length-1]).getValue();
        return no;
    }
}