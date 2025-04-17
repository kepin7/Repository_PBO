package Abstract;

/**
 *
 * @author Kepin
 */
public class SalariedEmployee extends Employee {
    private double weeklySalary;
    
    public SalariedEmployee(String first, String last, String ssn, double salary) {
        super(first, last, ssn); 
        setWeeklySalary(salary); 
    } 
    
    public void setWeeklySalary(double salary) {
        weeklySalary = salary < 0.0 ? 0.0 : salary; 
    } 
   
    public double getWeeklySalary() {
        return weeklySalary;
    } 
    
     public double earnings() {
        return getWeeklySalary();
    }
   
    public String toString() {
        return String.format("Karyawan tetap: %s\nGaji mingguan: $%,.2f",
            super.toString(), getWeeklySalary());
    } 
} 