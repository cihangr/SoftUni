import java.util.Scanner;

public class cinemaTickets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String movieName = input.nextLine();
        int filledSeats=0, student=0, standard=0, kid=0;
        while (!movieName.equals("Finish")){
            int seats = Integer.parseInt(input.nextLine());
            seats+=seats;
            String ticketType = input.nextLine();
             while (!ticketType.equals("End")){
                 if (filledSeats==seats){
                     break;
                 }
                 if (ticketType.equals("student")){
                     student++;
                     filledSeats++;
                 }
                 if (ticketType.equals("standard")){
                     standard++;
                     filledSeats++;
                 }
                 if (ticketType.equals("kid")){
                     kid++;
                     filledSeats++;
                 }


              ticketType=input.nextLine();
             }

            movieName=input.nextLine();
        }
        System.out.printf("%s - %.2f% full.\n",movieName,(filledSeats));
        System.out.printf("Total tickets: %d\n",filledSeats);
        System.out.printf("%.2f% student tickets.\n",(student/filledSeats)*100);
        System.out.printf("%.2f% standard tickets.\n",(standard/filledSeats)*100);
        System.out.printf("%.2f% kids tickets.",(kid/filledSeats)*100);

    }
}
