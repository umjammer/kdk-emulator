# Kindle Emulator with KDK

I can not wait for the release of [KDK](http://amazon.com/kdk/) ;-P

# News

* [Official](http://www.klab.com/jp/press/detail/id=4825)
* [GIZMODE](http://gizmodo.com/5518727/the-kindle-plays-nes-games-like-a-penguin-soars)
* [TechCrunch](https://techcrunch.com/2010/04/16/video-japanese-company-shows-super-mario-bros-on-kindle-emulator/)
* [Ajiajin](http://asiajin.com/blog/2010/04/14/klab-releases-amazon-kindle-compatible-emulator-in-open-source/)
* [Kotaku](http://kotaku.com/5518573/what-would-super-mario-bros-on-kindle-look-like)

## NES emulator released! ##

https://youtu.be/bKriwqCYEQA

[source code](https://github.com/umjammer/vavi-apps-nes-kdk)

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

You can download Tetris for KDK from [here](http://github.com/umjammer/vavi-games-tetris-kdk)!

<a href="http://www.flickr.com/photos/52807817@N00/4458856225/" title="Kindle Tetris by umjammer, on Flickr"><img src="http://farm5.static.flickr.com/4025/4458856225_46f0b87fc4.jpg" width="444" height="500" alt="Kindle Tetris" /></a>
