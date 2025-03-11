class MovieTicket{
    String movieName;
    String seatNumber;
    int price;

    MovieTicket(String movieName){
        this.movieName = movieName;
    }
    
    void bookTicket(String seat, int price){
        this.seatNumber = seat;
        this.price = price;
    }

    void display(){
        System.out.println("Movie Name is " + movieName);
        System.out.println("Seat Number is " + seatNumber);
        System.out.println("Price of your ticket is " + price);
    }
}

public class TicketBooking {
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("Hello Coding");
        ticket.bookTicket("L1",1000);
        ticket.display();
    }
}