
package ttto;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class JFrame_Board extends javax.swing.JFrame{
    protected String xoGiliran = "X";
    
    private BufferedReader in;
    private PrintWriter out;
    
    private String nama;
    private String namaL = "null";
    private int playerSatuScore = 0;
    private int playerDuaScore = 0;
    protected boolean accept = false;
    private boolean exit = false;
    
    protected boolean satu = true;
    protected boolean dua = true;
    protected boolean tiga = true;
    protected boolean empat = true;
    protected boolean lima = true;
    protected boolean enam = true;
    protected boolean tuju = true;
    protected boolean delapan = true;
    protected boolean sembilan = true;
    
    
    public JFrame_Board(BufferedReader in, PrintWriter out, String nama, String namaL) {
        initComponents();
        
        this.setVisible(true);
    }
    
    protected void setInput(BufferedReader in, PrintWriter out, String nama, String namaL, String XO){
        this.nama = nama;
        this.namaL = namaL;
        this.in = in;
        this.out = out;
        this.xoGiliran = XO;
    }
    protected void MenentukanPemenang(){
        String Satu = jButtonB_1_1.getText();
        String Dua = jButtonB_1_2.getText();
        String Tiga = jButtonB_1_3.getText();
        String Empat = jButtonB_2_1.getText();
        String Lima = jButtonB_2_2.getText();
        String Enam = jButtonB_2_3.getText();
        String Tujuh = jButtonB_3_1.getText();
        String Delapan = jButtonB_3_2.getText();
        String Sembilan = jButtonB_3_3.getText();    
        // Player X
        if(Satu.equalsIgnoreCase("X") && Dua.equalsIgnoreCase("X") && Tiga.equalsIgnoreCase("X")){
            xMenang();
        }
        if(Empat.equalsIgnoreCase("X") && Lima.equalsIgnoreCase("X") && Enam.equalsIgnoreCase("X")){
            xMenang();
        }
        if(Tujuh.equalsIgnoreCase("X") && Delapan.equalsIgnoreCase("X") && Sembilan.equalsIgnoreCase("X")){
            xMenang();
        }
        if(Satu.equalsIgnoreCase("X") && Empat.equalsIgnoreCase("X") && Tujuh.equalsIgnoreCase("X")){
            xMenang();
        }
        if(Dua.equalsIgnoreCase("X") && Lima.equalsIgnoreCase("X")&& Delapan.equalsIgnoreCase("X")){
            xMenang();
        }
        if(Tiga.equalsIgnoreCase("X") && Enam.equalsIgnoreCase("X") && Sembilan.equalsIgnoreCase("X")){
            xMenang();
        }
        if(Satu.equalsIgnoreCase("X") && Lima.equalsIgnoreCase("X") && Sembilan.equalsIgnoreCase("X")){
            xMenang();
        }
        if(Tiga.equalsIgnoreCase("X") && Lima.equalsIgnoreCase("X") && Tujuh.equalsIgnoreCase("X")){
            xMenang();
       }  
        
        // Player O
        if(Satu.equalsIgnoreCase("O") && Dua.equalsIgnoreCase("O") && Tiga.equalsIgnoreCase("O")){
            oMenang();
        }
        if(Empat.equalsIgnoreCase("O") && Lima.equalsIgnoreCase("O") && Enam.equalsIgnoreCase("O")){
            oMenang();
        }
        if(Tujuh.equalsIgnoreCase("O") && Delapan.equalsIgnoreCase("O") && Sembilan.equalsIgnoreCase("O")){
            oMenang();
        }
        if(Satu.equalsIgnoreCase("O") && Empat.equalsIgnoreCase("O") && Tujuh.equalsIgnoreCase("O")){
            oMenang();
        }
        if(Dua.equalsIgnoreCase("O") && Lima.equalsIgnoreCase("O")&& Delapan.equalsIgnoreCase("O")){
            oMenang();
        }
        if(Tiga.equalsIgnoreCase("O") && Enam.equalsIgnoreCase("O") && Sembilan.equalsIgnoreCase("O")){
            oMenang();
        }
        if(Satu.equalsIgnoreCase("O") && Lima.equalsIgnoreCase("O") && Sembilan.equalsIgnoreCase("O")){
            oMenang();
        }
        if(Tiga.equalsIgnoreCase("O") && Lima.equalsIgnoreCase("O") && Tujuh.equalsIgnoreCase("O")){
            oMenang();
       }      
    }
    protected void waiting(boolean w){
        if(w == false){
            jButtonB_1_1.setEnabled(false);
            jButtonB_1_2.setEnabled(false);
            jButtonB_1_3.setEnabled(false);
            jButtonB_2_1.setEnabled(false);
            jButtonB_2_2.setEnabled(false);
            jButtonB_2_3.setEnabled(false);
            jButtonB_3_1.setEnabled(false);
            jButtonB_3_2.setEnabled(false);
            jButtonB_3_3.setEnabled(false);
        }else{
            if(satu){
                jButtonB_1_1.setEnabled(true);
            }else{
                jButtonB_1_1.setEnabled(false);
            }
            if(dua){
                jButtonB_1_2.setEnabled(true);
            }else{
                jButtonB_1_2.setEnabled(false);
            }
            if(tiga){
                jButtonB_1_3.setEnabled(true);
            }else{
                jButtonB_1_3.setEnabled(false);
            }
            if(empat){
                jButtonB_2_1.setEnabled(true);
            }else{
                jButtonB_2_1.setEnabled(false);
            }
            if(lima){
                jButtonB_2_2.setEnabled(true);
            }else{
                jButtonB_2_2.setEnabled(false);
            }
            if(enam){
                jButtonB_2_3.setEnabled(true);
            }else{
                jButtonB_2_3.setEnabled(false);
            }
            if(tuju){
                jButtonB_3_1.setEnabled(true);
            }else{
                jButtonB_3_1.setEnabled(false);
            }
            if(delapan){
                jButtonB_3_2.setEnabled(true);
            }else{
                jButtonB_3_2.setEnabled(false);
            }
            if(sembilan){
                jButtonB_3_3.setEnabled(true);
            }else{
                jButtonB_3_3.setEnabled(false);
            }
        }
    }
    private void kirimG(String g){
        try{
            this.out.println(g);
        }catch(Exception e){
            
        }
    }
    private void ResetGame(){
        jButtonB_1_1.setText("");
        jButtonB_1_2.setText("");
        jButtonB_1_3.setText("");
        jButtonB_2_1.setText("");
        jButtonB_2_2.setText("");
        jButtonB_2_3.setText("");
        jButtonB_3_1.setText("");
        jButtonB_3_2.setText("");
        jButtonB_3_3.setText("");
        
        jButtonB_1_1.setEnabled(true);
        jButtonB_1_2.setEnabled(true);
        jButtonB_1_3.setEnabled(true);
        jButtonB_2_1.setEnabled(true);
        jButtonB_2_2.setEnabled(true);
        jButtonB_2_3.setEnabled(true);
        jButtonB_3_1.setEnabled(true);
        jButtonB_3_2.setEnabled(true);
        jButtonB_3_3.setEnabled(true);
        
        this.satu = true;
        this.dua = true;
        this.tiga = true;
        this.empat = true;
        this.lima = true;
        this.enam = true;
        this.tuju = true;
        this.delapan = true;
        this.sembilan = true;        
    }
    protected void setPanel(){
        jPanel_Waiting.setVisible(false);
    }
    protected void tieGame(){        
        if(!jButtonB_1_1.getText().equalsIgnoreCase("") && 
           !jButtonB_1_2.getText().equalsIgnoreCase("") && 
           !jButtonB_1_3.getText().equalsIgnoreCase("") &&
           !jButtonB_2_1.getText().equalsIgnoreCase("") && 
           !jButtonB_2_2.getText().equalsIgnoreCase("") && 
           !jButtonB_2_3.getText().equalsIgnoreCase("") &&
           !jButtonB_3_1.getText().equalsIgnoreCase("") &&
           !jButtonB_3_2.getText().equalsIgnoreCase("") && 
           !jButtonB_3_3.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(this, 
                    "Seri!!", "Game", JOptionPane.INFORMATION_MESSAGE);
            ResetGame();
            if(xoGiliran.equalsIgnoreCase("X")){
                this.waiting(false);
            }
        }
    }     
    private void xMenang(){
        if(xoGiliran.equalsIgnoreCase("X")){
            JOptionPane.showMessageDialog(this,
                "Winnner WInner Chicken Dinner!!",
                nama + " Manang!",
                JOptionPane.INFORMATION_MESSAGE);
            ResetGame();
            setScore();
            waiting(false);
            playerSatuScore++;
        }else{
            JOptionPane.showMessageDialog(this,
                "You Lose!!",
                namaL + " Manang!",
                JOptionPane.INFORMATION_MESSAGE);
            ResetGame();
            setScore();
            playerDuaScore++;   
        }
    }  
    private void oMenang(){
        if(xoGiliran.equalsIgnoreCase("O")){
            JOptionPane.showMessageDialog(this,
                "Winnner WInner Chicken Dinner!!",
                nama + " Manang!",
                JOptionPane.INFORMATION_MESSAGE);
            ResetGame();
            setScore();
            waiting(false);
            playerSatuScore++;
        }else{
            JOptionPane.showMessageDialog(this,
                "You Lose!!",
                namaL + " Manang!",
                JOptionPane.INFORMATION_MESSAGE);
            ResetGame();
            setScore();
            playerDuaScore++;   
        }
    }    
    protected void setTrun(String turn){
        if(turn.equalsIgnoreCase("Lawan")){
            this.jLabel2.setText(this.namaL);
        }else{
            this.jLabel2.setText(this.nama);
        }
    }
    protected void setScore(){
        if(xoGiliran.equalsIgnoreCase("X")){
            this.jLabel1.setText("Score X : ["+ playerSatuScore + "] "+ this.nama);
            this.jLabel2.setText(this.nama);
            this.jLabel3.setText("Score O : ["+ playerDuaScore + "] "+ this.namaL);
        }else{
            this.jLabel1.setText("Score O : ["+ playerSatuScore + "] "+ this.nama);
            this.jLabel2.setText(this.namaL);
            this.jLabel3.setText("Score X : ["+ playerDuaScore + "] "+ this.namaL);
        }
    }
    public boolean exit(){
        return exit;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Board = new javax.swing.JPanel();
        jPanel_Waiting = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel_Grid = new javax.swing.JPanel();
        jPanelB_1_1 = new javax.swing.JPanel();
        jButtonB_1_1 = new javax.swing.JButton();
        jPanelB_1_2 = new javax.swing.JPanel();
        jButtonB_1_2 = new javax.swing.JButton();
        jPanelB_1_3 = new javax.swing.JPanel();
        jButtonB_1_3 = new javax.swing.JButton();
        jPanelB_2_1 = new javax.swing.JPanel();
        jButtonB_2_1 = new javax.swing.JButton();
        jPanelB_2_2 = new javax.swing.JPanel();
        jButtonB_2_2 = new javax.swing.JButton();
        jPanelB_2_3 = new javax.swing.JPanel();
        jButtonB_2_3 = new javax.swing.JButton();
        jPanelB_3_1 = new javax.swing.JPanel();
        jButtonB_3_1 = new javax.swing.JButton();
        jPanelB_3_2 = new javax.swing.JPanel();
        jButtonB_3_2 = new javax.swing.JButton();
        jPanelB_3_3 = new javax.swing.JPanel();
        jButtonB_3_3 = new javax.swing.JButton();
        jPanel_Score = new javax.swing.JPanel();
        jPanel_Nama = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel_Turn = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel_nLawan = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel_logout = new javax.swing.JPanel();
        jPanel_Button = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Tic Tac Toe");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setLocation(new java.awt.Point(0, 0));
        setMaximumSize(new java.awt.Dimension(500, 400));
        setMinimumSize(new java.awt.Dimension(500, 400));
        setResizable(false);

        jPanel_Board.setLayout(new java.awt.BorderLayout());

        jPanel_Waiting.setBackground(new Color(0, 0, 0, 80));
        jPanel_Waiting.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Waiting Other Player");

        javax.swing.GroupLayout jPanel_WaitingLayout = new javax.swing.GroupLayout(jPanel_Waiting);
        jPanel_Waiting.setLayout(jPanel_WaitingLayout);
        jPanel_WaitingLayout.setHorizontalGroup(
            jPanel_WaitingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_WaitingLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel4)
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel_WaitingLayout.setVerticalGroup(
            jPanel_WaitingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_WaitingLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel4)
                .addContainerGap(178, Short.MAX_VALUE))
        );

        jPanel_Board.add(jPanel_Waiting, java.awt.BorderLayout.PAGE_START);

        jPanel_Grid.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel_Grid.setOpaque(false);
        jPanel_Grid.setLayout(new java.awt.GridLayout(3, 3));

        jPanelB_1_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelB_1_1.setLayout(new java.awt.BorderLayout());

        jButtonB_1_1.setFont(new java.awt.Font("Dialog", 1, 80)); // NOI18N
        jButtonB_1_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonB_1_1ActionPerformed(evt);
            }
        });
        jPanelB_1_1.add(jButtonB_1_1, java.awt.BorderLayout.CENTER);

        jPanel_Grid.add(jPanelB_1_1);

        jPanelB_1_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelB_1_2.setLayout(new java.awt.BorderLayout());

        jButtonB_1_2.setFont(new java.awt.Font("Dialog", 1, 80)); // NOI18N
        jButtonB_1_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonB_1_2ActionPerformed(evt);
            }
        });
        jPanelB_1_2.add(jButtonB_1_2, java.awt.BorderLayout.CENTER);

        jPanel_Grid.add(jPanelB_1_2);

        jPanelB_1_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelB_1_3.setLayout(new java.awt.BorderLayout());

        jButtonB_1_3.setFont(new java.awt.Font("Dialog", 1, 80)); // NOI18N
        jButtonB_1_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonB_1_3ActionPerformed(evt);
            }
        });
        jPanelB_1_3.add(jButtonB_1_3, java.awt.BorderLayout.CENTER);

        jPanel_Grid.add(jPanelB_1_3);

        jPanelB_2_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelB_2_1.setLayout(new java.awt.BorderLayout());

        jButtonB_2_1.setFont(new java.awt.Font("Dialog", 1, 80)); // NOI18N
        jButtonB_2_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonB_2_1ActionPerformed(evt);
            }
        });
        jPanelB_2_1.add(jButtonB_2_1, java.awt.BorderLayout.CENTER);

        jPanel_Grid.add(jPanelB_2_1);

        jPanelB_2_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelB_2_2.setLayout(new java.awt.BorderLayout());

        jButtonB_2_2.setFont(new java.awt.Font("Dialog", 1, 80)); // NOI18N
        jButtonB_2_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonB_2_2ActionPerformed(evt);
            }
        });
        jPanelB_2_2.add(jButtonB_2_2, java.awt.BorderLayout.CENTER);

        jPanel_Grid.add(jPanelB_2_2);

        jPanelB_2_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelB_2_3.setLayout(new java.awt.BorderLayout());

        jButtonB_2_3.setFont(new java.awt.Font("Dialog", 1, 80)); // NOI18N
        jButtonB_2_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonB_2_3ActionPerformed(evt);
            }
        });
        jPanelB_2_3.add(jButtonB_2_3, java.awt.BorderLayout.CENTER);

        jPanel_Grid.add(jPanelB_2_3);

        jPanelB_3_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelB_3_1.setLayout(new java.awt.BorderLayout());

        jButtonB_3_1.setFont(new java.awt.Font("Dialog", 1, 80)); // NOI18N
        jButtonB_3_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonB_3_1ActionPerformed(evt);
            }
        });
        jPanelB_3_1.add(jButtonB_3_1, java.awt.BorderLayout.CENTER);

        jPanel_Grid.add(jPanelB_3_1);

        jPanelB_3_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelB_3_2.setLayout(new java.awt.BorderLayout());

        jButtonB_3_2.setFont(new java.awt.Font("Dialog", 1, 80)); // NOI18N
        jButtonB_3_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonB_3_2ActionPerformed(evt);
            }
        });
        jPanelB_3_2.add(jButtonB_3_2, java.awt.BorderLayout.CENTER);

        jPanel_Grid.add(jPanelB_3_2);

        jPanelB_3_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelB_3_3.setLayout(new java.awt.BorderLayout());

        jButtonB_3_3.setFont(new java.awt.Font("Dialog", 1, 80)); // NOI18N
        jButtonB_3_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonB_3_3ActionPerformed(evt);
            }
        });
        jPanelB_3_3.add(jButtonB_3_3, java.awt.BorderLayout.CENTER);

        jPanel_Grid.add(jPanelB_3_3);

        jPanel_Board.add(jPanel_Grid, java.awt.BorderLayout.CENTER);

        jPanel_Score.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel_Score.setLayout(new java.awt.GridLayout(1, 0));

        jPanel_Nama.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel_Nama.setLayout(new java.awt.BorderLayout());

        jLabel1.setText("Nama");
        jLabel1.setHorizontalAlignment(0);
        jPanel_Nama.add(jLabel1, java.awt.BorderLayout.CENTER);

        jPanel_Score.add(jPanel_Nama);

        jPanel_Turn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel_Turn.setLayout(new java.awt.BorderLayout());

        jLabel2.setText("Turn");
        jPanel_Turn.add(jLabel2, java.awt.BorderLayout.CENTER);
        jLabel2.setHorizontalAlignment(0);

        jPanel_Score.add(jPanel_Turn);

        jPanel_nLawan.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel_nLawan.setLayout(new java.awt.BorderLayout());

        jLabel3.setText("Nama");
        jPanel_nLawan.add(jLabel3, java.awt.BorderLayout.CENTER);
        jLabel3.setHorizontalAlignment(0);

        jPanel_Score.add(jPanel_nLawan);

        jPanel_logout.setLayout(new java.awt.GridLayout(1, 0));

        jPanel_Button.setLayout(new java.awt.BorderLayout());

        jButton10.setText("Logout");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel_Button.add(jButton10, java.awt.BorderLayout.PAGE_START);

        jPanel_logout.add(jPanel_Button);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel_Score, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel_Board, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel_Board, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel_logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel_Score, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        if(accept == false){
            exit = true;
        }else{
            exit = true;
            out.println("Exit!");
        }
    }//GEN-LAST:event_jButton10ActionPerformed
    
    // <editor-fold defaultstate="collapsed" desc="Kodinat Board">
    private void jButtonB_1_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonB_1_1ActionPerformed
        jButtonB_1_1.setText(xoGiliran);
        jButtonB_1_1.setEnabled(false);
        satu = false;
       waiting(false);
       setTrun("Lawan");
       MenentukanPemenang();
       tieGame();
       kirimG("1_1");
    }//GEN-LAST:event_jButtonB_1_1ActionPerformed
    private void jButtonB_1_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonB_1_2ActionPerformed
        jButtonB_1_2.setText(xoGiliran);
        jButtonB_1_2.setEnabled(false);
        dua = false;
        waiting(false);
        setTrun("Lawan");
       MenentukanPemenang();
       tieGame();
       kirimG("1_2");
    }//GEN-LAST:event_jButtonB_1_2ActionPerformed
    private void jButtonB_1_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonB_1_3ActionPerformed
        jButtonB_1_3.setText(xoGiliran);
        jButtonB_1_3.setEnabled(false);
        tiga = false;
        waiting(false);
        setTrun("Lawan");
       MenentukanPemenang();
       tieGame();
       kirimG("1_3");
    }//GEN-LAST:event_jButtonB_1_3ActionPerformed
    private void jButtonB_2_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonB_2_1ActionPerformed
        jButtonB_2_1.setText(xoGiliran);
        jButtonB_2_1.setEnabled(false);
        empat = false;
        waiting(false);
        setTrun("Lawan");
       MenentukanPemenang();
       tieGame();
       kirimG("2_1");
    }//GEN-LAST:event_jButtonB_2_1ActionPerformed
    private void jButtonB_2_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonB_2_2ActionPerformed
        jButtonB_2_2.setText(xoGiliran);
        jButtonB_2_2.setEnabled(false);
        lima = false;
        waiting(false);
        setTrun("Lawan");
       MenentukanPemenang();
       tieGame();
       kirimG("2_2");
    }//GEN-LAST:event_jButtonB_2_2ActionPerformed
    private void jButtonB_2_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonB_2_3ActionPerformed
        jButtonB_2_3.setText(xoGiliran);
        jButtonB_2_3.setEnabled(false);
        enam = false;
        waiting(false);
        setTrun("Lawan");
       MenentukanPemenang();
       tieGame();
       kirimG("2_3");
    }//GEN-LAST:event_jButtonB_2_3ActionPerformed
    private void jButtonB_3_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonB_3_1ActionPerformed
        jButtonB_3_1.setText(xoGiliran);
        jButtonB_3_1.setEnabled(false);
        tuju = false;
        waiting(false);
        setTrun("Lawan");
       MenentukanPemenang();
       tieGame();
       kirimG("3_1");
    }//GEN-LAST:event_jButtonB_3_1ActionPerformed
    private void jButtonB_3_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonB_3_2ActionPerformed
        jButtonB_3_2.setText(xoGiliran);
        jButtonB_3_2.setEnabled(false);
        delapan = false;
        waiting(false);
        setTrun("Lawan");
       MenentukanPemenang();
       tieGame();
       kirimG("3_2");
    }//GEN-LAST:event_jButtonB_3_2ActionPerformed
    private void jButtonB_3_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonB_3_3ActionPerformed
        jButtonB_3_3.setText(xoGiliran);
        jButtonB_3_3.setEnabled(false);
        sembilan = false;
        waiting(false);
        setTrun("Lawan");
       MenentukanPemenang();
       tieGame();
       kirimG("3_3");
    }//GEN-LAST:event_jButtonB_3_3ActionPerformed
    // </editor-fold>                        
    
    // <editor-fold defaultstate="collapsed" desc="Variables Declaration">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    protected javax.swing.JButton jButtonB_1_1;
    protected javax.swing.JButton jButtonB_1_2;
    protected javax.swing.JButton jButtonB_1_3;
    protected javax.swing.JButton jButtonB_2_1;
    protected javax.swing.JButton jButtonB_2_2;
    protected javax.swing.JButton jButtonB_2_3;
    protected javax.swing.JButton jButtonB_3_1;
    protected javax.swing.JButton jButtonB_3_2;
    protected javax.swing.JButton jButtonB_3_3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanelB_1_1;
    private javax.swing.JPanel jPanelB_1_2;
    private javax.swing.JPanel jPanelB_1_3;
    private javax.swing.JPanel jPanelB_2_1;
    private javax.swing.JPanel jPanelB_2_2;
    private javax.swing.JPanel jPanelB_2_3;
    private javax.swing.JPanel jPanelB_3_1;
    private javax.swing.JPanel jPanelB_3_2;
    private javax.swing.JPanel jPanelB_3_3;
    private javax.swing.JPanel jPanel_Board;
    private javax.swing.JPanel jPanel_Button;
    private javax.swing.JPanel jPanel_Grid;
    private javax.swing.JPanel jPanel_Nama;
    private javax.swing.JPanel jPanel_Score;
    private javax.swing.JPanel jPanel_Turn;
    private javax.swing.JPanel jPanel_Waiting;
    private javax.swing.JPanel jPanel_logout;
    private javax.swing.JPanel jPanel_nLawan;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>    
}
