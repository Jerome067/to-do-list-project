# toDoApp.py

tasks = []

def add_task(task): # <--- alligned this colon with def
    """Add a task to the tasks list and print confirmation."""
    tasks.append(task)
    print("\nTask added!") 

def show_tasks():
    """Display all tasks in the list, or a message if empty."""
    if len(tasks) == 0:
        print("No tasks yet")
    else:
        print("Task List:")
        for i, task in enumerate(tasks):
            print(i+1, ".", task)

def remove_task(tasknumber):
    """
    Remove a task from the tasks list by its index (0-based).

    Args:
        tasknumber (int): The 0-based index of the task to remove.
    """
    tasks.pop(tasknumber)
    print("Task removed!!")

def main():
    """Main loop for the to-do list application.
    """
    while True:
        print("\n===========================")
        print("    TO-DO LIST (PYTHON)")
        print("===========================")

        print("1. Add Task")
        print("2. Show Tasks")
        print("3. Remove Task")
        print("4. Exit")
        print("===========================")
        ch = input("Enter choice: ")
        if ch == "1":
            t = input("Enter task: ")
            add_task(t)
        elif ch == "2":
            show_tasks()
        elif ch == "3":
            n = int(input("Enter task no to remove: "))
            if 1 <= n <= len(tasks):
                remove_task(n-1)
            else:
                print("Invalid task number!")
        elif ch == "4":
            print("Thak you for using the to-do app!")
            break
        else:
            print("\nWrong choice!")

main()
