package atividadeObserver;

import atividadeObserver.listeners.User;
import atividadeObserver.publisher.Channel;
import atividadeObserver.video.Video;

public class Main {
    public static void main(String[] args) {
        Channel ch1 = new Channel("ESASport");
        Channel ch2 = new Channel("politerio");

        User user1 = new User("oteleco");
        User user2 = new User("malaciano");

        user1.subscribeInChannel(ch1);
        user2.subscribeInChannel(ch1);
        user2.subscribeInChannel(ch2);

        ch1.publishVideo(new Video("OMG what a goal!!!!"));
        ch2.publishVideo(new Video("JESUS IS BACK"));
    }
}
