import java.util.Scanner;
import java.util.Stack;

import javax.swing.plaf.synth.SynthLookAndFeel;
class MinStack{
public static void Stack_Push(Stack<Integer> stack){
    System.out.println("do you want give size :");
    Scanner sc =new Scanner(System.in);
    int n =sc.nextInt();
    for(int i=0;i<n;i++){
        System.out.println("enter the element :");
        int element=sc.nextInt();
        stack.push(element);


    }
}

public static void stack_display(Stack<Integer> stack){
    System.out.println("this is element of a stack" +stack);
}

public static void Stack_pop(Stack<Integer> stack){
    if(stack.isEmpty()){
        System.out.println("stack is underflow");


    }
    else{
        int y=stack.pop();
        System.out.println("this is pop element " +y);
    }
    
}
public static void stack_peek(Stack<Integer> stack){
    if(stack.isEmpty()){
        System.out.println("element is not exist");
    }
    else{
        System.out.println("in the stack peek element " +stack.peek());
    }
}
public static void stack_add(Stack<Integer> stack){
    Scanner s=new Scanner(System.in);
    System.out.println("if you want to add the element (y/n)");
    int a=s.nextInt();
    stack.add(a);
}
public static void stack_search(Stack<Integer> stack){
   Scanner d=new Scanner(System.in);
   System.out.println("if you want to search the enter element ");
   int s=d.nextInt();
   
System.out.println("got it" +stack.search(s));
  
}
public void stack_atpostion(Stack<Integer> stack){
    System.out.println("if you want to remove the elelment at postion :");
    Scanner p=new Scanner(System.in);
    System.out.println("alocate the postion : ");
    int ap=p.nextInt();

    System.out.println(stack.remove(ap));
}
public static void main(String[] args){
    Stack<Integer> stack=new Stack<>();
    Stack_Push(stack);
    stack_display(stack);
    Stack_pop(stack);
    stack_peek(stack);
    stack_add(stack);
    stack_display(stack);
    stack_search(stack);
    MinStack ms=new MinStack();
   ms.stack_atpostion(stack);
    stack_display(stack);

}

}
