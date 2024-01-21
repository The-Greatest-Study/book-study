package minho.chapter11_proxy_pattern.virtual_proxy;

import javax.swing.*;
import java.awt.*;

public class ImageIconLoadedState implements ImageIconState {

    ImageProxy imageProxy;

    private ImageIconLoadedState(ImageProxy imageProxy) {
        this.imageProxy = imageProxy;
    }

    public static ImageIconLoadedState from(ImageProxy imageProxy) {
        return new ImageIconLoadedState(imageProxy);
    }

    @Override
    public int getIconWidth() {
        ImageIcon imageIcon = imageProxy.getImageIcon();
        return imageIcon.getIconWidth();
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        ImageIcon imageIcon = imageProxy.getImageIcon();
//        imageIcon.paintIcon(c, g, x, y);
        g.drawString("앨범 커버 예시", x + 300, y + 190);
    }

    @Override
    public int getIconHeight() {
        ImageIcon imageIcon = imageProxy.getImageIcon();
        return imageIcon.getIconHeight();
    }
}
