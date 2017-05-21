
public class PartTimeEmployee extends EmployeeInfo {

    private double hourlyWage;
    private double hoursPerWeek;
    private double weeksPerYear;

    // Constructor to assign passed values to attributes. Inside, "super" is a constructor of superclass EmployeeInfo
    public PartTimeEmployee(int empNo, String fName, String lName, double deduct, int location, double wage, double hours, double weeks) {
        super(empNo, fName, lName, deduct, location);
        if (wage > 0 && hours > 0 && weeks > 0) {
            hourlyWage = wage;
            hoursPerWeek = hours;
            weeksPerYear = weeks;
        } else {
            throw new RuntimeException();
        }
    }

    @Override
    public double calcAnnualPay() {
        return (hourlyWage * hoursPerWeek * weeksPerYear * (1 - getDeductionsRate()));
    }

    ///The following are getter/setter methods for the attributes specific to part-time Employee only. 
    ///While they are not used in the test program, they are available for use.
    //getter method for hourlyWage attribute
    public double getHourlyWage() {
        return (hourlyWage);
    }

    //setter method for hourlyWage
    public void setHourlyWage(double wage) {
        if (wage > 0) {
            hourlyWage = wage;
        } else {
            throw new RuntimeException();
        }
    }

    //getter method for hoursPerWeek attribute
    public double getHoursPerWeek() {
        return (hoursPerWeek);
    }

    //setter method for hoursPerWeek
    public void setHoursPerWeek(double hours) {
        if (hours > 0) {
            hoursPerWeek = hours;
        } else {
            throw new RuntimeException();
        }
    }

    //getter method for weeksPerYear attribute
    public double getWeeksPerYear() {
        return (weeksPerYear);
    }

    //setter method for weeksPerYear
    public void setWeeksPerYear(double weeks) {
        if (weeks > 0) {
            weeksPerYear = weeks;
        } else {
            throw new RuntimeException();
        }
    }
}
