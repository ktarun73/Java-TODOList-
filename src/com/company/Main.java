package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static TodoFunction myTodoList = new TodoFunction();
    public static void main(String[] args) {
        int command = 0;
        boolean exit = false;
        printCommand();
        while (!exit){
            System.out.println("Enter your command/Choice (Press 0 for instructions )");
            command = scanner.nextInt();
            scanner.nextLine();

            switch (command){
                case 0:
                    printCommand();
                    break;
                case 1:
                    myTodoList.printTodoList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    updateItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Please pick only from given command");
            }
        }


    }

    public static void printCommand(){
        System.out.println("0. Print Instructions");
        System.out.println("1. Print all List");
        System.out.println("2. Add Item in Todo List");
        System.out.println("3. To modify item in Todo list");
        System.out.println("4. To remove Item from Todo list");
        System.out.println("5. To search Item from Todo list");
        System.out.println("6. To exit");
    }

    public static void addItem(){
        System.out.println("Enter Item to be added in TODO list");
        myTodoList.addItem(scanner.nextLine());
    }

    public static void updateItem(){
        System.out.println("Enter Item Number");
        int index = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Item to be added");
        String myNewItem = scanner.nextLine();
        myTodoList.updateTodo(index-1 , myNewItem);
    }

    public static void removeItem(){
        System.out.println("Enter item number to be removed");
        int index = scanner.nextInt();
        scanner.nextLine();
        myTodoList.removeItem(index-1);
    }

  public static void searchItem(){
      System.out.println("Enter String to be searched");
      String searchItem = scanner.nextLine();
      if (myTodoList.findItem(searchItem) == null){
          System.out.println("Your Item is not there");
      }
      else {
          System.out.println("Found  "+myTodoList.findItem(searchItem));
      }
  }
}
