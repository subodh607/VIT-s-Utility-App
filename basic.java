/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sony
 * 
 */
import java.nio.file.Path;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static java.awt.SplashScreen.getSplashScreen;
import java.io.File;
public class basic extends JFrame implements ActionListener {
    JFileChooser chooser = new JFileChooser();
    readfile rd = new readfile();
    decrypt dc = new decrypt();
    compress cp = new compress();
    unzip uz = new unzip();
    
   Path pat;
       String h = " " ;
       Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
  int height = screenSize.height;
  int width = screenSize.width;
           private static void sleepThread() {
            try
                {
                   /* java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new load().setVisible(true);
                
                
                  
            }
            
        });*/
                    load l = new load();
                    l.setVisible(true);
               
                    Thread.sleep(5000);
                    l.setVisible(false);
                    
                    //getSplashScreen();
                }
                catch (InterruptedException ex)
                {
                    // Do something, if there is a exception
                    System.out.println(ex.toString());
                }
        }
          
       
    /**
     * Creates new form basic
     */
    public basic() {
       //sleepThread();
        //jFileChooser1.setFileSelectionMode(JFileChooser.FILES_ONLY);
        basic.this.setSize(width/2, height/2);
        basic.this.setLocationRelativeTo(null);
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
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UTILITY APPLICATION");
        setBackground(new java.awt.Color(153, 153, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(663, 442));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo-color.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("                        Your Selected File");
        jLabel2.setToolTipText("");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton6.setBackground(new java.awt.Color(204, 204, 204));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6.setText("Choose File");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(204, 204, 204));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setText("Exit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Developed by - Subodh, Srutakirty, Sumeet");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel3.setOpaque(true);

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton1.setText("Encrypt");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setHideActionText(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton2.setText("Decrypt");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton4.setText("Decompress");
        jButton4.setPreferredSize(new java.awt.Dimension(69, 21));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton3.setText("Compress");
        jButton3.setPreferredSize(new java.awt.Dimension(69, 21));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(158, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );

        jLayeredPane1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2, jButton3, jButton4});

