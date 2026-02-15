
package Registation;

import javax.swing.JOptionPane;

public class Bill {
    
   private String billID;
   private String patient;
   private String services;
   private String medications;
   private String consultationFees;
   private String testCharges;
   private String totalAmount;
   private String paymentStatus;
   private String insuranceCoverage;
   private String dueDate;
   
public void generateBill() {
    JOptionPane.showMessageDialog(null,
        "Bill generated successfully");
}

public void calculateTotal() {
    JOptionPane.showMessageDialog(null,
        "Total amount calculated");
}

public void processPayment() {
    JOptionPane.showMessageDialog(null,
        "Payment processed successfully");
}

public void applyInsuranceDiscount() {
    JOptionPane.showMessageDialog(null,
        "Insurance discount applied");
}

public void addService() {
    JOptionPane.showMessageDialog(null,
        "Service added to bill");
}


   
    public String getBillID() {
        return billID;
    }

   
    public void setBillID(String billID) {
        this.billID = billID;
    }

   
    public String getPatient() {
        return patient;
    }

    
    public void setPatient(String patient) {
        this.patient = patient;
    }

    
    public String getServices() {
        return services;
    }

    
    public void setServices(String services) {
        this.services = services;
    }

    
    public String getMedications() {
        return medications;
    }

    
    public void setMedications(String medications) {
        this.medications = medications;
    }


    public String getConsultationFees() {
        return consultationFees;
    }


    public void setConsultationFees(String consultationFees) {
        this.consultationFees = consultationFees;
    }

    
    public String getTestCharges() {
        return testCharges;
    }

    
    public void setTestCharges(String testCharges) {
        this.testCharges = testCharges;
    }

    
    public String getTotalAmount() {
        return totalAmount;
    }

    
    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    
    public String getPaymentStatus() {
        return paymentStatus;
    }

    
    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    
    public String getInsuranceCoverage() {
        return insuranceCoverage;
    }

    
    public void setInsuranceCoverage(String insuranceCoverage) {
        this.insuranceCoverage = insuranceCoverage;
    }

   
    public String getDueDate() {
        return dueDate;
    }

    
    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    
}
