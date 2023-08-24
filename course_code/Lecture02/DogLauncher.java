public class DogLauncher{
    public static void main(String[] args){
            //Dog d = new Dog(12);
            //d.WIP = 12;
            Dog[] dogs = new Dog[5];

            for (int i = 0; i < 5; i += 1){
                dogs[i] = new Dog(i*10 + 1);
                dogs[i].MakeNoise();
                Dog.NumOfDog();
            }

    }
}
