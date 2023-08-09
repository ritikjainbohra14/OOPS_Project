public class Salesperson extends Employee {

    private double commisionPercentage;

    
    public Salesperson(String name, double salary, int age, double commisionPercentage) {
        super(name, age, salary);
        this.commisionPercentage = commisionPercentage;
        //TODO Auto-generated constructor stub
    }

    public double getCommisionPercentage() {
        return this.commisionPercentage;
    }

    public void raiseCommision() {
        if(this.commisionPercentage < .30){
            this.commisionPercentage = this.commisionPercentage*1.2;
        }
    }

    

}
