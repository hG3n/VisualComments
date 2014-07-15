package comments.model;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.awt.Shape;


public class Model {
	private static int idCounter = 0;
	private ArrayList<Comment> comments  = new ArrayList<Comment>();
	
	public static int generateNewID(){
		idCounter++;
		return idCounter;
	}
	
	public ArrayList<Comment> getComments() {
		return comments;
	}
	public void setComments(ArrayList<Comment> comments) {
		this.comments = comments;
	}
	
	

}
