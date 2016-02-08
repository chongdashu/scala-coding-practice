package main.scala.practice.basic


/**
 * A different Hello World example, this time
 * where HelloWorldApp is an object extending
 * the App class.
 * 
 * This a basic example demonstrating:
 * 		- no need for the main method.
 * 		
 * 
 * @author Chong-U Lim
 */

object HelloWorldApp extends App {
    // Call the usual HelloWorld application.
    HelloWorld.main(Array())
    
    // Now add some stuff to differentiate this application.
    println("The above line was called from HelloWorldApp!");
}