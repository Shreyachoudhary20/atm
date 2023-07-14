import java.util.Scanner;
public class ATM
{
    public static void main(String args[] )
    { 
        int bal = 20000, withdraw, dep;
        Scanner s = new Scanner(System.in);
        while(true)
        {
            
            System.out.println("Enter 1 for Withdrawing the money");
            System.out.println("Enter 2 for Depositing the money");
            System.out.println("Enter 3 for Checking the Balance");
            System.out.println("Enter 4 for Stop");
            System.out.print("Choose the operation you want to perform");
            int n = s.nextInt();
            switch(n)
            {
                case 1:
                System.out.print("Enter money you want to be withdrawn:");
                withdraw = s.nextInt();
                if(bal >= withdraw)
                {
                    bal= bal - withdraw;
                    System.out.println("Please collect  your money");
                }
                else
                {
                    System.out.println("balance is low");
                }
                System.out.println("");
                break;
 
                case 2:
                System.out.print("Enter money you want to get deposited:");
                dep = s.nextInt();
                bal = bal+ dep;
                System.out.println("Your Money has been successfully depsited");
                System.out.println("");
                break;
 
                case 3:
                System.out.println("Balance : "+bal);
                System.out.println("");
                break;
 
                case 4:
                System.exit(0);
            }
        }
    }
}