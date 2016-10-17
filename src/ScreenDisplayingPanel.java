import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

//import client.mainGUI;

public class ScreenDisplayingPanel extends JPanel
{

	public BufferedImage screenImage;
	DesktopInfo targetDesktopInfo,localDesktopInfo;
	
	ScreenDisplayingPanel(DesktopInfo targetDesktopInfo)
	{
		this.targetDesktopInfo = targetDesktopInfo;
		localDesktopInfo = new DesktopInfo();
		// set panel size
		super.setSize(targetDesktopInfo.SCREEN_WIDTH,
				targetDesktopInfo.SCREEN_HEIGHT);
		this.setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		// screen painting
		super.paint(g);
		if(screenImage != null){
//			g.drawImage(screenImage, 0, 0,localDesktopInfo.SCREEN_WIDTH,localDesktopInfo.SCREEN_HEIGHT-15, null);
			g.drawImage(screenImage,0,0,null);
		}
	}
	
	
}
