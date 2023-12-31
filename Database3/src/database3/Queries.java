/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author janet
 */
public class Queries extends javax.swing.JFrame {

    /**
     * Creates new form Queries
     */
    public Queries() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        queryBox = new javax.swing.JTextField();
        tableButton = new javax.swing.JButton();
        fileButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gamers' Database");

        jPanel1.setBackground(new java.awt.Color(232, 242, 248));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gamers' Database", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 12))); // NOI18N

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(229, 229, 229));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(2);
        jTextArea1.setText("Welcome to Gamers' Database! This is a video games database, perfect for gamers who want to know what games are available on their preferred gaming platform.");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(165, 190, 241)));
        jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextArea1.setMinimumSize(new java.awt.Dimension(164, 56));
        jScrollPane1.setViewportView(jTextArea1);
        jTextArea1.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(232, 242, 248));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Queries", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 12))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel2.setText("Query: ");

        queryBox.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        queryBox.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(165, 190, 241)));
        queryBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queryBoxActionPerformed(evt);
            }
        });

        tableButton.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tableButton.setText("Display Here");
        tableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableButtonActionPerformed(evt);
            }
        });

        fileButton.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        fileButton.setText("Save to File");
        fileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel1.setText("1. Find the games (by Title and genre) available on PC, sorted by Title in ascending order.");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel3.setText("2. Display the names of games released on PlayStation 4 but not released on Xbox One.");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel4.setText("3. Display the release dates of “The Elder Scrolls V: Skyrim” on each platform, respectively.");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel5.setText("4. Display the names of games and the names of its developer studios for games that were released in 2020 on Xbox One.");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel6.setText("5. Display the platform name and count the number of games per platform.");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel7.setText("6. Display the names of games that were banned in Australia and the reason for which they were banned.");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel8.setText("7. Display the games (by title) that are available on both Xbox One and PlayStation 4.");

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel9.setText("8. Display the country name and count the number of games banned per country.");

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel10.setText("Please enter a query number and select whether to display the results here or save the results to a file. ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(queryBox, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(tableButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(fileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 732, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(queryBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tableButton)
                    .addComponent(fileButton))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void queryBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queryBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_queryBoxActionPerformed

    private void tableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tableButtonActionPerformed
        // TODO add your handling code here:
        String queryNum = queryBox.getText().trim();
        
       new Table(queryNum).setVisible(true);
    }//GEN-LAST:event_tableButtonActionPerformed

    
    private void fileCreate(String fn){
        File myObj = new File(fn);
        try {
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            } } catch (IOException ex) {
            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void writeFile(String w, String data) {
        try{
        FileWriter mw = new FileWriter(w);
        mw.write(data);
        mw.close();
        } catch(IOException ek){
            
        }
            
    }
    
    private void fileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileButtonActionPerformed
        // TODO add your handling code here:
       try {
          
        String qNum = queryBox.getText().trim(); 
          
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/VideoGames","root","Janet1997");
        Statement stmt = con.createStatement();
        
        int q = Integer.parseInt(qNum);
        
        if(q == 1)
        {    
          Date d = new Date(); 
          SimpleDateFormat ts = new SimpleDateFormat("hh-mm-ss");
          String timeStamp = ts.format(d);
          System.out.println(timeStamp);
          String fileName = "query" + qNum + "-" + timeStamp + ".txt";
        
            String data = "";
            fileCreate(fileName);
            
            ResultSet queryOne = stmt.executeQuery("Select title, genre from Game AS G, Platform AS P, Released_On AS R where "
                    + "G.GID = R.GID AND R.PID = P.PID AND P.platformName = 'PC' order by title ASC;"); 
             while(queryOne.next())
            {
                data += queryOne.getString("title") + " Genre: " + queryOne.getString("genre") + "\n";
                
            }  
             writeFile(fileName, data);
             JOptionPane.showMessageDialog(null, "Results successfully saved to file!"); 
        }
        else if (q == 2)
        {
            Date d = new Date(); 
            SimpleDateFormat ts = new SimpleDateFormat("hh-mm-ss");
            String timeStamp = ts.format(d);
            System.out.println(timeStamp);
            String fileName = "query" + qNum + "-" + timeStamp + ".txt";
        
            String data = "";
            fileCreate(fileName);
            
            ResultSet queryTwo = stmt.executeQuery("Select title AS Game from Game AS G, Released_On AS R, Platform AS P "
                    + "where G.GID = R.GID AND R.PID = P.PID AND P.platformName = 'PlayStation' AND P.generation = '4' "
                    + "AND title NOT IN (Select title from Game AS G, Released_On AS R, Platform AS P where "
                    + "G.GID = R.GID AND R.PID = P.PID AND P.platformName = 'Xbox' AND P.generation = 'One');");
            while(queryTwo.next())
            {
                data += queryTwo.getString("Game") + "\n";
            }
            writeFile(fileName, data);
            JOptionPane.showMessageDialog(null, "Results successfully saved to file!"); 
        }
        else if (q == 3)
        {
            Date d = new Date(); 
            SimpleDateFormat ts = new SimpleDateFormat("hh-mm-ss");
            String timeStamp = ts.format(d);
            System.out.println(timeStamp);
            String fileName = "query" + qNum + "-" + timeStamp + ".txt";
        
            String data = "";
            fileCreate(fileName);
            
            ResultSet queryThree = stmt.executeQuery("Select releaseDate, platformName, generation from Game AS G, Released_On AS R, "
                    + "Platform AS P where G.GID = R.GID AND R.PID = P.PID AND title = 'The Elder Scrolls V: Skyrim';");
            while(queryThree.next())
            {
                data += queryThree.getString("platformName") + " " + queryThree.getString("generation") + ", Released: " + queryThree.getDate("releaseDate") + "\n";
            }        
            writeFile(fileName, data);
            JOptionPane.showMessageDialog(null, "Results successfully saved to file!"); 
        }
        else if (q == 4)
        {
            Date d = new Date(); 
            SimpleDateFormat ts = new SimpleDateFormat("hh-mm-ss");
            String timeStamp = ts.format(d);
            System.out.println(timeStamp);
            String fileName = "query" + qNum + "-" + timeStamp + ".txt";
        
            String data = "";
            fileCreate(fileName);
            
            ResultSet queryFour = stmt.executeQuery("Select G.title AS Game, S.devName AS DeveloperStudio from Developed_By AS D, "
                    + "DeveloperStudio AS S, Game AS G, Released_On AS R, Platform AS P where S.DID = D.DID AND D.GID = G.GID AND "
                    + "D.GID = R.GID AND P.PID = R.PID AND YEAR(R.releaseDate) = 2020 AND P.platformName = 'Xbox' AND P.generation = 'One';");
            while(queryFour.next())
            {
                data += queryFour.getString("Game") + ", Developer Studio: " + queryFour.getString("DeveloperStudio") + "\n";
            }
           writeFile(fileName, data);
           JOptionPane.showMessageDialog(null, "Results successfully saved to file!"); 
        }
        else if (q == 5)
        {
            Date d = new Date(); 
            SimpleDateFormat ts = new SimpleDateFormat("hh-mm-ss");
            String timeStamp = ts.format(d);
            System.out.println(timeStamp);
            String fileName = "query" + qNum + "-" + timeStamp + ".txt";
        
            String data = "";
            fileCreate(fileName);
            
            ResultSet queryFive = stmt.executeQuery("Select P.platformName, P.generation, COUNT(R.GID) AS GameCounter from Platform AS P, "
                    + "Released_On AS R where R.PID = P.PID group by R.PID;");
            while(queryFive.next())
            {
                data += queryFive.getString("platformName") + " " + queryFive.getString("generation") + ", Number of Games: " + queryFive.getInt("GameCounter") + "\n";
            }
            writeFile(fileName, data);
            JOptionPane.showMessageDialog(null, "Results successfully saved to file!"); 
        }
        else if (q == 6)
        {
            Date d = new Date(); 
            SimpleDateFormat ts = new SimpleDateFormat("hh-mm-ss");
            String timeStamp = ts.format(d);
            System.out.println(timeStamp);
            String fileName = "query" + qNum + "-" + timeStamp + ".txt";
        
            String data = "";
            fileCreate(fileName);
            
            ResultSet querySix = stmt.executeQuery("Select title, banReason from Country AS C, Banned_In AS B, Game AS G where C.CID = B.CID "
                   + "AND B.GID = G.GID AND countryName = 'Australia';"); 
            while(querySix.next())
            {
                data += querySix.getString("title") + ", " + querySix.getString("banReason") + "\n";
            }       
            writeFile(fileName, data);
            JOptionPane.showMessageDialog(null, "Results successfully saved to file!"); 
        }
        else if (q == 7)
        {
            Date d = new Date(); 
            SimpleDateFormat ts = new SimpleDateFormat("hh-mm-ss");
            String timeStamp = ts.format(d);
            System.out.println(timeStamp);
            String fileName = "query" + qNum + "-" + timeStamp + ".txt";
        
            String data = "";
            fileCreate(fileName);
            
            ResultSet querySeven = stmt.executeQuery("Select title from Platform AS P, Released_On AS R, Game AS G where "
                    + "P.PID = R.PID AND R.GID = G.GID AND P.platformName = 'Xbox' AND P.generation = 'One' AND title IN "
                    + "(Select title from Platform AS P, Released_On AS R, Game AS G where P.PID = R.PID AND R.GID = G.GID "
                    + "AND P.platformName = 'PlayStation' AND P.generation = '4');"); 
            while(querySeven.next())
            {
                data += querySeven.getString("title") + "\n";
            }
            writeFile(fileName, data);
            JOptionPane.showMessageDialog(null, "Results successfully saved to file!"); 
        }
        else if (q == 8)
        {
            Date d = new Date(); 
            SimpleDateFormat ts = new SimpleDateFormat("hh-mm-ss");
            String timeStamp = ts.format(d);
            System.out.println(timeStamp);
            String fileName = "query" + qNum + "-" + timeStamp + ".txt";
        
            String data = "";
            fileCreate(fileName);
            
            ResultSet queryE = stmt.executeQuery("Select countryName, COUNT(G.GID) AS BannedGames from Country AS C, "
                    + "Banned_In AS B, Game AS G where C.CID = B.CID AND B.GID = G.GID group by B.CID;"); 
            while(queryE.next())
            {
                data += queryE.getString("countryName") + ", " + queryE.getString("BannedGames") + "\n";
            }   
            writeFile(fileName, data);
            JOptionPane.showMessageDialog(null, "Results successfully saved to file!"); 
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Query does not exist!", "Error", JOptionPane.ERROR_MESSAGE); 
        }
        con.close();
    } catch (Exception e) {
          System.out.println("An error occurred.");

    }
    }//GEN-LAST:event_fileButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Queries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Queries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Queries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Queries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
          
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Queries().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fileButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField queryBox;
    private javax.swing.JButton tableButton;
    // End of variables declaration//GEN-END:variables
}
