package StudentCrud;

import java.util.ArrayList;
import java.util.HashMap;

public class StudentBackend{

    private String name;
    private int age;
    private HashMap<String, Integer> StudentList;
    public StudentBackend(String name, int age){
        this.name = name;
        this.age = age;
        StudentList = new HashMap<>();

    }

    public void addStudent(String name, int age){
        if(!StudentList.containsKey(name)){
            StudentList.put(name, age);
            System.out.println("Student qo'shildi: " + name);
        }else{
            System.out.println("Student allaqachon bor");
        }
    }

    public HashMap<String, Integer> getStudentList(){
        return StudentList;
    }
    public void removeStudent(String name, int age){
        if (StudentList.containsKey(name)) {
            StudentList.remove(name,age);
            System.out.println(name + "O'chirildi");
        }
    }
}
