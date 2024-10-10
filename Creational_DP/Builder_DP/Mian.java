package Creational_DP.Builder_DP;

public class Mian {
    public static void main(String[] args) {
        User user = new User.UserBuilder().setEmailId("fsRakib@gmail.com").setUserId("wfewfwfwfe")
                .setUserName("fsRakib").build();
        System.out.println(user);

        User user2 = new User.UserBuilder().setEmailId("arif@gmail.com").setUserName("Arif").build();

        System.out.println(user2);

    }
}
