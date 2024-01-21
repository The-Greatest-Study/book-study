package minho.chapter11_proxy_pattern.virtual_proxy;

import java.awt.*;
import javax.swing.*;

public class ImageIconUnloadedState implements ImageIconState {

    ImageProxy imageProxy;

    private ImageIconUnloadedState(ImageProxy imageProxy) {
        this.imageProxy = imageProxy;
    }

    public static ImageIconUnloadedState from(ImageProxy imageProxy) {
        return new ImageIconUnloadedState(imageProxy);
    }

    @Override
    public int getIconWidth() {
        return 800;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        g.drawString("앨범 커버를 불러오는 중입니다. 잠시만 기다려 주세요.", x + 300, y + 190);

        if (!imageProxy.isRetrieving()) {
            imageProxy.setRetrieving(true);

            Thread retrievalThread =
                    new Thread(
                            () -> {
                                try {
                                    imageProxy.setImageIcon(
                                            new ImageIcon(imageProxy.getImageURL(), "Album Cover"));
                                    imageProxy.updateState(imageProxy.getImageIconLoadedState());
                                    c.repaint();
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            });
            imageProxy.setRetrievalThread(retrievalThread);
            imageProxy.startThread();
        }
    }

    @Override
    public int getIconHeight() {
        return 600;
    }
}
