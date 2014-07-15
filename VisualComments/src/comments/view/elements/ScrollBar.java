package comments.view.elements;

import java.awt.geom.Rectangle2D;

public class ScrollBar {
	private int width;
	private int height;
	private Rectangle2D scrollBar 		 = new Rectangle2D.Double();
	private Rectangle2D scrollSlider	 = new Rectangle2D.Double();
	
	public ScrollBar(int w, int h){
		super();
		this.width = w;
		this.height = h;
		setScrollBar(width-50,0,50,height);
		setScrollSlider(width-50,0,50,height/2);
	}
	
	public void update(int w, int h){
		this.width = w;
		this.height = h;
		setScrollBar(width-50,0,50,height);
		setScrollSlider(width-50,0,50,height/2);
	}
	
	public Rectangle2D getScrollBar() {
		return scrollBar;
	}

	public void setScrollBar(double x,double y,double w,double h) {
		this.scrollBar.setRect(x, y, w, h);
	}

	public Rectangle2D getScrollSlider() {
		return scrollSlider;
	}

	public void setScrollSlider(double x,double y,double w,double h) {
		this.scrollSlider.setRect(x, y, w, h);
	}
}
