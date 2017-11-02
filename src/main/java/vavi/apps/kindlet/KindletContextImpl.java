/*
 * Copyright (c) 2010 by Naohide Sano, All rights reserved.
 *
 * Programmed by Naohide Sano
 */

package vavi.apps.kindlet;

import java.awt.Container;
import java.io.File;

import com.amazon.kindle.kindlet.KindletContext;
import com.amazon.kindle.kindlet.net.Connectivity;
import com.amazon.kindle.kindlet.security.SecureStorage;
import com.amazon.kindle.kindlet.ui.KMenu;
import com.amazon.kindle.kindlet.ui.KProgress;
import com.amazon.kindle.kindlet.ui.KTextOptionPane;
import com.amazon.kindle.kindlet.ui.KindletUIResources;
import com.amazon.kindle.kindlet.ui.OrientationController;


/**
 * KindletContextImpl. 
 *
 * @author <a href="mailto:vavivavi@yahoo.co.jp">Naohide Sano</a> (nsano)
 * @version 0.00 2010/03/05 nsano initial version <br>
 */
public class KindletContextImpl implements KindletContext {

    private Container container;

    public KindletContextImpl(Container container) {
        this.container = container;
    }

    /* @see com.amazon.kindle.kindlet.KindletContext#getConnectivity() */
    public Connectivity getConnectivity() {
        // TODO Auto-generated method stub
        return null;
    }

    /* @see com.amazon.kindle.kindlet.KindletContext#getHomeDirectory() */
    public File getHomeDirectory() {
        return new File(System.getProperty("user.home"));
    }

    /* @see com.amazon.kindle.kindlet.KindletContext#getOrientationController() */
    public OrientationController getOrientationController() {
        // TODO Auto-generated method stub
        return null;
    }

    /* @see com.amazon.kindle.kindlet.KindletContext#getProgressIndicator() */
    public KProgress getProgressIndicator() {
        // TODO Auto-generated method stub
        return null;
    }

    /* */
    public Container getRootContainer() {
        return container;
    }

    /* @see com.amazon.kindle.kindlet.KindletContext#getSecureStorage() */
    public SecureStorage getSecureStorage() {
        // TODO Auto-generated method stub
        return null;
    }

    /* @see com.amazon.kindle.kindlet.KindletContext#getUIResources() */
    public KindletUIResources getUIResources() {
        // TODO Auto-generated method stub
        return null;
    }

    /* @see com.amazon.kindle.kindlet.KindletContext#setMenu(com.amazon.kindle.kindlet.ui.KMenu) */
    public void setMenu(KMenu menu) {
    }

    /* @see com.amazon.kindle.kindlet.KindletContext#setSubTitle(java.lang.String) */
    public void setSubTitle(String subtitle) {
        // TODO Auto-generated method stub
        
    }

    /* @see com.amazon.kindle.kindlet.KindletContext#setTextOptionPane(com.amazon.kindle.kindlet.ui.KTextOptionPane) */
    public void setTextOptionPane(KTextOptionPane option) {
        // TODO Auto-generated method stub
        
    }
}

/* */
