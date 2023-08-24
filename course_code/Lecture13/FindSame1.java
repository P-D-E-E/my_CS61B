
public class FindSame1 {
    public static boolean findSame1(int[] nums){
        for (int i = 0; i < nums.length - 1; i++){
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] nums = find.makeArray(1000000);
        System.out.println(findSame1(nums));
    }
}