        jLayeredPane1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton5, jButton6});

        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addGap(36, 36, 36)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLayeredPane1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton2, jButton3, jButton4});

        jLayeredPane1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton5, jButton6, jLabel2});

        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jButton6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jButton5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton4.getAccessibleContext().setAccessibleDescription("");
        jLayeredPane1.setLayer(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jDesktopPane1.setLayer(jLayeredPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

       
       JFrame fr = new JFrame("File Name");
        JButton bt = new JButton("Submit");
        bt.setBounds(100, 100, 140,40);
        JLabel lb = new JLabel("Enter The File Name");
        lb.setBounds(10, 10, 100, 100);
        JTextField tf= new JTextField();
		tf.setBounds(110, 50, 130, 30);
               
                fr.add(tf);
                fr.add(bt);
                fr.add(lb);
                fr.setSize(300,300);
                fr.setLayout(null);    
		fr.setVisible(true);    
		bt.addActionListener((ActionEvent e) -> {
                     String tx = tf.getText();
                System.out.println("file name : " + tx);
                   h = pat.toString();
               System.out.println("Variable H :"+h);
              uz.dcomp(h,tx);
                    JFrame frame = new JFrame();
                    frame.add(new JLabel("Decompressed file is : "+rd.strFilePath+"  and is stored in"+ chooser.getCurrentDirectory() ));
                    frame.setVisible(true);
                    frame.setSize(550,100);
                    frame.setLocationRelativeTo(basic.this);
                    System.out.println("I was clicked!");
        });

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //JFileChooser chooser = new JFileChooser();

       
        JFrame fr = new JFrame("File Name");
        JButton bt = new JButton("Submit");
        bt.setBounds(100, 100, 140,40);
        JLabel lb = new JLabel("Enter The File Name");
        lb.setBounds(10, 10, 100, 100);
        JTextField tf= new JTextField();
		tf.setBounds(110, 50, 130, 30);
               
                fr.add(tf);
                fr.add(bt);
                fr.add(lb);
                fr.setSize(300,300);
                fr.setLayout(null);    
		fr.setVisible(true);    
		bt.addActionListener((ActionEvent e) -> {
                     String tx = tf.getText();
                System.out.println("file name : " + tx);
                    h = pat.toString();
                    System.out.println("Variable H :"+h);
                    rd.dry(h,tx);
                    JFrame frame = new JFrame();
                    frame.add(new JLabel("Encrypted file is : "+rd.strFilePath+"  and is stored in"+ chooser.getCurrentDirectory() ));
                    frame.setVisible(true);
                    frame.setSize(550,100);
                    frame.setLocationRelativeTo(basic.this);
                    System.out.println("I was clicked!");
        });
        
        /* h = pat.toString();
        System.out.println("Variable H :"+h);
        rd.dry(h,tx);*/
        
      /*  JFrame frame = new JFrame();
       frame.add(new JLabel("Encrypted file is : "+rd.strFilePath+"  and is stored in"+ chooser.getCurrentDirectory() ));
       frame.setVisible(true);
       frame.setSize(550,100);
       frame.setLocationRelativeTo(this);*/
          
          
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
       
        
        JFrame fr = new JFrame("File Name");
        JButton bt = new JButton("Submit");
        bt.setBounds(100, 100, 140,40);
        JLabel lb = new JLabel("Enter The File Name");
        lb.setBounds(10, 10, 100, 100);
        JTextField tf= new JTextField();
		tf.setBounds(110, 50, 130, 30);
               
                fr.add(tf);
                fr.add(bt);
                fr.add(lb);
                fr.setSize(300,300);
                fr.setLayout(null);    
		fr.setVisible(true);    
		bt.addActionListener((ActionEvent e) -> {
                     String tx = tf.getText();
                System.out.println("file name : " + tx);
                   h = pat.toString();
               System.out.println("Variable H :"+h);
              cp.comp(h,tx);
                    JFrame frame = new JFrame();
                    frame.add(new JLabel("Compressed file is : "+rd.strFilePath+"  and is stored in"+ chooser.getCurrentDirectory() ));
                    frame.setVisible(true);
                    frame.setSize(550,100);
                    frame.setLocationRelativeTo(basic.this);
                    System.out.println("I was clicked!");
        });

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       // pat= jFileChooser1.getSelectedFile().toPath();
        
        JFrame fr = new JFrame("File Name");
        JButton bt = new JButton("Submit");
        bt.setBounds(100, 100, 140,40);
        JLabel lb = new JLabel("Enter The File Name");
        lb.setBounds(10, 10, 100, 100);
        JTextField tf= new JTextField();
		tf.setBounds(110, 50, 130, 30);
               
                fr.add(tf);
                fr.add(bt);
                fr.add(lb);
                fr.setSize(300,300);
                fr.setLayout(null);    
		fr.setVisible(true);    
		bt.addActionListener((ActionEvent e) -> {
                     String tx = tf.getText();
                System.out.println("file name : " + tx);
                   h = pat.toString();
                 System.out.println("Variable H :"+h);
                  dc.decryp(h,tx);
                    JFrame frame = new JFrame();
                    frame.add(new JLabel("Decrypted file is : "+rd.strFilePath+"  and is stored in"+ chooser.getCurrentDirectory() ));
                    frame.setVisible(true);
                    frame.setSize(550,100);
                    frame.setLocationRelativeTo(basic.this);
                    System.out.println("I was clicked!");
        });

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
           basic.this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
        chooser.showOpenDialog(jLabel1);
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        File workingDirectory = new File(System.getProperty("user.dir"));
        chooser.setCurrentDirectory(workingDirectory);
        
        pat= chooser.getSelectedFile().toPath();
        h = pat.toString();
        jLabel2.setText(h);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed
      
        
     
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
     /*JWindow window = new JWindow();
 window.getContentPane().add( jLabel1);   
    //new JLabel( new javax.swing.ImageIcon("sample/giphy.gif"), SwingConstants.CENTER));
  
window.setBounds(500, 150, 300, 200);
window.setVisible(true);
try {
    Thread.sleep(5000);
} catch (InterruptedException e) {
    e.printStackTrace();
}
window.setVisible(false);
window.dispose();
/*JFrame frame = new JFrame();
frame.add(new JLabel("Welcome"));
frame.setVisible(true);
frame.setSize(300,100);*/

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(basic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(basic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(basic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(basic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
         
      /*  java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new load().setVisible(true);
                  
            }
        });*/
        sleepThread();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new basic().setVisible(true);
             
            }
        });
       
        
       
        
           
        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(() -> {
            new basic().setVisible(true);
        });*/
         
        
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
