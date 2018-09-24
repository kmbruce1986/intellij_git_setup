public class Runner {
    public static void main(String[] args) {
        Cat myCat = new Cat("Marvin", 7);
        System.out.println(myCat.meow());
        myCat.setAge(10);
        System.out.println(myCat.getAge());
    }
}
