package ua.edu.sumdu.j2se.karelin.tasks;

public class TaskListFactory {
    public static AbstractTaskList createTaskList(ListTypes.types type){
    switch (type){
        case ARRAY:
            return new ArrayTaskList();

        case LINKED:
            return new LinkedTaskList();
    }
    return null;
    }
}
