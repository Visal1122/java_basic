package StaticKeyword;



public class StaticKeyWordDemo {
    public static void main(String[] args) {
        Student st1 = new Student("Dara" , Gender.MALE , Grade.THREE);
        Student st2 = new Student("Thida" , Gender.MALE , Grade.ONE);
        st1.setName("Dary");
        Student.numberOfStudent = 30;
        st1.numberOfStudent =20;
        System.out.println(st1.toString());
        System.out.println(st2.toString());
    }
}
