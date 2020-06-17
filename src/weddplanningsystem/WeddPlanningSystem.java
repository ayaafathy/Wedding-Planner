
package weddplanningsystem;
import GUI.*;
import Users.*;
import WeddVendors.*;
import WeddVendors.Entertainment.*;
import WeddVendors.Beauty.*;
import WeddVendors.Decorations.*;
import WeddPayments.*;
import System.*;
import java.io.*;
import java.util.*;
import javax.swing.JFrame;

public class WeddPlanningSystem implements Serializable{
   
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        
Florists fl = new Florists();
fl.load();
FloristsDashBoardGUI f = new FloristsDashBoardGUI();
f.setVisible(false);

DJ dj = new DJ();
dj.load();
DJDashBoardGUI d = new DJDashBoardGUI();
d.setVisible(false);

Photography photo = new Photography();
photo.load();
PhotographyDashBoardGUI pb = new PhotographyDashBoardGUI();
pb.setVisible(false);

//Transportation tr = new Transportation();
//tr.load();
//TransDashBoardGUI tb = new TransDashBoardGUI();
//tb.setVisible(false);

Officiant of = new Officiant();
of.load();
OfficiantDashBoardGUI ob = new OfficiantDashBoardGUI();
ob.setVisible(false);


Hotel h =new Hotel();
h.load();
HotelDashboard hb = new HotelDashboard();
hb.setVisible(false);


Theme tt = new Theme();
tt.load();
ThemeDashBoardGUI tbs = new ThemeDashBoardGUI();
tbs.setVisible(false);

PositionFrame pf = new PositionFrame();
pf.setVisible(true);
 } 
}

