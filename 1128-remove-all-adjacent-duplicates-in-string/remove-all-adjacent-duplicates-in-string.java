class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb=new StringBuilder();
        sb.append(s);
     
        StringBuilder sba=new StringBuilder();
        for(int i=0;i<sb.length();i++){
            char ch=sb.charAt(i);
            if(sba.length()>0 && ch==sba.charAt(sba.length()-1)){
                sba.deleteCharAt(sba.length()-1);
            }else{
                sba.append(ch);
            }
        }
         return sba.toString(); 
    }
}