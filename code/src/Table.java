import metadata.TableStatus;

import java.util.Date;
import java.util.List;

public class Table {
    private int tableID;
    private TableStatus status;
    private int maxCapacity;
    private int locationIdentifier;

    private List<TableSeat> seats;

    public boolean isTableFree();
    public boolean addReservation();

    public static List<Table> search(int capacity, Date startTime) {
        // return all tables with the given capacity and availability
    }

    public int getTableID() {
        return tableID;
    }
    public void setTableID(int tableID) {
        this.tableID = tableID;
    }

    public TableStatus getStatus() {
        return status;
    }
    public void setStatus(TableStatus status) {
        this.status = status;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }
    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public int getLocationIdentifier() {
        return locationIdentifier;
    }
    public void setLocationIdentifier(int locationIdentifier) {
        this.locationIdentifier = locationIdentifier;
    }

    public List<TableSeat> getSeats() {
        return seats;
    }
    public void setSeats(List<TableSeat> seats) {
        this.seats = seats;
    }
}