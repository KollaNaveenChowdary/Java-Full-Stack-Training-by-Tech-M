 
package task2;

public class Employee {
    private int empId;
    private String empName;
    private double salary;
    private int yearsWorked;

    public Employee(int empId, String empName, double salary, int yearsWorked) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.yearsWorked = yearsWorked;
    }

    public boolean isEligibleForLoan() {
        if (yearsWorked > 5) {
            if (salary >= 15_00_000) return true;
            if (salary >= 10_00_000) return true;
            if (salary >= 6_00_000) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Employee emp = new Employee(101, "John Doe", 1200000, 6);
        System.out.println("Loan Eligibility: " + emp.isEligibleForLoan());
    }
}
