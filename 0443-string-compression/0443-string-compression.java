class Solution {
    public int compress(char[] arr) {
        String  ans ="";
        int i=0 , j=0;
        while(j<arr.length){
            if(arr[i]==arr[j])j++;
            else{
                ans+=arr[i];
                int l = j-i;
                if(l>1)ans+=l;
                i=j;
            }
        }
        ans+=arr[i];
                int l = j-i;
                if(l>1)ans+=l;
                i=j;
        for(i=0; i<ans.length(); i++){
            arr[i]=ans.charAt(i);
        } 
        return ans.length();
    }
}