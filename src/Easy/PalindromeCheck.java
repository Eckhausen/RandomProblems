package Easy;

public class PalindromeCheck {
    public boolean isPalindrome(int x) {
        StringBuilder sb = new StringBuilder();
        String s = Integer.toString(x);

        for(int i = s.length()-1; i >= 0; i--){
            sb.append(s.charAt(i));
        }


        return s.equals(sb.toString());
    }

    public boolean isPalindrome2(int x){
        if(x < 0) return false;
        int original = x;
        int reversed = 0;

        while (x > 0){
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }

        return original == reversed;
    }
}
