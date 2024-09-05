import java.util.*;
class Account
{
    int top;
    int size=10;
    static String name="abeer";
    int stack[]=new int[size];

    void push(int x)
    {
        if(top==size-1)
        {
            System.out.println("overflow");
        }
        else
        {
            top++;
            stack[top]=x;
            
        }
    }
     void pop()
    {
        if(top==-1)
        {
            System.out.println("underflow!");
        }
        else 
        {
        int temp=stack[top];
        System.out.println("ITEM TO BE POPED : "+temp);
        top--;
    }
}
    void peek()
    {
        if(top==-1)
        {
            System.out.println("UNDERFLOW!");
        }
        else
        {
            System.out.println(stack[top]);
        }
    }
    void display()
    {
        if(top==-1)
        {
            System.out.println("UNDERFLOW!");
        }
        else
        {
            for(int i=0;i<=top;i++)
            {
                System.out.println(stack[i]);
            }
        }
    }
}
 
 
public class BankAccount 
{
    
   
    public static void main(String[] args) 
    {
       Scanner in=new Scanner(System.in);
       Account obj=new Account();
       int x;
       boolean loop=true;
       while(loop==true)
       {
       System.out.println("CHOOSE FROM THE FOLLOWING OPERATION : \n 1 : PUSH  \n 2 : POP \n 3 : PEEK \n 4 : DISPLAY");
       int c=in.nextInt();
       switch (c) {
        case 1:
        {
        System.out.print("ENTER THE VALUE YOU WANT TO ENTER : ");
          x=in.nextInt();
            obj.push(x);
            break;
        }
       case 2:
       {
          
           obj.pop();
           break;
       }
       case 3:
       {
          
           obj.peek();
           break;
       }
       case 4:
        {
            obj.display();
        }
        default:
            break;
       }
      System.out.println("do you want to wish to operate again \n 1 : yes \n 2 : no");
      System.out.println(Account.name);
      int choice=in.nextInt();
      if(choice==1)
      {
        loop=true;
      }
      else
      {
        loop=false;
      }
    }
    }
}