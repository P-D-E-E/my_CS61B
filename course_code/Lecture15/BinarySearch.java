public class BinarySearch {
    public static int BinarySearch(int[] array, int goal){
        int left = 0, right = array.length - 1;

        while (left < right){
            int mid = left + (right - left) / 2;
            if (array[mid] > goal){
                right = mid - 1;
            }else if(array[mid] < goal){
                left = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
