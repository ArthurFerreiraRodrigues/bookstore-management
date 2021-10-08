package vision.listers;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;

import control.ListAllSalesControl;
import model.Data;
import vision.table.Sales;

/**
 * Menu option class for ListSalesMenu - ListAllSales.
 * 
 * @author ArthuFerreiraRodrigues <a href="
 *         #{@link}">{@link https://github.com/ArthurFerreiraRodrigues/TrabalhoOO}</a>
 * 
 * @see javax.swing.JPanel
 * @see java.awt.event.ActionListener
 * 
 * @see vision.menu.ListSalesMenu
 */
public class ListAllSales extends JPanel implements ActionListener {
    private static final Font FONT = new Font("Default", Font.PLAIN, 16);

    private JTable table;
    private JScrollPane scroll;

    private final JButton buttonHome;

    private final ListAllSalesControl controller;

    /**
     * Adds a Table and a button do go back to the main menu.
     * 
     * @see vision.table.Sales
     */
    public ListAllSales() {
        int standartPos = 80, spacer = 50;
        controller = new ListAllSalesControl(this);

        JPanel panel = new JPanel();

        panel.setBounds(100, 100, 830, 522);
        panel.setLayout(null);

        JLabel labelTitle = new JLabel("Listar Todas as Vendas");
        labelTitle.setVerticalAlignment(SwingConstants.TOP);
        labelTitle.setForeground(Color.GRAY);
        labelTitle.setFont(new Font("Default", Font.BOLD, 45));
        labelTitle.setBounds(150, 5, 800, 800);
        add(labelTitle);

        String[] header = { "  ", "ID Vendedor", "Nome Vendedor", "Cliente", "Qtd.Unidades", "Total (R$)" };
        scroll = new JScrollPane();
        scroll.setViewportView(Sales.genTableAll(Sales.toArrayList(Data.getSales().toArray()), header));

        add(scroll);

        buttonHome = new JButton("Tela Inicial");
        buttonHome.setBackground(Color.LIGHT_GRAY);
        buttonHome.setForeground(Color.BLACK);
        buttonHome.setFont(FONT);
        buttonHome.setBounds(340, standartPos + spacer * 3, 120, 31);
        buttonHome.addActionListener(this);
        add(buttonHome);

    }

    /**
     * Executes the actioned button actions
     * 
     * @param actioned - Object
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        controller.execute(e.getSource());

    }

    public JTable getTable() {
        return table;
    }

    public JScrollPane getScroll() {
        return scroll;
    }

    public JButton getButtonHome() {
        return buttonHome;
    }

}