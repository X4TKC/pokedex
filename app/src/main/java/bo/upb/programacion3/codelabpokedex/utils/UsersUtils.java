package bo.upb.programacion3.codelabpokedex.utils;

import java.util.ArrayList;
import java.util.List;

import bo.upb.programacion3.codelabpokedex.Objects.Users;
import bo.upb.programacion3.codelabpokedex.R;

public class UsersUtils {
    public static List<Users> getUsers() {
        List<Users> users = new ArrayList<>();
        users.add(new Users(1, "Ash", R.drawable.ash_ketchum));
        users.add(new Users(2, "Misty", R.drawable.misty));
        users.add(new Users(3, "Brook", R.drawable.brook));
        users.add(new Users(4, "Jessy", R.drawable.jessy));
        users.add(new Users(5, "James", R.drawable.james));

        return users;
    }
}
