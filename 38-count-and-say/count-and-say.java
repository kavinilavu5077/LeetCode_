class Solution {
    public String countAndSay(int n) {
        String str = "1";
        while (n != 1) {
            String str2 = "";
            int count = 1;
            for (int i = 0; i < str.length() - 1; i++) {
                if (str.charAt(i) == str.charAt(i + 1)) {
                    count++;
                } else {
                    str2 += count + "" + str.charAt(i);
                    count = 1;
                }
            }
            str2 += count + "" + str.charAt(str.length() - 1);
            str = str2;
            n--;
        }
        return str;
    }
}

