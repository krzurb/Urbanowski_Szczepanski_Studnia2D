package kwanty;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import javax.swing.JPanel;


public class Rys extends JPanel implements Runnable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static volatile ArrayList<Prostokat> prostokaty;
	public static double Nx = 2;
	public static double Ny = 2;
	public static int nx = 0 ;
	public static int ny = 0;
	public static volatile boolean T = false;
	public static volatile boolean G = false;
	public static volatile boolean N = false;
	public static volatile boolean bl1,bl2,bl3,bl4,bl5,bl6,bl7,bl8,bl9=false;
	public static double Time;
	public static int X;
	public static int Y;
	public static long czas;
	public int Ile;
	public static Point pointStart ;
	public static Point pointEnd ;
	public double wartosc;
	public double wartosc2 = 0;
	public static int E= 1;
	
	Rys()
	{
		X=getWidth();
		Y=getHeight();
		this.setPreferredSize(new Dimension(400,400));
		this.setSize(getPreferredSize());
		this.setBackground(Color.BLACK);
		//this.addMouseListener(this);
        //this.addMouseMotionListener(this);
	}
	public synchronized void Dodaj(double t) 
	{
		prostokaty= new ArrayList<Prostokat>();
		for(int i=0;i<this.getWidth();i++) 
		{
			for(int j=0;j<this.getHeight();j++) 
			{
				Prostokat p1= new Prostokat();
				p1.x=i;
				p1.y=j;
				wartosc=(this.getWidth()/2)*(2/Math.sqrt(this.getWidth()*this.getWidth())*Math.sin(Nx*Math.PI*i/this.getWidth())*Math.sin(Ny*Math.PI*j/this.getWidth())*Math.cos((Nx+Ny)*t));
				p1.z=wartosc;
				prostokaty.add(p1);
			}
		}
		this.repaint();
	}
	public synchronized void Dodaj_nestacjo(double t) 
	{
		Ile=0;
		prostokaty= new ArrayList<Prostokat>();
		for(int i=0;i<this.getWidth();i++) 
		{
			for(int j=0;j<this.getHeight();j++) 
			{
				Prostokat p1= new Prostokat();
				p1.x=i;
				p1.y=j;
				p1.z =0;
				prostokaty.add(p1);
			}
		}
		if(bl1) {
			Ile++;
			for(Prostokat p1:prostokaty)  
			{
				p1.z +=(this.getWidth()/2)*(2/Math.sqrt(this.getWidth()*this.getWidth())*Math.sin(1*Math.PI*p1.x/this.getWidth())*Math.sin(1*Math.PI*p1.y/this.getWidth())*Math.cos(2*t));
			}
		}
		if(bl2){
			Ile++;
			for(Prostokat p1:prostokaty)  
			{
				p1.z +=(this.getWidth()/2)*(2/Math.sqrt(this.getWidth()*this.getWidth())*Math.sin(1*Math.PI*p1.x/this.getWidth())*Math.sin(2*Math.PI*p1.y/this.getWidth())*Math.cos(3*t));
			}
		}
		if(bl3){
			Ile++;
			for(Prostokat p1:prostokaty)  
			{
				p1.z +=(this.getWidth()/2)*(2/Math.sqrt(this.getWidth()*this.getWidth())*Math.sin(1*Math.PI*p1.x/this.getWidth())*Math.sin(3*Math.PI*p1.y/this.getWidth())*Math.cos(4*t));
			}
		}
		if(bl4){
			Ile++;
			for(Prostokat p1:prostokaty)  
			{
				p1.z +=(this.getWidth()/2)*(2/Math.sqrt(this.getWidth()*this.getWidth())*Math.sin(2*Math.PI*p1.x/this.getWidth())*Math.sin(1*Math.PI*p1.y/this.getWidth())*Math.cos(3*t));
			}
		}
		if(bl5){
			Ile++;
			for(Prostokat p1:prostokaty)  
			{
				p1.z +=(this.getWidth()/2)*(2/Math.sqrt(this.getWidth()*this.getWidth())*Math.sin(2*Math.PI*p1.x/this.getWidth())*Math.sin(2*Math.PI*p1.y/this.getWidth())*Math.cos(4*t));
			}
		}
		if(bl6){
			Ile++;
			for(Prostokat p1:prostokaty)  
			{
				p1.z +=(this.getWidth()/2)*(2/Math.sqrt(this.getWidth()*this.getWidth())*Math.sin(2*Math.PI*p1.x/this.getWidth())*Math.sin(3*Math.PI*p1.y/this.getWidth())*Math.cos(5*t));
			}
		}
		if(bl7){
			Ile++;
			for(Prostokat p1:prostokaty)  
			{
				p1.z +=(this.getWidth()/2)*(2/Math.sqrt(this.getWidth()*this.getWidth())*Math.sin(3*Math.PI*p1.x/this.getWidth())*Math.sin(1*Math.PI*p1.y/this.getWidth())*Math.cos(4*t));
			}
		}
		if(bl8){
			Ile++;
			for(Prostokat p1:prostokaty)  
			{
				p1.z +=(this.getWidth()/2)*(2/Math.sqrt(this.getWidth()*this.getWidth())*Math.sin(3*Math.PI*p1.x/this.getWidth())*Math.sin(2*Math.PI*p1.y/this.getWidth())*Math.cos(5*t));
			}
		}
		if(bl9){
			Ile++;
			for(Prostokat p1:prostokaty)  
			{
				p1.z +=(this.getWidth()/2)*(2/Math.sqrt(this.getWidth()*this.getWidth())*Math.sin(3*Math.PI*p1.x/this.getWidth())*Math.sin(3*Math.PI*p1.y/this.getWidth())*Math.cos(6*t));
			}
		}
		this.repaint();
	}
	public synchronized void Dodaj_gauss(double t) 
	{
		prostokaty= new ArrayList<Prostokat>();
		for(int i=this.getWidth();i>=0;i--) 
		{
			for(int j=this.getHeight();j>=0;j--) 
			{
				Prostokat p1= new Prostokat();
				Prostokat p2= new Prostokat();
				Prostokat p3= new Prostokat();
				Prostokat p4= new Prostokat();
				p1.x=Math.abs( i-pointStart.x);
				p1.y=Math.abs( j-pointStart.y);
				p2.x=Math.abs(i-pointStart.x);
				p2.y=Math.abs(j+pointStart.y);
				p3.x=Math.abs(i+pointStart.x);
				p3.y=Math.abs(j+pointStart.y);
				p4.x=Math.abs(i+pointStart.x);
				p4.y=Math.abs(j-pointStart.y);
				double mianownik = Math.sqrt(100/Math.sqrt(100*100 + t*t))*(100*100 + t*t);
				double exp = 100*100*Math.pow(Math.E, -100*(i*i + j*j)/(2*(100*100 + t*t) ) );
				double cos = Math.cos(  t*(i*i + j*j)/(2*(100*100 + t*t) ) );
				double wartosc= (this.getWidth()/2)*exp*cos/mianownik;
				p1.z=wartosc;
				prostokaty.add(p1);
				p2.z=wartosc;
				prostokaty.add(p2);
				p3.z=wartosc;
				prostokaty.add(p3);
				p4.z=wartosc;
				prostokaty.add(p4);
			}
			
		}
		
		this.repaint();
	}
	
