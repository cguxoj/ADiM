package symulatorparkometru;

import java.util.*;
import java.time.*;
import java.math.*;

public class SymulatorParkometru extends javax.swing.JFrame {

    public SymulatorParkometru() {
        initComponents();
        odswiezZegar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        tytulLabel = new javax.swing.JLabel();
        rejestracjaLabel = new javax.swing.JLabel();
        rejestracjaField = new javax.swing.JTextField();
        czasParkowaniaLabel = new javax.swing.JLabel();
        czasParkowaniaField = new javax.swing.JTextField();
        zegarLabel = new javax.swing.JLabel();
        wrzucButton = new javax.swing.JButton();
        kartaButton = new javax.swing.JButton();
        mainSeparator = new javax.swing.JSeparator();
        metodaPlatnosciLabel = new javax.swing.JLabel();
        kwotaField = new javax.swing.JTextField();
        plusKwotaButton = new javax.swing.JButton();
        minusKwotaButton = new javax.swing.JButton();
        doZaplatyLabel = new javax.swing.JLabel();
        doZaplatyField = new javax.swing.JTextField();
        pozostaloField = new javax.swing.JTextField();
        pozostaloLabel = new javax.swing.JLabel();
        resztaField = new javax.swing.JTextField();
        resztaLabel = new javax.swing.JLabel();
        zakonczButton = new javax.swing.JButton();
        przerwijButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tytulLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        tytulLabel.setText("Witaj w symulatorze parkometru!");

        rejestracjaLabel.setText("Wpisz rejestrację pojazdu:");

        rejestracjaField.setText("*rejestracja*");

        czasParkowaniaLabel.setText("Wpisz czas parkowania:");

        czasParkowaniaField.setText("*czas*");
        czasParkowaniaField.setPreferredSize(new java.awt.Dimension(78, 22));

        zegarLabel.setText("*aktualna godzina*");

        wrzucButton.setText("Wrzuć monetę / gotówkę");
        wrzucButton.setPreferredSize(new java.awt.Dimension(130, 35));

        kartaButton.setText("Zapłać kartą");

        metodaPlatnosciLabel.setText("Wybierz metodę płatności:");

        kwotaField.setEditable(false);
        kwotaField.setText("1 PLN");

        plusKwotaButton.setText("+");

        minusKwotaButton.setText("-");

        doZaplatyLabel.setText("Łącznie do zapłaty:");

        doZaplatyField.setText("*kwota*");
        doZaplatyField.setToolTipText("");
        doZaplatyField.setPreferredSize(new java.awt.Dimension(78, 22));

        pozostaloField.setEditable(false);
        pozostaloField.setText("... PLN");
        pozostaloField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pozostaloFieldActionPerformed(evt);
            }
        });

        pozostaloLabel.setText("Pozostało:");

        resztaField.setEditable(false);
        resztaField.setText("... PLN");
        resztaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resztaFieldActionPerformed(evt);
            }
        });

        resztaLabel.setText("Reszta:");

        zakonczButton.setText("Zakończ");

        przerwijButton.setText("Przerwij");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(tytulLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(zegarLabel))
                            .addComponent(mainSeparator)))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(metodaPlatnosciLabel)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(kwotaField, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(plusKwotaButton, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                                    .addComponent(minusKwotaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(109, 109, 109)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(kartaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(wrzucButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 195, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(pozostaloLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pozostaloField, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(resztaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resztaField, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addComponent(zakonczButton)
                        .addGap(18, 18, 18)
                        .addComponent(przerwijButton)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(doZaplatyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(doZaplatyField, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(czasParkowaniaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rejestracjaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                                .addGap(6, 6, 6)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(czasParkowaniaField, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rejestracjaField, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(222, 222, 222))))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tytulLabel)
                    .addComponent(zegarLabel))
                .addGap(81, 81, 81)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rejestracjaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(rejestracjaField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(czasParkowaniaField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(czasParkowaniaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doZaplatyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doZaplatyField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(mainSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(metodaPlatnosciLabel)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(kwotaField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(plusKwotaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(minusKwotaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(wrzucButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(kartaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pozostaloField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pozostaloLabel)
                    .addComponent(resztaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resztaLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zakonczButton)
                    .addComponent(przerwijButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void odswiezZegar() {
        TimerTask zegar = new TimerTask() {
            public void run() {
                LocalTime czas = LocalTime.now();
                int czasInt = (int) Math.round(czas);
                String czasStr = czas.toString();
                zegarLabel.setText(czasStr);
            }
        };
        Timer timer = new Timer();
        timer.schedule(zegar, 1000);
    }
    
    private void pozostaloFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pozostaloFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pozostaloFieldActionPerformed

    private void resztaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resztaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resztaFieldActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SymulatorParkometru().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField czasParkowaniaField;
    private javax.swing.JLabel czasParkowaniaLabel;
    private javax.swing.JTextField doZaplatyField;
    private javax.swing.JLabel doZaplatyLabel;
    private javax.swing.JButton kartaButton;
    private javax.swing.JTextField kwotaField;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JSeparator mainSeparator;
    private javax.swing.JLabel metodaPlatnosciLabel;
    private javax.swing.JButton minusKwotaButton;
    private javax.swing.JButton plusKwotaButton;
    private javax.swing.JTextField pozostaloField;
    private javax.swing.JLabel pozostaloLabel;
    private javax.swing.JButton przerwijButton;
    private javax.swing.JTextField rejestracjaField;
    private javax.swing.JLabel rejestracjaLabel;
    private javax.swing.JTextField resztaField;
    private javax.swing.JLabel resztaLabel;
    private javax.swing.JLabel tytulLabel;
    private javax.swing.JButton wrzucButton;
    private javax.swing.JButton zakonczButton;
    private javax.swing.JLabel zegarLabel;
    // End of variables declaration//GEN-END:variables
}
