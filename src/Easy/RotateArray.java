package Easy;

import java.util.Arrays;

public class RotateArray {
//    RotateArray ra = new RotateArray();
//        ra.rotate(new int[]{1,2,3,4,5,6,7}, 3);
    public void rotate(int[] nums, int k) {
        int[] res = new int[nums.length];
        int index = 0;
        for(int i = (nums.length-k); i < nums.length; i++){
            if(index < k){
                res[index] = nums[i];
                index++;
            }
        }

        for(int i = 0; i < (nums.length-k); i++){
            res[index] = nums[i];
            index++;
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = res[i];
        }
        System.out.println(Arrays.toString(nums));
    }
}
