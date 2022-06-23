
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SeatRepo {
    private List<Seat> repo = new ArrayList<>();

    SeatRepo() {
        setSeatsStatus();
    }

    public List<Seat> getList() {
        return this.repo;
    }

    public void setSeatsStatus() {
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            int i2 = i + 1;
            if (i == r.nextInt(10)) {
                repo.add(new Seat(i2, SeatStatus.TAKEN));
            } else {
                repo.add(new Seat(i2, SeatStatus.FREE));
            }
        }
    }

    public void reserveSeat(int input) {//change name
        input = input - 1;
        if (!(input > repo.size())) {
            if (repo.get(input).getStatus() == SeatStatus.FREE) {
                repo.set(input, new Seat(input, SeatStatus.TAKEN));
                AirplaneMessages.seatTakenMessage();
            } else if (repo.get(input).getStatus() == SeatStatus.TAKEN) {
                AirplaneMessages.seatTakenStatus();
            }
        }
    }

}
