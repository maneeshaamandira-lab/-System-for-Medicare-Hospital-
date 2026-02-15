
package Registation;

import java.io.File;
import java.io.FileWriter;
import javax.swing.JOptionPane;

public class Patient extends Person{
    
  private String  patientID;
  private String  registrationDate;
  private String  bloodGroup;
  private String  allergies;
  private String  emergencyContact;
  private String  insuranceInfo;
 
  public void registerPatient(){
      
      try {
          File file = new File("patient.txt");
          FileWriter Writer = new FileWriter(file, true);
          
           String format =
            "%-12s %-12s %-15s %-15s %-10s %-12s %-12s %-15s %-16s %-15s %-15s %-25s %-25s %-15s\n";
          
             if (file.length() == 0) {
             String header = String.format(format,
                "PersonID","PatientID","FirstName","LastName", "Gender",
                "DOB", "BloodGroup", "Allergies", "EmergencyContact",
                "InsuranceInfo", "ContactNumber", "Email", "Address","RegistrationDate"
             );
             Writer.write(header);
            }
             String line = String.format(format,
                      getPersonID(),
                      getPatientID(),
                      getFirstName(),
                      getLastName(),
                      getDateOfBirth(),
                      getGender(),
                      getBloodGroup(),
                      getAllergies(),
                      getEmergencyContact(),
                      getInsuranceInfo(),
                      getContactNumber(),
                      getEmail(),
                      getAddress(),
                      getRegistrationDate()
              );
              Writer.write(line);
              Writer.close();
        PersonDetails();
          
                      
      }
      
      catch (Exception e){
          JOptionPane.showMessageDialog(null,"Location note found","",JOptionPane.ERROR_MESSAGE);
      }
  }
  
  public void updateMedicalInfo() {
    JOptionPane.showMessageDialog(null,
        "Patient medical information updated successfully");
}

public void getMedicalHistory() {
    JOptionPane.showMessageDialog(null,
        "Displaying patient medical history");
}

  
  
  @Override
  public void PersonDetails(){
      
      JOptionPane.showMessageDialog(null,"Patient Registration Successfully!",
              "Success",JOptionPane.INFORMATION_MESSAGE);
              
  }

    public String getPatientID() {
        return patientID;
    }
    
    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public String getInsuranceInfo() {
        return insuranceInfo;
    }

    public void setInsuranceInfo(String insuranceInfo) {
        this.insuranceInfo = insuranceInfo;
    }
 
}

