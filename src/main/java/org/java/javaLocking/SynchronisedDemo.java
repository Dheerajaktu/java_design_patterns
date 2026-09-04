package org.java.javaLocking;

public class SynchronisedDemo {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();

        Thread t1 = new Thread(() -> {
            synchronized (bankAccount) {
                System.out.println("Someone locked account ");
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Lock released by hacker ");
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (bankAccount) {
                bankAccount.withdraw(100);
            }
        });

    }

}

class BankAccount{
    public synchronized void withdraw(int amount){
        System.out.println("Withdrawing stared..." + amount);
        try{
            Thread.sleep(5000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Withdraw Completed");
    }

    /* NOTE - Compiler will covert this code into like -
       public void withdraw() {
            synchronized (this) {
                balance -= 100;
            }
         }
    *
    *  */
}