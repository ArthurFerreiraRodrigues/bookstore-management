package control;

import main.MainFrameControl;
import model.Data;
import model.Seller;
import vision.deleters.DeleteSeller;
import vision.table.Sellers;

import javax.swing.JTable;

/**
 * Controller for DeleteSeller class.
 * 
 * @author ArthuFerreiraRodrigues <a href="
 *         #{@link}">{@link https://github.com/ArthurFerreiraRodrigues/TrabalhoOO}</a>
 * 
 * @see vision.deleters.DeleteSeller
 */
public class DeleteSellerControl {
    private DeleteSeller view;

    /**
     * View initializer
     * 
     * @param view - DeleteSeller
     */
    public DeleteSellerControl(DeleteSeller view) {
        this.view = view;
    }

    /**
     * Executes the actioned button actions
     * 
     * @param actioned - Object
     */
    public void execute(Object actioned) {
        if (actioned == view.getButtonHome()) {
            MainFrameControl.showStoreManagerMenu();
        } else if (actioned == view.getButtonDelete()) {

            String selectedId = view.getTable().getModel().getValueAt(view.getTable().getSelectedRow(), 1).toString();

            for (Seller seller : Data.getSellers()) {
                if (Integer.toString(seller.getId()).equals(selectedId)) {
                    Data.getSellers().remove(seller);
                    break;
                }
            }
            view.getScroll().setViewportView(new JTable(
                    Sellers.genTable(Sellers.toArrayList(Data.getSellers().toArray()), view.getHeader(), false)));
            MainFrameControl.showDeleteSeller();
        }

    }

}
