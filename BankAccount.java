public class BankAccount {

    private String owner;
    private double baalnce;


    public BankAccount(String owner, int baalnce) {
        this.owner = owner;
        this.baalnce = Math.max(baalnce, 0);
    }

    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }


    public double getBaalnce() {
        return baalnce;
    }
    public void setBaalnce(int baalnce) {
        this.baalnce = baalnce;
    }

    public double deposit(double amt){
        if(amt > 0){
            this.baalnce = this.baalnce + amt;
            return amt;
        }else{
            return 0;
        }
    }

    public double withdraw(double amt){
        if(amt > 0){
            this.baalnce -= amt;
            return amt;
        }else{
            return 0;
        }
    }
    
}
