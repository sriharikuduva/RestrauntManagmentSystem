import java.util.List;

public class Meal {
    private int mealID;
    private TableSeat seat;
    private List<MenuItem> menuItems;

    public int getMealID() {
        return mealID;
    }
    public void setMealID(int mealID) {
        this.mealID = mealID;
    }

    public TableSeat getSeat() {
        return seat;
    }
    public void setSeat(TableSeat seat) {
        this.seat = seat;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }
    public void setMenuItems(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }
}