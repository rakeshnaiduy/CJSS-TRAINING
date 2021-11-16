package customersdetailes;

public class comments {
   int  postId;
    String email;
    String comment;

    public comments(int postId, String email, String comment) {
        this.postId = postId;
        this.email = email;
        this.comment = comment;
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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
