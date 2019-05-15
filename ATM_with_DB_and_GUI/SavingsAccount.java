import java.util.List;

public class SavingsAccount extends LocalBankAccount {


    int numOfAccounts = 0;
    int interestrate = 3;

    private List<Integer> csakegyList;
    private static int savingsAccUnique = 0;

    public int getNumOfAccounts() {
//        numOfAccounts =  getSavingsAccUnique();
        return numOfAccounts;
    }

    public void setNumOfAccounts(int numOfAccounts) {
        this.numOfAccounts = numOfAccounts;
    }

    public List<Integer> getCsakegyList() {
        return csakegyList;
    }

    public void setCsakegyList(List<Integer> csakegyList) {
        this.csakegyList = csakegyList;
    }

    public static int getSavingsAccUnique() {
        savingsAccUnique++;

        return savingsAccUnique;
    }

//    public static int reachedMaxNumOfSavingsAccounts() {
////        getSavingsAccUnique();
////        if  (savingsAccUnique > 1)
////             int tempGet = getSavingsAccUnique();
////        return setSavingsAccUnique();
//    }

    public static void setSavingsAccUnique(int savingsAccUnique) {
        SavingsAccount.savingsAccUnique = savingsAccUnique;
    }

    public double addInterest(/*int interest*/) {
          double interest = localBankXXXXX.getBalance() * interestrate / 100;
          return interest;

     }

     public int getInterestrate() {
          return interestrate;
     }
}

