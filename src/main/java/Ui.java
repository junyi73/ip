public class Ui {

    public void printWelcome() {
        String welcomeMessage = "____________________________________________________________\n"
                + " Hello! I'm Noisy\n"
                + " What can I do for you?\n"
                + "____________________________________________________________\n"
                + " Bye. Hope to see you again soon!\n"
                + "____________________________________________________________";
        System.out.println(welcomeMessage);
    }

    public void printGoodbye() {
        String goodbyeMessage = "____________________________________________________________\n"
                + " Bye human :(\n"
                + "____________________________________________________________";
        System.out.println(goodbyeMessage);
    }

    public void printList(TaskList taskList) {
        String echoMessage = "____________________________________________________________\n" +
                "Here are the tasks in your list\n";
        for (int i = 0; i < taskList.getListSize(); i++) {
            int taskIndex = i + 1;
            echoMessage += taskIndex + ". " + taskList.getTask(i) + "\n";
        }
        System.out.println(echoMessage);
    }

    public void printMark(int i, TaskList taskList) {
        taskList.markDoneFromList(i - 1);
        String markString = "____________________________________________________________\n" +
                "Nice! I've marked this task as done:\n" +
                taskList.getTask(i - 1) + "\n" +
                "____________________________________________________________\n";
        System.out.println(markString);
    }

    public void printDelete(int i, TaskList taskList) {
        Task deletedTask = taskList.getTask(i - 1);
        taskList.deleteFromList(i - 1);
        String deleteMessage = "____________________________________________________________\n" +
                " Noted. I've removed this task:\n" +
                deletedTask + "\n" +
                "Now you have " + taskList.getListSize() + " tasks in the list\n" +
                "____________________________________________________________\n";
    }

    public void printAdd(int i, TaskList taskList) {

    }
}
