package chapter.stack_queue;

class StackX{
    private int maxSize;
    private long[] stackArray;
    private int top;
    public StackX(int s){
        maxSize = s;
        stackArray = new long[maxSize];
        top = -1;
    }
    public void push(long j){
        stackArray[++top] = j;
    }
    public long pop(){
        return stackArray[top--];
    }
    public long peek(){
        return stackArray[top];
    }
    public boolean isEmpty(){
        return (-1 == top);
    }
    public boolean isFull(){
        return (maxSize-1 == top );
    }
}
public class StackApp {
    public StackApp(){
        StackX theStack = new StackX(10);
        theStack.push(20);
        theStack.push(40);
        theStack.push(60);
        theStack.push(80);

        while(!theStack.isEmpty()){
            long value = theStack.pop();
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println("");
    }
}
