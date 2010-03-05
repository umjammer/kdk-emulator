/*
 * Copyright (c) 2010 by Naohide Sano, All rights reserved.
 *
 * Programmed by Naohide Sano
 */

package vavi.apps.kindlet;

import javax.swing.JFrame;

import com.amazon.kindle.kindlet.Kindlet;
import com.amazon.kindle.kindlet.KindletContext;


/**
 * KindletViewer. 
 *
 * @author <a href="mailto:vavivavi@yahoo.co.jp">Naohide Sano</a> (nsano)
 * @version 0.00 2010/03/05 nsano initial version <br>
 */
public class KindletViewer {

    /**
     * @param args
     */
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame();
        frame.setTitle("Kindlet Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        KindletContext context = new KindletContextImpl(frame); 

        Kindlet kindlet = (Kindlet) Class.forName(args[0]).newInstance();
        kindlet.create(context);

        frame.pack();
        frame.setVisible(true);

        kindlet.start();
    }
}

/* */
