package composite.composite;

import composite.interfaces.Task;

import java.util.ArrayList;
import java.util.List;

public class CompositeTask implements Task {
    private String title;
    private List<Task> tasks;

    public CompositeTask(String title) {
        this.title = title;
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task){
        this.tasks.add(task);
    }

    public void removeTask(Task task){
        this.tasks.remove(task);
    }
    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public String getDescription(){
        StringBuilder descricao = new StringBuilder();
        for (Task tarefa : tasks) {
            descricao.append(tarefa.getDescription()).append("\n");
        }
        return descricao.toString();
    }

    @Override
    public String getTerm() {
        StringBuilder term = new StringBuilder();
        for (Task task : tasks) {
            term.append(task.getTerm()).append("\n");
        }
        return term.toString();
    }

    @Override
    public void printTask(int level){
        StringBuilder prefix = new StringBuilder();
        for (int i = 0; i < level; i++) {
            prefix.append("| ");
        }
        System.out.println(prefix + "Title: " + this.title);
        for (Task task : tasks) {
            task.printTask(level + 1);
        }
    }

}
