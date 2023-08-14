import model.Cart;
import model.Item;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Application {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Cart cart1 = new Cart();
        cart1.setTotal(100);
        cart1.setName("Cart 1");

        Cart cart2 = new Cart();
        cart2.setTotal(200);
        cart2.setName("Cart 2");

        Cart cart3 = new Cart();
        cart3.setTotal(300);
        cart3.setName("Cart 3");

        Item item1 = new Item();
        item1.setTotal(50);

        Item item2 = new Item();
        item2.setTotal(75);

        cart1.getItemSet().add(item1);
        cart1.getItemSet().add(item2);
        cart2.getItemSet().add(item2);

        item2.getCartSet().add(cart3);





        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

//        for (int i = 1; i < 21; i++) {
//            Cart cartToRemove = (Cart) session.get(Cart.class, i);
//            if (cartToRemove != null) {
//                session.delete(cartToRemove);
//            }
//        }


        session.persist(cart1);
        session.persist(cart2);
        session.persist(item1);
        session.persist(item2);

        transaction.commit();
        session.close();

        sessionFactory.close();
     }
}
