import java.util.List;

public class User {
    private Integer id;
    private String name;
    private String password;
    private String email;
    private List<Card> cardId;

    public User(String name, String password, String email, List<Card> cardId) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.cardId = cardId;
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Card> getCardId() {
        return cardId;
    }

    public void setCardId(List<Card> cardId) {
        this.cardId = cardId;
    }
}
