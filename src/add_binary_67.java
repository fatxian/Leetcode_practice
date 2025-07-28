public class add_binary_67 {
    public String addBinary(String a, String b) {
        StringBuilder sum = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while(i >= 0 || j >= 0 || carry != 0){
            if(i >= 0){
                carry += a.charAt(i) - '0';
                i--;
            }
            if(j >= 0){
                carry +=b.charAt(j) - '0';
                j--;
            }
            //carry += (i >= 0) ? a.charAt(i--) - '0' : 0;
            //carry += (j >= 0) ? b.charAt(j--) - '0' : 0;
            sum.append(carry % 2);
            carry /= 2;
        }
        return sum.reverse().toString();
    }


}
