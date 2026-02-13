public class InheritanceDemo {
    public static void main(String[] args) {
        Animal an = new Animal();
        an.name = "Lulu";
        an.eat();
        Dog d = new Dog();
        d.name = "Naa";
        d.eat();
        d.showInfo();
    }
}
