import java.util.List;

public class Category {
    private Integer id;
    private String name;
    private boolean isAvailable;
    private List<SubCategory> subCategory;

    public Category(String name, boolean isAvailable, List<SubCategory> subCategory) {
        this.name = name;
        this.isAvailable = isAvailable;
        this.subCategory = subCategory;
    }

    public Category() {
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

    public List<SubCategory> getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(List<SubCategory> subCategory) {
        this.subCategory = subCategory;
    }
}
