@SuppressWarnings("ALL")



public class Profile {

    public String friends = "";

    public void addFriend(String friendsName) {
        if (friends.equals("")) {
            friends = friendsName;
        } else {
            friends = friends + ", " + friendsName;
        }
    }

    public String getFriends() {
        return friends;
    }
}


