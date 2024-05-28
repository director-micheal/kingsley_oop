public class Student extends User {
    String matric_no = "bhu/22/04/05/0073";
    String admission_no = "123456789";
    String registerCourse() {
        if (matric_no.equals("bhu/22/04/05/0073")) {
            return "successfull";
        }
        else{
            return "failed";
        }
    }
    String checkResults() {
        if (matric_no.equals("bhu/22/04/05/0073")) {
            return "successfull";
        }
        else{
            return "failed";
        }
    }
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Kingsley";
        student.password = "forXchange123";
        System.out.println(student.register());
        System.out.println(student.registerCourse());
        System.out.println(student.checkResults());
    }
}