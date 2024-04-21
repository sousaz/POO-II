package decorator.main;

import decorator.decoratos.EqualizationDecorator;
import decorator.decoratos.SoundEffectsDecorator;
import decorator.device.BasicMusic;
import decorator.interfaces.Music;

public class Main {
    public static void main(String[] args) {
        Music music = new BasicMusic();
        music.play();
        System.out.println();

        music = new EqualizationDecorator(music);
        music.play();
        System.out.println();

        music = new SoundEffectsDecorator(music);
        music.play();

    }
}
