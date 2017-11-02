/*
 * http://www.java2s.com/Code/JavaAPI/javax.swing.border/SubclassAbstractBordertocreateImageBorder.htm
 */

package vavi.apps.kindlet;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;

import javax.swing.border.AbstractBorder;


/**
 * @see http://www.java2s.com/Code/JavaAPI/javax.swing.border/SubclassAbstractBordertocreateImageBorder.htm
 */
public class ImageBorder extends AbstractBorder {

    Image image;

    Insets insets;

    public ImageBorder(Image image) {
        this.image = image;
    }

    public void setInsets(Insets insets) {
        this.insets = insets;
    }

    public Insets getBorderInsets(Component c) {
        if (insets != null) {
            return insets;
        } else {
            return new Insets(30, 30, 30, 30);
        }
    }

    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        g.drawImage(image, 0, 0, null);
    }
}

/* */