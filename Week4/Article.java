import java.util.List;

public class Article {
    private Long id ;
    private String title;
    private String description;
    private List<Product> productId;
    private List<SubCategory> subCategoryId;
    private List<Category> categoryId;

    public Article(String title, String description, List<Product> productId, List<SubCategory> subCategoryId, List<Category> categoryId) {
        this.title = title;
        this.description = description;
        this.productId = productId;
        this.subCategoryId = subCategoryId;
        this.categoryId = categoryId;
    }

    public Article() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Product> getProductId() {
        return productId;
    }

    public void setProductId(List<Product> productId) {
        this.productId = productId;
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
