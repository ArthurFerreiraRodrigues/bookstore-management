package vision.listers;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import control.ListCustomersControl;
import model.Data;
import vision.table.Customers;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 * Lister - ListCustomers.
 * 
 * @author ArthuFerreiraRodrigues <a href="
 *         #{@link}">{@link https://github.com/ArthurFerreiraRodrigues/TrabalhoOO}</a>
 * 
 * @see javax.swing.JPanel
 * @see java.awt.event.ActionListener
 */
public class ListCustomers extends JPanel implements ActionListener {
    private static final Font FONT = new Font("Default", Font.PLAIN, 16);

    private JScrollPane scroll;

    private final JButton buttonHome;

    private final ListCustomersControl controller;

    /**
     * Adds a Table and a button do go back to the main menu.
     * 
     * @see vision.table.Customers
     */
    public ListCustomers() {
        int standartPos = 80, spacer = 50;
        controller = new ListCustomersControl(this);

        JPanel panel = new JPanel();

        panel.setBounds(100, 100, 830, 522);
        panel.setLayout(null);

        JLabel labelTitle = new JLabel("Listar Clientes");
        labelTitle.setVerticalAlignment(SwingConstants.TOP);
        labelTitle.setForeground(Color.GRAY);
        labelTitle.setFont(new Font("Default", Font.BOLD, 45));
        labelTitle.setBounds(150, 5, 800, 800);
        add(labelTitle);

        String[] header = { "  ", "Nome", "Endereco", "Telefone", "Qtd.Visitas" };
        scroll = new JScrollPane();
        scroll.setViewportView(
                new JTable(Customers.genTable(Customers.toArrayList(Data.getCustomers().toArray()), header, false)));

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

    public JButton getButtonHome() {
        return buttonHome;
    }

}
