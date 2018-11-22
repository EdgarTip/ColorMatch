package colormatch;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author Miguel Dinis
 */
public class Board extends javax.swing.JPanel {
    
    GameController gc;

    /**
     * Creates new form NewJPanel
     */
    public Board() {
        initComponents();
        
        JPanel[] p = new JPanel[9];
        p[0] = panel1;
        p[1] = panel2;
        p[2] = panel3;
        p[3] = panel4;
        p[4] = panel5;
        p[5] = panel6;
        p[6] = panel7;
        p[7] = panel8;
        p[8] = panel9;
        
        gc = new GameController(p);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        game = new javax.swing.JPanel();
        panel1 = new javax.swing.JPanel();
        panel2 = new javax.swing.JPanel();
        panel3 = new javax.swing.JPanel();
        panel4 = new javax.swing.JPanel();
        panel5 = new javax.swing.JPanel();
        panel6 = new javax.swing.JPanel();
        panel7 = new javax.swing.JPanel();
        panel8 = new javax.swing.JPanel();
        panel9 = new javax.swing.JPanel();
        top = new javax.swing.JPanel();
        matchingColor = new javax.swing.JPanel();
        scoreLabel = new javax.swing.JLabel();
        closeButton = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 51, 51));
        setMinimumSize(new java.awt.Dimension(360, 390));
        setPreferredSize(new java.awt.Dimension(360, 390));
        setRequestFocusEnabled(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        game.setBackground(new java.awt.Color(0, 51, 51));
        game.setMinimumSize(new java.awt.Dimension(340, 340));
        game.setPreferredSize(new java.awt.Dimension(340, 340));
        game.setLayout(new java.awt.GridLayout(3, 3, 10, 10));

        panel1.setBackground(new java.awt.Color(255, 0, 0));
        panel1.setPreferredSize(new java.awt.Dimension(100, 100));
        panel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
        );

        game.add(panel1);

        panel2.setBackground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
        );

        game.add(panel2);

        panel3.setBackground(new java.awt.Color(0, 255, 0));

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
        );

        game.add(panel3);

        panel4.setBackground(new java.awt.Color(0, 0, 255));

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
        );

        game.add(panel4);

        panel5.setBackground(new java.awt.Color(255, 0, 153));

        javax.swing.GroupLayout panel5Layout = new javax.swing.GroupLayout(panel5);
        panel5.setLayout(panel5Layout);
        panel5Layout.setHorizontalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
        );
        panel5Layout.setVerticalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
        );

        game.add(panel5);

        panel6.setBackground(new java.awt.Color(0, 255, 255));

        javax.swing.GroupLayout panel6Layout = new javax.swing.GroupLayout(panel6);
        panel6.setLayout(panel6Layout);
        panel6Layout.setHorizontalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
        );
        panel6Layout.setVerticalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
        );

        game.add(panel6);

        panel7.setBackground(new java.awt.Color(0, 255, 0));

        javax.swing.GroupLayout panel7Layout = new javax.swing.GroupLayout(panel7);
        panel7.setLayout(panel7Layout);
        panel7Layout.setHorizontalGroup(
            panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
        );
        panel7Layout.setVerticalGroup(
            panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
        );

        game.add(panel7);

        panel8.setBackground(new java.awt.Color(0, 255, 255));

        javax.swing.GroupLayout panel8Layout = new javax.swing.GroupLayout(panel8);
        panel8.setLayout(panel8Layout);
        panel8Layout.setHorizontalGroup(
            panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
        );
        panel8Layout.setVerticalGroup(
            panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
        );

        game.add(panel8);

        panel9.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout panel9Layout = new javax.swing.GroupLayout(panel9);
        panel9.setLayout(panel9Layout);
        panel9Layout.setHorizontalGroup(
            panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
        );
        panel9Layout.setVerticalGroup(
            panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
        );

        game.add(panel9);

        add(game, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 340, 340));

        top.setBackground(new java.awt.Color(0, 51, 51));
        top.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        matchingColor.setBackground(new java.awt.Color(255, 0, 0));
        matchingColor.setMinimumSize(new java.awt.Dimension(20, 20));
        matchingColor.setPreferredSize(new java.awt.Dimension(20, 20));

        javax.swing.GroupLayout matchingColorLayout = new javax.swing.GroupLayout(matchingColor);
        matchingColor.setLayout(matchingColorLayout);
        matchingColorLayout.setHorizontalGroup(
            matchingColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        matchingColorLayout.setVerticalGroup(
            matchingColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        top.add(matchingColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 20, 20));

        scoreLabel.setForeground(new java.awt.Color(255, 255, 255));
        scoreLabel.setText("Score: 100");
        scoreLabel.setMaximumSize(new java.awt.Dimension(52, 30));
        scoreLabel.setMinimumSize(new java.awt.Dimension(52, 30));
        scoreLabel.setPreferredSize(new java.awt.Dimension(52, 30));
        top.add(scoreLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, 40));

        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/colormatch/assets/close.png"))); // NOI18N
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButtonMouseClicked(evt);
            }
        });
        top.add(closeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        add(top, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseClicked
        gc.closeGame();
    }//GEN-LAST:event_closeButtonMouseClicked

    private void panel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel1MouseClicked
        // TODO add your handling code here:
        gc.click(panel1);
    }//GEN-LAST:event_panel1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel closeButton;
    private javax.swing.JPanel game;
    private javax.swing.JPanel matchingColor;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panel3;
    private javax.swing.JPanel panel4;
    private javax.swing.JPanel panel5;
    private javax.swing.JPanel panel6;
    private javax.swing.JPanel panel7;
    private javax.swing.JPanel panel8;
    private javax.swing.JPanel panel9;
    private javax.swing.JLabel scoreLabel;
    private javax.swing.JPanel top;
    // End of variables declaration//GEN-END:variables
}
