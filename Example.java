import java.util.*;

class Example{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);

        
        double pBasmathi=250.00;
        double pDhal=180.00;
        double pSugar=150.00;
        double pHigland=1200.00;
        double pYoghurt=50.00;
        double pFlour=120.00;
        double pSoap=160.00;

         //q=Quantity , p=price , t=Total//
        
        System.out.println("================================================================================");
        System.out.println("__        __   _                            _          _ __  __            _");
        System.out.println("\\ \\      / /__| | ___ ___  _ __ ___   ___  | |_ ___   (_)  \\/  | __ _ _ __| |_");
        System.out.println(" \\ \\ /\\ / / _ \\ |/ __/ _ \\| '_ ` _ \\ / _ \\ | __/ _ \\  | | |\\/| |/ _` | '__| __|");
        System.out.println("  \\ V  V /  __/ | (_| (_) | | | | | |  __/ | || (_) | | | |  | | (_| | |  | |_");
        System.out.println("   \\_/\\_/ \\___|_|\\___\\___/|_| |_| |_|\\___|  \\__\\___/  |_|_|  |_|\\__,_|_|   \\__|");
        System.out.println("================================================================================");
        System.out.println();
        
        System.out.print("Enter Customer Phone Number - ");
        String phone=input.nextLine();
        System.out.println();
        System.out.print("Enter Customer Name         - ");
        String name=input.nextLine();
        System.out.println();
        System.out.println("=================================================================");
        System.out.println();

        
        System.out.print("Basmathi Qty(Kg) - ");
        int qBasmathi=input.nextInt();
        System.out.println();
        System.out.print("Dhal Qty(Kg)      - ");
        int qDhal=input.nextInt();
        System.out.println();
        System.out.print("Sugar Qty(Kg)     - ");
        int qSugar=input.nextInt();
        System.out.println();
        System.out.print("Higland Qty        - ");
        int qHigland=input.nextInt();
        System.out.println();
        System.out.print("Yoghurt Qty        - ");
        int qYoghurt=input.nextInt();
        System.out.println();
        System.out.print("Flour Qty(Kg)      - ");
        int qFlour=input.nextInt();
        System.out.println();
        System.out.print("Soap Qty           - ");
        int qSoap=input.nextInt();
        System.out.println();


        double tBasmathi=qBasmathi*pBasmathi;
        double tDhal=qDhal*pDhal;
        double tSugar=qSugar*pSugar;
        double tHigland=qHigland*pHigland;
        double tYoghurt=qYoghurt*pYoghurt;
        double tFlour=qFlour*pFlour;
        double tSoap=qSoap*pSoap;
        double total=tBasmathi+tDhal+tSugar+tHigland+tYoghurt+tFlour+tSoap;
        double discount=total*10/100;
        double finalPrice=total-discount;

        System.out.println("+-----------------------------------------------------------------------+");
        System.out.println("|                                                                       |");
        System.out.println("|                    _ __  __          _____ _______                    |");
        System.out.println("|                   (_)  \\/  |   /\\   |  __ \\__   __|                   |");
        System.out.println("|                    _| \\  / |  /  \\  | |__) | | |                      |");
        System.out.println("|                   | | |\\/| | / /\\ \\ |  _  /  | |                      |");
        System.out.println("|                   | | |  | |/ ____ \\| | \\ \\  | |                      |");
        System.out.println("|                   |_|_|  |_/_/    \\_\\_|  \\_\\ |_|                      |");
        System.out.println("|                       225,Galle Road,Panadura.                        |");
        System.out.println("|                                                                       |");
        System.out.println("+-----------------------------------------------------------------------+");
        System.out.printf("|                      # Tel  : %-39s | \n", phone);
        System.out.printf("|                      # Name : %-38s  |\n",name);
        System.out.println("+-----------------------+---------------+---------------+---------------+");
        System.out.println("|                       |       Qty     |   unit price  |      Price    |");
        System.out.println("+-----------------------+---------------+---------------+---------------+");
        System.out.println("| # Basmathi\t\t|   "+qBasmathi+"\t\t|   "+pBasmathi+"\t|   "+tBasmathi+"\t|");
        System.out.println("| # Dhal\t\t|   "+qDhal+"\t\t|   "+pDhal+"\t|   "+tDhal+"\t|");
        System.out.println("| # Suger\t\t|   "+qSugar+"\t\t|   "+pSugar+"\t|   "+tSugar+"\t|");
        System.out.println("| # Highland\t\t|   "+qHigland+"\t\t|   "+pHigland+"\t|   "+tHigland+"\t|");
        System.out.println("| # Yoghurt\t\t|   "+qYoghurt+"\t\t|   "+pYoghurt+"\t|   "+tYoghurt+"\t|");
        System.out.println("| # flour\t\t|   "+qFlour+"\t\t|   "+pFlour+"\t|   "+tFlour+"\t|");
        System.out.println("| # Soap\t\t|   "+qSoap+"\t\t|   "+pSoap+"\t|   "+tSoap+"\t|");
        System.out.println("+-----------------------+---------------+---------------+---------------+");
        System.out.println("                                        | Total\t\t|   "+total+"\t|");
        System.out.println("                                        +---------------+---------------+");
        System.out.println("                                        | discount(10%)\t|   "+discount+"\t|");
        System.out.println("                                        +---------------+---------------+");
        System.out.println("                                        | Price\t\t|   "+finalPrice+"\t|");
        System.out.println("                                        +---------------+---------------+");

       
        System.out.print("Enter Cash - ");
        double cash=input.nextDouble();
        int change=(int)(cash-finalPrice);
        System.out.println();

        System.out.println("+------------------+------------------+");
        System.out.printf("| %-16s | %-16s |\n","Net Amount",finalPrice);
        System.out.println("+------------------+------------------+");
        System.out.printf("| %-16s | %-16s |\n","Cash",cash);
        System.out.println("+------------------+------------------+");
        System.out.printf("| %-16s | %-16s |\n","Change",change);
        System.out.println("+------------------+------------------+");
        System.out.println();

        
        int rem=change;
        int n5000=rem/5000; rem=rem%5000;
        int n2000=rem/2000; rem=rem%2000;
        int n1000=rem/1000; rem=rem%1000;
        int n500=rem/500;   rem=rem%500;
        int n100=rem/100;   rem=rem%100;
        int n50=rem/50;     rem=rem%50;
        int n20=rem/20;     rem=rem%20;
        int n10=rem/10;     rem=rem%10;
        int n5=rem/5;       rem=rem%5;
        int n2=rem/2;       rem=rem%2;
        int n1=rem;

        int noOfNotes=n5000+n2000+n1000+n500+n100+n50+n20;
        int noOfCoins=n10+n5+n2+n1;

        System.out.println("+------------------+------------------+");
        System.out.printf("| %-16s | %-16s |\n","Value","No");
        System.out.println("+------------------+------------------+");
        System.out.printf("| %-16s | %-16d |\n","Rs.5000",n5000);
        System.out.printf("| %-16s | %-16d |\n","Rs.2000",n2000);
        System.out.printf("| %-16s | %-16d |\n","Rs.1000",n1000);
        System.out.printf("| %-16s | %-16d |\n","Rs.500",n500);
        System.out.printf("| %-16s | %-16d |\n","Rs.100",n100);
        System.out.printf("| %-16s | %-16d |\n","Rs.50",n50);
        System.out.printf("| %-16s | %-16d |\n","Rs.20",n20);
        System.out.printf("| %-16s | %-16d |\n","Rs.10",n10);
        System.out.printf("| %-16s | %-16d |\n","Rs.5",n5);
        System.out.printf("| %-16s | %-16d |\n","Rs.2",n2);
        System.out.printf("| %-16s | %-16d |\n","Rs.1",n1);
        System.out.println("+------------------+------------------+");
        System.out.printf("| %-16s | %-16d |\n","No of Notes",noOfNotes);
        System.out.println("+------------------+------------------+");
        System.out.printf("| %-16s | %-16d |\n","No of Coins",noOfCoins);
        System.out.println("+------------------+------------------+");
        System.out.println();
        System.out.println("---------------------------------------");
        System.out.println("     THANK YOU FOR SHOPPING WITH US");
        System.out.println("---------------------------------------");

    }
}
