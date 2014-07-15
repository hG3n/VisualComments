package comments.controller;


import java.awt.Color;

import comments.model.Model;
import comments.view.View;

public class MenuController {
	private View view = null;
	private Model model = null;
	private MouseController mouseControllerAddedToView = null;
	
	private static MenuController menuController = null;
	private MenuController(){
	}
	
	public static MenuController getMenuController(){
		if (menuController == null){
			menuController = new MenuController();
		}
		return menuController;  
	}
	
	public static MenuController getInstance(){
		return getMenuController();    
	}
	
	/*
	 * getter und setter
	 */
	public MouseController getMouseControllerAddedToView() {
		return mouseControllerAddedToView;
	}

	public void setMouseControllerAddedToView(
			MouseController mouseControllerAddedToView) {
		this.mouseControllerAddedToView = mouseControllerAddedToView;
	}
	public Model getModel() {
		return model;
		/*
		 * SingletonPattern Part1
		 */}
	public void setModel(Model model) {
		this.model = model;
	}
	public View getView() {
		return view;
	}
	public void setView(View view) {
		this.view = view;
	}



	
}