/*
    Web Builder 0.0
    Developed by Matthew Belanger
    mattmbelanger@hotmail.com
    github.com/MattBelanger321
*/
import java.util.Scanner;
public class WebBuilder implements Global{
    public static void main(String[] args) {
        System.out.printf("_____/** WELCOME TO WEB BUILDER %.1f **\\_____\n",VERSION);
        System.out.printf("                   **\n                   **\n                   **\n                   **\n                   **\n");
        start();
    }

    private static void start() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a working title for you website: ");
        Webpage usersWebsite = new Webpage(input.nextLine()); //Object to write html file build website and export website
        usersWebsite.build();
    }
}
