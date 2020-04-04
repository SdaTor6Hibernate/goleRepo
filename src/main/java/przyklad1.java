import dao.GenericDao;
import dao.OrderDao;
import model.Order;
import model.Product;

import java.util.List;

public class przyklad1 {
    public static void main(String[] args) {
        GenericDao<Product> productDao = new GenericDao<>(Product.class);
        OrderDao orderDao = new OrderDao();

        Product product = productDao.findById(2);
        List<Order> orders = orderDao.findAllContainingProduct(product);

        orders.forEach(order -> {
            System.out.println("Order No: "+order.getId());
            order.getCart().forEach(cart -> {
                System.out.println("Product Name: "+cart.getProduct().getName());
                System.out.println("Product Quantity: "+cart.getQuantity());
            });
        });

    }
}
