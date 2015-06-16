/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 3103503213
 */
public class frmMain extends javax.swing.JFrame
{

    /**
     * Creates new form frmMain
     */
    public frmMain()
    {
	initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        labelIndustry = new javax.swing.JLabel();
        buttonAdminModifyCategories = new javax.swing.JButton();
        buttonAdminViewAnalytics = new javax.swing.JButton();
        comboIndustry = new javax.swing.JComboBox();
        labelCategory = new javax.swing.JLabel();
        comboCategory = new javax.swing.JComboBox();
        buttonAdminModifyIndustries = new javax.swing.JButton();
        labelLogin = new javax.swing.JLabel();
        textFieldUserID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        buttonLogin = new javax.swing.JButton();
        buttonCreateAccount = new javax.swing.JButton();
        panelRadioOptions = new javax.swing.JPanel();
        radioCareerPathways = new javax.swing.JRadioButton();
        radioSkillsInDemand = new javax.swing.JRadioButton();
        radioEmployabilitySkills = new javax.swing.JRadioButton();
        buttonQuit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelIndustry.setText("Industry");

        buttonAdminModifyCategories.setText("Modify Categories");
        buttonAdminModifyCategories.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                buttonAdminModifyCategoriesActionPerformed(evt);
            }
        });

        buttonAdminViewAnalytics.setText("View Analytics");

        comboIndustry.setEnabled(false);
        comboIndustry.addItemListener(new java.awt.event.ItemListener()
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt)
            {
                comboIndustryItemStateChanged(evt);
            }
        });

        labelCategory.setText("Category");

        comboCategory.setEnabled(false);

        buttonAdminModifyIndustries.setText("Modify Industries");
        buttonAdminModifyIndustries.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                buttonAdminModifyIndustriesActionPerformed(evt);
            }
        });

        labelLogin.setText("You must login first");

        jScrollPane1.setViewportView(jEditorPane1);

        buttonLogin.setText("Login");
        buttonLogin.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                buttonLoginActionPerformed(evt);
            }
        });

        buttonCreateAccount.setText("Create an account");
        buttonCreateAccount.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                buttonCreateAccountActionPerformed(evt);
            }
        });

        panelRadioOptions.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        radioCareerPathways.setText("Career pathways");
        radioCareerPathways.setEnabled(false);
        radioCareerPathways.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                radioCareerPathwaysActionPerformed(evt);
            }
        });

        radioSkillsInDemand.setText("Skills in demand");
        radioSkillsInDemand.setEnabled(false);
        radioSkillsInDemand.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                radioSkillsInDemandActionPerformed(evt);
            }
        });

        radioEmployabilitySkills.setText("Employability skills");
        radioEmployabilitySkills.setEnabled(false);
        radioEmployabilitySkills.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                radioEmployabilitySkillsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRadioOptionsLayout = new javax.swing.GroupLayout(panelRadioOptions);
        panelRadioOptions.setLayout(panelRadioOptionsLayout);
        panelRadioOptionsLayout.setHorizontalGroup(
            panelRadioOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRadioOptionsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRadioOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioCareerPathways)
                    .addComponent(radioSkillsInDemand)
                    .addComponent(radioEmployabilitySkills))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        panelRadioOptionsLayout.setVerticalGroup(
            panelRadioOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRadioOptionsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(radioCareerPathways)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioSkillsInDemand)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioEmployabilitySkills)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buttonQuit.setText("Quit");
        buttonQuit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                buttonQuitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonCreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelIndustry, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboIndustry, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonAdminModifyIndustries, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonAdminModifyCategories, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(panelRadioOptions, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonQuit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(textFieldUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonAdminViewAnalytics, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(labelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(labelLogin)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldUserID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAdminViewAnalytics))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonLogin)
                        .addGap(7, 7, 7)
                        .addComponent(buttonCreateAccount)
                        .addGap(11, 11, 11)
                        .addComponent(labelIndustry)
                        .addGap(6, 6, 6)
                        .addComponent(comboIndustry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(buttonAdminModifyIndustries)
                        .addGap(6, 6, 6)
                        .addComponent(labelCategory)
                        .addGap(6, 6, 6)
                        .addComponent(comboCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(buttonAdminModifyCategories)
                        .addGap(11, 11, 11)
                        .addComponent(panelRadioOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonQuit))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAdminModifyCategoriesActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_buttonAdminModifyCategoriesActionPerformed
    {//GEN-HEADEREND:event_buttonAdminModifyCategoriesActionPerformed

    }//GEN-LAST:event_buttonAdminModifyCategoriesActionPerformed

    private void comboIndustryItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_comboIndustryItemStateChanged
    {//GEN-HEADEREND:event_comboIndustryItemStateChanged

    }//GEN-LAST:event_comboIndustryItemStateChanged

    private void buttonAdminModifyIndustriesActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_buttonAdminModifyIndustriesActionPerformed
    {//GEN-HEADEREND:event_buttonAdminModifyIndustriesActionPerformed

    }//GEN-LAST:event_buttonAdminModifyIndustriesActionPerformed

    private void buttonLoginActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_buttonLoginActionPerformed
    {//GEN-HEADEREND:event_buttonLoginActionPerformed

    }//GEN-LAST:event_buttonLoginActionPerformed

    private void radioCareerPathwaysActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_radioCareerPathwaysActionPerformed
    {//GEN-HEADEREND:event_radioCareerPathwaysActionPerformed

    }//GEN-LAST:event_radioCareerPathwaysActionPerformed

    private void radioSkillsInDemandActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_radioSkillsInDemandActionPerformed
    {//GEN-HEADEREND:event_radioSkillsInDemandActionPerformed

    }//GEN-LAST:event_radioSkillsInDemandActionPerformed

    private void radioEmployabilitySkillsActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_radioEmployabilitySkillsActionPerformed
    {//GEN-HEADEREND:event_radioEmployabilitySkillsActionPerformed

    }//GEN-LAST:event_radioEmployabilitySkillsActionPerformed

    private void buttonQuitActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_buttonQuitActionPerformed
    {//GEN-HEADEREND:event_buttonQuitActionPerformed

    }//GEN-LAST:event_buttonQuitActionPerformed

    private void buttonCreateAccountActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_buttonCreateAccountActionPerformed
    {//GEN-HEADEREND:event_buttonCreateAccountActionPerformed

    }//GEN-LAST:event_buttonCreateAccountActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
	try {
	    for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
		if ("Windows".equals(info.getName())) {
		    javax.swing.UIManager.setLookAndFeel(info.getClassName());
		    break;
		}
	    }
	} catch (ClassNotFoundException ex) {
	    java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (InstantiationException ex) {
	    java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (IllegalAccessException ex) {
	    java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (javax.swing.UnsupportedLookAndFeelException ex) {
	    java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	}
	//</editor-fold>

	/* Create and display the form */
	java.awt.EventQueue.invokeLater(new Runnable()
	{
	    public void run()
	    {
		new frmMain().setVisible(true);
	    }
	});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdminModifyCategories;
    private javax.swing.JButton buttonAdminModifyIndustries;
    private javax.swing.JButton buttonAdminViewAnalytics;
    private javax.swing.JButton buttonCreateAccount;
    private javax.swing.JButton buttonLogin;
    private javax.swing.JButton buttonQuit;
    private javax.swing.JComboBox comboCategory;
    private javax.swing.JComboBox comboIndustry;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCategory;
    private javax.swing.JLabel labelIndustry;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JPanel panelRadioOptions;
    private javax.swing.JRadioButton radioCareerPathways;
    private javax.swing.JRadioButton radioEmployabilitySkills;
    private javax.swing.JRadioButton radioSkillsInDemand;
    private javax.swing.JTextField textFieldUserID;
    // End of variables declaration//GEN-END:variables
}
