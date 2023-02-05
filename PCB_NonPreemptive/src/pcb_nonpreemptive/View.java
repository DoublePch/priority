package pcb_nonpreemptive;

import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Optional;
import java.util.TimerTask;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import java.util.Timer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumnModel;

    public class View extends javax.swing.JFrame {

        Timer mytime = new Timer();
        private int count = 0;
        static int i  = 0,w = 0;

        Control control = new Control();
        PCB obj;

    public View() {
            initComponents();
            clockTime(obj);    
        }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        clock = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        avgWT = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        turnTime = new javax.swing.JLabel();
        terminate1 = new javax.swing.JButton();
        addProcess = new javax.swing.JButton();
        terminate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        CD = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        addCD = new javax.swing.JButton();
        endCD = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        USB = new javax.swing.JTable();
        endUSB = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        addUSB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SJF-Nonpreemptive");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(59, 229, 83));
        jPanel1.setAlignmentX(0.0F);
        jPanel1.setAlignmentY(0.0F);
        jPanel1.setMinimumSize(new java.awt.Dimension(1600, 900));
        jPanel1.setPreferredSize(new java.awt.Dimension(1600, 900));

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Cpu time : ");

        clock.setFont(new java.awt.Font("SWTxt", 0, 18)); // NOI18N
        clock.setText("-----");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("AVG WatingTime :");

        avgWT.setFont(new java.awt.Font("SWTxt", 0, 18)); // NOI18N
        avgWT.setText("----");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Tunraround Time : ");

        turnTime.setFont(new java.awt.Font("SWTxt", 0, 18)); // NOI18N
        turnTime.setText("----");

        terminate1.setBackground(new java.awt.Color(255, 0, 0));
        terminate1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        terminate1.setText("TerminateW");
        terminate1.setActionCommand("TerminateW");
        terminate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terminate1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clock)
                .addGap(106, 106, 106)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(avgWT)
                .addGap(91, 91, 91)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(turnTime)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(terminate1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(avgWT)
                    .addComponent(jLabel5)
                    .addComponent(turnTime)
                    .addComponent(clock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(terminate1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        addProcess.setBackground(new java.awt.Color(0, 204, 51));
        addProcess.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addProcess.setText("AddProcess");
        addProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProcessActionPerformed(evt);
            }
        });

        terminate.setBackground(new java.awt.Color(255, 0, 0));
        terminate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        terminate.setText("Terminate");
        terminate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terminateActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Process ID", "Status", "Priority", "Arrival Time", "Burst Time", "Waiting Time"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        jTable1.setFont(new java.awt.Font("Tahoma", 0, 20));
        jTable1.setRowHeight(70);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);

        jTable1.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        jTable1.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        jTable1.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        jTable1.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
        jTable1.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
        jTable1.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(terminate, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1551, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(394, 394, 394)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addProcess, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(terminate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(56, Short.MAX_VALUE)))
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Process ID", "Status"
            }
        ));
        jScrollPane2.setViewportView(jTable2);
        jTable2.setRowHeight(40);
        jTable2.setFont(new java.awt.Font("Tahoma", 0, 16));

        centerRenderer.setHorizontalAlignment(JLabel.CENTER);

        jTable2.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        jTable2.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Ready Queue");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jLabel9)
                .addContainerGap(151, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(204, 255, 204));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Process ID", "Status"
            }
        ));
        jScrollPane4.setViewportView(jTable4);
        jTable4.setRowHeight(40);
        jTable4.setFont(new java.awt.Font("Tahoma", 0, 16));

        centerRenderer.setHorizontalAlignment(JLabel.CENTER);

        jTable4.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        jTable4.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Terminate Queue");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jLabel10)
                .addContainerGap(138, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel7.setText("Priority Non-Preemptive Scheduling");

        jPanel7.setBackground(new java.awt.Color(204, 255, 204));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("I/O Queue");

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        CD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Process ID", "Status", "I/O Time"
            }
        ));
        jScrollPane5.setViewportView(CD);
        CD.setRowHeight(40);
        CD.setFont(new java.awt.Font("Tahoma", 0, 16));

        centerRenderer.setHorizontalAlignment(JLabel.CENTER);

        CD.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        CD.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        CD.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("CD Queue");

        addCD.setBackground(new java.awt.Color(0, 204, 51));
        addCD.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addCD.setText("Add");
        addCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCDActionPerformed(evt);
            }
        });

        endCD.setBackground(new java.awt.Color(255, 0, 0));
        endCD.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        endCD.setText("End");
        endCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endCDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(addCD, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(endCD, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jLabel4)
                .addContainerGap(128, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(endCD, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addCD, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        USB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Process ID", "Status", "I/O Time"
            }
        ));
        jScrollPane6.setViewportView(USB);
        USB.setRowHeight(40);
        USB.setFont(new java.awt.Font("Tahoma", 0, 16));

        centerRenderer.setHorizontalAlignment(JLabel.CENTER);

        USB.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        USB.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        USB.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);

        endUSB.setBackground(new java.awt.Color(255, 0, 0));
        endUSB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        endUSB.setText("End");
        endUSB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endUSBActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 102));
        jLabel8.setText("USB Queue");

        addUSB.setBackground(new java.awt.Color(0, 204, 51));
        addUSB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addUSB.setText("Add");
        addUSB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUSBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(addUSB, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(endUSB, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 128, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(117, 117, 117))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addUSB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(endUSB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(jLabel11)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(461, 461, 461)
                .addComponent(jLabel7))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProcessActionPerformed
       
        control.addProcess(count);
        control.Algorithm();
        control.waitting(count);
        showJob(control.showJobQ());      
        
    }//GEN-LAST:event_addProcessActionPerformed

    private void terminateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terminateActionPerformed
        control.removeQueue(count); 
    }//GEN-LAST:event_terminateActionPerformed

    private void addCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCDActionPerformed
        control.addCD(count); 
    }//GEN-LAST:event_addCDActionPerformed

    private void endCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endCDActionPerformed
        control.endCD(count); 
        control.Algorithm();
    }//GEN-LAST:event_endCDActionPerformed

    private void addUSBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUSBActionPerformed
        control.addUSB(); 
    }//GEN-LAST:event_addUSBActionPerformed

    private void endUSBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endUSBActionPerformed
        control.endUSB();       
        control.Algorithm();
    }//GEN-LAST:event_endUSBActionPerformed

    private void terminate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terminate1ActionPerformed
       //control.removeWaitingQueue(w);
    }//GEN-LAST:event_terminate1ActionPerformed

   void showClock(){
        clock.setText(Integer.toString(obj.getCpuTime()));
    }
    public void showJob(String text){
        try{
            DefaultTableModel model1 = (DefaultTableModel) jTable1.getModel();
            int rowCount =  model1.getRowCount();
                for (int i = rowCount - 1; i >= 0; i--) {
                model1.removeRow(i);
             }
          
            String[] textTable2 = text.split(",");
            for (int index = 0; index < textTable2.length ; index++) {
            String[] textTable1 = textTable2[index].split(" ");
            model1.addRow(new Object[]{textTable1[0],textTable1[1],textTable1[2],textTable1[3],textTable1[4],textTable1[5]});
        }  
        }
        catch(ArrayIndexOutOfBoundsException e){        
        }         
    }
    
    public void showReady(String text){
        try{
            DefaultTableModel model1 = (DefaultTableModel) jTable2.getModel();
            int rowCount =  model1.getRowCount();
                for (int i = rowCount - 1; i >= 0; i--) {
                model1.removeRow(i);
             }
            String[] textTable2 = text.split(",");
            for (int index = 1; index < textTable2.length ; index++) {
            String[] textTable1 = textTable2[index].split(" ");
            model1.addRow(new Object[]{textTable1[0],textTable1[1]});
        }  
        }catch(ArrayIndexOutOfBoundsException e){
            
        }
    }
    
    public void  showCD(String text){
        try{
            DefaultTableModel model1 = (DefaultTableModel) CD.getModel();
            int rowCount =  model1.getRowCount();
                for (int i = rowCount - 1; i >= 0; i--) {
                model1.removeRow(i);
             }
            String[] textTable2 = text.split(",");
            for (int index = 0; index < textTable2.length ; index++) {
            String[] textTable1 = textTable2[index].split(" ");
            model1.addRow(new Object[]{textTable1[0],textTable1[1],textTable1[2]});
        }  
        }catch(ArrayIndexOutOfBoundsException e){
            
        }
    }
    
    public void  showUSB(String text){
        try{
            DefaultTableModel model1 = (DefaultTableModel) USB.getModel();
            int rowCount =  model1.getRowCount();
                for (int i = rowCount - 1; i >= 0; i--) {
                model1.removeRow(i);
             }
            String[] textTable2 = text.split(",");
            for (int index = 0; index < textTable2.length ; index++) {
                String[] textTable1 = textTable2[index].split(" ");
                model1.addRow(new Object[]{textTable1[0],textTable1[1],textTable1[2]});
            }  
        }catch(ArrayIndexOutOfBoundsException e){
            
        }
    }

    public  void  showTerminate(String text){
      try{
            DefaultTableModel model1 = (DefaultTableModel) jTable4.getModel();
            int rowCount =  model1.getRowCount();
                for (int i = rowCount - 1; i >= 0; i--) {
                model1.removeRow(i);
             }
            String[] textTable2 = text.split(",");
            for (int index = 0; index < textTable2.length ; index++) {
            String[] textTable1 = textTable2[index].split(" ");
            model1.addRow(new Object[]{textTable1[0],textTable1[1]});
        }  
        }catch(ArrayIndexOutOfBoundsException e){
            
        }
    }
    
 
  
    
    void setEnableButton(){
       if(jTable1.getRowCount() == 0){
            terminate.setEnabled(false);
            addCD.setEnabled(false);
            endCD.setEnabled(false);
            addUSB.setEnabled(false);
            endUSB.setEnabled(false);
            if(USB.getRowCount() == 1){
                 addUSB.setEnabled(false);
            }
            if(CD.getRowCount() == 1){
                addCD.setEnabled(false);
            }
            if(USB.getRowCount() == 0){
                 endUSB.setEnabled(false);
            }
            if(CD.getRowCount() == 0){
                endCD.setEnabled(false);
            }
            
        }
      
        else{
            terminate.setEnabled(true);
            addCD.setEnabled(true);
            endCD.setEnabled(true);
            addUSB.setEnabled(true);
            endUSB.setEnabled(true);
            if(USB.getRowCount() == 1){
                 addUSB.setEnabled(false);
            }
            if(CD.getRowCount() == 1){
                addCD.setEnabled(false);
            }
             if(USB.getRowCount() == 0){
                 endUSB.setEnabled(false);
            }
            if(CD.getRowCount() == 0){
                endCD.setEnabled(false);
            }
        }
       
    }
    void showWatime(){
        avgWT.setText(control.showWatime());
    }
    void showTurntime(){
        turnTime.setText(control.turnAround());
    }
                                        
    public void clockTime(PCB obj){
    
     TimerTask task =new TimerTask(){
        public  void run(){

            count++;
            clock.setText(Integer.toString(count));
            setEnableButton();
            control.nextProcess();
            control.Cpuscheduler(count);
            control.usingCD();
            control.usingUSB();
            control.waitting(count);
            control.ioCD(count);
            control.ioUSB(count);
            showJob(control.showJobQ()); 
            showReady(control.showReadyQueue());
            showTerminate(control.showTerminateQueue());
            showUSB(control.showUSBQueue());
            showCD(control.showCDQueue());
            showWatime();
            showTurntime();
        }
    };
    mytime.scheduleAtFixedRate(task, 1000, 1000);
   }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CD;
    private javax.swing.JTable USB;
    private javax.swing.JButton addCD;
    private javax.swing.JButton addProcess;
    private javax.swing.JButton addUSB;
    private javax.swing.JLabel avgWT;
    private javax.swing.JLabel clock;
    private javax.swing.JButton endCD;
    private javax.swing.JButton endUSB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable4;
    private javax.swing.JButton terminate;
    private javax.swing.JButton terminate1;
    private javax.swing.JLabel turnTime;
    // End of variables declaration//GEN-END:variables

   
}
