import java.util.Scanner;

public class simpleBank {
    public static void main(String[] args) {
        System.out.println("==============================");
        System.out.println("SIMPLE BANKING SYSTEM - RESPAWN");
        System.out.println("==============================");

        Scanner input = new Scanner(System.in);
        System.out.print("Customer Name: ");
        String name = input.next();
        System.out.print("Initial Balance :");
        
        Double Balance = input.nextDouble();
        System.out.println("------------------------------");
        System.out.println("1. Check Balance. ");
        System.out.println("2. Withdraw Money. ");
        System.out.println("3. Deposit Money. ");
        System.out.println("4. Transaction History. ");
        System.out.println("5. Exit. ");
    
        String History = " ";        
     while (true) {
        System.out.print("Press [1-5] : ");
        int r = input.nextInt();
        
        switch (r) {
            case 1 : System.out.println("Balance: "+ Balance);
                    System.out.println("------------------------------------------------");
            break;
            case 2 : System.out.print("Enter Amount : ");
                    Double n = input.nextDouble();
                    if(n > Balance){
                        System.out.println("Error. Not Enough Balance! ");
                    }
                    else {
                        System.out.println("Successfully Withdrawn "+ n);
                        Balance -= n;
                        History +="Withdrawn: " + n + " ";
                    System.out.println("------------------------------------------------");
                    }
            break;
            case 3 : System.out.print("Enter Amout: ");
                    double m = input.nextDouble();
                    Balance +=m;
                    History += "Deposited: " + m +" ";
                    System.out.println("------------------------------------------------");
            break;
            case 4 : System.out.println("Transaction History:"); 
                    System.out.println(History);
                    System.out.println("------------------------------------------------");
            break;
            case 5 : System.out.println("Exiting Bank! , Thanks For Transactioning with US ");
            return;  
            default : System.out.println("Wrong Input , Please Try Again! "); 
                    System.out.println("------------------------------------------------");
            break;
        }

    } 
    }
    
}
