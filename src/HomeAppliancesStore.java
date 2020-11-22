
interface DeviceBasic{

    void PowerOn ();
    void PowerOff ();
    int PeriodicMantainance();
    boolean Status();

    void SetMikos(int Mikos);
    void SetIpsos(int ipsos);
    void SetVathos(int vathos);
    void SetOnomaKataskeuasth(String OnomaKataskeuasth);
    void SetOnomaSuskeuhs(String OnomaSuskeuhs);
    void SetTuposSuskeuhs(String TuposSuskeuhs);
    void SetKatanalwsh(int Katanalwsh);
    int GetMikos();
    int GetIpsos();
    int GetVathos();
    String GetOnomaKataskeuasth();
    String GetOnomaSuskeuhs();
    String GetTuposSuskeush();
    int GetKatanalwsh();
    void Stoixeia();
}

abstract class Device implements DeviceBasic{

    public int Mikos;
    public int ipsos;
    public int vathos;
    public String OnomaKataskeuasth;
    public String OnomaSuskeuhs;
    public String TuposSuskeuhs;
    public int Katanalwsh;

    // Setters
    public abstract void SetMikos(int Mikos);
    public abstract void SetIpsos(int ipsos);
    public abstract void SetVathos(int vathos);
    public abstract void SetOnomaKataskeuasth(String OnomaKataskeuasth);
    public abstract void SetOnomaSuskeuhs(String OnomaSuskeuhs);
    public abstract void SetTuposSuskeuhs(String TuposSuskeuhs);
    public abstract void SetKatanalwsh(int Katanalwsh);

    public abstract int GetMikos();
    public abstract int GetIpsos();
    public abstract int GetVathos();
    public abstract String GetOnomaKataskeuasth();
    public abstract String GetOnomaSuskeuhs();
    public abstract String GetTuposSuskeush();
    public abstract int GetKatanalwsh();

    public static boolean status;

    public abstract void Stoixeia();
}

public class HomeAppliancesStore {
    public static void main(String[] args) {

    DeviceStatus();

    }

    public static void DeviceStatus(){

     Device Div = new Fridge("TEST" , "TEST" , "Fridge" , 2 , 3 , 4 , 5);

     if(Div instanceof Fridge){

         Fridge fridge = (Fridge) Div;

         System.out.printf("Device Status: ");
         if(fridge.Status() == true) System.out.printf("On\n"); else System.out.printf("Off\n");


     }
    }
}


