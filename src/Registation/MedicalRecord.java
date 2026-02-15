
package Registation;

import javax.swing.JOptionPane;

public class MedicalRecord {
    private String recordID;
    private String patient;
    private String doctor;
    private String visitDate;
    private String symptoms;
    private String diagnosis;
    private String treatment;
    private String prescription;
    private String testResults;
    
public void createRecord() {
    JOptionPane.showMessageDialog(null,
        "Medical record created");
}

public void updateRecord() {
    JOptionPane.showMessageDialog(null,
        "Medical record updated");
}

public void addDiagnosis() {
    JOptionPane.showMessageDialog(null,
        "Diagnosis added");
}

public void addTestResults() {
    JOptionPane.showMessageDialog(null,
        "Test results added");
}

public void generateSummary() {
    JOptionPane.showMessageDialog(null,
        "Medical summary generated");
}


    public String getRecordID() {
        return recordID;
    }


    public void setRecordID(String recordID) {
        this.recordID = recordID;
    }

   
    public String getPatient() {
        return patient;
    }


    public void setPatient(String patient) {
        this.patient = patient;
    }

    
    public String getDoctor() {
        return doctor;
    }

   
    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    
    public String getVisitDate() {
        return visitDate;
    }

    
    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }

    
    public String getSymptoms() {
        return symptoms;
    }

    
    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    
    public String getDiagnosis() {
        return diagnosis;
    }

    
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }


    public String getTreatment() {
        return treatment;
    }

    
    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    
    public String getPrescription() {
        return prescription;
    }

    
    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    
    public String getTestResults() {
        return testResults;
    }


    public void setTestResults(String testResults) {
        this.testResults = testResults;
    }
    
    
    
}
