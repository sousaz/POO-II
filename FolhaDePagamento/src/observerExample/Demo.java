package observerExample;

import observerExample.editor.Editor;
import observerExample.listeners.EmailNotificationListener;
import observerExample.listeners.LogOpenListener;


public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("observerExample"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try{
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
