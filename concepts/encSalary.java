public class encSalary {
    public int baseSalary;
    public int per_hour_pay;

    public int calculateSal(int extrahours){
     return baseSalary + (extrahours*per_hour_pay);
    }
}
