package decorator.decoratos;

import decorator.interfaces.Music;

public class EqualizationDecorator extends MusicDecorator{
    public EqualizationDecorator(Music decoratorMusic){
        super(decoratorMusic);
    }

    @Override
    public void play(){
        super.play();
        applyEqualization();
    }

    public void applyEqualization(){
        System.out.println("Applying equalization...");
    }
}
