public class MealItem {
    private int mealItemID, quantity;
    private MenuItem menuItem;

    public int getMealItemID() {
        return mealItemID;
    }
    public void setMealItemID(int mealItemID) {
        this.mealItemID = mealItemID;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public MenuItem getMenuItem() {
        return menuItem;
    }
    public void setMenuItem(MenuItem menuItem) {
        this.menuItem = menuItem;
    }
}