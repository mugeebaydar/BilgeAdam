package ilkswinguygulama;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartApp {
    public static void main(String[] args) {

        JFrame ilkPencere=new JFrame("İlk Penceremiz");
        //ilkPencere.setTitle("İlk Penceremiz.");

        ilkPencere.setSize(400,400); //pencere boyutu
        ilkPencere.setVisible(true); //Penceremizin görünürlüğü
        ilkPencere.setLocationRelativeTo(null); //pencerenin konumunu ayarlamak için kullnaılır. tam merkezde pencereyi açar
        ilkPencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //pencerenin kapatılması için close ayarı

        JPanel panel=new JPanel(); //penceremizdeki componentleri konumlandırmak için panel oluşturduk
        FlowLayout flowLayout=new FlowLayout(FlowLayout.LEFT,40,40); //soldan sağa doğru sıralanması içn layout
        panel.setLayout(flowLayout); //layout objemizi set ediyoruz. Her zaman panele set edilir

        JLabel jLabel=new JLabel("Adı: "); //etiket componentimizi oluşturduk
        JTextField jTextField=new JTextField(20); //input componentini oluşturuyoruz kullanıcıdan değer almak için

        JButton jButton=new JButton("Kaydet"); //buton oluşturma
        jButton.addActionListener(new ActionListener() { //kaydet butonuna basıldığında yapılacak işi actionListenele yaparız
            @Override
            public void actionPerformed(ActionEvent e) {
                //Buton submit(tıklandığında) olduğunda yapılacak işlemi ele alır.
                if(!jTextField.getText().equals("")){
                    System.out.println(jTextField.getText());
                    //jTextField.setText("");
                }
                Pencere pencere=new Pencere(new JLabel(jTextField.getText()));
            }
        });

        //ekleme sırası önemlidir
        panel.add(jLabel); //label componentimizi panele ekliyoruz.
        panel.add(jTextField);
        panel.add(jButton);
        ilkPencere.add(panel);
    }
}
