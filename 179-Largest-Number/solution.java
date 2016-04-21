public class Solution {
    public String largestNumber(int[] nums) {
        String[] sList = new String[nums.length];
        for(int i = 0; i < nums.length; i++){
            sList[i] = Integer.toString(nums[i]);
        }
        
        
        Comparator<String> cmp = new Comparator<String>(){
          public int compare(String s1, String s2){
              return (s1+s2).compareTo(s2+s1);
          }  
        };
        
        // collections.reverseOrder 
        Arrays.sort(sList, Collections.reverseOrder(cmp));
        StringBuilder sb = new StringBuilder();
        if (sList[0].equals("0")){
            return "0";
        }
        for(int i = 0; i < sList.length; i++){
            sb.append(sList[i]);
        }
        return sb.toString();
        
    }
}