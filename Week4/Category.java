import java.util.List;

public class Category {
    private Integer id;
    private String name;
    private boolean isAvailable;
    private List<Category> subCategory;

    public Category(String name, boolean isAvailable, List<Category> subCategory) {
        this.name = name;
        this.isAvailable = isAvailable;
        this.subCategory = subCategory;
    }

    public Category() {
    }

    public void setId(Integer id) {
        this.id = id;
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

    public List<Category> getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(List<Category> subCategory) {
        this.subCategory = subCategory;
    }
}
