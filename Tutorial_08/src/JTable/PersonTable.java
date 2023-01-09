package JTable;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;
import java.util.ArrayList;

public class PersonTable extends JFrame {
    JTable myTable;
    PersonTableModel tableModel;
    ArrayList<Person> list;

    public PersonTable(ArrayList<Person> list){
        this.list = list;
        tableModel = new PersonTableModel(list);
        myTable =  new JTable(tableModel);

        setBounds(10,10,400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        myTable.setAutoCreateRowSorter(true);
        myTable.getColumnModel().getColumn(2).setCellRenderer(new DefaultTableCellRenderer(){
            Color originalColor = null;

            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

                Component renderer =  super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

                if (value == "Teacher") {
                    renderer.setBackground(Color.GREEN);
                } else {
                    renderer.setBackground(Color.BLUE);
                }
                return renderer;
            }
        });

        JScrollPane scrollPane = new JScrollPane(myTable);
        scrollPane.setPreferredSize(new Dimension(380,280));

        JPanel panel = new JPanel();
        panel.add(scrollPane);
        add(panel,BorderLayout.CENTER);

    }
}
