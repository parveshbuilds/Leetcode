class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] a = new char[128];
        for(int i =0; i<s.length(); i++){
            char ch = s.charAt(i);
            char dh = t.charAt(i);
            int indx = (int)ch;
            if(a[indx]=='\0'){
                a[indx]=dh;
            }
            else if(a[indx]!=dh){
                return false;
            }
        }
          for(int i = 0; i<128; i++ ){
            a[i]  = '\0'   ;      
            }
             for(int i =0; i<s.length(); i++){
            char ch = s.charAt(i);
            char dh = t.charAt(i);
            int indx = (int)dh;
            if(a[indx]=='\0'){
                a[indx]=ch;
            }
            else if(a[indx]!=ch){
                return false;
            }
        }
        return true;
        
    }
}