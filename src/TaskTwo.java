import java.util.ArrayList;

public class TaskTwo {
    public TaskTwo(){
        tasks = new ArrayList<>();
    }

    private ArrayList<String> tasks;

    public void add(String task) {
        tasks.add(task);
    }
    public void print() {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(tasks.get(i) + " " + (i + 1));
        }
    }
    public void remove(int number){
        tasks.remove(number);
    }

    }
