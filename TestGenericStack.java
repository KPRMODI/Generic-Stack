

public class TestGenericStack {
    public static void main(String[] args) {
        // Test with Strings
        GenericStack<String> stringStack = new GenericStack<>();
        stringStack.push("Hello");
        stringStack.push("World");
        stringStack.push("Java");
        
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
        
        System.out.println("\nInteger Stack: " + intStack);
        System.out.println("Peek: " + intStack.peek());
        System.out.println("Pop: " + intStack.pop());
        System.out.println("Size: " + intStack.getSize());
        System.out.println("After Pop: " + intStack);
        System.out.println("Is Empty: " + intStack.isEmpty());

        //Test with empty list
        GenericStack<Boolean> booleanStack = new GenericStack<>();
        System.out.println("\nIs Empty: " + booleanStack.isEmpty());
        System.out.println("Boolean Stack: " + booleanStack);

        booleanStack.push(true);
        booleanStack.push(false);
        booleanStack.push(false);

        System.out.println("\nBoolean Stack: " + booleanStack);
        System.out.println("Peek: " + booleanStack.peek());
        System.out.println("Pop: " + booleanStack.pop());
        System.out.println("Size: " + booleanStack.getSize());
        System.out.println("After Pop: " + booleanStack);
        System.out.println("Is Empty: " + booleanStack.isEmpty());


    }
}