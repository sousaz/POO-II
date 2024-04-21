package composite;

import composite.composite.CompositeTask;
import composite.interfaces.Task;

import java.util.ArrayList;
import java.util.List;

public class Issue {
    private List<Task> tasks;

    public Issue() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task){
        this.tasks.add(task);
    }

    public void removeTask(Task task){
        this.tasks.remove(task);
    }

    public void getTasks(){
        for (Task task : tasks) {
            task.printTask(0);
            System.out.println("--------------------------------------");
        }
    }

}
