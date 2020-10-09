public class SubCategory {
    private int id;
    private String name;
    private boolean isAvailable;
    private Integer id_category;

    public SubCategory(String name, boolean isAvailable, Integer id_category) {
        this.name = name;
        this.isAvailable = isAvailable;
        this.id_category = id_category;
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

    public Integer getId_category() {
        return id_category;
    }

    public void setId_category(Integer id_category) {
        this.id_category = id_category;
    }
}
