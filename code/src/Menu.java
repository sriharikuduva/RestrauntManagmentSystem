import java.util.List;

public class Menu {
    private int menuID;
    private String title, description;
    private List<MenuSection> menuSections;

    public int getMenuID() {
        return menuID;
    }
    public void setMenuID(int menuID) {
        this.menuID = menuID;
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

    public List<MenuSection> getMenuSections() {
        return menuSections;
    }
    public void setMenuSections(List<MenuSection> menuSections) {
        this.menuSections = menuSections;
    }
}