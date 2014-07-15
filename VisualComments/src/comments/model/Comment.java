package comments.model;

import java.awt.Color;

public class Comment {
	private int id = 0;
	private int refersToId = 0;
	private String text = "";
	private int votes = 0;
	
	public Comment(int refersToId, String text, int votes) {
		super();
		this.refersToId = refersToId;
		this.text = text;
		this.votes = votes;
	}
	
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	public int getRefersToId() {
		return refersToId;
	}
	public void setRefersToId(int refersToId) {
		this.refersToId = refersToId;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getVotes() {
		return votes;
	}
	public void setVotes(int votes) {
		this.votes = votes;
	}

	
	
}
