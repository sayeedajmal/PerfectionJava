import data.Stack;

public class MainProgram {
    public static void main(String[] args) {

        /*
         * Scanner input=new Scanner(System.in);
         * System.out.println("Enter Total Number of Elements: "); int
         * totalElement=input.nextInt(); int[]List=new int[totalElement];
         * System.out.println("Enter Your List: "); for (int i = 0; i < List.length;
         * i++) { List[i]=input.nextInt(); }
         * System.out.println("Enter Your Search Element: "); int key = input.nextInt();
         * int Result = Array.SearchViaLoop(List, key); if(Result!=0){
         * System.out.println("The Index is: "+Result); }else{
         * System.out.println("The Element "+key+" not Found..."); } input.close();
         */

        Stack s = new Stack();
        s.Push(20);
        s.Push(30);
        s.Push(40);

        System.out.println(s.Pop() + " The Number is Poped: ");
        System.out.println("The Top Number is: "+s.peek());
        System.out.print("Elements present in stack :");
        s.Printing();
    }
}
