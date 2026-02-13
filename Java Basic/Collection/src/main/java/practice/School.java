package practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class School {
    private String name;
    private ArrayList<Student>  students = new ArrayList<>();

    public void register(Student student){
        students.add(student);
    }

    public void showStudent(){
        for(Student student : students){
            System.out.println("Name : " + student.getName() + " Age : " + student.getAge());

        }
    }
    public void removeStudent(String name){
//        Student student1 = null;
//        for(Student student : students){
//            if(student.getName().compareTo(name) == 0){
//                student1 = student;
//            }
//        }
//        students.remove(student1);


        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()){
            Student student = iterator.next();
            if(student.getName().compareTo(name) == 0){
                iterator.remove();
            }
        }
    }

    public void sortStudentByName(){
        Comparator<Student> studentComparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        students.sort(studentComparator);
    }
    public void findStudentByname(String name){
        for (Student student : students){
            if(student.getName().compareTo(name) == 0){
                System.out.println("Name : " + student.getName() + " Age : " + student.getAge());
            }
        }
    }


    public void updateStudent(String name , Student student){
        int index = -1;
        for(int i = 0 ; i < students.toArray().length ; i++){
            if (students.get(i).getName().compareTo(name) == 0){
                index = i;
            }
        }
        students.set(index ,student);

    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}
