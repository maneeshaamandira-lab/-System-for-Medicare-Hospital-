
package Registation;

import javax.swing.JOptionPane;

public abstract class MedicalStaff extends Person {
    
private String staffID;
private String department;
private String hireDate;
private double salary;
private String workSchedule;
private String qualifications;
private String staffType;

    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getWorkSchedule() {
        return workSchedule;
    }

    public void setWorkSchedule(String workSchedule) {
        this.workSchedule = workSchedule;
    }

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }

    public String getStaffType() {
        return staffType;
    }

    public void setStaffType(String staffType) {
        this.staffType = staffType;
    }
    
    public void login() {
    JOptionPane.showMessageDialog(null,
        "Medical staff logged in successfully");
}

public void updateSchedule() {
    JOptionPane.showMessageDialog(null,
        "Work schedule updated");
}

    
    // Method 3: Get Working Hours
    public String getWorkingHours() {
        return workSchedule;
    }
    
    // Method 4: Abstract method for duties
    public abstract void performDuties();
    
}