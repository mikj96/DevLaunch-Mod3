//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TaskOne example1 = new TaskOne();

        TaskTwo todolist = new TaskTwo();
        todolist.add("Raz");
        todolist.add("Dwa");
        todolist.print();
        todolist.remove(0);
        todolist.print();
    }
}