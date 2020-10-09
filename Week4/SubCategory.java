public class SubCategory {
    private int id;
    private String name;
    private boolean isAvailable;
    private Integer idCategory;

    public SubCategory(String name, boolean isAvailable, Integer idCategory) {
        this.name = name;
        this.isAvailable = isAvailable;
        this.idCategory = idCategory;
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

    public Integer getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Integer idCategory) {
        this.idCategory = idCategory;
    }
}