public synchronized void paintComponent(Graphics g) {
		
	   super.paintComponent(g);
	   if(prostokaty!=null) {
		   for(Prostokat p1:prostokaty) 
		   {
			   if(p1.z>0 ) {
				   float[] hsb = Color.RGBtoHSB(204, 0, 204, null);
				   float hue = hsb[0];
				   float saturation = hsb[1];
				   float brightness = hsb[2];
				   brightness=(float)((brightness*(p1.z)));
				   int rgb = Color.HSBtoRGB(hue, saturation, brightness);		  
				   int red = (rgb>>16)&0xFF;
				   int green = (rgb>>8)&0xFF;
				   int blue = rgb&0xFF;
				   Color c2= new Color(red,green,blue);
				   g.setColor(c2);
				   g.fillRect(p1.x, p1.y, 1, 1);
				   
			}
			 else if(p1.z<=0 ){
				   float[] hsb = Color.RGBtoHSB(255, 255, 0, null);
				   float hue = hsb[0];
				   float saturation = hsb[1];
				   float brightness = hsb[2];
				   brightness=(float)((brightness*(Math.abs(p1.z ))));
				   int rgb = Color.HSBtoRGB(hue, saturation, brightness);
				   int red = (rgb>>16)&0xFF;
				   int green = (rgb>>8)&0xFF;
				   int blue = rgb&0xFF;
				   Color c2= new Color(red,green,blue);
				   g.setColor(c2);
				   g.fillRect(p1.x, p1.y, 1, 1);
			   }
				   
		   }   
	   
	   }
}
@Override
public void run() {
	// TODO Auto-generated method stub
	long t0=System.currentTimeMillis();
	while(true) 
	{
			if(T)
			{
				double tp=System.currentTimeMillis()-t0;
				double t= (double)(tp)*0.0003;
				Dodaj(t);
				
			}
			else if(G) 
			{
				double tp=System.currentTimeMillis()-czas;
				double t= (double)(tp)*0.5;
				Dodaj_gauss(t);
				
			}
			else if(N) 
			{
				double tp=System.currentTimeMillis()-t0;
				double t= (double)(tp)*0.0003;
				Dodaj_nestacjo(t);
				
			}
			
		try {
			Thread.sleep(1);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.getToolkit().sync();
	}
}

}
