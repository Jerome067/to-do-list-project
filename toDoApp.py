# toDoApp.py

tasks = []

def addtask(task): # <--- alligned this colon with def
    tasks.append(task)
    print("\nTask added!") 

def showTasks():
    if len(tasks) == 0:
        print("No tasks yet")
    else:
        for i in range(len(tasks)):
            print(i+1, ".", tasks[i])

def removetask(tasknumber):
    tasks.pop(tasknumber)
    print("Task removed!!")

def main():
    while True:
        print("1. Add Task")
        print("2. Show Tasks")
        print("3. Remove Task")
        print("4. Exit")
        ch = input("Enter choice: ")
        if ch == "1":
            t = input("Enter task: ")
            addtask(t)
        elif ch == "2":
            showTasks()
        elif ch == "3":
            n = int(input("Enter task no to remove: "))
            if 1 <= n <= len(tasks):
                removetask(n-1)
            else:
                print("Invalid task number!")
        elif ch == "4":
            break
        else:
            print("\nWrong choice!")

main()
