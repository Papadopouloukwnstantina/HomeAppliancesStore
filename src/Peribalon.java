import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class Peribalon extends JFrame{

    private JLabel label1; // Fridge:
    private JLabel label2; // WashingMachine:
    private JLabel label3; // Oven:
    private JLabel label4; // AirCondition:

    private JTextField Text1; // Fridges [ ... ]
    private JTextField Text2; // WashingMachine
    private JTextField Text3; // Oven
    private JTextField Text4; // AirCondition

    private JButton reg;


    public Peribalon(){
        super("HomeApplianceStore");
        setLayout(new FlowLayout(FlowLayout.LEFT));

        // Labels
        label1 = new JLabel("Fridges: ");
        label2 = new JLabel("WashingMachines: ");
        label3 = new JLabel("Ovens: ");
        label4 = new JLabel("AirCondition: ");

        // TextFields
        Text1 = new JTextField(5);
        Text2 = new JTextField(5);
        Text3 = new JTextField(5);
        Text4 = new JTextField(5);

        add(label1); add(label2); add(label3); add(label4);
        add(Text1); add(Text2); add(Text3); add(Text4);

        // Creating Button
        reg = new JButton("DONE");
        add(reg);

        // Creating ActionListener
        Handling handle = new Handling();
        reg.addActionListener(handle);
    }

    // Class to Handle the Actions
    private class Handling implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            String temp = "";

            int Fridges = 0, WashingMachines = 0, Ovens = 0, AirConditions = 0;
            try {
                temp = Text1.getText();
                Fridges = Integer.parseInt(temp);
                temp = Text2.getText();
                WashingMachines = Integer.parseInt(temp);
                temp = Text3.getText();
                Ovens = Integer.parseInt(temp);
                temp = Text4.getText();
                AirConditions = Integer.parseInt(temp);
            } catch (Exception e1) {
                System.out.println("Error");
                return;
            }

            Fridge FridgesObjects[] = new Fridge[Fridges];
            WashineMachine WashingMachineObjects[] = new WashineMachine[WashingMachines];
            Oven OvensObjects[] = new Oven[Ovens];
            AirCondition AirConditionObjects[] = new AirCondition[AirConditions];

            if (e.getSource() == reg) {

                for (int i = 0; i < Fridges; i++) {
                    FridgesObjects[i] = new Fridge("TEST", "TEST", "TEST", 5, 5, 5, 5);
                }
                for (int i = 0; i < WashingMachines; i++) {
                    WashingMachineObjects[i] = new WashineMachine("TEST", "TEST", "TEST", 5, 8, 6, 4);
                }
                for (int i = 0; i < Ovens; i++) {
                    OvensObjects[i] = new Oven("TEST", "TEST", "TEST", 5, 5, 6, 6);
                }
                for (int i = 0; i < AirConditions; i++) {
                    AirConditionObjects[i] = new AirCondition("TEST", "TEST", "TEST", 5, 5, 6, 6);
                }

                JFrame jframe = new JFrame("JTextArea");
                jframe.setSize(300 , 300);
                JTextArea area = new JTextArea(Fridge.Suskeuh() + "\n" + WashineMachine.Suskeuh() + "\n" + Oven.Suskeuh() + "\n" + AirCondition.Suskeuh());
                jframe.add(area);
                area.setBounds(10 , 20 , 300 , 300);
                jframe.setVisible(true);


            }
        }
    }


}
