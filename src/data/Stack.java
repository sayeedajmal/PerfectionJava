package data;

public class Stack {

    static final int maximum = 15;
    int Top;
    int[] StackList = new int[maximum];

    /* IsEmpty Operation */
    public boolean IsEmpty() {
        // return true if element is empty else false;
        return (Top < 0);
    }

    /* Creating Constructure for define the value of Top to -1 as It's Empty */
    public Stack() {
        Top = 0;
    }

    /* Push Operation */
    public Boolean Push(int number) {
        if (Top >= maximum - 1) {
            System.out.println("Stack  OverFlow 😖");
            return false;
        } else {
            StackList[++Top] = number;
            System.out.println(number + " pushed into Stack 😍...");
            return true;
        }
    }

    /* Pop Operation */
    public int Pop() {
        if (Top < 0) {
            System.out.println("Stack Underflow😖");
            return 0;
        } else {
            int number = StackList[Top--];
            return number;
        }

    }

    /* Peek Operation */
    public int peek() {
        if (Top < 0) {
            System.out.println("Stack UnderFlow 😖");
            return 0;
        } else {
            int number = StackList[Top];
            return number;
        }
    }

    /* For Printing Peek */
    public void Printing() {
        for (int i = Top; i > 0; i--) {
            System.out.print(" " + StackList[i]);
        }
    }
}
