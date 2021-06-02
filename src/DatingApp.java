import java.util.Random;

public class DatingApp {
    public static void main(String[] args) {

        Profile profile1 = new Profile();

        Profile profile2 = new Profile("Tanya", 91,false);

        System.out.println(profile1.getName());
        System.out.println(profile1.getAge());
        System.out.println(profile1.isMale());

        profile1.setName("Georges");
        profile1.setAge(89);
        profile1.setMale(true);

        System.out.println(profile1.getName());
        System.out.println(profile1.getAge());
        System.out.println(profile1.isMale());

        System.out.println(profile2.getName());
        System.out.println(profile2.getAge());
        System.out.println(profile2.isMale());
    }
}
