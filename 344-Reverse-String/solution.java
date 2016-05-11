public class Solution {
    public String reverseString(String s) {
        char[] arr = s.toCharArray();
        reverseCharArray(arr);
        String result = new String(arr);
        return result;
        
    }
    
    private void reverseCharArray(char[] arr){
        int length = arr.length;
        for(int i = 0; i < length / 2; i++){
            char temp = arr[i];
            arr[i] = arr[length - i - 1];
            arr[length - i - 1] = temp;
        }
    }
}