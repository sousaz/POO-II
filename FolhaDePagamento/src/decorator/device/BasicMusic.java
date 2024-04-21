package decorator.device;

import decorator.interfaces.Music;

public class BasicMusic implements Music {
    @Override
    public void play(){
        System.out.println("PLaying a basic music...");
    }
}
