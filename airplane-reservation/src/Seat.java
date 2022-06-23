public class Seat {
    private int seatNumber;
    private SeatStatus status;

    public Seat(int number, SeatStatus status) {
        this.seatNumber = number;
        this.status = status;
    }
    
    public int getSeatNumber() {
        return seatNumber;
    }
    public String getSeatStatus() {
        String seatStatus = null;
        if (status == SeatStatus.FREE) {
            seatStatus = "Free";
        } else if (status == SeatStatus.TAKEN) {
            seatStatus = "Taken";
        }
        return seatStatus;
    }

    public SeatStatus getStatus() {
        return status;
    }
    public int getSingleSeatNumber(int givenNum) {
        return seatNumber;
    }

    public int setSeatNumber(int newNum) {
        seatNumber = newNum;
        return seatNumber;
    }
    public SeatStatus setSeatStatus(SeatStatus seatStatus) {
        status = seatStatus;
        return status;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
