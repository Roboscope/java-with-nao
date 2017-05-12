/**
 * ???
 */
public class Main {

    public static void main(String[] args) {
        Profile miriamsProfile = new Profile();
        miriamsProfile.addFriend("Erika");
        miriamsProfile.addFriend("Max");
        String miriamsFriends = miriamsProfile.getFriends();
        System.out.println(miriamsFriends);
    }



}


