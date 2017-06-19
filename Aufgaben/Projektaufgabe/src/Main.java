@SuppressWarnings("ALL")

/**
 * ???
 */
public class Main {

    public static void main(String[] args) {
        Profile adminsProfile = new Profile();
        Profile hackersProfile = adminsProfile;
        adminsProfile.age = 33;
        hackersProfile.age = 12;
        adminsProfile.printAge();
    }



}


