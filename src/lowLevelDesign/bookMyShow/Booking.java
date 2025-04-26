package lowLevelDesign.bookMyShow;

public class Booking {
    private int id;
    private String bookingDate;
    private String showTime;
    private int numberOfSeats;
    private double totalAmount;
    private Payment payment;
    private Show show;
    private Screen screen;

    public Booking(int id, String bookingDate, String showTime, int numberOfSeats, double totalAmount, Payment payment, Show show, Screen screen) {
        this.id = id;
        this.bookingDate = bookingDate;
        this.showTime = showTime;
        this.numberOfSeats = numberOfSeats;
        this.totalAmount = totalAmount;
        this.payment = payment;
        this.show = show;
        this.screen = screen;
    }

    public String makePayment() {
        return payment.makePayment();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getShowTime() {
        return showTime;
    }

    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }
}
