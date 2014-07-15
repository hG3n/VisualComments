package comments;


import comments.controller.*;
import comments.view.gui.*;
import comments.model.Model;
import comments.view.*;

import javax.swing.SwingUtilities;

public class VisualComments {
	private MouseController controller = null;
    private Model model = null;
    private View view = null;
       
	public View getView() {
		if (view == null) generateVisualComments();
		return view;
	}
	public void generateVisualComments(){
	   model = new Model();
	   view = new View();
	   controller = new MouseController();
	   
	   MenuController menuController = MenuController.getMenuController();
	   view.addMouseListener(controller);
	   view.addMouseMotionListener(controller);
	   view.setModel(model);
	   controller.setModel(model);
	   controller.setView(view);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				GUI application = new GUI();
				application.showToolbar(true);
				application.setView(new VisualComments().getView());
				application.getJFrame().setVisible(true);
			}
		});
	}
	
	
}
