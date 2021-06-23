import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Scanner;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;

/**
 * @author Jorge Luis Villanueva Gamboa
 */

public class Interfaz extends JFrame {
    khc xx = new khc();

    public Interfaz() {
        super("UCC Homework Checker");
        initComponents();
        this.setContentPane(this.cuerpo);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void defaultbuttonActionPerformed(ActionEvent e)  {
        String matricula = "";
        String password = "";
        File getUser = new File ("user.txt");
        File getPass = new File ("pass.txt");
        try {
            Scanner S_usser = new Scanner(getUser);
            Scanner S_pass = new Scanner(getPass);
            matricula = S_usser.nextLine();
            password = S_pass.nextLine();
            System.out.println(matricula);
            System.out.println(password);
            S_usser.close();
            S_pass.close();

        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        String day = dia_input.getText();

        File tarea = new File("Tarea.txt");
        FileWriter fw = null;
        try {
            fw = new FileWriter(tarea);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        PrintWriter pw = new PrintWriter(fw);

        xx.getUsuario(matricula);
        xx.getDia(day);
        xx.getPass(password);

        try {
            pw.write(xx.login());
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(null,"Sin Tarea, Posible error vuelva a intentar");
            xx.driver.quit();
            System.exit(0);
        }

       pw.close();
    }
    
    public void nuevoDef(){
        Nuevo form = new Nuevo();
        form.setVisible(true);
        this.dispose();
    }

    private void sendbuttonActionPerformed(ActionEvent e) {
        String matricula = user_input.getText();
        System.out.println(matricula);
        String day = dia_input.getText();
        String password = pass_input.getText();
        xx.getUsuario(matricula);
        xx.getDia(day);
        xx.getPass(password);

        try {
            xx.login();
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
    }

    private void ndActionPerformed(ActionEvent e) {
        nuevoDef();
    }
    

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Jorge Luis Villanueva Gamboa
        cuerpo = new JPanel();
        panelizq = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        nd = new JButton();
        panelder = new JPanel();
        user = new JPanel();
        user_input = new JTextField();
        usfoto = new JLabel();
        separator1 = new JSeparator();
        diap = new JPanel();
        dia_input = new JTextField();
        diafoto = new JLabel();
        separator2 = new JSeparator();
        passp = new JPanel();
        passfoto = new JLabel();
        pass_input = new JPasswordField();
        separator3 = new JSeparator();
        defaultbutton = new JButton();
        sendbutton = new JButton();

        //======== cuerpo ========
        {
            cuerpo.setBackground(new Color(51, 51, 51));
            cuerpo.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.
            border.EmptyBorder(0,0,0,0), "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn",javax.swing.border.TitledBorder.CENTER
            ,javax.swing.border.TitledBorder.BOTTOM,new java.awt.Font("Dia\u006cog",java.awt.Font
            .BOLD,12),java.awt.Color.red),cuerpo. getBorder()));cuerpo. addPropertyChangeListener(
            new java.beans.PropertyChangeListener(){@Override public void propertyChange(java.beans.PropertyChangeEvent e){if("\u0062ord\u0065r"
            .equals(e.getPropertyName()))throw new RuntimeException();}});

            //======== panelizq ========
            {
                panelizq.setBackground(new Color(51, 51, 51));

                //---- label1 ----
                label1.setIcon(new ImageIcon(getClass().getResource("/img/me.png")));

                //---- label2 ----
                label2.setText("@jorgeeluisvg");
                label2.setForeground(Color.white);
                label2.setFont(new Font("Consolas", Font.BOLD, 20));

                //---- nd ----
                nd.setText("Nuevo Registro");
                nd.setFont(new Font("Consolas", Font.BOLD, 16));
                nd.setBackground(Color.white);
                nd.addActionListener(e -> ndActionPerformed(e));

                GroupLayout panelizqLayout = new GroupLayout(panelizq);
                panelizq.setLayout(panelizqLayout);
                panelizqLayout.setHorizontalGroup(
                    panelizqLayout.createParallelGroup()
                        .addGroup(panelizqLayout.createSequentialGroup()
                            .addContainerGap(88, Short.MAX_VALUE)
                            .addGroup(panelizqLayout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, panelizqLayout.createSequentialGroup()
                                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
                                    .addGap(73, 73, 73))
                                .addGroup(GroupLayout.Alignment.TRAILING, panelizqLayout.createSequentialGroup()
                                    .addComponent(label2, GroupLayout.PREFERRED_SIZE, 222, GroupLayout.PREFERRED_SIZE)
                                    .addGap(51, 51, 51))
                                .addGroup(GroupLayout.Alignment.TRAILING, panelizqLayout.createSequentialGroup()
                                    .addComponent(nd, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
                                    .addGap(109, 109, 109))))
                );
                panelizqLayout.setVerticalGroup(
                    panelizqLayout.createParallelGroup()
                        .addGroup(panelizqLayout.createSequentialGroup()
                            .addGap(110, 110, 110)
                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)
                            .addComponent(label2, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(nd, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(34, Short.MAX_VALUE))
                );
            }

            //======== panelder ========
            {
                panelder.setBackground(new Color(0, 122, 33));

                //======== user ========
                {
                    user.setBackground(new Color(0, 122, 33));

                    //---- user_input ----
                    user_input.setOpaque(false);
                    user_input.setFont(new Font("Consolas", Font.BOLD, 20));
                    user_input.setDisabledTextColor(Color.black);

                    //---- usfoto ----
                    usfoto.setIcon(new ImageIcon(getClass().getResource("/img/user.png")));

                    //---- separator1 ----
                    separator1.setBackground(Color.black);
                    separator1.setForeground(Color.black);

                    GroupLayout userLayout = new GroupLayout(user);
                    user.setLayout(userLayout);
                    userLayout.setHorizontalGroup(
                        userLayout.createParallelGroup()
                            .addGroup(userLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(usfoto, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(userLayout.createParallelGroup()
                                    .addGroup(userLayout.createSequentialGroup()
                                        .addComponent(user_input, GroupLayout.PREFERRED_SIZE, 239, GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(separator1))
                                .addContainerGap())
                    );
                    userLayout.setVerticalGroup(
                        userLayout.createParallelGroup()
                            .addGroup(userLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(user_input, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(separator1))
                            .addGroup(userLayout.createSequentialGroup()
                                .addComponent(usfoto, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                    );
                }

                //======== diap ========
                {
                    diap.setBackground(new Color(0, 122, 33));

                    //---- dia_input ----
                    dia_input.setOpaque(false);
                    dia_input.setFont(new Font("Consolas", Font.BOLD, 20));
                    dia_input.setDisabledTextColor(Color.black);

                    //---- diafoto ----
                    diafoto.setIcon(new ImageIcon(getClass().getResource("/img/dia.png")));

                    //---- separator2 ----
                    separator2.setBackground(Color.black);
                    separator2.setForeground(Color.black);

                    GroupLayout diapLayout = new GroupLayout(diap);
                    diap.setLayout(diapLayout);
                    diapLayout.setHorizontalGroup(
                        diapLayout.createParallelGroup()
                            .addGroup(diapLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(diafoto, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(diapLayout.createParallelGroup()
                                    .addComponent(dia_input, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 239, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(separator2, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 239, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
                    );
                    diapLayout.setVerticalGroup(
                        diapLayout.createParallelGroup()
                            .addGroup(diapLayout.createSequentialGroup()
                                .addGroup(diapLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(diapLayout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(dia_input, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(separator2, GroupLayout.PREFERRED_SIZE, 9, GroupLayout.PREFERRED_SIZE))
                                    .addComponent(diafoto, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 10, Short.MAX_VALUE))
                    );
                }

                //======== passp ========
                {
                    passp.setBackground(new Color(0, 122, 33));

                    //---- passfoto ----
                    passfoto.setIcon(new ImageIcon(getClass().getResource("/img/pass.png")));

                    //---- pass_input ----
                    pass_input.setOpaque(false);
                    pass_input.setFont(new Font("Consolas", Font.BOLD, 20));

                    //---- separator3 ----
                    separator3.setBackground(Color.black);
                    separator3.setForeground(Color.black);

                    GroupLayout passpLayout = new GroupLayout(passp);
                    passp.setLayout(passpLayout);
                    passpLayout.setHorizontalGroup(
                        passpLayout.createParallelGroup()
                            .addGroup(passpLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(passfoto, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addGroup(passpLayout.createParallelGroup()
                                    .addComponent(pass_input)
                                    .addGroup(passpLayout.createSequentialGroup()
                                        .addComponent(separator3, GroupLayout.PREFERRED_SIZE, 239, GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                    );
                    passpLayout.setVerticalGroup(
                        passpLayout.createParallelGroup()
                            .addGroup(passpLayout.createSequentialGroup()
                                .addGroup(passpLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addGroup(passpLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(pass_input, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(separator3, GroupLayout.PREFERRED_SIZE, 9, GroupLayout.PREFERRED_SIZE))
                                    .addComponent(passfoto, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                    );
                }

                //---- defaultbutton ----
                defaultbutton.setIcon(null);
                defaultbutton.setBackground(Color.white);
                defaultbutton.setText("Default");
                defaultbutton.setFont(new Font("Consolas", Font.BOLD, 16));
                defaultbutton.addActionListener(e -> defaultbuttonActionPerformed(e));

                //---- sendbutton ----
                sendbutton.setIcon(null);
                sendbutton.setBackground(Color.white);
                sendbutton.setText("Consultar");
                sendbutton.setFont(new Font("Consolas", Font.BOLD, 16));
                sendbutton.addActionListener(e -> sendbuttonActionPerformed(e));

                GroupLayout panelderLayout = new GroupLayout(panelder);
                panelder.setLayout(panelderLayout);
                panelderLayout.setHorizontalGroup(
                    panelderLayout.createParallelGroup()
                        .addGroup(panelderLayout.createSequentialGroup()
                            .addContainerGap(51, Short.MAX_VALUE)
                            .addGroup(panelderLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addComponent(user, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGroup(panelderLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(diap, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(passp, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addContainerGap(29, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, panelderLayout.createSequentialGroup()
                            .addContainerGap(108, Short.MAX_VALUE)
                            .addComponent(sendbutton, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(defaultbutton, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                            .addGap(37, 37, 37))
                );
                panelderLayout.setVerticalGroup(
                    panelderLayout.createParallelGroup()
                        .addGroup(panelderLayout.createSequentialGroup()
                            .addGap(97, 97, 97)
                            .addComponent(user, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(67, 67, 67)
                            .addComponent(diap, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                            .addComponent(passp, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)
                            .addGroup(panelderLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(sendbutton, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                .addComponent(defaultbutton, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
                            .addGap(40, 40, 40))
                );
            }

            GroupLayout cuerpoLayout = new GroupLayout(cuerpo);
            cuerpo.setLayout(cuerpoLayout);
            cuerpoLayout.setHorizontalGroup(
                cuerpoLayout.createParallelGroup()
                    .addGroup(cuerpoLayout.createSequentialGroup()
                        .addComponent(panelizq, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelder, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            cuerpoLayout.setVerticalGroup(
                cuerpoLayout.createParallelGroup()
                    .addComponent(panelizq, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelder, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Jorge Luis Villanueva Gamboa
    private JPanel cuerpo;
    private JPanel panelizq;
    private JLabel label1;
    private JLabel label2;
    private JButton nd;
    private JPanel panelder;
    private JPanel user;
    private JTextField user_input;
    private JLabel usfoto;
    private JSeparator separator1;
    private JPanel diap;
    private JTextField dia_input;
    private JLabel diafoto;
    private JSeparator separator2;
    private JPanel passp;
    private JLabel passfoto;
    private JPasswordField pass_input;
    private JSeparator separator3;
    private JButton defaultbutton;
    private JButton sendbutton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new Interfaz();
                frame.setVisible(true);
                frame.setResizable(false);
                frame.pack();

            }
        });
    }
}
