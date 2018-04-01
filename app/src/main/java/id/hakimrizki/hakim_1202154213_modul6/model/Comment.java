package id.hakimrizki.hakim_1202154213_modul6.model;

/**
 * Created by hakimrizki on 31/03/18.
 */

public class Comment {
    String id;
    String username;
    String comment;

    public Comment() {
    }

    public Comment(String id, String username, String comment) {
        this.id = id;
        this.username = username;
        this.comment = comment;
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getComment() {
        return comment;
    }
}
