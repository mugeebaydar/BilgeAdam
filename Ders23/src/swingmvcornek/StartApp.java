package swingmvcornek;

import javax.swing.*;

public class StartApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                HesaplaView hesaplaView=new HesaplaView();
                HesaplaModel hesaplaModel=new HesaplaModel();

                new HesaplaController(hesaplaView,hesaplaModel);
            }
        });
    }
}
