package Hm2;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    private String name;
    private ArrayList<Student> students = new ArrayList<>();

    public Main(String name) {
        this.name = name;
    }
    public String printS() {
        StringBuilder sb = new StringBuilder();
        for (Student s : students) {
            sb.append(s).append("\n");
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        Main journal = new Main("Journal");
        Student s1 = new Student(4.23,"Nikita","Supraa");
        Student s2 = new Student(6.67,"Sasha","Toyota");
        Student s3 = new Student(8.44,"Stas","Ice");
        Student s4 = new Student(4.89,"Colya","Pool");
        Student s5 = new Student(9.33,"Masha","Lol");

        journal.students.add(s1);
        journal.students.add(s2);
        journal.students.add(s3);
        journal.students.add(s4);
        journal.students.add(s5);
        System.out.println(journal.students.get(0));
        System.out.println(journal.printS());
    }
}

