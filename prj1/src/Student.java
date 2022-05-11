
public class Student {
int StudentId;
String StudentName;
Course course;
void input(int id, String name, Course c) {
    StudentId=id;
    StudentName=name;
    course=c;
}
void print() {
    System.out.println("Details: \nName: " + StudentName);
    System.out.println("ID: " + StudentId);
    System.out.println("Course Details: Course name: " + course.Course_name + " Duration in days : "+ course.duration);
}

 

}
class Course{
    String Course_name;
    int duration;
    void input(String name, int dur) {
        Course_name=name;
        duration= dur;
    }
    
}
 