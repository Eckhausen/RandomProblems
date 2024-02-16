package Easy;

public class SearchInsertPos {
//    SearchInsertPos sip = new SearchInsertPos();
//        System.out.println(sip.searchInsert(new int[]{1, 3, 5, 6}, 5));
//        System.out.println(sip.searchInsert(new int[]{1, 3, 5, 6}, 2));
//        System.out.println(sip.searchInsert(new int[]{1, 3, 5, 6}, 7));
    public int searchInsert(int[] nums, int target) {
        int position = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                return i;
            }
            if(target < nums[i]){
                position = i;
                return position;
            } else if(target > nums[i]){
                position = nums.length;
            }
        }
        return position;
    }
}
