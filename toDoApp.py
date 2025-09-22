# toDoApp.py
# Simple To-Do list app in Python

tasks = []  # list to store tasks

def add_task(task):
    """Add a task to the list."""
    tasks.append(task)
    print("\nTask added!") 

def show_tasks():
    """Show all tasks or say none exist."""
    if len(tasks) == 0:
        print("No tasks yet")
    else:
        print("Task List:")
        for i, task in enumerate(tasks):
            print(i+1, ".", task)

def remove_task(tasknumber):
    """Remove a task by its number."""
    tasks.pop(tasknumber)
    print("Task removed!!")

def main():
    """Main program loop."""
    while True:
        # display menu
        print("\n===========================")
        print("    TO-DO LIST (PYTHON)")
        print("===========================")
        print("1. Add Task")
        print("2. Show Tasks")
        print("3. Remove Task")
        print("4. Exit")
        print("===========================")

        ch = input("Enter choice: ")
        # add a new task
        if ch == "1":  
            t = input("Enter task: ")
            add_task(t)
        # show tasks
        elif ch == "2":  
            show_tasks()
        # remove task    
        elif ch == "3":  
            n = int(input("Enter task no to remove: "))
            if 1 <= n <= len(tasks):
                remove_task(n-1)
            else:
                print("Invalid task number!")
        # exit program        
        elif ch == "4":  
            print("Thank you for using the to-do app!")
            break
        # wrong menu choice
        else:  
            print("\nWrong choice!")

main()  # starts program
