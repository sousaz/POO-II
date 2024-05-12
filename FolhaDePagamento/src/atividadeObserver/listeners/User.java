package atividadeObserver.listeners;

import atividadeObserver.publisher.Channel;
import atividadeObserver.video.Video;

public class User implements EventListener{
    private String username;
    public User(String username){
        this.username = username;
    }

    @Override
    public void notify(Video video){
        System.out.println(username + " received notification about new video: " + video.getTitle());
    }

    public void subscribeInChannel(Channel channel){
        channel.subscribe(this);
    }

    public void unsubscribeInChannel(Channel channel){
        channel.unsubscribe(this);
    }
}
