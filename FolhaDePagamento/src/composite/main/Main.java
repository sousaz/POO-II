package composite.main;

import composite.Issue;
import composite.composite.CompositeTask;
import composite.composite.SimpleTask;

public class Main {
    public static void main(String[] args) {
        SimpleTask st1 = new SimpleTask("do anything", "i need do anything", "when giving");
        SimpleTask st2 = new SimpleTask("do anything2", "i need do anything2", "when giving2");
        SimpleTask st3 = new SimpleTask("do anything3", "i need do anything3", "when giving3");
        CompositeTask ct1 = new CompositeTask("Do anything composite");
        ct1.addTask(st2);
        ct1.addTask(st3);

        SimpleTask st4 = new SimpleTask("do anything4", "i need do anything4", "when giving4");
        SimpleTask st5 = new SimpleTask("do anything5", "i need do anything5", "when giving5");
        SimpleTask st6 = new SimpleTask("do anything6", "i need do anything6", "when giving6");
        CompositeTask ct2 = new CompositeTask("Do anything composite");
        ct2.addTask(st4);
        ct2.addTask(st5);
        ct2.addTask(st6);

        ct1.addTask(ct2);

        Issue task = new Issue();
        task.addTask(st1);
        task.addTask(ct1);

        task.getTasks();
    }
}
