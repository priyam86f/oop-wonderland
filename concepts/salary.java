public class salary {
    public static void main(String[] args) {
       int baseSalary=50000;
       int per_hour_pay = 50;
       int extrahours=25;

       int res = finalSal(baseSalary, per_hour_pay, extrahours);
       System.out.println(res);
    }

    public static int finalSal(int baseSalary,int per_hour_pay,int extrahours){
        return baseSalary + (per_hour_pay*extrahours);
    }
}
