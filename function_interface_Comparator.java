import java.util.*;

public class function_interface_Comparator {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        // First Method

       /*  list.add(new Student("Ram",100, 85));
        list.add(new Student("Sita",101, 90));
        list.add(new Student("Ankit",102, 70));
        list.add(new Student("Vishal",103, 80));

        Collections.sort(list);
        for(Student s : list){
            System.out.println(s.name + " , " + s.rollNo + " , " + s.marks);
        }  */

        // Second Method     ye annomous method hai

        list.add(new Student("Ram",100, 85));
        list.add(new Student("Sita",101, 90));
        list.add(new Student("Ankit",102, 70));
        list.add(new Student("Vishal",103, 80));

        Comparator<Student> C1 = new SortByName();
        Comparator<Student> C2 = new SortByRollNo();
        Comparator<Student> C3 = new SortByMarks();

       //Collections.sort(list, C1);
        //Collections.sort(list, C2);
        Collections.sort(list, C3);   // ye marks ke basic par 

        for(Student s : list){
            System.out.println(s.name + " , " + s.rollNo + " , " + s.marks);
        }  

    }
}

class SortByName implements Comparator<Student>{
    @Override
    public int compare(Student s1, Student s2){
        return s1.name.compareTo(s2.name);
    }
}

class SortByRollNo implements Comparator<Student>{
    @Override
    public int compare(Student s1, Student s2){
        return s1.rollNo - s2.rollNo;
    }
}

class SortByMarks implements Comparator<Student>{
    @Override
    public int compare(Student s1, Student s2){
        return s1.marks - s2.marks;
    }
}  

// First Method

/*class Student implements Comparable<Student> {
    String name;
    int rollNo;
    int marks;

    public Student(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student s) {
       // return this.marks - s.marks;  // ye marks ke basic par 
        return this.name.compareTo(s.name);  // ye name ke basic par 
        //return this.rollNo - s.rollNo;          // ye rollNo ke basic par 
    }
}*/

// Second Method 
class Student {
    String name;
    int rollNo;
    int marks;

    public Student(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }
}

// lambda Expression next program me hai  