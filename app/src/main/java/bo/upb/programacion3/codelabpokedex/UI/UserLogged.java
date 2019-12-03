package bo.upb.programacion3.codelabpokedex.UI;

import bo.upb.programacion3.codelabpokedex.UserTypes;

public class UserLogged {
    private String email;

    private UserTypes type;

    public UserLogged(String email, UserTypes type) {
        this.email = email;
        this.type = type;
    }

    public String getEmail() {
        return email;
    }

    public UserTypes getType() {
        return type;
    }
}
