package id.hakimrizki.hakim_1202154213_modul6.model;

/**
 * Created by hakimrizki on 31/03/18.
 */

public class User {
    String userId;
    String username;
    String email;

    public User() {
    }

    public User(String userId, String username, String email) {
        this.userId = userId;
        this.username = username;
        this.email = email;
    }

    public String getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }
}
