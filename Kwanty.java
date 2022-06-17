package kwanty;

import java.awt.BorderLayout
;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JSlider;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Kwanty extends JFrame implements ActionListener, MouseListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Rys panel;
	JPanel panelik,panelson;
	JSlider x,y;
	JLabel field1,field2;
	JRadioButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
	ButtonGroup group;
	JMenu menu, submenu;  
	JRadioButtonMenuItem i1, i2;
    Color kolor= new Color(230, 230, 255);
   
	
	public void actionPerformed(ActionEvent e) {
		if(i2 == e.getSource())//nstacjo
		{
			
			b1.setEnabled(true);
			b2.setEnabled(true);
			b3.setEnabled(true);
			b4.setEnabled(true);
			b5.setEnabled(true);
			b6.setEnabled(true);
			b7.setEnabled(true);
			b8.setEnabled(true);
			b9.setEnabled(true);
			x.setEnabled(false);
			y.setEnabled(false);
			Rys.T= false;
			Rys.G= false;
			Rys.N = true;
			panel.repaint();

		}
		else if(i1 == e.getSource())//stacjo
		{

			x.setEnabled(true);
			y.setEnabled(true);
			b1.setEnabled(false);
			b2.setEnabled(false);
			b3.setEnabled(false);
			b4.setEnabled(false);
			b5.setEnabled(false);
			b6.setEnabled(false);
			b7.setEnabled(false);
			b8.setEnabled(false);
			b9.setEnabled(false);
			Rys.T= true;
			Rys.G= false;
			Rys.N = false;
			panel.repaint();

		}
		else if(b1==e.getSource() && b1.isSelected()) {
			Rys.N= true;
			Rys.bl1=true;
			Rys.E++;
		}
		else if(b1==e.getSource() && !b1.isSelected())
		{
			Rys.bl1=false;
			Rys.E--;
		}
		else if(b2==e.getSource() && b2.isSelected())
		{
			Rys.N= true;
			Rys.bl2=true;
			Rys.E++;
		}
		else if(b2==e.getSource() && !b2.isSelected())
		{
			Rys.bl2=false;
			Rys.E--;
		}
		else if(b3==e.getSource() && b3.isSelected())
		{
			Rys.N= true;
			Rys.bl3=true;
			Rys.E++;
		}
		else if(b3==e.getSource() && !b3.isSelected())
		{
			Rys.bl3=false;
			Rys.E--;
		}	
		else if(b4==e.getSource() && b4.isSelected())
		{
			Rys.N= true;
			Rys.bl4=true;
			Rys.E++;
		}
		else if(b4==e.getSource() && !b4.isSelected())
		{
			Rys.bl4=false;
			Rys.E--;
		}
		else if(b5==e.getSource() && b5.isSelected())
		{
			Rys.N= true;
			Rys.bl5=true;
			Rys.E++;
		}
		else if(b5==e.getSource() && !b5.isSelected())
		{
			Rys.bl5=false;
			Rys.E--;
		}	
		else if(b6==e.getSource() && b6.isSelected())
		{
			Rys.N= true;
			Rys.bl6=true;
			Rys.E++;
		}
		else if(b6==e.getSource() && !b6.isSelected())
		{
			Rys.bl6=false;
			Rys.E--;
		}	
		else if(b7==e.getSource() && b7.isSelected())
		{
			Rys.N= true;
			Rys.bl7=true;
			Rys.E++;
		}
		else if(b7==e.getSource() && !b7.isSelected())
		{
			Rys.bl7=false;
			Rys.E--;
		}	
		else if(b8==e.getSource() && b8.isSelected())
		{
			Rys.N= true;
			Rys.bl8=true;
			Rys.E++;
		}
		else if(b8==e.getSource() && !b8.isSelected())
		{
			Rys.bl8=false;
			Rys.E--;
		}	
		else if(b9==e.getSource() && b9.isSelected())
		{
			Rys.N= true;
			Rys.bl9=true;
			Rys.E++;
		}
		else if(b9==e.getSource() && !b9.isSelected())
		{
			Rys.bl9=false;
			Rys.E--;
		}	
		
	}
	Kwanty()
	{
			 this.setResizable(false);
			 this.setLayout(new BorderLayout());
			 this.setSize(620,530);	
			 this.setTitle("Stany kwantowe");
			 this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			 this.setLocationRelativeTo(null);
			 panel= new Rys();
			 panelik = new JPanel();
			 panelson = new JPanel();
			 panelik.setBackground(kolor);
			 panel.setBackground(Color.black);
			 this.add(panel, BorderLayout.LINE_START);
			 this.add(panelik, BorderLayout.LINE_END);
			 this.add(panelson, BorderLayout.SOUTH);
			 panelson.setPreferredSize(new Dimension(620,80));
			 panelson.setSize(getPreferredSize());
			 panelik.setPreferredSize(new Dimension(204,400));
			 panelik.setSize(getPreferredSize());
			 b1 = new JRadioButton();
			 b2 = new JRadioButton();
			 b3 = new JRadioButton();
			 b4 = new JRadioButton();
			 b5 = new JRadioButton();
			 b6 = new JRadioButton();
			 b7 = new JRadioButton();
			 b8 = new JRadioButton();
			 b9 = new JRadioButton();
			 b1.setEnabled(false);
			 b2.setEnabled(false);
			 b3.setEnabled(false);
			 b4.setEnabled(false);
			 b5.setEnabled(false);
			 b6.setEnabled(false);
			 b7.setEnabled(false);
			 b8.setEnabled(false);
			 b9.setEnabled(false);
			 l1 = new JLabel("(1,1)");
			 l2 = new JLabel("(1,2)");
			 l3 = new JLabel("(1,3)");
			 l4 = new JLabel("(2,1)");
			 l5 = new JLabel("(2,2)");
			 l6 = new JLabel("(2,3)");
			 l7 = new JLabel("(3,1)");
			 l8 = new JLabel("(3,2)");
			 l9 = new JLabel("(3,3)");
			 GridLayout grid = new GridLayout(3,6);
			 panelson.setLayout(grid);
			 panelson.add(b1);
			 panelson.add(l1);
			 panelson.add(b2);
			 panelson.add(l2);
			 panelson.add(b3);
			 panelson.add(l3);
			 panelson.add(b4);
			 panelson.add(l4);
			 panelson.add(b5);
			 panelson.add(l5);
			 panelson.add(b6);
			 panelson.add(l6);
			 panelson.add(b7);
			 panelson.add(l7);
			 panelson.add(b8);
			 panelson.add(l8);
			 panelson.add(b9);
			 panelson.add(l9);

			 x = new JSlider();
			 y = new JSlider();
			 field1 = new JLabel("nx: 2");
			 field2 = new JLabel("ny: 2");
			 panelik.add(field1);
			 panelik.add(x);
			 panelik.add(field2);
			 panelik.add(y);
			 panelik.setLayout(new GridLayout(6,1));
			 x.setMinimum(1);
			 x.setBackground(kolor);
		     x.setMaximum(6);
		     x.setMajorTickSpacing(1);
		     x.setPaintTicks(true);
		     x.setPaintLabels(true);
		     x.setValue(2);
		     y.setMinimum(1);
		     y.setBackground(kolor);
		   	 y.setMaximum(6);
		   	 y.setMajorTickSpacing(1);
		   	 y.setPaintTicks(true);
		   	 y.setPaintLabels(true);
		   	 y.setValue(2);
		   	 
		   	 JMenuBar mb=new JMenuBar();  
	         menu=new JMenu("Stany");  
	         i1=new JRadioButtonMenuItem("Stacjonarne");  
	         i2=new JRadioButtonMenuItem("Niestacjonarne");  
	         group= new ButtonGroup();
	         group.add(i1);
	         group.add(i2);
	         menu.add(i1); menu.add(i2);  
	         mb.add(menu);  
	         this.setJMenuBar(mb);
	         
			 x.addChangeListener(new SliderChangeListener());
			 y.addChangeListener(new SliderChangeListener());
			 i2.addActionListener(this);
			 i1.addActionListener(this);
			 b1.addActionListener(this);
			 b2.addActionListener(this);
			 b3.addActionListener(this);
			 b4.addActionListener(this);
			 b5.addActionListener(this);
			 b6.addActionListener(this);
			 b7.addActionListener(this);
			 b8.addActionListener(this);
			 b9.addActionListener(this);
			 panel.addMouseListener(this);
			 
			 this.setVisible(true);
		}
	 public class SliderChangeListener implements ChangeListener{

			@Override
			public void stateChanged(ChangeEvent arg0) {
				String value = String.format("%d", x.getValue());
				String value2 = String.format("%d", y.getValue());
				
				String q1 = "nx: ";
				String q2 = "ny: ";
				field1.setText(q1 + value);
				field2.setText(q2 + value2);
				int x1 = Integer.parseInt(value);
				int r1 = Integer.parseInt(value2);
				Rys.Nx= x1;
				Rys.Ny= r1;
				
					}

		 }
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable() {
		@Override
		public void run() {
			// TODO Auto-generated method stub
			Kwanty k1= new Kwanty();
			Thread t1= new Thread(k1.panel);
			t1.start();
			
		}
		
		});
		
			
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		 Rys.pointStart=e.getPoint();
	     Rys.czas=System.currentTimeMillis();
	     Rys.G = true;
	     i1.setSelected(false);
	     i2.setSelected(false);
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}


