import java.util.ArrayList;

public class AirplaneReservation {
    private static SeatRepo seatRepo = new SeatRepo();

    public static void getAirplane() {
        AirplaneMessages.listSeats(seatRepo);
        int userInput = AirplaneMessages.seatReservation();
        seatRepo.reserveSeat(userInput);
    }


    //    public static void getSeatsStatus(SeatRepo statusArray) {
//        for (int i = 0; i < statusArray.getList().size(); i++) {
//            int i2 = i + 1;
//            seatsData.setSeatNumber(i2);
//            if (seat.get(i) == SeatStatus.TAKEN) {
//                AirplaneMessages.seatTakenStatus();
//            } else if (statusArray.get(i) == SeatStatus.FREE) {
//                AirplaneMessages.seatFreeStatus();
//            }
//
//        }
//    }

    public static void listFreeSeats(ArrayList<SeatStatus> statusArrayList) {
        for (int i = 0; i < statusArrayList.size(); i++) {
            int i2 = i + 1;
            if (statusArrayList.get(i) == SeatStatus.FREE) {
                AirplaneMessages.seatFreeStatus();
            }
        }
    }

}
