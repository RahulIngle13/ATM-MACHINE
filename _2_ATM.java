package Project;
import java.util.Scanner;

class bankAccount{
    private  double balance;

    public bankAccount(double initialBalance){  // constructor
        this.balance=initialBalance;
    }

    public void deposit(double amount){
        if(amount>0){
            balance +=amount;
            System.out.println("Your amount of "+amount+" deposite sucessfully");
        }
        else {
            System.out.println("Invalid amount");
        }
    }

    public void withdraw(double amount) {
        if (amount <+ 0) {
            System.out.println("invalid amount");
        } else if (amount>balance) {
            System.out.println("Insufficient Amount");
        }else{
            balance-=amount;
            System.out.println("Withdraw Sucessfully of Rs "+amount);
        }
    }
    public double getbalance(){
        return balance;
    }
}

public class _2_ATM {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        bankAccount ba= new bankAccount(1000.0);
        String cam;

        do{
            System.out.println("Do You Want  to Use Atm? Y/N");
            cam=sc.nextLine();
            if(cam.equalsIgnoreCase("Y")){

                int com;
                do{
                    System.out.print("1.Check Account Balance");
                    System.out.println("    2.Deposite Amount");
                    System.out.print("3.Withdraw Amount");
                    System.out.println("          4.Exit");
                    com=sc.nextInt();
                    sc.nextLine();

                    switch(com){
                        case 1 :
                            System.out.println("Your Account balance is "+ba.getbalance()); break;
                        case 2:
                            System.out.print("Enter amount of Deposite : ");
                            double damt =sc.nextDouble();
                            ba.deposit(damt); break;

                        case 3:
                            System.out.print("Enter amount of Withdraw :");
                            double wamt = sc.nextDouble();
                            ba.withdraw(wamt);break;
                        case 4:
                            System.out.println("Thank You ...!");break;
                        default:
                            System.out.println("Invalid Option ");
                    }
                }while(com !=4);

            } else if (!cam.equalsIgnoreCase("N")) {
                System.out.println("Invalid Command");
            }
        }while(!cam.equalsIgnoreCase("N"));
        System.out.println("Thanks for using ATM");


    }
}
