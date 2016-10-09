public class Solution {
    public String addStrings(String num1, String num2) {
        int length1 = num1.length();
		int length2 = num2.length();
		String result = "";
		int minLength = Math.min(length1, length2);
		int carry = 0;
		for (int i = 0; i < minLength; i++){
			char c1 = num1.charAt(length1 - i - 1);
			char c2 = num2.charAt(length2 - i - 1);
			int add = Character.getNumericValue(c1) + Character.getNumericValue(c2) + carry;
			if (add >= 10) {
				add -= 10;
				carry = 1;
			} else {
				carry = 0;
			}
			char addChar = Character.forDigit(add, 10);
			result = addChar + result;
		}
		String rest = "";
		if (minLength == length1) {
			rest = num2.substring(0, length2 - length1);
		} else {
		    rest = num1.substring(0, length1 - length2);
		}
		int start = rest.length() - 1;
		while (carry == 1 && start >= 0) {
			char now = rest.charAt(start);
			int add = Character.getNumericValue(now) + carry;
			if (add >= 10){
				add -= 10;
				carry = 1;
			} else {
				carry = 0;
			}
			result = Character.forDigit(add, 10) + result;
			start -= 1;
		}
		if (carry == 1){
		    result = "1" + result;
		} else {
		    result = rest.substring(0, start + 1) + result;    
		}
		return result;
    }
}