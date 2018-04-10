package id.hakimrizki.hakim_1202154213_modul6.model;

/**
 * Created by hakimrizki on 30/03/18.
 */

public class Post {
    private String id;
    private String userID;
    private String username;
    private String titlePost;
    private String post;
    private String imagePost;

    public Post() {
    }

    public Post(String id, String userID, String username, String imagePost, String titlePost, String post) {
        this.id = id;
        this.userID = userID;
        this.username = username;
        this.titlePost = titlePost;
        this.post = post;
        this.imagePost = imagePost;
    }

    public String getId() {
        return id;
    }

    public String getUserID() {
        return userID;
    }

    public String getUsername() {
        return username;
    }

    public String getTitlePost() {
        return titlePost;
    }

    public String getPost() {
        return post;
    }

    public String getImagePost() {
        return imagePost;
    }
}
