import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class feedback_frame extends javax.swing.JFrame {
Connection conn;
private final javax.swing.ButtonGroup[] clarityGroups = new ButtonGroup[3];
private final javax.swing.ButtonGroup[] interactionGroups = new ButtonGroup[3];
private final javax.swing.ButtonGroup[] contentGroups = new ButtonGroup[3];

    public feedback_frame() {
        initComponents();
        groupRadioButtons();
        setupAutoFill();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        feebackformlbl = new javax.swing.JLabel();
        tnamelbl = new javax.swing.JLabel();
        tname_cmb = new javax.swing.JComboBox<>();
        subjectlbl = new javax.swing.JLabel();
        subjecttxt = new javax.swing.JTextField();
        experiencelbl = new javax.swing.JLabel();
        experiencetxt = new javax.swing.JTextField();
        courselbl = new javax.swing.JLabel();
        coursetxt = new javax.swing.JTextField();
        tdetailslbl = new javax.swing.JLabel();
        questionslbl = new javax.swing.JLabel();
        question_topic1lbl = new javax.swing.JLabel();
        question1lbl = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        question1lbl1 = new javax.swing.JLabel();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        question1lbl2 = new javax.swing.JLabel();
        question1lbl3 = new javax.swing.JLabel();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton15 = new javax.swing.JRadioButton();
        question1lbl4 = new javax.swing.JLabel();
        question_topic1lbl1 = new javax.swing.JLabel();
        question_topic1lbl2 = new javax.swing.JLabel();
        question_topic1lbl3 = new javax.swing.JLabel();
        question1lbl5 = new javax.swing.JLabel();
        question1lbl7 = new javax.swing.JLabel();
        question1lbl8 = new javax.swing.JLabel();
        question1lbl13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        feedback_txtarea = new javax.swing.JTextArea();
        submitbtn = new javax.swing.JButton();
        cancelbtn = new javax.swing.JButton();
        jRadioButton16 = new javax.swing.JRadioButton();
        jRadioButton17 = new javax.swing.JRadioButton();
        jRadioButton18 = new javax.swing.JRadioButton();
        jRadioButton19 = new javax.swing.JRadioButton();
        jRadioButton20 = new javax.swing.JRadioButton();
        jRadioButton21 = new javax.swing.JRadioButton();
        jRadioButton22 = new javax.swing.JRadioButton();
        jRadioButton23 = new javax.swing.JRadioButton();
        jRadioButton24 = new javax.swing.JRadioButton();
        jRadioButton25 = new javax.swing.JRadioButton();
        jRadioButton26 = new javax.swing.JRadioButton();
        jRadioButton27 = new javax.swing.JRadioButton();
        jRadioButton28 = new javax.swing.JRadioButton();
        jRadioButton29 = new javax.swing.JRadioButton();
        jRadioButton30 = new javax.swing.JRadioButton();
        jRadioButton31 = new javax.swing.JRadioButton();
        jRadioButton32 = new javax.swing.JRadioButton();
        jRadioButton33 = new javax.swing.JRadioButton();
        jRadioButton34 = new javax.swing.JRadioButton();
        jRadioButton35 = new javax.swing.JRadioButton();
        jRadioButton36 = new javax.swing.JRadioButton();
        jRadioButton37 = new javax.swing.JRadioButton();
        jRadioButton38 = new javax.swing.JRadioButton();
        jRadioButton39 = new javax.swing.JRadioButton();
        jRadioButton40 = new javax.swing.JRadioButton();
        jRadioButton41 = new javax.swing.JRadioButton();
        jRadioButton42 = new javax.swing.JRadioButton();
        jRadioButton43 = new javax.swing.JRadioButton();
        jRadioButton44 = new javax.swing.JRadioButton();
        jRadioButton45 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        feebackformlbl.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        feebackformlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        feebackformlbl.setText("Teacher's Feedback Form");

        tnamelbl.setText("Teacher's Name");

        tname_cmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "John Smith", "Michael Sandel", "David Melis", "Arthur Bahr" }));

        subjectlbl.setText("Subject");

        experiencelbl.setText("Experience");

        courselbl.setText("Course");

        tdetailslbl.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        tdetailslbl.setText("Teacher's Details");

        questionslbl.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        questionslbl.setText("Form Questions");

        question_topic1lbl.setFont(new java.awt.Font("Arial Black", 2, 12)); // NOI18N
        question_topic1lbl.setText("Overall Feedbacck");

        question1lbl.setText("How clearly does the teacher explain the concepts?");

        jRadioButton1.setText("1");

        jRadioButton2.setText("2");

        jRadioButton3.setText("3");

        jRadioButton5.setText("5");

        question1lbl1.setText("How effective are the teacher’s communication skills?");

        jRadioButton6.setText("1");

        jRadioButton7.setText("2");

        jRadioButton8.setText("3");

        jRadioButton10.setText("5");

        question1lbl2.setText("How engaging are the teacher’s lectures? ");

        question1lbl3.setText("How well does the teacher encourage student participation? ");

        jRadioButton11.setText("1");

        jRadioButton12.setText("2");

        jRadioButton13.setText("3");

        jRadioButton15.setText("5");

        question1lbl4.setText("How approachable is the teacher for clearing doubts?");

        question_topic1lbl1.setFont(new java.awt.Font("Arial Black", 2, 12)); // NOI18N
        question_topic1lbl1.setText("Clarity & Teaching Style");

        question_topic1lbl2.setFont(new java.awt.Font("Arial Black", 2, 12)); // NOI18N
        question_topic1lbl2.setText("Student Interaction & Support");

        question_topic1lbl3.setFont(new java.awt.Font("Arial Black", 2, 12)); // NOI18N
        question_topic1lbl3.setText("Course Content & Delivery");

        question1lbl5.setText("How clearly does the teacher explain the concepts?");

        question1lbl7.setText("How clearly does the teacher explain the concepts?");

        question1lbl8.setText("How clearly does the teacher explain the concepts?");

        question1lbl13.setText("How effectively does the teacher provide feedback on assignments and tests?");

        feedback_txtarea.setColumns(20);
        feedback_txtarea.setRows(5);
        jScrollPane1.setViewportView(feedback_txtarea);

        submitbtn.setText("Submit");
        submitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbtnActionPerformed(evt);
            }
        });

        cancelbtn.setText("Cancel");
        cancelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbtnActionPerformed(evt);
            }
        });

        jRadioButton16.setText("1");

        jRadioButton17.setText("2");

        jRadioButton18.setText("3");

        jRadioButton19.setText("4");

        jRadioButton20.setText("5");

        jRadioButton21.setText("1");

        jRadioButton22.setText("2");

        jRadioButton23.setText("3");

        jRadioButton24.setText("4");

        jRadioButton25.setText("5");

        jRadioButton26.setText("1");

        jRadioButton27.setText("2");

        jRadioButton28.setText("3");

        jRadioButton29.setText("4");

        jRadioButton30.setText("5");

        jRadioButton31.setText("1");

        jRadioButton32.setText("2");

        jRadioButton33.setText("3");

        jRadioButton34.setText("4");

        jRadioButton35.setText("5");

        jRadioButton36.setText("1");

        jRadioButton37.setText("2");

        jRadioButton38.setText("3");

        jRadioButton39.setText("4");

        jRadioButton40.setText("5");

        jRadioButton41.setText("1");

        jRadioButton42.setText("2");

        jRadioButton43.setText("3");

        jRadioButton44.setText("4");

        jRadioButton45.setText("5");

        jRadioButton4.setText("4");

        jRadioButton9.setText("4");

        jRadioButton14.setText("4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(152, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(question1lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jRadioButton11)
                                            .addGap(33, 33, 33)
                                            .addComponent(jRadioButton12)
                                            .addGap(43, 43, 43)
                                            .addComponent(jRadioButton13)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jRadioButton14))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jRadioButton6)
                                            .addGap(33, 33, 33)
                                            .addComponent(jRadioButton7)
                                            .addGap(43, 43, 43)
                                            .addComponent(jRadioButton8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jRadioButton9))
                                        .addComponent(question1lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(39, 39, 39)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jRadioButton15)
                                        .addComponent(jRadioButton10)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jRadioButton1)
                                    .addGap(33, 33, 33)
                                    .addComponent(jRadioButton2)
                                    .addGap(43, 43, 43)
                                    .addComponent(jRadioButton3)
                                    .addGap(36, 36, 36)
                                    .addComponent(jRadioButton4)
                                    .addGap(38, 38, 38)
                                    .addComponent(jRadioButton5))
                                .addComponent(question1lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(question_topic1lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(experiencelbl)
                                .addComponent(tnamelbl)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tdetailslbl, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(feebackformlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(coursetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(tname_cmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(subjecttxt)
                                                    .addComponent(experiencetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGap(83, 83, 83))
                                .addComponent(question1lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(question1lbl13, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(question1lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jRadioButton16)
                                    .addGap(32, 32, 32)
                                    .addComponent(jRadioButton17)
                                    .addGap(42, 42, 42)
                                    .addComponent(jRadioButton18)
                                    .addGap(38, 38, 38)
                                    .addComponent(jRadioButton19)
                                    .addGap(36, 36, 36)
                                    .addComponent(jRadioButton20))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jRadioButton21)
                                    .addGap(31, 31, 31)
                                    .addComponent(jRadioButton22)
                                    .addGap(43, 43, 43)
                                    .addComponent(jRadioButton23)
                                    .addGap(38, 38, 38)
                                    .addComponent(jRadioButton24)
                                    .addGap(35, 35, 35)
                                    .addComponent(jRadioButton25))
                                .addComponent(question_topic1lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jRadioButton26)
                                    .addGap(31, 31, 31)
                                    .addComponent(jRadioButton27)
                                    .addGap(39, 39, 39)
                                    .addComponent(jRadioButton28)
                                    .addGap(42, 42, 42)
                                    .addComponent(jRadioButton29)
                                    .addGap(35, 35, 35)
                                    .addComponent(jRadioButton30))
                                .addComponent(questionslbl, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(question1lbl7, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(question1lbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jRadioButton31)
                                    .addGap(28, 28, 28)
                                    .addComponent(jRadioButton32)
                                    .addGap(42, 42, 42)
                                    .addComponent(jRadioButton33)
                                    .addGap(41, 41, 41)
                                    .addComponent(jRadioButton34)
                                    .addGap(35, 35, 35)
                                    .addComponent(jRadioButton35))
                                .addComponent(question_topic1lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(question1lbl8, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jRadioButton36)
                                    .addGap(28, 28, 28)
                                    .addComponent(jRadioButton37)
                                    .addGap(42, 42, 42)
                                    .addComponent(jRadioButton38)
                                    .addGap(40, 40, 40)
                                    .addComponent(jRadioButton39)
                                    .addGap(36, 36, 36)
                                    .addComponent(jRadioButton40))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(courselbl)
                                    .addComponent(subjectlbl)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(question_topic1lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(submitbtn)
                                .addGap(36, 36, 36)
                                .addComponent(cancelbtn))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton41)
                                .addGap(26, 26, 26)
                                .addComponent(jRadioButton42)
                                .addGap(42, 42, 42)
                                .addComponent(jRadioButton43)
                                .addGap(42, 42, 42)
                                .addComponent(jRadioButton44)
                                .addGap(36, 36, 36)
                                .addComponent(jRadioButton45)))
                        .addGap(0, 65, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(feebackformlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tdetailslbl, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tnamelbl)
                    .addComponent(tname_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subjectlbl)
                    .addComponent(subjecttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courselbl)
                    .addComponent(coursetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(experiencelbl)
                    .addComponent(experiencetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(questionslbl, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(question_topic1lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(question1lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton5)
                    .addComponent(jRadioButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(question1lbl1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton6)
                    .addComponent(jRadioButton7)
                    .addComponent(jRadioButton8)
                    .addComponent(jRadioButton10)
                    .addComponent(jRadioButton9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(question1lbl2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton11)
                    .addComponent(jRadioButton12)
                    .addComponent(jRadioButton13)
                    .addComponent(jRadioButton15)
                    .addComponent(jRadioButton14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(question_topic1lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(question1lbl3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton16)
                    .addComponent(jRadioButton17)
                    .addComponent(jRadioButton18)
                    .addComponent(jRadioButton19)
                    .addComponent(jRadioButton20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(question1lbl4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton21)
                    .addComponent(jRadioButton22)
                    .addComponent(jRadioButton23)
                    .addComponent(jRadioButton24)
                    .addComponent(jRadioButton25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(question1lbl13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButton27)
                        .addComponent(jRadioButton28)
                        .addComponent(jRadioButton29)
                        .addComponent(jRadioButton30))
                    .addComponent(jRadioButton26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(question_topic1lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(question1lbl5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton31)
                    .addComponent(jRadioButton32)
                    .addComponent(jRadioButton33)
                    .addComponent(jRadioButton34)
                    .addComponent(jRadioButton35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(question1lbl7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton36)
                    .addComponent(jRadioButton37)
                    .addComponent(jRadioButton38)
                    .addComponent(jRadioButton39)
                    .addComponent(jRadioButton40))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(question1lbl8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton41)
                    .addComponent(jRadioButton42)
                    .addComponent(jRadioButton43)
                    .addComponent(jRadioButton44)
                    .addComponent(jRadioButton45))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(question_topic1lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitbtn)
                    .addComponent(cancelbtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void groupRadioButtons(){for (int i = 0; i < 3; i++) {
        clarityGroups[i] = new ButtonGroup();
        interactionGroups[i] = new ButtonGroup();
        contentGroups[i] = new ButtonGroup();
    }

    ButtonGroup[][] allGroups = {clarityGroups, interactionGroups, contentGroups};
    JRadioButton[][] allButtons = {
        {jRadioButton1, jRadioButton2, jRadioButton3, jRadioButton4, jRadioButton5},
        {jRadioButton6, jRadioButton7, jRadioButton8, jRadioButton9, jRadioButton10},
        {jRadioButton11, jRadioButton12, jRadioButton13, jRadioButton14, jRadioButton15},

        {jRadioButton16, jRadioButton17, jRadioButton18, jRadioButton19, jRadioButton20},
        {jRadioButton21, jRadioButton22, jRadioButton23, jRadioButton24, jRadioButton25},
        {jRadioButton26, jRadioButton27, jRadioButton28, jRadioButton29, jRadioButton30},

        {jRadioButton31, jRadioButton32, jRadioButton33, jRadioButton34, jRadioButton35},
        {jRadioButton36, jRadioButton37, jRadioButton38, jRadioButton39, jRadioButton40},
        {jRadioButton41, jRadioButton42, jRadioButton43, jRadioButton44, jRadioButton45}
    };

    for (int i = 0; i < 9; i++) {
        for (int j = 0; j < 5; j++) {
            allGroups[i / 3][i % 3].add(allButtons[i][j]);
            allButtons[i][j].setActionCommand(String.valueOf(j + 1));
        }
        }
    }
    
    private int getSelectedValue(javax.swing.ButtonGroup group) {
    if (group.getSelection() != null) {
        return Integer.parseInt(group.getSelection().getActionCommand()); 
    }
    return 0;
}
    
    private void submitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbtnActionPerformed
    int clarity1 = getSelectedValue(clarityGroups[0]);
    int clarity2 = getSelectedValue(clarityGroups[1]);
    int clarity3 = getSelectedValue(clarityGroups[2]);

    int interaction1 = getSelectedValue(interactionGroups[0]);
    int interaction2 = getSelectedValue(interactionGroups[1]);
    int interaction3 = getSelectedValue(interactionGroups[2]);

    int content1 = getSelectedValue(contentGroups[0]);
    int content2 = getSelectedValue(contentGroups[1]);
    int content3 = getSelectedValue(contentGroups[2]);

    double avgClarity = (clarity1 + clarity2 + clarity3) / 3.0;
    double avgInteraction = (interaction1 + interaction2 + interaction3) / 3.0;
    double avgContent = (content1 + content2 + content3) / 3.0;

    try {
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/form_db", "APP", "app");
        String query = "INSERT INTO TEACHER_FEEDBACK (t_name, subject, course, experience, avgClarity, avgInteraction, avgContent, overallfeedback) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement pst = con.prepareStatement(query);

        pst.setString(1, tname_cmb.getSelectedItem().toString());
        pst.setString(2, subjecttxt.getText());
        pst.setString(3, coursetxt.getText());
        pst.setString(4, experiencetxt.getText());
        pst.setDouble(5, avgClarity);
        pst.setDouble(6, avgInteraction);
        pst.setDouble (7, avgContent);
        pst.setString(8, feedback_txtarea.getText());
        
        
        pst.executeUpdate();
        JOptionPane.showMessageDialog(this, "Feedback Submitted Successfully!");
        con.close();
        this.dispose();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_submitbtnActionPerformed

    private void setupAutoFill() {
    tname_cmb.addActionListener((ActionEvent evt) -> {
        String selectedTeacher = tname_cmb.getSelectedItem().toString();
        switch (selectedTeacher) {
            case "John Smith":
                subjecttxt.setText("Mathematics");
                coursetxt.setText("B.Tech");
                experiencetxt.setText("10 Years");
                break;
            case "Michael Sandel":
                subjecttxt.setText("Physics");
                coursetxt.setText("B.Sc");
                experiencetxt.setText("8 Years");
                break;
            case "David Melis":
                subjecttxt.setText("Computer Science");
                coursetxt.setText("BCA");
                experiencetxt.setText("12 Years");
                break;
            case "Arthur Bahr":
                subjecttxt.setText("Computer Science");
                coursetxt.setText("B.Ms");
                experiencetxt.setText("15 Years");
            default:
                subjecttxt.setText("");
                coursetxt.setText("");
                experiencetxt.setText("");
                break;
        }
    });
}
    
    private void cancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbtnActionPerformed
        JOptionPane.showMessageDialog(this, "No feedback form submitted.");
        this.dispose();
    }//GEN-LAST:event_cancelbtnActionPerformed

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
            java.util.logging.Logger.getLogger(feedback_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(feedback_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(feedback_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(feedback_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new feedback_frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelbtn;
    private javax.swing.JLabel courselbl;
    private javax.swing.JTextField coursetxt;
    private javax.swing.JLabel experiencelbl;
    private javax.swing.JTextField experiencetxt;
    private javax.swing.JLabel feebackformlbl;
    private javax.swing.JTextArea feedback_txtarea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton16;
    private javax.swing.JRadioButton jRadioButton17;
    private javax.swing.JRadioButton jRadioButton18;
    private javax.swing.JRadioButton jRadioButton19;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton20;
    private javax.swing.JRadioButton jRadioButton21;
    private javax.swing.JRadioButton jRadioButton22;
    private javax.swing.JRadioButton jRadioButton23;
    private javax.swing.JRadioButton jRadioButton24;
    private javax.swing.JRadioButton jRadioButton25;
    private javax.swing.JRadioButton jRadioButton26;
    private javax.swing.JRadioButton jRadioButton27;
    private javax.swing.JRadioButton jRadioButton28;
    private javax.swing.JRadioButton jRadioButton29;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton30;
    private javax.swing.JRadioButton jRadioButton31;
    private javax.swing.JRadioButton jRadioButton32;
    private javax.swing.JRadioButton jRadioButton33;
    private javax.swing.JRadioButton jRadioButton34;
    private javax.swing.JRadioButton jRadioButton35;
    private javax.swing.JRadioButton jRadioButton36;
    private javax.swing.JRadioButton jRadioButton37;
    private javax.swing.JRadioButton jRadioButton38;
    private javax.swing.JRadioButton jRadioButton39;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton40;
    private javax.swing.JRadioButton jRadioButton41;
    private javax.swing.JRadioButton jRadioButton42;
    private javax.swing.JRadioButton jRadioButton43;
    private javax.swing.JRadioButton jRadioButton44;
    private javax.swing.JRadioButton jRadioButton45;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel question1lbl;
    private javax.swing.JLabel question1lbl1;
    private javax.swing.JLabel question1lbl13;
    private javax.swing.JLabel question1lbl2;
    private javax.swing.JLabel question1lbl3;
    private javax.swing.JLabel question1lbl4;
    private javax.swing.JLabel question1lbl5;
    private javax.swing.JLabel question1lbl7;
    private javax.swing.JLabel question1lbl8;
    private javax.swing.JLabel question_topic1lbl;
    private javax.swing.JLabel question_topic1lbl1;
    private javax.swing.JLabel question_topic1lbl2;
    private javax.swing.JLabel question_topic1lbl3;
    private javax.swing.JLabel questionslbl;
    private javax.swing.JLabel subjectlbl;
    private javax.swing.JTextField subjecttxt;
    private javax.swing.JButton submitbtn;
    private javax.swing.JLabel tdetailslbl;
    private javax.swing.JComboBox<String> tname_cmb;
    private javax.swing.JLabel tnamelbl;
    // End of variables declaration//GEN-END:variables
}
