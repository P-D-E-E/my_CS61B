public class Dog {
    public int WIP;
    /** Static变量是属于整个类的，而不是每个对象的。所以说得用类名去Call它，而不是instance/object的名字
     * */
    private static int num_dog = 0;
    public Dog(int w){
        WIP = w;
        num_dog += 1;
    }
    public static void NumOfDog(){
        System.out.println(num_dog);
    }
    public void MakeNoise() {
        if (WIP < 10){
            System.out.println("WangWangWang!");
        }else if(WIP < 30){
            System.out.println("Dawangtewang!");
        }else{
            System.out.println("Wo wei wang wang kuang!");
        }
    }


    public static Dog[] largerThanFourNeighbors(Dog[] dogs){

        return dogs;
    }


}