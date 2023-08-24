public class FindSame2 {
    public static boolean findSame2(int[] nums){
        for (int i = 0; i < nums.length - 1; i++){
            if (nums[i] == nums[i + 1]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] nums = find.makeArray(1000000);
        System.out.println(findSame2(nums));
    }
}
