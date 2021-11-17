import customersdetailes.comments;
import customersdetailes.customers;
import customersdetailes.posts;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] ars) {
        System.out.println("TASk-2");
        List<customers> customer = new ArrayList<>();
        customers customer1 = new customers("rak", "Rak@gmail.com");
        customers customer2 = new customers("ramu", "ramu@gmail.com");
        customers customer3 = new customers("raju", "raju@gmail.com");
        customer.add(customer1);
        customer.add(customer2);
        customer.add(customer3);
        customer.forEach(c -> System.out.println("customername:" + c.getName() + "  " + "email:" + c.getEmail()));
//        for(customers c: customer){
//            System.out.println("customername:"+c.getName()+"  "+"email:"+c.getEmail());
//        }
        System.out.println(" ");
        System.out.println("TASk-3");
        List<posts> post = new ArrayList<>();
        posts post1 = new posts(1, "Rak@gmail.com", "about products", "products are very nice");
        posts post2 = new posts(2, "ramu@gmail.com", "about products", "want to improve the quality of the product");
        posts post3 = new posts(3, "raju@gmail.com", "about delivery", "the delivery was soo fast");
        post.add(post1);
        post.add(post2);
        post.add(post3);
        customer.forEach(c -> {
           post.stream().filter(d ->c.getEmail()==d.getEmail()).forEach(f->System.out.println("customername:"+c.getName()+"  "+"heading:"+f.getHeading()+"  "+"description:"+f.getDescription()));
        });
//        for(customers c:customer){
//            for(posts p: post){
//                if(p.getEmail()==c.getEmail()){
//                    System.out.println("customername:"+c.getName()+"  "+"heading:"+p.getHeading()+"  "+"description:"+p.getDescription());
//                }
//            }
//        }
        System.out.println(" ");
        System.out.println("TASk-4");
        List<comments> comment = new ArrayList<>();
        List<String> comments = new ArrayList<>();
        comments.add("cacghfsg");
        comments.add("ghhggf");
        comments.add("dgfdjfd");
        List<String> comments11=new ArrayList<>();
        comments11.add("ghvjhbhghb");
        comments11.add("chgfgfsdfdg");
        List<String> comments12=new ArrayList<>();
        comments12.add("fyywrrssy");
        comments12.add("frsrxfg");
        comments comment1 = new comments(1, "Rak@gmail.com",comments);
        comments comment2 = new comments(2, "ramu@gmail.com",comments11);
        comments comment3 = new comments(3, "raju@gmail.com",comments12);
        comment.add(comment1);
        comment.add(comment2);
        comment.add(comment3);

        customer.forEach(c -> {
            post.forEach(p -> {
//                comment.forEach(co ->{
//                    if(c.getEmail()==p.getEmail()&&p.getEmail()==co.getEmail()){
//                        System.out.println("customername:"+c.getName()+"  "+"heading:"+p.getHeading()+"  "+"description:"+p.getDescription()+"  "+"comment:"+co.getComment()+"  "+"commentedcustomername:"+c.getName());
//                    }
//                });
                comment.stream()
                        .filter(cou -> c.getEmail() .equals( p.getEmail()) && p.getEmail().equals( cou.getEmail())).forEach(s ->s.getComments().forEach(x-> System.out.println("customername:"+c.getName()+"  "+"heading:"+p.getHeading()+"  "+"description:"+p.getDescription()+"  "+"comment:"+x+"  "+"commentedcustomername:"+c.getName())));

            });
        });
    }
}

//        for(customers c: customer){
//            for(posts p: post){
//                for(comments co: comment){
//                    if(c.getEmail()==p.getEmail()&&p.getEmail()==co.getEmail()){
//                        System.out.println("customername:"+c.getName()+"  "+"heading:"+p.getHeading()+"  "+"description:"+p.getDescription()+"  "+"comment:"+co.getComment()+"  "+"commentedcustomername:"+c.getName());
//                    }
//
//                }
//            }
//        }
//    }
//}
