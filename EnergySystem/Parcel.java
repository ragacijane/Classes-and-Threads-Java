package EnergySystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public abstract class Parcel extends Label{
	
	public Parcel(String n, Color c) {
		super();
		this.setText(n);
		this.setAlignment(CENTER);
		this.setFont(new Font("Serif",Font.BOLD,14));
		this.setForeground(Color.white);
		this.setBackground(c);
		
		addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				getParent().dispatchEvent(e);
			}
		});
	}
	
	public void changeColor(Color c) {
		this.setBackground(c);
	}
	
	public void reseted() {
		this.setFont(new Font("Serif",Font.BOLD,14));
	}

	public void selected() {
		this.setFont(new Font("Serif",Font.BOLD,20));
	}
	
}
