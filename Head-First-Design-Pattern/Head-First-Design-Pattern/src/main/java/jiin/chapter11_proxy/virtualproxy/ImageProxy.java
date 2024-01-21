package jiin.chapter11_proxy.virtualproxy;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ImageProxy implements Icon {
    volatile ImageIcon imageIcon;
    final URL imageUrl;
    Thread retrievalThread;
    boolean retrieving = false;

    public ImageProxy(URL imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public int getIconWidth() {
        if (imageIcon != null) {
            return imageIcon.getIconWidth();
        } else {
            return 800;
        }
    }

    @Override
    public int getIconHeight() {
        if (imageIcon != null) {
            return imageIcon.getIconHeight();
        } else {
            return 600;
        }
    }

    @Override
    public void paintIcon(Component component, Graphics graphics, int x, int y) {
        if (imageIcon != null) {
            imageIcon.paintIcon(component, graphics, x, y);
        } else {
            graphics.drawString("앨범 커버를 불러오는 중입니다. 잠시만 기다려 주세요.", x + 300, y + 190);
            if (!retrieving) {
                retrieving = true;

                retrievalThread =
                        new Thread(
                                new Runnable() {
                                    @Override
                                    public void run() {
                                        try {
                                            imageIcon = new ImageIcon(imageUrl, "Album Cover");
                                            component.repaint();
                                        } catch (Exception e) {
                                            e.printStackTrace();
                                        }
                                    }
                                });
                retrievalThread.start();
            }
        }
    }
}
