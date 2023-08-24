public class StringTest {
    public static void main(String[] args){
        String immum = "Hog";
        String that = "Hog";
        System.out.println(immum == that);
        //immum = "Hosh";
        //System.out.println(that);
        String aThird = new String("Hog");
        System.out.println(aThird == immum);
    }
}
