package symulatorparkometru;

import java.io.File;
import java.io.FileWriter;
import javax.swing.*;
import java.util.*;
import java.time.*;
import java.text.SimpleDateFormat;

public class SymulatorParkometru extends javax.swing.JFrame {
    ArrayList<Double> kwotyList = new ArrayList<>(Arrays.asList(1.0, 2.0, 5.0, 10.0, 20.0, 50.0));
    int indeksKwoty = 0;    
    double zaplacono = 0;
    double wykupionyCzas = 0;
    boolean kartaZaplacona = false;
    double zaplaconoMonetami = 0;
    double zaplaconoKarta = 0;
    
    public SymulatorParkometru() {
        initComponents();
        
        javax.swing.Timer timer = new javax.swing.Timer(1000, new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                ustawZegar();
            }
        });
        timer.start();
        
        int czasParkowania = Integer.valueOf(czasParkowaniaField.getText());
        doZaplatyField.setText(Double.toString(czasParkowania * 0.2));
        pozostaloField.setText(doZaplatyField.getText());
        
        czasParkowaniaField.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            private void sprawdzTekst() {
                String czasParkowania = czasParkowaniaField.getText();
                if (czasParkowania.length() > 0 && !Character.isDigit(czasParkowania.charAt(czasParkowania.length() - 1))) {
                    JOptionPane.showMessageDialog(null, "Wpisz poprawną liczbę reprezentującą czas twojego zamierzonego parkowania.");
                    czasParkowania = czasParkowania.substring(0, czasParkowania.length() - 1);
                    czasParkowaniaField.setText(czasParkowania);
                }
            }

            @Override
            public void insertUpdate(javax.swing.event.DocumentEvent e) {
                sprawdzTekst();
            }

            @Override
            public void removeUpdate(javax.swing.event.DocumentEvent e) {
                sprawdzTekst();
            }

            @Override
            public void changedUpdate(javax.swing.event.DocumentEvent e) {
                sprawdzTekst();
            }
        });
    }
    
    private void ustawZegar() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String obecnyCzas = sdf.format(new Date());
        zegarLabel.setText(obecnyCzas);
    }
    
    private boolean walidujRejestracje() {
        String rej = rejestracjaField.getText().trim().toUpperCase();

        String pattern = "^[A-Z]{1,3}\\s?[0-9][A-Z0-9]{3,4}$";

        if (!rej.matches(pattern)) {
            JOptionPane.showMessageDialog(null,
                "Wpisz poprawną polską tablicę rejestracyjną.\n\n");
            return false;
        }

        rejestracjaField.setText(rej);
        return true;
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
        przerwijButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        plusCzasButton = new javax.swing.JButton();
        minusCzasButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        wykupionyCzasStrLabel = new javax.swing.JLabel();
        wykupionyCzasLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        potwierdzButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tytulLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        tytulLabel.setText("Witaj w symulatorze parkometru!");

        rejestracjaLabel.setText("Wpisz rejestrację pojazdu:");

        czasParkowaniaLabel.setText("Podaj czas parkowania:");

        czasParkowaniaField.setEditable(false);
        czasParkowaniaField.setText("30");
        czasParkowaniaField.setPreferredSize(new java.awt.Dimension(78, 22));

        zegarLabel.setText("*aktualna godzina*");

        wrzucButton.setText("Wrzuć monetę");
        wrzucButton.setPreferredSize(new java.awt.Dimension(130, 35));
        wrzucButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wrzucButtonActionPerformed(evt);
            }
        });

        kartaButton.setText("Zapłać kartą");
        kartaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kartaButtonActionPerformed(evt);
            }
        });

        metodaPlatnosciLabel.setText("Metody płatności:");

        kwotaField.setEditable(false);
        kwotaField.setText("1.0");

        plusKwotaButton.setText("+");
        plusKwotaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusKwotaButtonActionPerformed(evt);
            }
        });

        minusKwotaButton.setText("-");
        minusKwotaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusKwotaButtonActionPerformed(evt);
            }
        });

        doZaplatyLabel.setText("Łącznie do zapłaty:");

        doZaplatyField.setEditable(false);
        doZaplatyField.setToolTipText("");
        doZaplatyField.setPreferredSize(new java.awt.Dimension(78, 22));

        pozostaloField.setEditable(false);
        pozostaloField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pozostaloFieldActionPerformed(evt);
            }
        });

        pozostaloLabel.setText("Pozostało:");

        resztaField.setEditable(false);
        resztaField.setText("0.0");
        resztaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resztaFieldActionPerformed(evt);
            }
        });

        resztaLabel.setText("Reszta:");

        przerwijButton.setText("Przerwij");
        przerwijButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                przerwijButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel1.setText("PLN");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        jLabel2.setText("PLN");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        jLabel3.setText("PLN");

        plusCzasButton.setText("+");
        plusCzasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusCzasButtonActionPerformed(evt);
            }
        });

        minusCzasButton.setText("-");
        minusCzasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusCzasButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel4.setText("minut");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel5.setText("PLN");

        wykupionyCzasStrLabel.setText("Wykupiony czas (min):");

        wykupionyCzasLabel.setText(" 0");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        jLabel6.setText("Przykład: \"WSI 8271\", \"PO1234L\"");

        potwierdzButton.setText("Potwierdź");
        potwierdzButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potwierdzButtonActionPerformed(evt);
            }
        });

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
                        .addGap(226, 226, 226)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(metodaPlatnosciLabel)
                                .addGroup(mainPanelLayout.createSequentialGroup()
                                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addGap(26, 26, 26))
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                            .addComponent(kwotaField, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(plusKwotaButton, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                                        .addComponent(minusKwotaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(109, 109, 109)
                                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(wrzucButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                            .addGap(21, 21, 21)
                                            .addComponent(kartaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(mainPanelLayout.createSequentialGroup()
                                        .addComponent(wykupionyCzasStrLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(wykupionyCzasLabel))
                                    .addGroup(mainPanelLayout.createSequentialGroup()
                                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(pozostaloLabel)
                                            .addComponent(resztaLabel))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addComponent(resztaField, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel3))
                                            .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addComponent(pozostaloField, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel2)))))
                                .addGap(279, 279, 279)))
                        .addGap(0, 155, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(doZaplatyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(doZaplatyField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(czasParkowaniaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rejestracjaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rejestracjaField, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(mainPanelLayout.createSequentialGroup()
                                        .addComponent(czasParkowaniaField, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4)
                                        .addGap(27, 27, 27)
                                        .addComponent(plusCzasButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(minusCzasButton))
                                    .addGroup(mainPanelLayout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(jLabel6)))))
                        .addGap(200, 200, 200))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addComponent(przerwijButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(potwierdzButton)
                        .addContainerGap())))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tytulLabel)
                    .addComponent(zegarLabel))
                .addGap(44, 44, 44)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rejestracjaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(rejestracjaField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(czasParkowaniaField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(czasParkowaniaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plusCzasButton)
                    .addComponent(minusCzasButton)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doZaplatyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doZaplatyField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(54, 54, 54)
                .addComponent(mainSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(metodaPlatnosciLabel)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(wrzucButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(kartaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainPanelLayout.createSequentialGroup()
                            .addGap(42, 42, 42)
                            .addComponent(kwotaField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainPanelLayout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addComponent(plusKwotaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(minusKwotaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(40, 40, 40)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(pozostaloLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(resztaLabel))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pozostaloField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(resztaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wykupionyCzasStrLabel)
                    .addComponent(wykupionyCzasLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(przerwijButton)
                    .addComponent(potwierdzButton))
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

    
    private void pozostaloFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pozostaloFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pozostaloFieldActionPerformed

    private void resztaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resztaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resztaFieldActionPerformed

    private void przerwijButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_przerwijButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_przerwijButtonActionPerformed

    private void plusKwotaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusKwotaButtonActionPerformed
        if (indeksKwoty < 5) {
            indeksKwoty++;
            kwotaField.setText(Double.toString(kwotyList.get(indeksKwoty)));
        }
        if (kwotyList.get(indeksKwoty) > 5) wrzucButton.setText("Włóż gotówkę");
    }//GEN-LAST:event_plusKwotaButtonActionPerformed

    private void minusKwotaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusKwotaButtonActionPerformed
        if (indeksKwoty > 0) {
            indeksKwoty--;
            kwotaField.setText(Double.toString(kwotyList.get(indeksKwoty)));
        }
        if (kwotyList.get(indeksKwoty) < 10) wrzucButton.setText("Wrzuć monetę");
    }//GEN-LAST:event_minusKwotaButtonActionPerformed

    private void plusCzasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusCzasButtonActionPerformed
        if (!walidujRejestracje()) return;
        
        int czasParkowania = Integer.valueOf(czasParkowaniaField.getText());
        czasParkowania += 5;
        czasParkowaniaField.setText(Integer.toString(czasParkowania));

        double koszt = czasParkowania * 0.2;

        double pozostalo = koszt - zaplacono;
        double reszta = zaplacono - koszt;

        if (pozostalo < 0) pozostalo = 0;
        if (reszta < 0) reszta = 0;

        doZaplatyField.setText(Double.toString(koszt));
        pozostaloField.setText(Double.toString(pozostalo));
        resztaField.setText(Double.toString(reszta));

        wykupionyCzasLabel.setText(Double.toString(wykupionyCzas));
    }//GEN-LAST:event_plusCzasButtonActionPerformed

    private void minusCzasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusCzasButtonActionPerformed
        if (!walidujRejestracje()) return;
        
        int czasParkowania = Integer.valueOf(czasParkowaniaField.getText());

        if (czasParkowania - 5 < wykupionyCzas) {
            JOptionPane.showMessageDialog(null, 
                "Nie możesz zmniejszyć czasu poniżej już opłaconego!");
            return;
        }

        czasParkowania -= 5;
        czasParkowaniaField.setText(Integer.toString(czasParkowania));

        double koszt = czasParkowania * 0.2;

        double pozostalo = koszt - zaplacono;
        double reszta = zaplacono - koszt;

        if (pozostalo < 0) pozostalo = 0;
        if (reszta < 0) reszta = 0;

        doZaplatyField.setText(Double.toString(koszt));
        pozostaloField.setText(Double.toString(pozostalo));
        resztaField.setText(Double.toString(reszta));

        wykupionyCzasLabel.setText(Double.toString(wykupionyCzas));
    }//GEN-LAST:event_minusCzasButtonActionPerformed

    private void wrzucButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wrzucButtonActionPerformed
        if (!walidujRejestracje()) return;
        
        double kwota = Double.valueOf(kwotaField.getText());

        double pozostalo = Double.valueOf(pozostaloField.getText());

        if (pozostalo <= 0) {
            JOptionPane.showMessageDialog(null, 
                "Całkowita kwota została już opłacona. Nie można wrzucać więcej pieniędzy.");
            return;
        }

        zaplacono += kwota;
        zaplaconoMonetami += kwota;

        int czasParkowania = Integer.valueOf(czasParkowaniaField.getText());
        double koszt = czasParkowania * 0.2;

        pozostalo = koszt - zaplacono;
        double reszta = zaplacono - koszt;

        if (pozostalo < 0) pozostalo = 0;
        if (reszta < 0) reszta = 0;

        pozostaloField.setText(Double.toString(pozostalo));
        resztaField.setText(Double.toString(reszta));

        if (pozostalo == 0) {
            wykupionyCzas = czasParkowania;
            wykupionyCzasLabel.setText(Double.toString(wykupionyCzas));
        }
    }//GEN-LAST:event_wrzucButtonActionPerformed

    private void potwierdzButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_potwierdzButtonActionPerformed
        if (!walidujRejestracje()) return;

        try {
            File plik = new File("bilet_parkingowy.txt");
            FileWriter writer = new FileWriter(plik);

            writer.write("Bilet parkingowy\n");
            writer.write("Rejestracja: " + rejestracjaField.getText() + "\n");
            writer.write("Czas wykupiony: " + wykupionyCzasLabel.getText() + " minut\n");
            writer.write("Płatność dokonana: " + doZaplatyField.getText() + " PLN\n");
            if (kartaZaplacona) writer.write("Płatność kartą: TAK\n"); else writer.write("Płatność kartą: NIE\n");
            writer.write("Zapłacono monetami: " + String.format(Locale.US, "%.2f", zaplaconoMonetami) + " PLN\n");
            writer.write("Zapłacono kartą: " + String.format(Locale.US, "%.2f", zaplaconoKarta) + " PLN\n");
            writer.write("Reszta: " + resztaField.getText() + " PLN\n");
            writer.write("Godzina wydania: " + zegarLabel.getText() + "\n");

            writer.close();

            Object[] options = {"Zamknij", "Podgląd biletu"};

            int wybor = JOptionPane.showOptionDialog(null,
                "Bilet został utworzony pomyślnie.",
                "Potwierdzenie",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                options,
                options[0]);

            if (wybor == 0) {
                System.exit(0);
            } else if (wybor == 1) {
                Scanner scanner = new Scanner(plik);
                StringBuilder tresc = new StringBuilder();
                while (scanner.hasNextLine()) {
                    tresc.append(scanner.nextLine()).append("\n");
                }
                scanner.close();

                JOptionPane.showMessageDialog(null, tresc.toString(),
                    "Podgląd biletu", JOptionPane.INFORMATION_MESSAGE);

                System.exit(0);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Błąd przy tworzeniu biletu: " + e.getMessage());
        }
    }//GEN-LAST:event_potwierdzButtonActionPerformed

    private void kartaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kartaButtonActionPerformed
        if (!walidujRejestracje()) return;

        double pozostalo = Double.valueOf(pozostaloField.getText().replace(',', '.'));
        double reszta = Double.valueOf(resztaField.getText().replace(',', '.'));

        if (pozostalo <= 0) {
            JOptionPane.showMessageDialog(null,
                "Całkowita kwota została już opłacona. Nie można płacić więcej kartą.");
            return;
        }

        zaplacono += pozostalo;
        zaplaconoKarta += pozostalo;

        int czasParkowania = Integer.valueOf(czasParkowaniaField.getText());
        double koszt = czasParkowania * 0.2;

        pozostalo = koszt - zaplacono;
        reszta = zaplacono - koszt;

        if (pozostalo < 0) pozostalo = 0;
        if (reszta < 0) reszta = 0;

        pozostaloField.setText(String.format(Locale.US, "%.2f", pozostalo));
        resztaField.setText(String.format(Locale.US, "%.2f", reszta));

        if (pozostalo == 0) {
            wykupionyCzas = czasParkowania;
            wykupionyCzasLabel.setText(String.format(Locale.US, "%.2f", wykupionyCzas));
        }

        kartaZaplacona = true;

        JOptionPane.showMessageDialog(null,
            "Płatność kartą zakończona sukcesem.");
    }//GEN-LAST:event_kartaButtonActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton kartaButton;
    private javax.swing.JTextField kwotaField;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JSeparator mainSeparator;
    private javax.swing.JLabel metodaPlatnosciLabel;
    private javax.swing.JButton minusCzasButton;
    private javax.swing.JButton minusKwotaButton;
    private javax.swing.JButton plusCzasButton;
    private javax.swing.JButton plusKwotaButton;
    private javax.swing.JButton potwierdzButton;
    private javax.swing.JTextField pozostaloField;
    private javax.swing.JLabel pozostaloLabel;
    private javax.swing.JButton przerwijButton;
    private javax.swing.JTextField rejestracjaField;
    private javax.swing.JLabel rejestracjaLabel;
    private javax.swing.JTextField resztaField;
    private javax.swing.JLabel resztaLabel;
    private javax.swing.JLabel tytulLabel;
    private javax.swing.JButton wrzucButton;
    private javax.swing.JLabel wykupionyCzasLabel;
    private javax.swing.JLabel wykupionyCzasStrLabel;
    private javax.swing.JLabel zegarLabel;
    // End of variables declaration//GEN-END:variables
}
