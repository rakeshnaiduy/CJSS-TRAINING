package posts;
import java.util.*;

public class Posts {
    int postId;
    String email;
    String heading;
    String description;

    public Posts(int postId, String email, String heading, String description) {
        this.postId = postId;
        this.email = email;
        this.heading = heading;
        this.description = description;
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

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Posts{" +
                "postId=" + postId +
                ", email='" + email + '\'' +
                ", heading='" + heading + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

//    public static void main(String[] args){
//        List<Posts> post=new ArrayList<>();
//        Posts post1= new Posts(1,"nikil@gmail.com", "about", "nice website");
//        Posts post2= new Posts(2,"sam@gmail.com", "content", "nice content");
//        Posts post3= new Posts(3,"ramu@gmail.com", "delivery", "satisfied delivery");
//        Posts post4= new Posts(4,"rak@gmail.com", "products", "nice products");
//        post.add(post1);
//        post.add(post2);
//        post.add(post3);
//        post.add(post4);
//         for(int i=0;i<post.size();i++){
//            System.out.println(post.get(i));
// }
//    }
}
