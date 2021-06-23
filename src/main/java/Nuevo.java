import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;
/*
 * Created by JFormDesigner on Mon May 31 21:57:30 PDT 2021
 */



/**
 * @author Jorge Luis Villanueva Gamboa
 */
public class Nuevo extends JFrame {
    String usuarioDef = "";
    String passDef = "";
    public Nuevo() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {
        usuarioDef = userr_input.getText();
        passDef = pass_input.getText();

        File defaultUser = new File("user.txt");
        FileWriter fw = null;
        try {
            fw = new FileWriter(defaultUser);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        PrintWriter pw = new PrintWriter(fw);
        pw.write(usuarioDef);
        pw.close();

        File defaultPass = new File("pass.txt");
        FileWriter fwp = null;
        try {
            fwp = new FileWriter(defaultPass);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        PrintWriter fpw = new PrintWriter(fwp);
        fpw.write(passDef);
        fpw.close();

        JOptionPane.showMessageDialog(null,"Vuelve a abrir el programa :)");
        System.exit(0);
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Jorge Luis Villanueva Gamboa
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        userr = new JPanel();
        userr_input = new JTextField();
        usfoto = new JLabel();
        separator1 = new JSeparator();
        passpp = new JPanel();
        passfoto = new JLabel();
        pass_input = new JPasswordField();
        separator3 = new JSeparator();
        button1 = new JButton();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setBackground(new Color(51, 51, 51));
            dialogPane.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing
            . border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JFor\u006dDesi\u0067ner \u0045valu\u0061tion" , javax. swing .border . TitledBorder
            . CENTER ,javax . swing. border .TitledBorder . BOTTOM, new java. awt .Font ( "Dia\u006cog", java .
            awt . Font. BOLD ,12 ) ,java . awt. Color .red ) ,dialogPane. getBorder () ) )
            ; dialogPane. addPropertyChangeListener( new java. beans .PropertyChangeListener ( ){ @Override public void propertyChange (java . beans. PropertyChangeEvent e
            ) { if( "bord\u0065r" .equals ( e. getPropertyName () ) )throw new RuntimeException( ) ;} } )
            ;

            //======== contentPanel ========
            {
                contentPanel.setBackground(new Color(51, 51, 51));

                //======== userr ========
                {
                    userr.setBackground(new Color(51, 51, 51));

                    //---- userr_input ----
                    userr_input.setFont(new Font("Consolas", Font.BOLD, 20));
                    userr_input.setDisabledTextColor(Color.black);

                    //---- usfoto ----
                    usfoto.setIcon(new ImageIcon(getClass().getResource("/img/user.png")));

                    //---- separator1 ----
                    separator1.setBackground(Color.black);
                    separator1.setForeground(Color.black);

                    GroupLayout userrLayout = new GroupLayout(userr);
                    userr.setLayout(userrLayout);
                    userrLayout.setHorizontalGroup(
                        userrLayout.createParallelGroup()
                            .addGroup(userrLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(usfoto, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(userrLayout.createParallelGroup()
                                    .addGroup(userrLayout.createSequentialGroup()
                                        .addComponent(userr_input, GroupLayout.PREFERRED_SIZE, 239, GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 6, Short.MAX_VALUE))
                                    .addComponent(separator1))
                                .addContainerGap())
                    );
                    userrLayout.setVerticalGroup(
                        userrLayout.createParallelGroup()
                            .addGroup(userrLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(userr_input, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(separator1))
                            .addGroup(userrLayout.createSequentialGroup()
                                .addComponent(usfoto, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                    );
                }

                //======== passpp ========
                {
                    passpp.setBackground(new Color(51, 51, 51));

                    //---- passfoto ----
                    passfoto.setIcon(new ImageIcon(getClass().getResource("/img/pass.png")));

                    //---- pass_input ----
                    pass_input.setFont(new Font("Consolas", Font.BOLD, 20));

                    //---- separator3 ----
                    separator3.setBackground(Color.black);
                    separator3.setForeground(Color.black);

                    GroupLayout passppLayout = new GroupLayout(passpp);
                    passpp.setLayout(passppLayout);
                    passppLayout.setHorizontalGroup(
                        passppLayout.createParallelGroup()
                            .addGroup(passppLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(passfoto, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addGroup(passppLayout.createParallelGroup()
                                    .addComponent(pass_input)
                                    .addGroup(passppLayout.createSequentialGroup()
                                        .addComponent(separator3, GroupLayout.PREFERRED_SIZE, 239, GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                    );
                    passppLayout.setVerticalGroup(
                        passppLayout.createParallelGroup()
                            .addGroup(passppLayout.createSequentialGroup()
                                .addGroup(passppLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addGroup(passppLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(pass_input, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(separator3, GroupLayout.PREFERRED_SIZE, 9, GroupLayout.PREFERRED_SIZE))
                                    .addComponent(passfoto, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                    );
                }

                //---- button1 ----
                button1.setText("Registrar");
                button1.setFont(new Font("Consolas", Font.BOLD, 26));
                button1.addActionListener(e -> button1ActionPerformed(e));

                GroupLayout contentPanelLayout = new GroupLayout(contentPanel);
                contentPanel.setLayout(contentPanelLayout);
                contentPanelLayout.setHorizontalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addGap(147, 147, 147)
                            .addGroup(contentPanelLayout.createParallelGroup()
                                .addComponent(passpp, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(userr, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addContainerGap(157, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                            .addContainerGap(247, Short.MAX_VALUE)
                            .addComponent(button1, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
                            .addGap(215, 215, 215))
                );
                contentPanelLayout.setVerticalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addGap(67, 67, 67)
                            .addComponent(userr, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(64, 64, 64)
                            .addComponent(passpp, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                            .addComponent(button1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                            .addGap(23, 23, 23))
                );
            }

            GroupLayout dialogPaneLayout = new GroupLayout(dialogPane);
            dialogPane.setLayout(dialogPaneLayout);
            dialogPaneLayout.setHorizontalGroup(
                dialogPaneLayout.createParallelGroup()
                    .addComponent(contentPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
            );
            dialogPaneLayout.setVerticalGroup(
                dialogPaneLayout.createParallelGroup()
                    .addComponent(contentPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
            );
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Jorge Luis Villanueva Gamboa
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JPanel userr;
    private JTextField userr_input;
    private JLabel usfoto;
    private JSeparator separator1;
    private JPanel passpp;
    private JLabel passfoto;
    private JPasswordField pass_input;
    private JSeparator separator3;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
