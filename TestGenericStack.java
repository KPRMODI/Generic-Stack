/**
 * Lab: GenericStack
 * Name: Karan Modi
 * The test file to test the Generic Stack
 */


public class TestGenericStack {
    public static void main(String[] args) {
        // Test with Strings
        GenericStack<String> stringStack = new GenericStack<>();
        stringStack.push("Hello"); //push values
        stringStack.push("World");
        stringStack.push("Java");
        
        // output of string stack after applying methods
        System.out.println("String Stack: " + stringStack); 
        System.out.println("Peek: " + stringStack.peek());
        System.out.println("Pop: " + stringStack.pop());
        System.out.println("Size: " + stringStack.getSize());
        System.out.println("After Pop: " + stringStack);
        System.out.println("Is Empty: " + stringStack.isEmpty());
        
        // Test with Integers
        GenericStack<Integer> intStack = new GenericStack<>();
        intStack.push(10);
        intStack.push(20);
        intStack.push(30);
        
        // output of integer stack after applying methods
        System.out.println("\nInteger Stack: " + intStack);
        System.out.println("Peek: " + intStack.peek());
        System.out.println("Pop: " + intStack.pop());
        System.out.println("Size: " + intStack.getSize());
        System.out.println("After Pop: " + intStack);
        System.out.println("Is Empty: " + intStack.isEmpty());

        //Test with empty list
        GenericStack<Double> doubleStack = new GenericStack<>();
        System.out.println("\nDouble Stack Is Empty: " + doubleStack.isEmpty());
        System.out.println("Double Stack: " + doubleStack);

        //Test with doubles
        doubleStack.push(2.1);
        doubleStack.push(2.2);
        doubleStack.push(6.7);
        doubleStack.push(4.2);
        doubleStack.push(20.21);

        // output of double stack after applying methods
        System.out.println("\nDouble Stack: " + doubleStack);
        System.out.println("Peek: " + doubleStack.peek());
        System.out.println("Pop: " + doubleStack.pop());
        System.out.println("Size: " + doubleStack.getSize());
        System.out.println("After Pop: " + doubleStack);
        System.out.println("Is Empty: " + doubleStack.isEmpty());
    }
}