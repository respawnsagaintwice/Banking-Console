import java.util.Scanner;
public class bank {
    
    static Scanner in = new Scanner(System.in);
    static double Balance = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        showcase();
        int choice = 0;
        
        while(choice!=4){
            System.out.println("Enter choice: ");
            choice = in.nextInt();
            System.out.println("-------------------------------------------------------------------");
            switch (choice) {
                case 1: checkbalance();
                    break;
                case 2: deposit();
                    break;
                case 3: Withdraw();
                    break;
                case 4: System.out.println("Exiting System!");
                    return ;
                default:System.out.println("Brother , Wrong input - Try again.");
                    break;
            }
        }
    }
public static void showcase(){
    System.out.println("========================================");
    System.out.println("          RESPAWN BANK SYSTEM           ");
    System.out.println("========================================");
    
    System.out.print("Customer Name: ");
    String name1 = in.nextLine();
    System.out.print("Initial Balance: ");
    Balance = in.nextDouble();

    System.out.println("========================================");
    System.out.println("1. Check Balance. ");
    System.out.println("2. Deposit. ");
    System.out.println("3. Withdraw. ");
    System.out.println("4. Exit. ");
}
public static void deposit(){
    System.out.print("Enter Amount: ");
    
    double dep = in.nextDouble();
    Balance += dep;
    System.out.println("Deposited Successfully.");
    System.out.println("-------------------------------------------------------------------");
    
}

public static void checkbalance(){
    System.out.println("Balance: "+ Balance);
    System.out.println("-------------------------------------------------------------------");
    
}
public static void Withdraw(){
    System.out.print("Enter Amount: ");
    double with = in.nextDouble();
    if(with>Balance){
        System.out.println("Error. Not Enough Balance!");
        System.out.println("-------------------------------------------------------------------");
    }
    else{
        System.out.println("Successfully Withdrawned.");
        Balance -= with;
        System.out.println("-------------------------------------------------------------------");
    }
    

} 

}


  
