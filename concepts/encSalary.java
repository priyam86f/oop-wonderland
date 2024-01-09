public class encSalary {
    private int baseSalary;
    private int per_hour_pay;

    public int calculateSal(int extrahours){
     return baseSalary + (extrahours*per_hour_pay);
    }

     //getters and setters
     public void setBaseSalary(int baseSalary){
        if(baseSalary<=0)
        throw new IllegalArgumentException("Salary cannot be negative or zero.");

        this.baseSalary=baseSalary;
     }

     public int getBaseSalary(){
        return baseSalary;
     }

     public void setPayPerHour(int per_hour_pay){
        if(per_hour_pay<=0)
        throw new IllegalArgumentException("Per hour pay cannot be negative or zero.");

        this.per_hour_pay=per_hour_pay;
     }

     public int getPayPerHour(){
        return per_hour_pay;
     }
}
