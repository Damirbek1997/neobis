import java.util.List;

public class Product {
    private Integer id;
    private String name;
    private Integer price;
    private boolean isAvailable;
    private List<Article> articleId;
    private List<SubCategory> subCategoryId;
    private List<Category> categoryId;

    public Product(String name, Integer price, boolean isAvailable, List<Article> articleId, List<SubCategory> subCategoryId, List<Category> categoryId) {
        this.name = name;
        this.price = price;
        this.isAvailable = isAvailable;
        this.articleId = articleId;
        this.subCategoryId = subCategoryId;
        this.categoryId = categoryId;
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

    public List<Article> getArticleId() {
        return articleId;
    }

    public void setArticleId(List<Article> articleId) {
        this.articleId = articleId;
    }

    public List<SubCategory> getSubCategoryId() {
        return subCategoryId;
    }

    public void setSubCategoryId(List<SubCategory> subCategoryId) {
        this.subCategoryId = subCategoryId;
    }

    public List<Category> getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(List<Category> categoryId) {
        this.categoryId = categoryId;
    }
}
