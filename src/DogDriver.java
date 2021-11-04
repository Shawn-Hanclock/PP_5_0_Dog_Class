public class DogDriver
{
    public static void main(String[] args)
    {
        Dog dog1 = new Dog("Fang", 5, "Husky", 80);

        Dog dog2 = new Dog("Piper", 3, "Austrian Shepherd", 45);

        Dog dog3 = new Dog("doggy", 99, "cat", 25.12345);

        System.out.println(dog1.getName() + dog1.getAge());
        System.out.println(dog2.getWeight());
        System.out.println(dog3.getName() + ", " + dog3.getAge() + ", " + dog3.getBreed() + ", " + dog3.getWeight());
        System.out.println(Dog.getDogCount());
    }
}
