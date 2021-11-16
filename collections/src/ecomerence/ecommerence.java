package ecomerence;

import java.util.ArrayList;
import java.util.List;

public class ecommerence  {
    public static void main(String[] args) {
            List<customers.model.customer> customers = new ArrayList<>();
            customers.model.customer customer1 = new customers.model.customer("rakesh", "nikil@gmail.com");
            customers.model.customer customer2 = new customers.model.customer("sam", "sam@gmail.com");
            customers.model.customer customer3 = new customers.model.customer("suresh", "ramu@gmail.com");
            customers.model.customer customer4 = new customers.model.customer("ram", "rak@gmail.com");
            customers.add(customer1);
            customers.add(customer2);
            customers.add(customer3);
            customers.add(customer4);
            System.out.println("task-2");
            for (customers.model.customer customer : customers) {
                System.out.println("customer name:"+customer.getName()+ " "+ "customer emailid:"+customer.getEmailid());
            }
        List<posts.Posts> post=new ArrayList<>();
        posts.Posts post1= new posts.Posts(1,"nikil@gmail.com", "about", "nice website");
        posts.Posts post2= new posts.Posts(2,"sam@gmail.com", "content", "nice content");
        posts.Posts post3= new posts.Posts(3,"ramu@gmail.com", "delivery", "satisfied delivery");
        posts.Posts post4= new posts.Posts(4,"rak@gmail.com", "products", "nice products");
        post.add(post1);
        post.add(post2);
        post.add(post3);
        post.add(post4);
//         for(int i=0;i<post.size();i++) {
//             System.out.println(post.get(i));
//         }
            System.out.println("task-3");
            for(customers.model.customer c : customers){
                for(posts.Posts p:post){
                    if(c.getEmailid()== p.getEmail()){
                        System.out.println("customer name:"+c.getName()+" "+"heading:"+p.getHeading()+" "+"description:"+p.getDescription());
                    }

                }

            }

        List<comments.Comments> comment = new ArrayList<>();
        comments.Comments comment1 = new comments.Comments(1, "nikil@gmail.com", "what to improve the products");
        comments.Comments comment2 = new comments.Comments(2, "sam@gmail.com", "what to improve the delivery");
        comments.Comments comment3 = new comments.Comments(3, "ramu@gmail.com", "what to improve the delivery");
        comments.Comments comment4 = new comments.Comments(4, "rak@gmail.com", "what to improve the delivery");
        comment.add(comment1);
        comment.add(comment2);
        comment.add(comment3);
        comment.add(comment4);

//        for (comments.Comments commentr : comment) {
//            System.out.println(commentr.getPostId() + " " + commentr.getEmail() + " " + commentr.getComment());
//
//        }
        System.out.println("task-4");
        for(customers.model.customer c: customers){
            for(posts.Posts p: post){
                for(comments.Comments co:comment){
                    if(c.getEmailid()==p.getEmail()&&p.getEmail()==co.getEmail()){
                        System.out.println("customer name:"+c.getName()+" "+"heading:"+p.getHeading()+" "+":description:"+p.getDescription()+" "+"comment:"+co.getComment()+" "+"customer name:"+c.getName());

                    }
                }

            }
        }

}
}

