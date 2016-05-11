public class Solution {
    public String reverseVowels(String s) {
        if (s == null || s.length() <= 1){
            return s;
        } 
        
        char[] arr = s.toCharArray();
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        // second method, vowels = "aeiou", if (vowels.contains("a")) ....
        
        int length = s.length();
        // or length = arr.length;
        
        int left = 0;
        int right = length - 1;
        
        while(left < right){
            while(left < right && !vowels.contains(arr[left])){
                left += 1;
            }
            
            while(left < right && !vowels.contains(arr[right])){
                right -= 1;
            }
            
            if (left < right){
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                //System.out.println(left);
                //System.out.println(right);
            }
            left += 1;
            right -= 1;
        }
        
        String re = new String(arr);
        return re;
        
    }
}