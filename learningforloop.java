public class learningforloop {
    public static void main(String[] args) {

        int i = 6;

        switch(i){
            case 1:
                System.out.print("Monday");
                break;
            case 2:
                System.out.print("Tuesday");
                break;
            case 3:
                System.out.print("Wednesday");
                break;
            case 4:
                System.out.print("Thursday");
                break;
            case 5:
                System.out.print("Friday");
                break;
            case 6:
                System.out.print("Saturday");
                break;
            case 7:
                System.out.print("Sunday");
                break;

            default:
                System.out.print("N/A");
                break;
        }

        // Using 24 Hour Time because I have no clue how to make it so that it gets set to 1 PM after 12:00
        
        System.out.println(" is the current day. Your schedule: ");

        for(int p=1;p<=12;p++)
        {
            System.out.println("    " + (p+11) + ":00" + " - " + (p+12) + ":00" + "   NOTHING");
        }
    }
}        