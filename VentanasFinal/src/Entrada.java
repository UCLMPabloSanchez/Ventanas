import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Entrada extends JFrame{
    private JPanel panel1;
    private JButton cancelarButton;
    private JButton limpiarButton;
    private JButton reservarButton;
    private JTextField textField1;
    private JButton calcularButton;
    private JRadioButton estandarRadioButton;
    private JRadioButton suiteRadioButton;
    private JRadioButton balcónRadioButton;
    private JComboBox comboBox1;
    private JTextField a0TextField;
    private JTextField a0TextField1;
    private JTextField a0TextField2;
    private JLabel precioFinal;

    public Entrada(){
        comboBox1.setSelectedItem(null);
        setContentPane(panel1);
        setBounds(375,235,750,470);
        setVisible(false);
        setTitle("Reservas");
        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        estandarRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(estandarRadioButton.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Seleccionaste habitación estandar.", "Información", JOptionPane.INFORMATION_MESSAGE);
                }else JOptionPane.showMessageDialog(null, "Deseleccionaste habitación estandar.", "Información", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        balcónRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(balcónRadioButton.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Seleccionaste habitación con balcón.", "Información", JOptionPane.INFORMATION_MESSAGE);
                }else JOptionPane.showMessageDialog(null, "Deseleccionaste habitación con balcón.", "Información", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        suiteRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(suiteRadioButton.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Seleccionaste habitación Suite.", "Información", JOptionPane.INFORMATION_MESSAGE);
                }else JOptionPane.showMessageDialog(null, "Deseleccionaste habitación Suite.", "Información", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                a0TextField.setText("0");
                a0TextField1.setText("0");
                a0TextField2.setText("0");
                precioFinal.setText("0€");
                comboBox1.setSelectedItem(null);
                estandarRadioButton.setSelected(false);
                balcónRadioButton.setSelected(false);
                suiteRadioButton.setSelected(false);
            }
        });
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int precio=0;
                if(estandarRadioButton.isSelected()){
                    int numeroEntero1=Integer.parseInt(a0TextField.getText());
                    for(int i=0;i<numeroEntero1;i++){
                        precio+=150;
                    }
                }
                if(balcónRadioButton.isSelected()){
                    int numeroEntero2=Integer.parseInt(a0TextField1.getText());
                    for(int i=0;i<numeroEntero2;i++){
                        precio+=200;
                    }
                }
                if(suiteRadioButton.isSelected()){
                    int numeroEntero3=Integer.parseInt(a0TextField2.getText());
                    for(int i=0;i<numeroEntero3;i++){
                        precio+=250;
                    }
                }
                if(comboBox1.getSelectedItem()=="Sin desayuno"){
                    precio=precio*1;
                }
                if(comboBox1.getSelectedItem()=="Con desayuno"){
                    precio=precio*2;
                }
                if(comboBox1.getSelectedItem()=="Media Pensión"){
                    precio=precio*3;
                }
                if(comboBox1.getSelectedItem()=="Pensión Completa"){
                    precio=precio*4;
                }
                String s=String.valueOf(precio);
                precioFinal.setText(s+"€");

            }
        });
        reservarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(precioFinal.getText().equals("0€") || textField1.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"No se puede reservar. Rellene los campos.","ERROR",JOptionPane.ERROR_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null,"¡Excelente, su reserva ha sido realizada con éxito!","Información",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(comboBox1.getSelectedItem()=="Sin desayuno") JOptionPane.showMessageDialog(null,"Has seleccionado sin desayuno","Aviso", JOptionPane.INFORMATION_MESSAGE);
                if(comboBox1.getSelectedItem()=="Con desayuno") JOptionPane.showMessageDialog(null,"Has seleccionado con desayuno","Aviso", JOptionPane.INFORMATION_MESSAGE);
                if(comboBox1.getSelectedItem()=="Media pensión") JOptionPane.showMessageDialog(null,"Has seleccionado media pensión","Aviso", JOptionPane.INFORMATION_MESSAGE);
                if(comboBox1.getSelectedItem()=="Pensión completa") JOptionPane.showMessageDialog(null,"Has seleccionado pensión completa","Aviso", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }
}
