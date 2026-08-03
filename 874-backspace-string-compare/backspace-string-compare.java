class Solution {
    public boolean backspaceCompare(String s, String t) {
        int n1=s.length();
        int n2=t.length();
        StringBuilder s1=new StringBuilder();
        StringBuilder s2=new StringBuilder();
        for(int i=0;i<n1;i++){
            if(s.charAt(i)=='#'){
                if(s1.length()>0){
                     s1.deleteCharAt(s1.length() - 1);
                }

            }else{
                s1.append(s.charAt(i));
            }

        }
        for(int i=0;i<n2;i++){
            if(t.charAt(i)=='#'){
                if(s2.length()>0){
                       s2.deleteCharAt(s2.length() - 1);
                }
            }else{
                s2.append(t.charAt(i));
            }
        }
        return s1.toString().equals(s2.toString());
        
    }
}