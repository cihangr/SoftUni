import java.util.Scanner;

public class cinemaTickets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double soldSeat=0, student=0, standard=0, kid=0;
        String movieName = input.nextLine();
        while (!movieName.equals("Finish")){
            String movie =movieName;
            double seats = Integer.parseInt(input.nextLine());

            String ticketType = input.nextLine();
             while (!ticketType.equals("End")){
                 ++soldSeat;
                 switch (ticketType){
                     case "student" :
                         ++student;
                         break;
                     case "standard" :
                         ++standard;
                         break;
                     case "kid" :
                         ++kid;
                         break;
                 }
                 if (soldSeat==seats){
                     break;
                 }


              ticketType=input.nextLine();
             }

            System.out.printf("%s - %.2f%% full.\n",movie,soldSeat/seats*100);
            movieName=input.nextLine();
        }
        double totalTickets= student+standard+kid;
        System.out.printf("Total tickets: %d\n",totalTickets);
        System.out.printf("%.2f%% student tickets.\n",(student/totalTickets)*100);
        System.out.printf("%.2f%% standard tickets.\n",(standard/totalTickets)*100);
        System.out.printf("%.2f%% kids tickets.",(kid/totalTickets)*100);

    }
}
