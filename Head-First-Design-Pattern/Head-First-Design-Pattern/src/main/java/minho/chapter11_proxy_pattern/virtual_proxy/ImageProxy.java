package minho.chapter11_proxy_pattern.virtual_proxy;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
import lombok.Getter;

public class ImageProxy implements Icon {

    /*
     * volatile
     *      - Java 변수를 Main Memory에 저장하겠다라는 것을 명시하는 것
     *      - 매번 변수의 값을 Read할 때마다 CPU cache에 저장된 값이 아닌 Main Memory에서 읽는 것
     *      - 또한 변수의 값을 Write할 때마다 Main Memory에 까지 작성하는 것
     *      - Multi Thread 환경에서 하나의 Thread만 read & write하고 나머지 Thread가 read하는 상황에서 가장 최신의 값을 보장
     */
    @Getter volatile ImageIcon imageIcon;
    @Getter final URL imageURL;
    Thread retrievalThread;
    boolean retrieving = false;

    ImageIconState state;
    @Getter ImageIconState imageIconLoadedState;
    ImageIconState imageIconUnloadedState;

    private ImageProxy(URL imageURL) {
        this.imageURL = imageURL;

        imageIconLoadedState = ImageIconLoadedState.from(this);
        imageIconUnloadedState = ImageIconUnloadedState.from(this);
        this.state = imageIconUnloadedState;
    }

    public static ImageProxy from(URL imageURL) {
        return new ImageProxy(imageURL);
    }

    @Override
    public int getIconWidth() {
        //        return (imageIcon != null) ? imageIcon.getIconWidth() : 800;
        return state.getIconWidth();
    }

    public synchronized void setImageIcon(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        //        if(imageIcon != null) {
        //            imageIcon.paintIcon(c, g, x, y);
        //        } else {
        //            g.drawString("앨범 커버를 불러오는 중입니다. 잠시만 기다려 주세요.", x + 300, y + 190);
        //
        //            if(!retrieving) {
        //                retrieving = true;
        //
        //                retrievalThread = new Thread(() -> {
        //                    try {
        //                        setImageIcon(new ImageIcon(imageURL, "Album Cover"));
        //                        c.repaint();
        //                    } catch (Exception e) {
        //                        e.printStackTrace();
        //                    }
        //                });
        //                retrievalThread.start();
        //            }
        //        }
        state.paintIcon(c, g, x, y);
    }

    @Override
    public int getIconHeight() {
        //        return (imageIcon != null) ? imageIcon.getIconHeight() : 600;
        return state.getIconHeight();
    }

    public boolean isRetrieving() {
        return retrieving;
    }

    public void setRetrieving(boolean retrieving) {
        this.retrieving = retrieving;
    }

    public void setRetrievalThread(Thread thread) {
        this.retrievalThread = thread;
    }

    public void startThread() {
        this.retrievalThread.start();
    }

    public void updateState(ImageIconState state) {
        this.state = state;
    }
}
