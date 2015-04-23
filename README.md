#Kindle Emulator with KDK#

I can not wait to release [KDK](http://amazon.com/kdk/) ;-P

# News #

## NES emulator released! ##

https://youtu.be/bKriwqCYEQA

[source code](http://code.google.com/p/umjammer/source/browse/trunk/vavi-apps-nes-kdk)

[original](http://www.nescafeweb.com/)

# Kindlet #

```java

public class KindleTestApp implements Kindlet {

    private MyView view;

    private KindletContext context;

    /** */
    public void create(KindletContext context) {
        try {
            view = new MyView();
            this.context = context;
            this.context.getRootContainer().add(view); // i guess...
        } catch (Exception e) {
e.printStackTrace(System.err);
        }
    }

    /** */
    public void start() {
        new Thread(view).start();
    }

    /* */
    public void stop() {
    }

    /* */
    public void destroy() {
    }

    /** */
    private class MyView extends KComponent implements Runnable {
      :
```

<a href="http://www.flickr.com/photos/52807817@N00/4439590647/" title="Kindle Emulator by umjammer, on Flickr"><img src="http://farm3.static.flickr.com/2730/4439590647_5349b26e0a.jpg" width="408" height="500" alt="Kindle Emulator" /></a>

## How to Run ##

```shell
 $ # java vavi.apps.kindlet.KindletViewer your_Kindlet_class
 $ java vavi.apps.kindlet.KindletViewer vavi.games.tetris.TetrisApp
```

You can download Tetris for KDK from [here](http://code.google.com/p/umjammer/source/browse/trunk/vavi-games-tetris-kdk)!

<a href="http://www.flickr.com/photos/52807817@N00/4458856225/" title="Kindle Tetris by umjammer, on Flickr"><img src="http://farm5.static.flickr.com/4025/4458856225_46f0b87fc4.jpg" width="444" height="500" alt="Kindle Tetris" /></a>
