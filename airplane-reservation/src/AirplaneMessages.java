import utils.CommonUtils;

public class AirplaneMessages {
    public static Seat seatsData;

    public static int seatReservation() {
        System.out.println("Please enter the seat number you want to reserve");
        int reserveInput = CommonUtils.s.nextInt();
        return reserveInput;
    }

    public static void seatTakenStatus() {
        System.out.println("Seat " + seatsData.getSeatNumber() + ", Availability: TAKEN");
    }

    public static void seatFreeStatus() {
        System.out.println("Seat " + seatsData.getSeatNumber() + ", Availability: FREE");
    }

    public static void seatTakenMessage() {
        System.out.println("This seat is taken");
    }

    public static void reservedSeat() {
        System.out.println("This seat is reserved");
    }


    public static void listSeats(SeatRepo seatRepo) {
        for (Seat seat : seatRepo.getList()) {
            System.out.println(seat.getSeatNumber() + seat.getSeatStatus());
        }
    }

}
