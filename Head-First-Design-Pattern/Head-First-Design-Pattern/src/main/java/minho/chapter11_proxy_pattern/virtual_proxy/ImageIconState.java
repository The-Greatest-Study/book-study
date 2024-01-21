package minho.chapter11_proxy_pattern.virtual_proxy;

import java.awt.*;

public interface ImageIconState {

    int getIconWidth();

    void paintIcon(Component c, Graphics g, int x, int y);

    int getIconHeight();
}
