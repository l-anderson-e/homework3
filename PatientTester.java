import java.util.Collections;

public class PatientTester {
    
    public static void main(String[] args){
        PatientManager manager = new PatientManager();
        System.out.print(manager);

        manager.addPatient(new Patient(1, 200));
        manager.addPatient(new Patient(2,400));
        manager.addPatient(new Patient(3, 600));
        manager.addPatient(new Patient(4,800));

        System.out.println(manager);

        manager.caffeineAbsorption();
        manager.caffeineAbsorption();

        System.out.println(manager);

        int highestCaffeineIndex = 0;
        double highestCaffeine = 0;
        for (int i = 1; i < manager.patients.size(); i++) {
            double caffeineLevel = manager.patients.get(i).getCaffeineLevel();
            if (caffeineLevel > highestCaffeine) {
                highestCaffeine = caffeineLevel;
                highestCaffeineIndex = i;
            }
        }
        manager.removePatient(highestCaffeineIndex);

        System.out.println(manager);

    }
}
