public class ticket {
    private Movie movie;
    private int studioNumber;
    private double price;
    private String seat;

    public ticket(Movie movie, int studioNumber, String seat) {
        this.movie = movie;
        this.studioNumber = studioNumber;
        this.seat = seat;
        this.price = 0.0; 
    }

    public String getTicketInfo() {
        return "Movie: " + movie.getTitle() + ", Studio Number: " + studioNumber + ", Seat: " + seat + ", Price: " + price;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getStudioNumber() {
        return studioNumber;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getSeat() {
        return seat;
    }

    public double getTicketPrice(String type) {
        if (type.equals("adult")) {
            return price * 1.0; 
        } else if (type.equals("child")) {
            return price * 0.5;
        } else {
            return 0.0; 
        }
    }

    public static void main(String[] args) {
        Movie movie = new Movie("Upin", 9.3);
        ticket ticket = new ticket(movie, 1, "A1");
        ticket.setPrice(10.0);
        System.out.println(ticket.getTicketInfo());
    }
}