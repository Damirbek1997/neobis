import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Order {
    private Integer id;
    private String userEmail;
    private BigDecimal total;
    private Date orderDate;
    private List<Product> orderProduct;

    public Order(String userEmail, BigDecimal total, Date orderDate, List<Product> orderProduct) {
        this.userEmail = userEmail;
        this.total = total;
        this.orderDate = orderDate;
        this.orderProduct = orderProduct;
    }

    public Order() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public List<Product> getOrderProduct() {
        return orderProduct;
    }

    public void setOrderProduct(List<Product> orderProduct) {
        this.orderProduct = orderProduct;
    }
}
