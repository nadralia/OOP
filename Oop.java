import java.util.Scanner;

public class Oop {

   public static void main(String[] args) {
      Account[] accounts = new Account[10];
      SavingsAccount[] savings = new SavingsAccount[5];
      CheckingAccount[] checking = new CheckingAccount[5];
      for (int i = 0; i < accounts.length; i++) {
         accounts[i] = new Account(i);
      }
      Scanner input = new Scanner(System.in);
      System.out.print("Enter an ID: ");
      int enteredID;
      do {
         enteredID = input.nextInt();
         if (enteredID <= 9 && enteredID >=0 && enteredID == accounts[enteredID].getID()) {
            System.out.println("Main Menu: ");
            System.out.println("1: check balance");
            System.out.println("2: withdraw");
            System.out.println("3: deposit");
            System.out.println("4: exit");
             do {
                  // same as above code
                   System.out.print("Enter a choice: ");
                   int choice = input.nextInt();
                   input.nextLine();
                   switch(choice) {
                    case 1:
                        System.out.println("The balance is: " + accounts[enteredID].getBalance());
                        break;
                    case 2:
                        System.out.print("Enter withdraw amount: ");
                        int withdrawAmount = input.nextInt();
                        accounts[enteredID].withDraw(withdrawAmount);
                        break;
                    case 3:
                        System.out.print("Enter deposit amount: ");
                        int depositAmount = input.nextInt();
                        accounts[enteredID].deposit(depositAmount);
                        break;
                    case 4:
                        System.out.println("Exit");
                        System.out.println("Enter an ID");
                        break;
                    }
                } while (true);
            }
            else{
                System.out.print("enter correct id!");
            }

        }while(true);
    }
}