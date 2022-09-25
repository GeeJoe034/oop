import java.util.Scanner; 

public class Account {
    public String firstname; 
    public String lastname; 
    public double balance; 
    
    public void Account(){
        this.firstname="Unknown";
        this.lastname="Unknown";
        this.balance=0.00;
    }public String getFirstname(){
        return this.firstname;
    }public String getLastname(){
        return this.lastname;
    }public double getCurrenBalance(){
        return this.balance;
    }
    public void setFirstname(String fn){
         this.firstname=fn;
    }
    public void setLastname(String ln){
         this.lastname=ln;
    }public void SetCurrenBalance(double b){
        this.balance=b;
    }
    
    
    
}
class AccountRegistration extends Account{
    public static void main(String[]arge){
         Account acct1=new Account();
         Account acct2=new Account(); //สร้าง object
         
             //acct1
             Scanner firstname1 = new Scanner(System.in);
             System.out.print("Input the firstname of the first account owner: ");
             String fn = firstname1.nextLine();
             
             Scanner lastname1 = new Scanner(System.in);
            System.out.print("Input the lastname of the first account owner: ");
            String ln = lastname1.nextLine();

            Scanner iniBalance1 = new Scanner(System.in);
            System.out.print("Input the inteial balance of the first account owner: ");
            double b = iniBalance1.nextDouble();
             acct1.firstname=fn;
             acct1.lastname=ln;             
             acct1.balance=b;
             //acct2
             Scanner firstname2 = new Scanner(System.in);
             System.out.print("Input the firstname of the Second account owner: ");
             String fn2 = firstname1.nextLine();
             
             Scanner lastname2 = new Scanner(System.in);
            System.out.print("Input the lastname of the Second account owner: ");
            String ln2 = lastname2.nextLine();

            Scanner iniBalance2 = new Scanner(System.in);
            System.out.print("Input the inteial balance of the Second account owner: ");
            double b2 = iniBalance2.nextDouble();
            acct2.firstname=fn2;
            acct2.lastname=ln2;             
            acct2.balance=b2;
         System.out.println(acct1.getFirstname()+" "+acct1.getLastname()+" has $ "+acct1.getCurrenBalance()+" left in the bank.");
         System.out.println(acct2.getFirstname()+" "+acct2.getLastname()+" has $ "+acct2.getCurrenBalance()+" left in the bank.");
      }
    }