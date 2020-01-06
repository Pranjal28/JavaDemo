package com.java.demo;

public class HelloWorld {
	
	public static void main (String[] args)
	{
		System.out.println("Hello World");
	}
}
	
	// public -> main method needs to run at runtime, if access specifier is not public then 
	// restrictions will be there and main method will not run, hence program can't execute
	
	//static -> Every java method needs an object which can invoke/call it. But before main method, no
	//object is created, and main method can't run w/o any object, so it becomes a deadlock. To remove
	// this deadlock, we require the static keyword. Because of static, no object is reqd. to call
	// the main method, and main method executes
	
	//void -> There is no sense for main method to return any value as it helps in execution of program.
	//So return type is void
	
	//main -> main is the keyword which is looked at runtime for execution of program
	
	
	//String[] args -> Used for command line arguments, can also be written as String ...a

    //CLI Example
     /*
      public class Test {

public static void main(String[] args){

    for(String s : args){
	System.out.println(s);
    }
	
    }
}

$ javac Test.java 
$ java Test 1 2 3
1
2
3
$ java Test "Hello World" "Pankaj Kumar"
Hello World
Pankaj Kumar

      */
	
	