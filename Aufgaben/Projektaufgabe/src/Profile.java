@SuppressWarnings("ALL")



public class Profile {

    public int age;

    public String friends = "";

    public void addFriend(String friendsName) {
        if (friends.equals("")) {
            friends = friendsName;
        } else {
            friends = friends + ", " + friendsName;
        }
    }

    public void printAge() {
        System.out.println(age);
    }

    public String getFriends() {
        return friends;
    }
}


