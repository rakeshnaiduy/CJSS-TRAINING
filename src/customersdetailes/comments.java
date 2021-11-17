package customersdetailes;

import java.util.ArrayList;
import java.util.List;

public class comments {
    int postId;
    String email;
    List<String> comments = new ArrayList();

    public comments(int postId, String email, List<String> comments) {
        this.postId = postId;
        this.email = email;
        this.comments = comments;

    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getComments() {
        return comments;
    }

    public void setComments(List<String> comments) {
        this.comments = comments;
    }
}
