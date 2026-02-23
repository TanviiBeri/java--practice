package pract;
import java.util.Scanner;

class Person{
    String name;
    int age;
    void displayPerson(String n, int a){
        System.out.println("Person name:" +name);
        System.out.println("Person age:" +age);
    }
}

class Student extends Person{
    int studentid;
    void displayStudent(int s){
        System.out.println("Student id: " +studentid);
    }
}

class GraduateStudent extends Student{
    String researchTopic;
    void displayResearchdetails(String rt){
        System.out.println("research topic: " +researchTopic);
    }
}
public class academic_platform {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    }
}
