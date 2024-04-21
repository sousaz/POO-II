package decorator.decoratos;

import decorator.interfaces.Music;

public class SoundEffectsDecorator extends MusicDecorator{
    public SoundEffectsDecorator(Music decoratorMusic){
        super(decoratorMusic);
    }

    @Override
    public void play(){
        super.play();
        applySoundEffects();
    }

    public void applySoundEffects(){
        System.out.println("Applying sound effects...");
    }
}
