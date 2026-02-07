import java.util.Scanner;

public class StackOperations {
    public static void main(String[] args) {
        int stack[] = new int[10];
        int top = -1;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Stack: \n 1. Push\n 2. Pop\n 3. Peek\n 4. Exit\n");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (top == stack.length - 1) {
                        System.out.println("Stack is full. Cannot push.");
                    } else {
                        System.out.print("Enter value to push: ");
                        int value = scanner.nextInt();
                        stack[++top] = value;
                        System.out.println("Pushed " + value + " to stack.");
                    }
                    break;
                case 2:
                    if (top == -1) {
                        System.out.println("Stack is empty. Cannot pop.");
                    } else {
                        int poppedValue = stack[top--];
                        System.out.println("Popped " + poppedValue + " from stack.");
                    }
                    break;
                case 3:
                    if (top == -1) {
                        System.out.println("Stack is empty. Nothing to peek.");
                    } else {
                        System.out.println("Top of stack: " + stack[top]);
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break; // Exit the loop gracefully
                default:
                    System.out.println("Invalid choice made. Retry!!");
                    break;
            }
            // If the user selected 'Exit', break out of the loop
            if (choice == 4) {
                break;
            }
        }
        scanner.close();
    }
}
