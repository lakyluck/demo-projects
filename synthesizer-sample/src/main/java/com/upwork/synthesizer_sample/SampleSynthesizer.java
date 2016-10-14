package com.upwork.synthesizer_sample;

import java.awt.event.ItemEvent;
import javax.sound.midi.Instrument;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author daniyar.artykov
 */
public class SampleSynthesizer extends JFrame {

    private static final long serialVersionUID = 6536616336446213988L;
    private static Synthesizer synthesizer;
    private static MidiChannel[] midiChannel;
    private static Instrument[] instruments;
    private int currentInstrumentIndex = 10;
    private int velocity = 64;

    public SampleSynthesizer() {
        try {
            synthesizer = MidiSystem.getSynthesizer();
            synthesizer.open();
            midiChannel = synthesizer.getChannels();
            instruments = synthesizer.getDefaultSoundbank().getInstruments();
            loadInstrument(currentInstrumentIndex);
        } catch (MidiUnavailableException ex) {
            ex.printStackTrace();
        }
        initComponents();
        comboBoxInstrument.setSelectedIndex(currentInstrumentIndex);
        comboBoxChannel.setSelectedIndex(5);
    }

    private void loadInstrument(int i) {
        synthesizer.loadInstrument(instruments[i]);
    }

    private void unloadInstrument(int i) {
        synthesizer.unloadInstrument(instruments[i]);
    }

    private String[] getInstrumentsName() {
        String[] instrumentsName = new String[instruments.length];
        for (int i = 0; i < instrumentsName.length; i++) {
            instrumentsName[i] = instruments[i].getName();
        }

        return instrumentsName;
    }

    private String[] getChannels() {
        String[] channels = new String[midiChannel.length];
        for (int i = 0; i < channels.length; i++) {
            channels[i] = "" + i;
        }
        return channels;
    }

