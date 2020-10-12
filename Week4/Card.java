import java.util.List;

public class Card {
    private Long id;
    private String cardNumber;
    private List<User> userId;

    public Card(String cardNumber, List<User> userId) {
        this.cardNumber = cardNumber;
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public List<User> getUserId() {
        return userId;
    }

    public void setUserId(List<User> userId) {
        this.userId = userId;
    }
}
