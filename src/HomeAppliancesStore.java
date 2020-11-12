public class HomeAppliancesStore {
    public static void main(String[] args) {

        Fridge Fridge = new Fridge("TEST" , "HTM2" , "Fridge" , "White" , 500 , 500 , 500 , 250 , 250 , 100 , 50 , 3);
        WashineMachine Machine = new WashineMachine("TEST" , "HDMI" , "WashineMashine" , "White" , 500 , 500 , 200 , 250 , 50 , 90 , 30 ,35);
        Oven Oven = new Oven("TEST" , "GDMI" , "Oven" , "Black" , 500 , 500 , 500 , 200 , 150 , 20 , 30 , 4);
        AirCondition Air = new AirCondition("TEST" , "HDMI" , "AirCondition" , "Orange" , 500 , 250 , 300 , 500 , 200 , 30 , 40 , 20);
        WashineMachine Machine2 = new WashineMachine("TEST" , "HDMI" , "WashineMashine" , "White" , 500 , 500 , 200 , 250 , 50 , 90 , 30 ,35);
        Oven Oven2 = new Oven("TEST" , "GDMI" , "Oven" , "Black" , 500 , 500 , 500 , 200 , 150 , 20 , 30 , 4);

        System.out.println(Fridge.FridgeCounter());
        System.out.println(Machine.MachineCounter());
        System.out.println(Oven.OvenCounter());
        System.out.println(Air.AirCounter());
    }
}


