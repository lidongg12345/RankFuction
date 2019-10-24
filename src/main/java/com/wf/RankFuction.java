package com.wf;

/**
 * Created by Administrator on 2019/10/24.
 */
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class RankFuction {
    public static void main(String[] args) {
        List<Student> stus = Arrays.asList(new Student("Tom", 79.5), new Student("Jack", 52), new Student("Amdy", 79.5),
                new Student("Lucy", 68), new Student("Cherry", 79.5), new Student("Jerry", 52), new Student("Sweet", 91),
                new Student("Solem", 65));
        sortedByJava8(stus);
    }

    // Java8 Lambada Stream API group and sort
    public static void sortedByJava8(List<Student> stus) {
        List<Entry<Double, List<Student>>> list = stus.stream().collect(Collectors.groupingBy(Student::getScore)).entrySet()
                .stream().sorted((s1, s2) -> -Double.compare(s1.getKey(), s2.getKey())).collect(Collectors.toList());
        int index = 1;
        for (Entry<Double, List<Student>> entry : list) {
            System.out.print("No:" + index + "\tscore:" + entry.getKey() + "\tname");
            entry.getValue().forEach((s) -> System.out.print("  " + s.getName()));
            System.out.println();
            index+=entry.getValue().size();
        }
    }
}
