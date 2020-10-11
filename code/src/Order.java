import metadata.OrderStatus;

import java.util.Date;

public class Order {
    private int OrderID;
    private OrderStatus status;
    private Date creationTime;

    private Meal[] meals;
    private Table table;
    private Check check;
    private Waiter waiter;
    private Chef chef;

    public int getOrderID() {
        return OrderID;
    }
    public void setOrderID(int orderID) {
        OrderID = orderID;
    }

    public OrderStatus getStatus() {
        return status;
    }
    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Date getCreationTime() {
        return creationTime;
    }
    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public Meal[] getMeals() {
        return meals;
    }
    public void setMeals(Meal[] meals) {
        this.meals = meals;
    }

    public Table getTable() {
        return table;
    }
    public void setTable(Table table) {
        this.table = table;
    }

    public Check getCheck() {
        return check;
    }
    public void setCheck(Check check) {
        this.check = check;
    }

    public Waiter getWaiter() {
        return waiter;
    }
    public void setWaiter(Waiter waiter) {
        this.waiter = waiter;
    }

    public Chef getChef() {
        return chef;
    }
    public void setChef(Chef chef) {
        this.chef = chef;
    }
}