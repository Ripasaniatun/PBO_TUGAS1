/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class RumusKecepatan extends javax.swing.JFrame {
Double njarak, nwaktu, nkecepatan; 

public RumusKecepatan() {
        initComponents();
    }
    private void hitungkecepatan(){
        njarak = Double.valueOf(txtJarak.getText());
        nwaktu = Double.valueOf(txtWaktu.getText());
        
        nkecepatan = njarak/nwaktu;
        txtKecepatan.setText("" +nkecepatan);
    }
    
    private void hitungjarak(){
        nwaktu = Double.valueOf(txtWaktu.getText());
        nkecepatan = Double.valueOf(txtKecepatan.getText());
        
        njarak = nkecepatan*nwaktu;
        txtJarak.setText("" +njarak);
    }
    
    private void hitungwaktu(){
        njarak = Double.valueOf(txtJarak.getText());
        nkecepatan = Double.valueOf(txtKecepatan.getText());
        
        nwaktu = njarak / nwaktu;
        txtWaktu.setText("" +nwaktu);
    }

    private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

