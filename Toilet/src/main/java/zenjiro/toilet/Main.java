package zenjiro.toilet;

import java.awt.AWTException;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Main {

    public static void main(final String[] args) throws IOException, AWTException {
        final SystemTray tray = SystemTray.getSystemTray();
        final TrayIcon icon = new TrayIcon(ImageIO.read(Main.class.getResourceAsStream("/blue.jpg")));
        icon.setImageAutoSize(true);
        icon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent event) {
                System.out.println(event);
                tray.remove(icon);
            }
        });
        tray.add(icon);
    }
}
