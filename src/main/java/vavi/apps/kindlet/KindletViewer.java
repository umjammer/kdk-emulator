/*
 * Copyright (c) 2010 by Naohide Sano, All rights reserved.
 *
 * Programmed by Naohide Sano
 */

package vavi.apps.kindlet;

import java.awt.Dimension;
import java.awt.Insets;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

import com.amazon.kindle.kindlet.Kindlet;
import com.amazon.kindle.kindlet.KindletContext;


/**
 * KindletViewer.
 *
 * @author <a href="mailto:umjammer@gmail.com">Naohide Sano</a> (nsano)
 * @version 0.00 2010/03/05 nsano initial version <br>
 */
public class KindletViewer {

    /**
     * @param args
     */
    public static void main(String[] args) throws Exception {
        BufferedImage image = ImageIO.read(KindletViewer.class.getResource("/kindle2.png"));
        ImageBorder border = new ImageBorder(image);
        border.setInsets(new Insets(92, 116, 102, 118));

        Dimension size = new Dimension(600, 800);
        JScrollPane pane = new JScrollPane();
        pane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        pane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        pane.setPreferredSize(size);
        pane.setMaximumSize(size);
        pane.setMinimumSize(size);
        pane.setSize(size);
        pane.setViewportBorder(border);

        JFrame frame = new JFrame();
        frame.setTitle("Kindlet Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(image.getWidth(), image.getHeight()));

        frame.getContentPane().add(pane);

        KindletContext context = new KindletContextImpl(pane.getViewport());

        Kindlet kindlet = (Kindlet) Class.forName(args[0]).newInstance();
        kindlet.create(context);

        frame.pack();
        frame.setVisible(true);

        kindlet.start();
    }
}

/* */
