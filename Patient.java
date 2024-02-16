public class Patient{
    public int IDNumber;
    public double caffeineLevel;

    public Patient(int IDNumber, double caffeineLevel){
        this.IDNumber = IDNumber;
        this.caffeineLevel = caffeineLevel;
    }

    public int getIDNumber(){
        return IDNumber;
    }

    public double getCaffeineLevel(){
        return caffeineLevel;
    }

    public void setCaffeineLevel(double caffeineLevel){
        this.caffeineLevel = caffeineLevel;
    }
@Override
public String toString(){
    return IDNumber + " " + caffeineLevel;
}
}