import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Order {
    private Integer id;
    private String userEmail;
    private BigDecimal total;
    private Date orderDate;
    private List<Product> orderProductId;
    private List<Card> cardId;

    public Order(String userEmail, BigDecimal total, Date orderDate, List<Product> orderProductId, List<Card> cardId) {
        this.userEmail = userEmail;
        this.total = total;
        this.orderDate = orderDate;
        this.orderProductId = orderProductId;
        this.cardId = cardId;
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

    public List<Product> getOrderProductId() {
        return orderProductId;
    }

    public void setOrderProductId(List<Product> orderProductId) {
        this.orderProductId = orderProductId;
    }

    public List<Card> getCardId() {
        return cardId;
    }

    public void setCardId(List<Card> cardId) {
        this.cardId = cardId;
    }
}
