import org.junit.Test;
import static org.junit.Assert.*;
public class TestSort {
    /** Test the Sort class*/

    @Test
    public void testSort(){
        String[] input = {"i", "have", "an", "egg"};
        String[] expected = {"an", "egg", "have", "i"};

        Sort.sort(input);
        assertArrayEquals(expected, input);
        //System.out.println(input);
//        for (int i = 0; i < input.length; i += 1){
//            if (!input[i].equals(expected[i])){
//                System.out.println("Mismatch in position " + i + ", expected :" + expected[i] +
//                        ", but got :" + input[i] + ".");
//            }
//        }
    }
//    public static void testFindSmallest() {
//        String[] input = {"i", "have", "an", "egg"};
//        String expected = "an";
//
//        int output = Sort.findSmallest(input);
//        org.junit.Assert.assertEquals(expected, input[output]);
//
//        String[] input2 = {"there", "are", "many", "pigs"};
//        String expected2 = "are";
//
//        int actual2 = Sort.findSmallest(input2);
//        org.junit.Assert.assertEquals(expected2, input2[actual2]);
//    }
    @Test
    public void testSwap(){
        String[] input = {"i", "have", "an", "egg"};
        int a = 0, b = 1;
        String[] expected = {"have", "i", "an", "egg"};

        Sort.swap(input, a, b);
        assertArrayEquals(expected, input);

    }

}
