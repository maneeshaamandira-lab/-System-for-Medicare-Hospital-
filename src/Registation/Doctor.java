package Registation;

import javax.swing.JOptionPane;


public class Doctor extends MedicalStaff {
    
    private String specialization;
    private String consultationFee;
    private String licenseNumber;
    private String yearsOfExperience;
    private String ID;
    private String name;
    private String dob;
    private String address;
 
    public String getSpecialization() {
        return specialization;
    }

    
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

   
    public String getConsultationFee() {
        return consultationFee;
    }

    public void setConsultationFee(String consultationFee) {
        this.consultationFee = consultationFee;
    }

    
    public String getLicenseNumber() {
        return licenseNumber;
    }

    
    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    
    public String getYearsOfExperience() {
        return yearsOfExperience;
    }

    
    public void setYearsOfExperience(String yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
    
     @Override
     public void performDuties(){
         
     }
    
    public void diagnosePatient() {
    JOptionPane.showMessageDialog(null,
        "Patient diagnosis completed");
}

public void prescribeMedication() {
    JOptionPane.showMessageDialog(null,
        "Medication prescribed");
}

public void scheduleAppointment() {
    JOptionPane.showMessageDialog(null,
        "Appointment scheduled by doctor");
}

public void generatePrescription() {
    JOptionPane.showMessageDialog(null,
        "Prescription generated");
}



    @Override
public void PersonDetails() {
    JOptionPane.showMessageDialog(null,
        "Doctor details saved successfully");
}
public void setId(String ID) { this.ID = ID; }
    public String getId() { return ID; }

    public void setName(String name) { this.name = name; }
    public String getName() { return name; }

    public void setDob(String dob) { this.dob = dob; }
    public String getDob() { return dob; }

    public void setAddress(String address) { this.address = address; }
    public String getAddress() { return address; }
    private String doctorTelephone;

public void setTelephone(String tel) { this.doctorTelephone = tel; }
public String getTelephone() { return doctorTelephone; }



}
    

