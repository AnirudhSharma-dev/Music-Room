import java.sql.*;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * 
 *
 * 
 */
/**
 *
 * @author anirudh
 */
public class AddStock extends javax.swing.JFrame {

    /** Creates new form PlanetM */
    public AddStock() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        T1 = new javax.swing.JTextField();
        T2 = new javax.swing.JTextField();
        T5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        T3 = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        T4 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Stock");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Enter Name of the song");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel2.setText("Artist");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        jLabel3.setText("Genre");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, -1, -1));

        jLabel4.setText("Price");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));
        getContentPane().add(T1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 310, 30));
        getContentPane().add(T2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 100, -1));
        getContentPane().add(T5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 100, -1));

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 100, 30));

        jButton2.setText("Log out");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, 80, -1));

        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 90, 30));

        jLabel5.setFont(new java.awt.Font("Monospaced", 2, 24));
        jLabel5.setText("Welcome Admin to Music Room");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 400, -1));

        T3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "Pop", "Jazz", "Electro", "Metal", "R&B", "Trance", "Dance", "Rock", "Hip-Hop", "Rap", "Stereo", "Mono", "Acoustic", "Soul", "Classical", "Instrumental", " ", " ", " " }));
        T3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T3ActionPerformed(evt);
            }
        });
        getContentPane().add(T3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 110, -1));

        jLabel7.setText("CopyRights (2017-2042)All Rights Reserved....!!!!");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, -1, -1));

        jButton4.setText("Insert");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 90, 30));

        jLabel8.setText("Year");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, -1, -1));
        getContentPane().add(T4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 110, -1));

        jButton5.setText("Update");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 80, -1));

        jButton6.setText("Delete");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 80, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TitleImg.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setOpaque(true);
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 490));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Clear
         T1.setText("");
         T2.setText("");
         T3.setSelectedIndex(0);
         T4.setText("");
         T5.setText("");
         
          
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Logout
       new Login().setVisible(true);
       dispose();  
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Search
         try
        {
         Class.forName("java.sql.DriverManager");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","9829");
         Statement st=con.createStatement();
         String sql,Name;
         Name=T1.getText();
         sql="select * from songs where name='"+Name+"';" ;
         ResultSet rs=st.executeQuery(sql);
         if(!rs.next())
             JOptionPane.showMessageDialog(this, "No such result FOUND");
         else
         {
            T2.setText(rs.getString("artist"));
            //System.out.println(rs.getString("artist"));
            T3.setSelectedItem(rs.getString("genre"));
            //System.out.println(rs.getString("genre"));
            T4.setText(rs.getString("year")); 
            //System.out.println(rs.getString("year"));
            T5.setText(rs.getString("price")); 
            //System.out.println(rs.getString("price"));
            
         }
         }
        catch(Exception e)
                {
                JOptionPane.showMessageDialog(this,"Errror!!!"+e.getMessage());
                }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // Insert
          try
       { 
       Class.forName("java.sql.DriverManager");
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","9829");
       String Name,Artist,Year,sql; double Price;
       Name=T1.getText();
       Artist=T2.getText();
       Price=Double.parseDouble(T5.getText());
       Year=T4.getText();
       String Genre=T3.getSelectedItem().toString();
      
       Statement st=con.createStatement();
       sql="insert into songs values('"+Name+"','"+Artist+"','"+Genre+"','"+Year+"',"+Price+");";
       st.executeUpdate(sql);
       JOptionPane.showMessageDialog(this,"Record is saved");
        }
        
        catch (Exception e)
        {
        JOptionPane.showMessageDialog(this,e.getMessage());    
        }
      
                                         
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
          // Update
         try
       { 
       Class.forName("java.sql.DriverManager");
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","9829");
       String a,b,c,d,e,sql;
       a=T1.getText();
       b=T2.getText();
       c=T3.getSelectedItem().toString();
       d=T4.getText();
       e=T5.getText();
   
       Statement st=con.createStatement();
       sql="update songs set artist='"+b+"' , price="+e+",year='"+d+"',genre='"+c+"' where name='"+a+"';";
       st.executeUpdate(sql);
       JOptionPane.showMessageDialog(this,"Record updated");
        }
        
        catch (Exception e)
        {
        JOptionPane.showMessageDialog(this,e.getMessage());    
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
           try
       { 
       Class.forName("java.sql.DriverManager");
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","9829");
       String a,sql;
       a=T1.getText();
       Statement st=con.createStatement();
       sql="delete from songs where Name = '"+a+"';";
       st.executeUpdate(sql);
       JOptionPane.showMessageDialog(this,"Record is deleted");
        }
        
        catch (Exception e)
        {
        JOptionPane.showMessageDialog(this,e.getMessage());    
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void T3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new AddStock().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField T1;
    private javax.swing.JTextField T2;
    private javax.swing.JComboBox T3;
    private javax.swing.JTextField T4;
    private javax.swing.JTextField T5;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}