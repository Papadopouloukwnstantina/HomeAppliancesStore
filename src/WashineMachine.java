public class WashineMachine {

    private int Mikos;
    private int ipsos;
    private int vathos;
    private String OnomaKataskeuasth;
    private String OnomaSuskeuhs;
    private String TuposSuskeuhs;
    private int Katanalwsh;
    private String Xrwma;
    private int Timh;
    private int Xwros; // kilos
    private int maxstrofes;
    private int thorivos;

    // Setters
    /**
     * Thetoume thn timh
     * @param Mikos H metablith pou thetoume
     */
    public void SetMikos(int Mikos){
        this.Mikos = Mikos;
    }
    /**
     * Thetoume thn timh
     * @param ipsos H metablith pou thetoume
     */
    public void SetIpsos(int ipsos){
        this.ipsos = ipsos;
    }
    /**
     * Thetoume thn timh
     * @param vathos H metablith pou thetoume
     */
    public void SetVathos(int vathos){
        this.vathos = vathos;
    }
    /**
     * Thetoume thn timh
     * @param OnomaKataskeuasth H metablith pou thetoume
     */
    public void SetOnomaKataskeuasth(String OnomaKataskeuasth){
        this.OnomaKataskeuasth = OnomaKataskeuasth;
    }
    /**
     * Thetoume thn timh
     * @param OnomaSuskeuhs H metablith pou thetoume
     */
    public void SetOnomaSuskeuhs(String OnomaSuskeuhs){
        this.OnomaSuskeuhs = OnomaSuskeuhs;
    }
    /**
     * Thetoume thn timh
     * @param TuposSuskeuhs H metablith pou thetoume
     */
    public void SetTuposSuskeuhs(String TuposSuskeuhs){
        this.TuposSuskeuhs = TuposSuskeuhs;
    }
    /**
     * Thetoume thn timh
     * @param Katanalwsh H metablith pou thetoume
     */
    public void SetKatanalwsh(int Katanalwsh){
        this.Katanalwsh = Katanalwsh;
    }
    /**
     * Thetoume thn timh
     * @param Xrwma H metablith pou thetoume
     */
    public void SetXrwma(String Xrwma){
        this.Xrwma = Xrwma;
    }
    /**
     * Thetoume thn timh
     * @param Timh H metablith pou thetoume
     */
    public void SetTimh(int Timh){
        this.Timh = Timh;
    }
    /**
     * Thetoume thn timh
     * @param Xwros H metablith pou thetoume
     */
    public void SetXwros(int Xwros){
        this.Xwros = Xwros;
    }
    /**
     * Thetoume thn timh
     * @param maxstrofes H metablith pou thetoume
     */
    public void SetMaxstrofes(int maxstrofes){
        this.maxstrofes = maxstrofes;
    }
    /**
     * Thetoume thn timh
     * @param thorivos H metablith pou thetoume
     */
    public void SetThorivos(int thorivos){
        this.thorivos = thorivos;
    }

    // Getters
    /**
     *
     * @return Epistrefei thn timh ths metabliths mas.
     */
    public int GetMikos(){
        return Mikos;
    }
    /**
     *
     * @return Epistrefei thn timh ths metabliths mas.
     */
    public int GetIpsos(){
        return ipsos;
    }
    /**
     *
     * @return Epistrefei thn timh ths metabliths mas.
     */
    public int GetVathos(){
        return vathos;
    }
    /**
     *
     * @return Epistrefei thn timh ths metabliths mas.
     */
    public String GetOnomaKataskeuasth(){
        return OnomaKataskeuasth;
    }
    /**
     *
     * @return Epistrefei thn timh ths metabliths mas.
     */
    public String GetOnomaSuskeuhs(){return OnomaSuskeuhs;}
    /**
     *
     * @return Epistrefei thn timh ths metabliths mas.
     */
    public String GetTuposSuskeush(){
        return TuposSuskeuhs;
    }
    /**
     *
     * @return Epistrefei thn timh ths metabliths mas.
     */
    public int GetKatanalwsh(){
        return Katanalwsh;
    }
    /**
     *
     * @return Epistrefei thn timh ths metabliths mas.
     */
    public String GetXrwma(){
        return Xrwma;
    }
    /**
     *
     * @return Epistrefei thn timh ths metabliths mas.
     */
    public int Gettimh(){
        return Timh;
    }
    /**
     *
     * @return Epistrefei thn timh ths metabliths mas.v
     */
    public int GetXwros(){
        return Xwros;
    }
    /**
     *
     * @return Epistrefei thn timh ths metabliths mas.
     */
    public int GetMaxStrofer(){
        return maxstrofes;
    }
    /**
     *
     * @return Epistrefei thn timh ths metabliths mas.
     */
    public int GetThorivos(){
        return thorivos;
    }

    static int MachineCounter = 0;
    public int MachineCounter() {
        System.out.printf("WashineMashines: ");
        return MachineCounter;
    }
    WashineMachine(String OnomaKataskeuasth , String OnomaSuskeuhs , String TuposSuskeuhs , String Xrwma , int Mikos , int Ipsos , int Vathos , int Katanalwsh , int timh , int Xwros , int Maxstrofes , int thorivos){
        try{
            SetMikos(Mikos);
            SetIpsos(Ipsos);
            SetVathos(Vathos);
            SetKatanalwsh(Katanalwsh);
            SetTimh(timh);
            SetXwros(Xwros);
            SetOnomaKataskeuasth(OnomaKataskeuasth);
            SetOnomaSuskeuhs(OnomaSuskeuhs);
            SetTuposSuskeuhs(TuposSuskeuhs);
            SetXrwma(Xrwma);
            SetMaxstrofes(Maxstrofes);
            SetThorivos(thorivos);
        }
        catch (Exception e){
            System.out.println("ERROR: Cant Set Values");
        }
        MachineCounter = MachineCounter + 1;
        Display();
    }
    public void Display(){
        System.out.printf("Kataskeuasths: %s\n" , GetOnomaKataskeuasth());
        System.out.printf("%s: %s %dcm %dcm %dcm Katanalwsh: %dkW/h\n" , GetTuposSuskeush() , GetOnomaSuskeuhs() , GetMikos() , GetIpsos() , GetVathos() , GetKatanalwsh());
        System.out.printf("Price: %d Xwritikothta: %dKilos MaxStrofes: %d Thorivos: %ddb Xrwma: %s\n\n" , Gettimh() , GetXwros() , GetMaxStrofer() , GetThorivos() , GetXrwma());
    }

    private void periodicMantainance(){
    }

}
