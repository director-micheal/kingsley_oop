public class Person {
    private String name;
    private String schoolName = "Bingham University";
    private String password;
    private String matric;
    int staffNumber = 737373;
    String getName(){
        return name;
    }
    void setName(String name) {
        this.name = name;
    }
    void setPassword(String password){
        this.password = password;
    }
    Person(String schoolName, String name, String password, String matric){
        this.name = name;
        this.matric = matric;
        this.schoolName = schoolName;
        this.password = password;
    }
    Person(String schoolName, String name, String password, int staffNumber){
        this.name = name;
        this.staffNumber = staffNumber;
        this.schoolName = schoolName;
        this.password = password;
    }
}
