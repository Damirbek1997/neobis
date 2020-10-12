import java.util.List;

public class SubCategory {
    private int id;
    private String name;
    private boolean isAvailable;
    private List<Category> categoryId;

    public SubCategory(String name, boolean isAvailable, List<Category> categoryId) {
        this.name = name;
        this.isAvailable = isAvailable;
        this.categoryId = categoryId;
    }

    public SubCategory() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public List<Category> getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(List<Category> categoryId) {
        this.categoryId = categoryId;
    }
}
