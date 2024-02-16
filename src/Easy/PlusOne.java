package Easy;

import java.util.Arrays;

public class PlusOne {
//    PlusOne p1 = new PlusOne();
//        System.out.println(Arrays.toString(p1.plusOne(new int[]{1, 2, 3}))); //1,2,3
//        System.out.println(Arrays.toString(p1.plusOne(new int[]{4, 3, 2, 1}))); //4,3,2,2
//        System.out.println(Arrays.toString(p1.plusOne(new int[]{9}))); //1,0
//        System.out.println(Arrays.toString(p1.plusOne(new int[]{9, 9}))); //1,0,0
    public int[] plusOne(int[] digits) {
        int[] result = new int[digits.length+1];
        digits[digits.length-1] += 1;
        for(int i = digits.length-1; i > 0; i--){
            if(digits[i] > 9){
                digits[i] = 0;
                digits[i-1] += 1;
            }
        }
        if(digits[0] > 9){
            result = Arrays.copyOf(digits, digits.length+1);
            result[0] = 1;
            return result;
        }
        return digits;
    }
}
