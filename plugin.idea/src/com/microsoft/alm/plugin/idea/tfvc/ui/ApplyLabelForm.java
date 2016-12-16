// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the project root.

package com.microsoft.alm.plugin.idea.tfvc.ui;

import com.intellij.openapi.project.Project;
import com.intellij.ui.DocumentAdapter;
import com.intellij.ui.components.JBScrollPane;
import com.intellij.ui.table.JBTable;
import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;
import com.intellij.util.EventDispatcher;
import com.microsoft.alm.plugin.external.models.ItemInfo;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.Dimension;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.EventListener;
import java.util.List;
import java.util.ResourceBundle;

public class ApplyLabelForm {

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        contentPane = new JPanel();
        contentPane.setLayout(new GridLayoutManager(7, 1, new Insets(0, 0, 0, 0), -1, -1));
        final JLabel label1 = new JLabel();
        this.$$$loadLabelText$$$(label1, ResourceBundle.getBundle("com/microsoft/alm/plugin/idea/ui/tfplugin").getString("ApplyLabelDialog.NameLabel"));
        contentPane.add(label1, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        nameText = new JTextField();
        contentPane.add(nameText, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JLabel label2 = new JLabel();
        this.$$$loadLabelText$$$(label2, ResourceBundle.getBundle("com/microsoft/alm/plugin/idea/ui/tfplugin").getString("ApplyLabelDialog.CommentLabel"));
        contentPane.add(label2, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label3 = new JLabel();
        this.$$$loadLabelText$$$(label3, ResourceBundle.getBundle("com/microsoft/alm/plugin/idea/ui/tfplugin").getString("ApplyLabelDialog.ItemsLabel"));
        contentPane.add(label3, new GridConstraints(4, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayoutManager(1, 3, new Insets(0, 0, 0, 0), -1, -1));
        contentPane.add(panel1, new GridConstraints(6, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        addButton = new JButton();
        this.$$$loadButtonText$$$(addButton, ResourceBundle.getBundle("com/microsoft/alm/plugin/idea/ui/tfplugin").getString("ApplyLabelDialog.AddButton"));
        panel1.add(addButton, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer1 = new Spacer();
        panel1.add(spacer1, new GridConstraints(0, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        removeButton = new JButton();
        removeButton.setEnabled(false);
        this.$$$loadButtonText$$$(removeButton, ResourceBundle.getBundle("com/microsoft/alm/plugin/idea/ui/tfplugin").getString("ApplyLabelDialog.RemoveButton"));
        panel1.add(removeButton, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JBScrollPane jBScrollPane1 = new JBScrollPane();
        contentPane.add(jBScrollPane1, new GridConstraints(5, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(-1, 250), null, 0, false));
        itemsTable = new JBTable();
        jBScrollPane1.setViewportView(itemsTable);
        final JBScrollPane jBScrollPane2 = new JBScrollPane();
        contentPane.add(jBScrollPane2, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        commentTextArea = new JTextArea();
        commentTextArea.setRows(4);
        jBScrollPane2.setViewportView(commentTextArea);
        label1.setLabelFor(nameText);
    }

    /**
     * @noinspection ALL
     */
    private void $$$loadLabelText$$$(JLabel component, String text) {
        StringBuffer result = new StringBuffer();
        boolean haveMnemonic = false;
        char mnemonic = '\0';
        int mnemonicIndex = -1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '&') {
                i++;
                if (i == text.length()) break;
                if (!haveMnemonic && text.charAt(i) != '&') {
                    haveMnemonic = true;
                    mnemonic = text.charAt(i);
                    mnemonicIndex = result.length();
                }
            }
            result.append(text.charAt(i));
        }
        component.setText(result.toString());
        if (haveMnemonic) {
            component.setDisplayedMnemonic(mnemonic);
            component.setDisplayedMnemonicIndex(mnemonicIndex);
        }
    }

    /**
     * @noinspection ALL
     */
    private void $$$loadButtonText$$$(AbstractButton component, String text) {
        StringBuffer result = new StringBuffer();
        boolean haveMnemonic = false;
        char mnemonic = '\0';
        int mnemonicIndex = -1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '&') {
                i++;
                if (i == text.length()) break;
                if (!haveMnemonic && text.charAt(i) != '&') {
                    haveMnemonic = true;
                    mnemonic = text.charAt(i);
                    mnemonicIndex = result.length();
                }
            }
            result.append(text.charAt(i));
        }
        component.setText(result.toString());
        if (haveMnemonic) {
            component.setMnemonic(mnemonic);
            component.setDisplayedMnemonicIndex(mnemonicIndex);
        }
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return contentPane;
    }

    public interface Listener extends EventListener {
        void dataChanged(String labelName, int visibleItemsCount);
    }

    private final Project project;
    private final List<ItemInfo> itemInfos;

    private JPanel contentPane;

    private JTextField nameText;
    private JTextArea commentTextArea;
    private JTable itemsTable;

    private JButton addButton;
    private JButton removeButton;

    private LabelItemsTableModel itemsTableModel;
    //private final LabelModel myLabelModel;

    private final EventDispatcher<Listener> eventDispatcher = EventDispatcher.create(Listener.class);

    public ApplyLabelForm(final Project project, final List<ItemInfo> itemInfos) {
        this.project = project;
        this.itemInfos = itemInfos;
        //myLabelModel = new LabelModel();

        nameText.getDocument().addDocumentListener(new DocumentAdapter() {
            protected void textChanged(final DocumentEvent e) {
                eventDispatcher.getMulticaster().dataChanged(getLabelName(), itemsTableModel.getRowCount());
            }
        });

        // Hide the buttons for now
        addButton.setVisible(false);
        //addButton.addActionListener(new ActionListener() {
        //  public void actionPerformed(final ActionEvent e) {
        //    addItems();
        //  }
        //});

        removeButton.setVisible(false);
        //removeButton.addActionListener(new ActionListener() {
        //  public void actionPerformed(final ActionEvent e) {
        //    removeItems();
        //  }
        //});

        initTable();
        updateButtons();
    }

    private void initTable() {
        itemsTableModel = new LabelItemsTableModel();
        itemsTableModel.setItems(itemInfos);
        itemsTable.setModel(itemsTableModel);
        for (int i = 0; i < LabelItemsTableModel.Column.values().length; i++) {
            itemsTable.getColumnModel().getColumn(i).setPreferredWidth(LabelItemsTableModel.Column.values()[i].getWidth());
        }
        itemsTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                updateButtons();
            }
        });

//        itemsTable.getColumnModel().getColumn(LabelItemsTableModel.Column.Item.ordinal()).setCellRenderer(new DefaultTableCellRenderer() {
//            @Override
//            public Component getTableCellRendererComponent(final JTable table,
//                                                           final Object value,
//                                                           final boolean isSelected,
//                                                           final boolean hasFocus,
//                                                           final int row,
//                                                           final int column) {
//                final Item item = (Item)value;
//                super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
//                setIcon(item.getType() == ItemType.Folder ? UiConstants.ICON_FOLDER : UiConstants.ICON_FILE);
//                setValue(item.getItem());
//                return this;
//            }
//        });

    }

//    private void removeItems() {
//        final List<LabelItemSpecWithItems> removalSpecs = new ArrayList<LabelItemSpecWithItems>(itemsTable.getSelectedRows().length);
//        for (int selectedRow : itemsTable.getSelectedRows()) {
//            removalSpecs.add(LabelItemSpecWithItems.createForRemove(itemsTableModel.getItem(selectedRow)));
//        }
//        myLabelModel.addAll(removalSpecs);
//        reloadItems();
//    }
//
//    private void reloadItems() {
//        itemsTableModel.setContent(myLabelModel.calculateItemsToDisplay());
//        eventDispatcher.getMulticaster().dataChanged(getLabelName(), itemsTableModel.getRowCount());
//    }
//
//    public void addItems() {
//        AddItemDialog d = new AddItemDialog(project, myWorkspace, mySourcePath);
//        if (d.showAndGet()) {
//            //noinspection ConstantConditions
//            myLabelModel.add(d.getLabelSpec());
//            reloadItems();
//        }
//    }

    private void updateButtons() {
        //removeButton.setEnabled(itemsTable.getSelectedRowCount() > 0);
    }

    public JPanel getContentPane() {
        return contentPane;
    }

    public String getLabelName() {
        return nameText.getText().trim();
    }

    public String getLabelComment() {
        return commentTextArea.getText();
    }

    public List<String> getLabelItemSpecs() {
        final List<String> itemSpecs = new ArrayList<String>();
        for (final ItemInfo info : itemInfos) {
            itemSpecs.add(info.getServerItem() + ";" + info.getServerVersion());
        }
        return itemSpecs;
    }

    public void addListener(final Listener listener) {
        eventDispatcher.addListener(listener);
    }

    public void removeListener(final Listener listener) {
        eventDispatcher.addListener(listener);
    }
}
