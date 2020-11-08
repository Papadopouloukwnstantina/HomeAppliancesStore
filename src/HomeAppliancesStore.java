public class HomeAppliancesStore {

    static int i;
    static String onomaetairias;
    static String dieuthinsietairias;

    public static void main(String[] args) {
        try{
        SetOnoma(args[0]);
        SetAddress(args[1]);
        SetIpal(Integer.parseInt(args[2]));
        }catch(Exception e){
            System.out.println("Lathos");
            return;
        }

        System.out.println(GetOnoma() + " " + GetAddress() + " " + GetIpal());
    }

    // Setters
    public static void SetOnoma(String onoma){
        onomaetairias = onoma;
    }
    public static void SetAddress(String Address){
        dieuthinsietairias = Address;
    }
    public static void SetIpal(int Ipal){
        i = Ipal;
    }
    // Getters
    public static String GetOnoma(){  return onomaetairias;    }
    public static String GetAddress(){
        return dieuthinsietairias;
    }
    public static int GetIpal(){
        return i;
    }

}
