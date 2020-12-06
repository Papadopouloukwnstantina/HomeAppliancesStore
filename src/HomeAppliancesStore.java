import java.io.*;
public class HomeAppliancesStore {
    public static void main(String[] args) {
    // Suskeues.txt
    String arxeio = "Suskeues.txt";

    // Creating Arrays of Object
    Fridge FridgeObjects[] = new Fridge[readFile(arxeio , "Fridge")];
    Oven OvenObjects[] = new Oven[readFile(arxeio , "Oven")];
    WashineMachine WashingMachineObjects[] = new WashineMachine[readFile(arxeio , "WashineMachine")];
    AirCondition AirConditionObjects[] = new AirCondition[readFile(arxeio , "AirCondition")];

    // Saving Objects to Arrays
    for(int i=0; i<FridgeObjects.length; i++){
        FridgeObjects[i] = new Fridge("Test" , "Test" , "Fridge" , 5 , 5, 5, 5);
    }
    for(int i=0; i<OvenObjects.length; i++){
        OvenObjects[i] = new Oven("Test" , "Test" , "Oven" , 5 , 5, 5, 5);
    }
    for(int i=0; i<WashingMachineObjects.length; i++){
        WashingMachineObjects[i] = new WashineMachine("Test" , "Test" , "WashineMachine" , 5 , 5, 5, 5);
    }
    for(int i=0; i<AirConditionObjects.length; i++){
        AirConditionObjects[i] = new AirCondition("Test" , "Test" , "AirCondition" , 5 , 5, 5, 5);
    }

    System.out.println(WashineMachine.Suskeuh());
    System.out.println(Oven.Suskeuh());
    System.out.println(AirCondition.Suskeuh());
    System.out.println(Fridge.Suskeuh());

        grapsimosearxeio(FridgeObjects , OvenObjects , WashingMachineObjects , AirConditionObjects);
    }

    static int readFile(String arxeio , String Suskeuh){

        String grammi;
        try {
            BufferedReader br = new BufferedReader(new FileReader(arxeio));
            while ((grammi = br.readLine()) != null) { // While the EOF
                String[] st = grammi.split(" "); // Array for Holding each Word per Block. Split Words with ' '.
                String Div = st[0]; // Type of Device.
                String id = st[1]; // Numbers of Device.
                // Finding Our Device.
                if(Div.equals(Suskeuh)){
                    return Integer.parseInt(st[1]);
                }
            }
        }
        catch(Exception e){
            System.out.println("Error Corrupted.");
        }

        System.out.println("Device: " + Suskeuh + " Was not Found\n");
        return 0;

    }

    static public void grapsimosearxeio(Object FridgeObjects[] , Object OvenObjects[] , Object WashingMachineObjects[] , Object AirConditionObject[]){

        try{
            FileOutputStream arxeioout = new FileOutputStream("antikeimena.txt");
            ObjectOutputStream out = new ObjectOutputStream(arxeioout);

            out.writeObject(FridgeObjects);
            out.writeObject(OvenObjects);
            out.writeObject(WashingMachineObjects);
            out.writeObject(AirConditionObject);
            out.close();

        }
        catch(IOException ex){
            System.out.println("Error Corrupted.");
        }



    }
}


