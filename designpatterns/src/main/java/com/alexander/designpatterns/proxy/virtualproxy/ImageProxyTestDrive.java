package com.alexander.designpatterns.proxy.virtualproxy;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Hashtable;

import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class ImageProxyTestDrive {

	private ImageComponent imageComponent;
	private JFrame frame = new JFrame("CD Cover Viewer");
	private JMenuBar menuBar;
	private JMenu menu;
	private Hashtable<String, String> cds = new Hashtable<String, String>();
	
	public static void main(String[] args) throws Exception {
		ImageProxyTestDrive testDrive = new ImageProxyTestDrive();
	}
	
	public ImageProxyTestDrive() throws Exception {
		//set up frame and menus
		
		cds.put("Anthrax", "http://www.myfreewallpapers.net/comics/wallpapers/judge-dredd-anthrax.jpg");
		cds.put("Dio", "http://upload.wikimedia.org/wikipedia/en/8/8d/Dio_Warner.JPG");
		cds.put("Dido", "http://images.absolutenow.com/rp/Dido_JS5765.jpg");
		cds.put("Poison", "http://upload.wikimedia.org/wikipedia/commons/2/2c/Poison.JPG");
		cds.put("Journey", "http://upload.wikimedia.org/wikipedia/commons/7/73/Journey_band.JPG");
		cds.put("Weird Al Yankovic", "http://cdn.songonlyrics.com/wp-content/uploads/2011/06/weird_al-Single-Track.jpg");
		cds.put("Blink 182", "http://www.poppunkbands.co.uk/wp-content/uploads/2011/07/Blink-182-2.gif");
		/*
		cds.put("Ambient: Music for Airports","http://images.amazon.com/images/P/B000003S2K.01.LZZZZZZZ.jpg");
        cds.put("Buddha Bar","http://images.amazon.com/images/P/B00009XBYK.01.LZZZZZZZ.jpg");
        cds.put("Ima","http://images.amazon.com/images/P/B000005IRM.01.LZZZZZZZ.jpg");
        cds.put("Karma","http://images.amazon.com/images/P/B000005DCB.01.LZZZZZZZ.gif");
        cds.put("MCMXC A.D.","http://images.amazon.com/images/P/B000002URV.01.LZZZZZZZ.jpg");
        cds.put("Northern Exposure","http://images.amazon.com/images/P/B000003SFN.01.LZZZZZZZ.jpg");
        cds.put("Selected Ambient Works, Vol. 2","http://images.amazon.com/images/P/B000002MNZ.01.LZZZZZZZ.jpg");
		*/
//		URL initialURL = new URL(cds.get("Ambient: Music for Airports"));
		URL initialURL = new URL(cds.get("Anthrax"));
		menuBar = new JMenuBar();
		menu = new JMenu("Random CDs");
		menuBar.add(menu);
		frame.setJMenuBar(menuBar);
		
		for (Enumeration<String> e = cds.keys(); e.hasMoreElements();){
			String name = e.nextElement();
			JMenuItem menuItem = new JMenuItem(name);
			menu.add(menuItem);
			menuItem.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent event){
//					System.out.println("Have an action");
					imageComponent.setIcon(new ImageProxy(getCDUrl(event.getActionCommand())));
					frame.repaint();
//					System.out.println("Asked to repaint the frame");
				}
			});
		}
		
		Icon icon = new ImageProxy(initialURL);
		imageComponent = new ImageComponent(icon);
		frame.getContentPane().add(imageComponent);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,600);
		frame.setVisible(true);
	}
	
	URL getCDUrl(String name){
		try {
			return new URL(cds.get(name));
		} catch (MalformedURLException e){
			e.printStackTrace();
			return null;
		}
	}
}
