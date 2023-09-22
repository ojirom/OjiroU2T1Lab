public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Bagel", 7, 12);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Bagel 2", 5, 10);
        cat2.printCatInfo();
        cat2.introduce();
    }
}
