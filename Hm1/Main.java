package Hm1;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> s = new LinkedList<>();
        s.add(new Student("Саша", "Петров", 7.86));
        s.add(new Student("Маша", "Скороход", 9.55));
        s.add(new Student("Миша", "Ону", 7.55));
        s.add(new Student("Алёна", "Некруш", 8.65));
    }
}
