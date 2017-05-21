
/**
 * ********
 *
 * NAME: Umer Amjad STUDENT NUMBER: 483475
 *
 * ICS4U0-A, Feb-June 2016
 *
 * THIS FILE IS PART OF THE PROGRAM: Open Hash Table
 *
 *********
 */
public class EmployeeInfo {

    // Attributes
    private int empNum;
    private String firstName;
    private String lastName;
    private double deductionsRate;
    private int location;

    // Constructor to assign passed values to attributes.
    public EmployeeInfo(int empNo, String fName, String lName, double deduct, int location) {
        empNum = empNo;
        if (!fName.equals("") && !lName.equals("")) {
            firstName = fName;
            lastName = lName;
        } else {
            throw new RuntimeException();
        }
        deductionsRate = deduct;
        if (location < 6 && location > -1) {
            this.location = location;
        } else {
            throw new RuntimeException();
        }
    }

    //Method to be overrided by subclasses
    //No parameters, if employee is not part time or full time, pay is 0 
    public double calcAnnualPay() {
        return (0);
    }

    // Getter method for employeeNumber attribute.
    public int getEmpNum() {
        return (empNum);
    }

    // Setter method for employeeNumber attributes.
    public void setEmpNum(int empNo) {
        if (empNo < 0) {
            throw new RuntimeException();
        } else {
            empNum = empNo;
        }
    }

    //Getter method for first name attribute
    public String getFirstName() {
        return (firstName);
    }

    //setter method for first name
    public void setFirstName(String name) {
        firstName = name;
    }

    //Getter method for last name attribute
    public String getLastName() {
        return (lastName);
    }

    //setter method for last name
    public void setLastName(String name) {
        lastName = name;
    }

    //getter method for deductions 
    public double getDeductionsRate() {
        return (deductionsRate);
    }

    //setter method for deductions 
    public void setDeductionsRate(int deduct) {
        deductionsRate = deduct;
    }

    //getter method for location 
    public int getLocation() {
        return (location);
    }

    //setter method for deductions 
    public void setLocation(int locate) {
        location = locate;
    }

} // public class EmployeeInfo

