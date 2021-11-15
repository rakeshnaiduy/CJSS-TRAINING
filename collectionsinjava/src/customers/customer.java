package customers.model;
import java.util.*;
public class customer {
        String name;
        String emailid;

        public customer(String name, String emailid) {
            this.name = name;
            this.emailid = emailid;
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }
    public static void main(String[] args) {
            List<customer> customers = new ArrayList<>();
            customer customer1 = new customer("rakesh", "nikil@gmail.com");
            customer customer2 = new customer("sam", "sam@gmail.com");
            customer customer3 = new customer("suresh", "ramu@gmail.com");
            customer customer4 = new customer("ram", "rak@gmail.com");
            customers.add(customer1);
            customers.add(customer2);
            customers.add(customer3);
            customers.add(customer4);
            for (customer customer : customers) {
                System.out.println(customer.getName()+ " "+ customer.getEmailid());
            }

        }

}

