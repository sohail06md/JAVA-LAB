import java.util.*;

class bank{
    private String accno;
    private String name;
    private Long balance;

    Scanner  kb =new Scanner (System.in);

    void openAccount(){
        System.out.println("enter account no:");
        accno=kb.next();
        System.out.println("enter name:");
        name=kb.next();
        System.out.println("enter balance:");
        balance=kb.nextLong();

    }

    void showAccount(){
        System.out.println(accno + ","+name+","+balance);

    }
    void deposite(){
        Long amt;
        System.out.println("enter ammount u want to deposite:");
        amt=kb.nextLong();
        balance=balance+amt;
    }

    void withdrawl(){
        Long amt;
        System.out.println("enter ammount u want to withdraw:");
        amt=kb.nextLong();
        if(balance>=amt){
            balance=balance-amt;
        }
        else{
            System.out.println("transection failed");

        }
    }

    boolean search(String acn){
        if(accno.equals(acn)){
            showAccount();
            return(true);

        }
        return(false);
    }


}

public class ExBank{
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("how many customer u want to input:");
        int n = kb.nextInt();
        bank c[]=new bank[n];
        for(int i=0;i<c.length;i++){
            c[i]=new bank();
            c[i].openAccount();

        }
        int ch;
        do{
            System.out.println("main menu\n1.displayall\n2.search by account\n3.deposite\n4.withdrawl\n5.exit");
            System.out.println("ur choice");
            ch=kb.nextInt();
            switch(ch){
                case 1:
                for(int i=0;i<c.length;i++){
                    c[i].showAccount();
                }
                break;
                case 2:
                System.out.println("enter account no u want to search...");
                String acn =kb.next();
                boolean found=false;
                for(int i=0;i<c.length;i++){
                    found=c[i].search(acn);
                    if (found){
                        break;
                    }
                }
                if(!found){
                    System.out.println("account not exits");

                }
                break;
                case 3:
                System.out.println("enter accont no ");
                acn=kb.next();
                found=false;
                for(int i=0;i<c.length;i++){
                    found=c[i].search(acn);
                    if (found) {
                        c[i].deposite();
                        break;
                        
                    }


                }
                if (!found) {
                    System.out.println("account not exits");
                    
                }
                case 4:
                System.out.println("enter account no");
                acn=kb.next();
                found=false;
                for(int i=0;i<c.length;i++){
                    found=c[i].search(acn);
                    if (found) {
                        c[i].withdrawl();
                        break;
                        
                    }
                }
                if (!found) {
                    System.out.println("account not exits");

                
                    
                }
                break;

                case 5:
                System.out.println("good bye");
                break;
                    

            }

        }
         while(ch!=5);

    }
}