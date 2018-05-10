import java.util.Scanner;

class SwitchStatement
{
    public static void main(String[] args){

        // Ask for user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Where are you from? ");
        String country = sc.next().toLowerCase();

        // Test the variable against the cases
        switch(country)
        {
            case "ireland": System.out.println("So you are Irish"); break;
            case "france": System.out.println("So you are French"); break;
            case "brazil": System.out.println("So you are Brazilian"); break;
            default: System.out.println("Unknown"); break;
        }
    }
}