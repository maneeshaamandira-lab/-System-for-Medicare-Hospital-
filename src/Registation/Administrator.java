
package Registation;

import javax.swing.JOptionPane;

public class Administrator extends Person {
    
    private  String adminID;
    private  String accessLevel;
    private String department;
    private String hireDate;
    private String adminType;

    
    public String getAdminID() {
        return adminID;
    }

    
    public void setAdminID(String adminID) {
        this.adminID = adminID;
    }

    
    public String getAccessLevel() {
        return accessLevel;
    }

    
    public void setAccessLevel(String accessLevel) {
        this.accessLevel = accessLevel;
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

    
    public String getAdminType() {
        return adminType;
    }

    
    public void setAdminType(String adminType) {
        this.adminType = adminType;
    }
    
  @Override
public void PersonDetails() {
    JOptionPane.showMessageDialog(null,
        "Administrator details recorded");
}

public void login() {
    JOptionPane.showMessageDialog(null,
        "Administrator logged in");
}

public void generateReport() {
    JOptionPane.showMessageDialog(null,
        "Report generated successfully");
}

public void manageRecords() {
    JOptionPane.showMessageDialog(null,
        "Records managed successfully");
}

public void processPayment() {
    JOptionPane.showMessageDialog(null,
        "Payment processed");
}

public void registerPatient() {
    JOptionPane.showMessageDialog(null,
        "Patient registered by administrator");
}
    
}
