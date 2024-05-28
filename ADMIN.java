public class Admin extends User {
    String staffNumber;
    void uploadResults(String course, float score) {
        System.out.println(course);
        System.out.println(score);
    }
    public static void main(String[] args) {
        Admin adminName = new Admin();
        adminName.name = "Kingsley";
        adminName.password = "737373";
        System.out.println(adminName.register());
    }
} 
