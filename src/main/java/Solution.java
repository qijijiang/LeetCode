public class Solution {
    public static void main(String[] args) {
        Solution solution=new Solution();
       String s= solution.longestPalindrome("cbbd");
       System.out.println(s);
    }
    public String longestPalindrome(String s) {
        if(s.length()<1){
            return "";
        }
        char[] cs=s.toCharArray();
        int[] ranage=new int[]{0,1};
        for(int i=0;i<cs.length;i++){
            i=help(cs,ranage,i);
        }
        return s.substring(ranage[0],ranage[1]);
    }
    public int help(char[] cs,int[] ranage,int i){
        int lo=i,hi=i;
        while(hi<cs.length-1&&cs[hi]==cs[hi+1]){
            hi++;}
        int ret=hi;
        while(lo>0&&hi<cs.length-1&&cs[lo-1]==cs[hi+1]){
            lo--;
            hi++;
        }
        if((hi-lo+1)>(ranage[1]-ranage[0])){
            ranage[0]=lo;
            ranage[1]=hi+1;
        }
        return ret;

    }
}
