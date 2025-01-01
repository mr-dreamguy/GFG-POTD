class Solution {
    public String findSum(String s1, String s2) {
        char[] str1, str2;
        if (s1.length() > s2.length()) {
            str1 = s2.toCharArray();
            str2 = s1.toCharArray();
        } else {
            str1 = s1.toCharArray();
            str2 = s2.toCharArray();
        }

        StringBuilder str = new StringBuilder("");
        int n1 = str1.length, n2 = str2.length;
        int diff = n2 - n1;

        int carry = 0;

        for (int i = n1 - 1; i >= 0; i--) {
            int sum = ((str1[i] - '0') + (str2[i + diff] - '0') + carry);
            str.append(sum % 10 + "");
            carry = sum / 10;
        }

        for (int i = n2 - n1 - 1; i >= 0; i--) {
            int sum = ((str2[i] - '0') + carry);
            str.append(sum % 10 + "");
            carry = sum / 10;
        }

        if (carry > 0) str.append(carry + "");

        return str.reverse().toString();
    }
    
    public String minSum(int arr[]) {
        int n = arr.length;
        Arrays.sort(arr);

        StringBuilder a = new StringBuilder(""), b = new StringBuilder("");
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0 && i != n - 1) continue;

            if ((i & 1) == 1)
                a.append("" + arr[i]);
            else
                b.append("" + arr[i]);
        }

        return findSum(a.toString(), b.toString());
    }    
}