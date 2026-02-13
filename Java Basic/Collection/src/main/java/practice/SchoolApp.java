package practice;

public class SchoolApp {

    public static void main(String[] args) {
        School school = new School();
        school.setName("Visal School");
        Student st1 = new Student("Visal" , 21 , Gender.MALE);
        Student st2 = new Student("Nan" , 20 , Gender.MALE);
        Student st3 = new Student("Jing" , 22 , Gender.MALE);
        Student st4 = new Student("Thya" , 22 , Gender.MALE);

        school.register(st1);
        school.register(st2);
        school.register(st3);

//        school.removeStudent("Visal");

        school.sortStudentByName();
//        System.out.println(school.getStudents());
        school.updateStudent("Jing" , st4);
        school.showStudent();
        school.findStudentByname("Nan");

    }
}


