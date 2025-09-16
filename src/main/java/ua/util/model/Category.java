package ua.util.model;

public class Category extends BaseEntity {
    private String name;
    private String description;

    public Category(String name, String description) {
        super();
        this.name = name;
        this.description = description;
    }

    public String getName() { return name; }
    public String getDescription() { return description; }

    @Override
    public String toString() {
        return "Category#" + id + " " + name + " (" + description + ")";
    }
}
