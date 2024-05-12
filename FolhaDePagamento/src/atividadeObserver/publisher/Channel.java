package atividadeObserver.publisher;

import atividadeObserver.listeners.EventListener;
import atividadeObserver.video.Video;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Channel {
    private String name;
    private List<EventListener> subscribers;

    public Channel(String name){
        this.name = name;
        this.subscribers = new ArrayList<>();
    }

    public void publishVideo(Video video){
        System.out.println("New vídeo published in channel " + this.name + ": " + video.getTitle());
        notify(video);
    }

    public void subscribe(EventListener eventListener){
        subscribers.add(eventListener);
    }

    public void unsubscribe(EventListener eventListener){
        subscribers.remove(eventListener);
    }

    public void notify(Video video){
        for(EventListener subscribe : subscribers){
            subscribe.notify(video);
        }
    }
}
