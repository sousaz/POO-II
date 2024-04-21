package composite.composite;

import composite.interfaces.Task;

public class SimpleTask implements Task {
    private String title;
    private String description;
    private String term;

    public SimpleTask(String title, String description, String term) {
        this.title = title;
        this.description = description;
        this.term = term;
    }
    @Override
    public String getTitle() {
        return title;
    }
    @Override
    public String getDescription() {
        return description;
    }
    @Override
    public String getTerm() {
        return term;
    }
    @Override
    public void printTask(int level){
        StringBuilder prefix = new StringBuilder();
        for (int i = 0; i < level; i++) {
            prefix.append("| ");
        }
        System.out.println(prefix + "Title: " + this.title);
        System.out.println(prefix + "Description: " + this.description);
        System.out.println(prefix + "Term: " + this.term);
    }
}
