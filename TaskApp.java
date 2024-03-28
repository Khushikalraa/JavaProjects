import java.util.*;

class Task{
    
    String title;
    String desc;
    String date;
    String status;

    Task(String title, String desc, String date,String status){
        this.title=title;
        this.desc=desc;
        this.date=date;
        this.status=status;

        
        }
        String getTitle(){
            return title;
    }

    String getStatus(){
        return status;
    }

    String getDesc(){
        return desc;
    }

    String getDate(){
        return date;
    }
}
   



class TaskManager{

    List<Task> tasks;

    public TaskManager(){
        this.tasks = new ArrayList<>();
    }

    void add(Task task){
        tasks.add(task);

    }

    void delete(Task task){
        tasks.remove(task);
    }

    void edit(String title, String newdesc, String newdate, String newstatus){
        for(Task task: tasks){
            if(task.getTitle().equalsIgnoreCase(title)){
                task.desc=newdesc;
                task.date=newdate;
                task.status=newstatus;
                System.out.println("Task edited successfully bro!");

                System.out.println();
                return;

            }

        }
        System.out.println("not found");

    }
    void filter(String status){
        System.out.println("Tasks with status " + status +":");
        for(Task task: tasks){
            if(task.getStatus().equalsIgnoreCase(status)){
                System.out.println(task.getTitle()+" "+task.getDesc()+" "+task.getDate()+" "+task.getStatus());

                System.out.println();
            }
        }


    }

    void view(){
        for(Task task: tasks){
            System.out.println(task.title +" "+ task.date+ " "+ task.status+ " "+task.desc);

            System.out.println();
        }
    }

}

public class TaskApp{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();

        taskManager.add(new Task("Task 1", "Description 1", "2024-04-01", "To Do"));
        taskManager.add(new Task("Task 2", "Description 2", "2024-04-02", "In Progress"));

        taskManager.view();

        taskManager.edit("Task 1","go go go learn java","2024-05-30","completed");

        taskManager.view();

        taskManager.filter("completed");
    }
}