    private void executeSound(int noteNumber) {
        int channel = comboBoxChannel.getSelectedIndex();
        System.out.println("channel: " + channel);
        midiChannel[channel].noteOn(noteNumber, velocity);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanelSuper = new javax.swing.JPanel();
        jPanelSuperContent = new javax.swing.JPanel();
        jPanelContent = new javax.swing.JPanel();
        jPanelFields = new javax.swing.JPanel();
        button1 = new javax.swing.JButton();
        button2 = new javax.swing.JButton();
        button3 = new javax.swing.JButton();
        button4 = new javax.swing.JButton();
        button5 = new javax.swing.JButton();
        button6 = new javax.swing.JButton();
        button7 = new javax.swing.JButton();
        button8 = new javax.swing.JButton();
        button9 = new javax.swing.JButton();
        button10 = new javax.swing.JButton();
        comboBoxChannel = new javax.swing.JComboBox<>();
        comboBoxInstrument = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanelTitle = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        menuSampleDrum = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Synthesizer Sample");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanelSuper.setBackground(new java.awt.Color(229, 235, 242));
        jPanelSuper.setLayout(new java.awt.GridBagLayout());

        jPanelSuperContent.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(195, 210, 219), 1, true));
        jPanelSuperContent.setLayout(new java.awt.GridBagLayout());

        jPanelContent.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(203, 209, 213)));
        jPanelContent.setLayout(new java.awt.GridBagLayout());

        jPanelFields.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(203, 209, 213)));
        jPanelFields.setLayout(new java.awt.GridBagLayout());

        button1.setText("Note 1");
        button1.setMaximumSize(new java.awt.Dimension(81, 23));
        button1.setMinimumSize(new java.awt.Dimension(81, 23));
        button1.setName(""); // NOI18N
        button1.setPreferredSize(new java.awt.Dimension(81, 23));
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanelFields.add(button1, gridBagConstraints);

        button2.setText("Note 2");
        button2.setMaximumSize(new java.awt.Dimension(81, 23));
        button2.setMinimumSize(new java.awt.Dimension(81, 23));
        button2.setName(""); // NOI18N
        button2.setPreferredSize(new java.awt.Dimension(81, 23));
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanelFields.add(button2, gridBagConstraints);

        button3.setText("Note 3");
        button3.setMaximumSize(new java.awt.Dimension(81, 23));
        button3.setMinimumSize(new java.awt.Dimension(81, 23));
        button3.setPreferredSize(new java.awt.Dimension(81, 23));
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanelFields.add(button3, gridBagConstraints);

        button4.setText("Note 4");
        button4.setMaximumSize(new java.awt.Dimension(81, 23));
        button4.setMinimumSize(new java.awt.Dimension(81, 23));
        button4.setPreferredSize(new java.awt.Dimension(81, 23));
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanelFields.add(button4, gridBagConstraints);

        button5.setText("Note 5");
        button5.setMaximumSize(new java.awt.Dimension(81, 23));
        button5.setMinimumSize(new java.awt.Dimension(81, 23));
        button5.setPreferredSize(new java.awt.Dimension(81, 23));
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanelFields.add(button5, gridBagConstraints);

        button6.setText("Note 6");
        button6.setMaximumSize(new java.awt.Dimension(81, 23));
        button6.setMinimumSize(new java.awt.Dimension(81, 23));
        button6.setPreferredSize(new java.awt.Dimension(81, 23));
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanelFields.add(button6, gridBagConstraints);

        button7.setText("Note 7");
        button7.setMaximumSize(new java.awt.Dimension(81, 23));
        button7.setMinimumSize(new java.awt.Dimension(81, 23));
        button7.setPreferredSize(new java.awt.Dimension(81, 23));
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanelFields.add(button7, gridBagConstraints);

        button8.setText("Note 8");
        button8.setMaximumSize(new java.awt.Dimension(81, 23));
        button8.setMinimumSize(new java.awt.Dimension(81, 23));
        button8.setPreferredSize(new java.awt.Dimension(81, 23));
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanelFields.add(button8, gridBagConstraints);

        button9.setText("Note 9");
        button9.setMaximumSize(new java.awt.Dimension(81, 23));
        button9.setMinimumSize(new java.awt.Dimension(81, 23));
        button9.setPreferredSize(new java.awt.Dimension(81, 23));
        button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanelFields.add(button9, gridBagConstraints);

        button10.setText("Note 10");
        button10.setMaximumSize(new java.awt.Dimension(81, 23));
        button10.setMinimumSize(new java.awt.Dimension(81, 23));
        button10.setPreferredSize(new java.awt.Dimension(81, 23));
        button10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button10ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanelFields.add(button10, gridBagConstraints);

        comboBoxChannel.setModel(new javax.swing.DefaultComboBoxModel(getChannels()));
        comboBoxChannel.setMaximumSize(new java.awt.Dimension(71, 23));
        comboBoxChannel.setMinimumSize(new java.awt.Dimension(71, 23));
        comboBoxChannel.setPreferredSize(new java.awt.Dimension(71, 23));
        comboBoxChannel.setVisible(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanelFields.add(comboBoxChannel, gridBagConstraints);

        comboBoxInstrument.setModel(new javax.swing.DefaultComboBoxModel(getInstrumentsName()));
        comboBoxInstrument.setMaximumSize(new java.awt.Dimension(110, 23));
        comboBoxInstrument.setMinimumSize(new java.awt.Dimension(110, 23));
        comboBoxInstrument.setPreferredSize(new java.awt.Dimension(110, 23));
        //comboBoxInstrument.setVisible(false);
        comboBoxInstrument.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxInstrumentItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanelFields.add(comboBoxInstrument, gridBagConstraints);

        jLabel2.setText("Channel");
        jLabel2.setVisible(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanelFields.add(jLabel2, gridBagConstraints);

        jLabel3.setText("Instrument");
        //jLabel3.setVisible(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanelFields.add(jLabel3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        jPanelContent.add(jPanelFields, gridBagConstraints);

        jPanelTitle.setBackground(new java.awt.Color(253, 253, 253));
        jPanelTitle.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Java Sound API");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanelTitle.add(jLabel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanelContent.add(jPanelTitle, gridBagConstraints);

        jPanelSuperContent.add(jPanelContent, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 15, 15);
        jPanelSuper.add(jPanelSuperContent, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(jPanelSuper, gridBagConstraints);

        menu.setText("Menu");

        menuSampleDrum.setText("SampleDrum");
        menuSampleDrum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSampleDrumActionPerformed(evt);
            }
        });
        menu.add(menuSampleDrum);

        menuBar.add(menu);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        executeSound(60);
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        executeSound(61);
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        executeSound(62);
    }//GEN-LAST:event_button3ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        executeSound(63);
    }//GEN-LAST:event_button4ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        executeSound(64);
    }//GEN-LAST:event_button5ActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
        executeSound(65);
    }//GEN-LAST:event_button6ActionPerformed

    private void button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button7ActionPerformed
        executeSound(66);
    }//GEN-LAST:event_button7ActionPerformed

    private void button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button8ActionPerformed
        executeSound(67);
    }//GEN-LAST:event_button8ActionPerformed

    private void button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button9ActionPerformed
        executeSound(68);
    }//GEN-LAST:event_button9ActionPerformed

    private void button10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button10ActionPerformed
        executeSound(69);
    }//GEN-LAST:event_button10ActionPerformed

    private void comboBoxInstrumentItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxInstrumentItemStateChanged
        if (evt.getStateChange() == ItemEvent.DESELECTED) {
            System.out.println("1. current: " + currentInstrumentIndex);
            unloadInstrument(currentInstrumentIndex);
        } else if (evt.getStateChange() == ItemEvent.SELECTED) {
            currentInstrumentIndex = comboBoxInstrument.getSelectedIndex();
            System.out.println("2. current: " + currentInstrumentIndex);
            loadInstrument(currentInstrumentIndex);
        }
    }//GEN-LAST:event_comboBoxInstrumentItemStateChanged

    private void menuSampleDrumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSampleDrumActionPerformed
        SampleDrum drum = new SampleDrum();
        drum.setVisible(true);
    }//GEN-LAST:event_menuSampleDrumActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        SwingUtilities.invokeLater(() -> {
            SampleSynthesizer sample = new SampleSynthesizer();
            sample.setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button1;
    private javax.swing.JButton button10;
    private javax.swing.JButton button2;
    private javax.swing.JButton button3;
    private javax.swing.JButton button4;
    private javax.swing.JButton button5;
    private javax.swing.JButton button6;
    private javax.swing.JButton button7;
    private javax.swing.JButton button8;
    private javax.swing.JButton button9;
    private javax.swing.JComboBox<String> comboBoxChannel;
    private javax.swing.JComboBox<String> comboBoxInstrument;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanelContent;
    private javax.swing.JPanel jPanelFields;
    private javax.swing.JPanel jPanelSuper;
    private javax.swing.JPanel jPanelSuperContent;
    private javax.swing.JPanel jPanelTitle;
    private javax.swing.JMenu menu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem menuSampleDrum;
    // End of variables declaration//GEN-END:variables

}
