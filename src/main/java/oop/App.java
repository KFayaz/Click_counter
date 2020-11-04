package oop;

/**
 * 'Click' Counter
 *  Starter code for demonstrating a simple class.
 */
public class App 
{
    public static void main( String[] args )
    {
        App app = new App();
        app.start();
    }

    public void start() {
        System.out.println("\n*** Counter App ***");

        Counter myCounter = new Counter(10);
        myCounter.display();
        myCounter.click();
        myCounter.click();
        myCounter.click();

        myCounter.undo(); //undo counter
        myCounter.display();
        myCounter.reset();
        myCounter.display();
        //TODO - add call to reset() that you implement in Counter class


        //TODO - add call to undo() that you implement in Counter class

        //TODO
        // Add a JUnit test method to test undo()

        //TODO
        // Create a second Counter object, then
        // click() it once, undo() twice, click(), then display()
        // What count do you expect?
        System.out.println("Bus counter:- ");
        Counter busCounter = new Counter(12);
        busCounter.display();
        busCounter.click();
        busCounter.click();
        busCounter.click();
        busCounter.click();
        busCounter.click();
        busCounter.undo();
        busCounter.display();
        busCounter.reset();
        busCounter.display();

    }

}
