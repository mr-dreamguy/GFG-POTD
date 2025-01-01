class Solution {
    public String addBinary(String s1, String s2) {
        int i = s1.length() - 1;
        int j = s2.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();
        
        while (i >= 0 || j >= 0 || carry > 0) {
            int bit1 = i >= 0 ? s1.charAt(i) - '0' : 0; 
            int bit2 = j >= 0 ? s2.charAt(j) - '0' : 0; 

            int sum = bit1 + bit2 + carry; 
            result.append(sum % 2); 
            carry = sum / 2; 

            i--;
            j--;
        }

        while (result.length() > 1 && result.charAt(result.length() - 1) == '0') {
            result.deleteCharAt(result.length() - 1);
        }

        return result.reverse().toString();
    }
}