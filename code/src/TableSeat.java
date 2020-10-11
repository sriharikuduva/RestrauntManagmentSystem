import metadata.SeatType;

public class TableSeat {
    private int tableSeatNumber;
    private SeatType type;

    public int getTableSeatNumber() {
        return tableSeatNumber;
    }
    public void setTableSeatNumber(int tableSeatNumber) {
        this.tableSeatNumber = tableSeatNumber;
    }

    public SeatType getType() {
        return type;
    }
    public void setType(SeatType type) {
        this.type = type;
    }
}