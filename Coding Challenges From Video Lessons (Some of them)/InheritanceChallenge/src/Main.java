public class Main {
    public static void main(String[] args) {
        Employee karim = new Employee("Karim", "09/05/1980", "07/10/2024");
        System.out.println(karim);
        System.out.println(karim.getName() + "'s age is: " + karim.getAge());

        HourlyEmployee khalid = new HourlyEmployee("Khalid", "09/14/1990", "10/01/2025", 90.0);
        System.out.println(khalid.getName() + "'s age is: " + khalid.getAge());
        System.out.println("Khalid's Paycheck = $" + khalid.collectPay());
        System.out.println("Khalid's Holiday Pay = $" + khalid.getDoublePay());
    }
}
