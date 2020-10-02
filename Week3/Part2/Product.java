public class Product {
    private Integer id;
    private String name;
    private String description;
    private Integer price;
    private boolean isAvailable;
    private Integer id_subCategory;
    private Integer id_Category;

    public Product(String name, String description, Integer price, boolean isAvailable, Integer id_subCategory, Integer id_Category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.isAvailable = isAvailable;
        this.id_subCategory = id_subCategory;
        this.id_Category = id_Category;
    }

    public Product() {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public Integer getId_subCategory() {
        return id_subCategory;
    }

    public void setId_subCategory(Integer id_subCategory) {
        this.id_subCategory = id_subCategory;
    }

    public Integer getId_Category() {
        return id_Category;
    }

    public void setId_Category(Integer id_Category) {
        this.id_Category = id_Category;
    }
}
