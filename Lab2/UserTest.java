public class UserTest {
    public static void main(String[] args) {
        User user1 = new User("230042135", "Khadiza Sultana", "01763016648", "Student");
        System.out.println();
        user1.display();
        System.out.println();
        user1.setUserID("230042141");
        user1.setName("Nondiny");
        user1.setPhoneNo("01745636013");
        user1.setMembershipType("Guest");
        user1.deactivate();
        user1.display();
        System.out.println();
        User user2 = new User("12345678", "Alexandar", "01334567891", "Teacher");
        user2.display();
    }
}
