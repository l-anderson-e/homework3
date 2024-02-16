
import java.util.ArrayList;

public class PatientManager {
    public ArrayList<Patient> patients;

    public PatientManager(){
        patients = new ArrayList<>(10);
    }
    
    public int addPatient(Patient patient){
        if(patients.size() < 10){
            patients.add(patient);
            return patients.size() -1;
        }
        return -1;
    }

    public Patient removePatient(int index){
      if (index > 0 && index < patients.size()){
        return patients.remove(index);
      }  
      else {
        return null;
    }
}

    public void caffeineAbsorption(){
        for (int i = 0; i < patients.size(); i++){
            Patient patient = patients.get(i);
            double newCaffeineLevel = Math.max(0, patient.getCaffeineLevel() - 130); 
            patient.setCaffeineLevel(newCaffeineLevel);
            if (newCaffeineLevel == 0){
                patients.remove(i);
                i--;
            }          
        }
    }

@Override
public String toString(){
    if(patients.isEmpty()){
        return "Empty \n";
    }
    else{
        StringBuilder sb = new StringBuilder();
        for (Patient patient : patients){
            sb.append(patient).append("\n");
        }
    return sb.toString();
    }
}
   
}
