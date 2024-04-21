package composite.interfaces;

public interface Task {
    String getTitle();
    String getDescription();
    String getTerm();
    void printTask(int level);
}
