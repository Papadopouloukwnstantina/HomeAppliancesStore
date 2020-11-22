public class Oven extends Device{

    // Constructor
    public Oven(String OnomaKataskeuasth , String OnomaSuskeuhs , String TuposSuskeuhs , int Mikos , int Ipsos , int Vathos , int Katanalwsh){

        try{
            SetMikos(Mikos);
            SetIpsos(Ipsos);
            SetVathos(Vathos);
            SetKatanalwsh(Katanalwsh);
            SetOnomaSuskeuhs(OnomaSuskeuhs);
            SetOnomaKataskeuasth(OnomaKataskeuasth);
            SetTuposSuskeuhs(TuposSuskeuhs);
        }catch(Exception e){
            System.out.println("Error: Cant Set Values"); return;
        }

        Stoixeia();
    }



    public boolean Status(){return status;}
    public void PowerOn(){status = true;}
    public void PowerOff(){status = false;}

    // Setters
    public void SetMikos(int Mikos){
        this.Mikos = Mikos;
    }
    public void SetIpsos(int ipsos){
        this.ipsos = ipsos;
    }
    public void SetVathos(int vathos){
        this.vathos = vathos;
    }
    public void SetOnomaKataskeuasth(String OnomaKataskeuasth){
        this.OnomaKataskeuasth = OnomaKataskeuasth;
    }
    public void SetOnomaSuskeuhs(String OnomaSuskeuhs){
        this.OnomaSuskeuhs = OnomaSuskeuhs;
    }
    public void SetTuposSuskeuhs(String TuposSuskeuhs){
        this.TuposSuskeuhs = TuposSuskeuhs;
    }
    public void SetKatanalwsh(int Katanalwsh){
        this.Katanalwsh = Katanalwsh;
    }

    // Getters
    public int GetMikos(){
        return Mikos;
    }
    public int GetIpsos(){
        return ipsos;
    }
    public int GetVathos(){
        return vathos;
    }
    public String GetOnomaKataskeuasth(){
        return OnomaKataskeuasth;
    }
    public String GetOnomaSuskeuhs(){return OnomaSuskeuhs;}
    public String GetTuposSuskeush(){
        return TuposSuskeuhs;
    }
    public int GetKatanalwsh(){
        return Katanalwsh;
    }

    public void Stoixeia(){
        System.out.printf("%s: %s Length: %dcm Height: %dcm Depth: %dcm Consumption: %dkWh/h\n"  , GetTuposSuskeush() , GetOnomaSuskeuhs() , GetMikos() , GetIpsos() , GetVathos() , GetKatanalwsh());
        System.out.printf("Designer: %s\n" , GetOnomaKataskeuasth());


    }

    public int PeriodicMantainance(){
        return 0;
    }
}
