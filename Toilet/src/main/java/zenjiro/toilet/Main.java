package zenjiro.toilet;

import java.awt.AWTException;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Main {

    public static void main(final String[] args) throws IOException, AWTException {
        final SystemTray tray = SystemTray.getSystemTray();
        final TrayIcon icon = new TrayIcon(ImageIO.read(Main.class.getResourceAsStream("/blue.jpg")));
        icon.setImageAutoSize(true);
        tray.add(icon);
    }
}
