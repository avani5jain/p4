import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
		Stack s=new Stack();
		Scanner sc=new Scanner(System.in);//Balanced Parenthesis Checker | Program to check for balanced parenthesis in an expression
		String exp=sc.next();
		int i;
		for(i=0;i<exp.length();i++)
		{ if(exp.charAt(i)=='('||exp.charAt(i)=='['||exp.charAt(i)=='{')
		{ s.push(exp.charAt(i));
		}
		}
		for(i=0;i<exp.length();i++)
		{ if((exp.charAt(i)==')'&&exp.charAt(i)!='}'&&exp.charAt(i)!=']')||(exp.charAt(i)==']'&&exp.charAt(i)!=')'&&exp.charAt(i)!='}')||(exp.charAt(i)=='}'&&exp.charAt(i)!=')'&&exp.charAt(i)!=']'))
		{ s.pop();
		}
		}
		if(s.empty())
		{System.out.println(1);}
		else{System.out.println(-1);}
		
	}
}
