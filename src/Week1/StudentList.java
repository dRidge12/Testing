package Week1;

public class StudentList {
    public static void main(String [] args ) {
        Student student1 = new Student("Dan", "1");
        Student student2 = new Student("Joe", "2");
        Student student3 = new Student("Mike", "3");
        Student student4 = new Student("John", "4");
        Student student5 = new Student("Bernard", "5");
        
        Student [] studentArray = new Student[5];
        studentArray[0] = student1;
        studentArray[1] = student2;
        studentArray[2] = student3;
        studentArray[3] = student4;
        studentArray[4] = student5;
        
        for (int i = 0; i<studentArray.length; i++){
            System.out.println(studentArray[i].getName());
        }
        
        for (Student student: studentArray){
            System.out.println(student.getStudentID());
        }
    }
}
