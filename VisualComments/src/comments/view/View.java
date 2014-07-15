package comments.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RectangularShape;
import java.util.Iterator;

import javax.swing.JPanel;

import comments.model.Model;
import comments.view.elements.ScrollBar;

public class View extends JPanel {
	private Model model = null;
	private double translateX = 0;
	private double translateY = 0;
	private double borderX = 0;
	private double borderY = 0;
	private ScrollBar scrollBar = new ScrollBar(getWidth(),getHeight());


	public void paint(Graphics g) {
		Graphics2D g2D = (Graphics2D)g;
		g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
		g2D.clearRect(0, 0, getWidth(), getHeight());
		
		paintScrollElements(g2D);
//		Rectangle2D rect = new Rectangle2D.Double(50,50,200,200);
//        Rectangle2D rect2 = new Rectangle2D.Double(10,10,100,100);
//        
//        Color color1 = Color.BLUE;
//        
//        g2D.setColor(color1);
//        g2D.fill(rect);
//        Color color2 = Color.RED;
//        g2D.setColor(color2);
//        g2D.draw(rect);
//        
//        g2D.scale(3, 3);
//        g2D.fill(rect2);
        
	}

	public void paintScrollElements(Graphics2D g2D){
		scrollBar.update(getWidth(),getHeight());
		g2D.setColor(Color.gray);
		g2D.draw(scrollBar.getScrollBar());
		g2D.fill(scrollBar.getScrollBar());
		g2D.setColor(Color.darkGray);
		g2D.draw(scrollBar.getScrollSlider());
		g2D.fill(scrollBar.getScrollSlider());
	}
	

	public double getTranslateX() {
		return translateX;
	}


	public void setTranslateX(double translateX) {
		this.translateX = translateX;
	}


	public double getTranslateY() {
		return translateY;
	}


	public void setTranslateY(double translateY) {
		this.translateY = translateY;
	}


	public double getBorderX() {
		return borderX;
	}


	public void setBorderX(double borderX) {
		this.borderX = borderX;
	}


	public double getBorderY() {
		return borderY;
	}


	public void setBorderY(double borderY) {
		this.borderY = borderY;
	}


	@Override
	public void update(Graphics g) {
		paint(g);
	}

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	
}
