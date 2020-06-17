/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Image;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Rawan Khaled
 */
public class projNotification {
    
    public projNotification()  {
    }

    SystemTray tray;
    Image image;
    TrayIcon trayIcon;
    
    
    public void displayTray() {
        tray = SystemTray.getSystemTray();
        image = Toolkit.getDefaultToolkit().createImage("icon.png");
        trayIcon = new TrayIcon(image, "Tray Demo");
        trayIcon.setImageAutoSize(true);
        trayIcon.setToolTip("System tray icon demo");
        try {
            tray.add(trayIcon);
        } catch (Exception ex) {
            Logger.getLogger(projNotification.class.getName()).log(Level.SEVERE, null, ex);
        }

        trayIcon.displayMessage(" Wedding Planning System", "Your Wedding Plan is Totally confirmed ... Congrats !! ", TrayIcon.MessageType.INFO);
    }


}