package comments;
import java.util.*;

public class Comments<Public> {
    int postId;
    String email;
    String comment;

    public Comments(int postId, String email, String comment) {
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

//    public static void main(String[] args) {
//        List<Comments> comment = new ArrayList<>();
//        Comments comment1 = new Comments(1, "nikil@gmail.com", "what to improve the products");
//        Comments comment2 = new Comments(2, "sam@gmail.com", "what to improve the delivery");
//        Comments comment3 = new Comments(3, "ramu@gmail.com", "what to improve the delivery");
//        Comments comment4 = new Comments(4, "rak@gmail.com", "what to improve the delivery");
//        comment.add(comment1);
//        comment.add(comment2);
//        comment.add(comment3);
//        comment.add(comment4);
//        for (Comments commentr : comment) {
//            System.out.println(commentr.getPostId() + " " + commentr.getEmail() + " " + commentr.getComment());
//
//
//        }
//    }
}
