package decorator.decoratos;

import decorator.interfaces.Music;

public abstract class MusicDecorator implements Music {
    protected Music decoratorMusic;

    public MusicDecorator(Music decoratorMusic){
        this.decoratorMusic = decoratorMusic;
    }

    @Override
    public void play(){
        decoratorMusic.play();
    }


}
