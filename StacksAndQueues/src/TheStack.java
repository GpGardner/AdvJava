import java.util.Arrays;

public class TheStack {

	// Class Fields
	private String[] stackArray;

	private int stackSize;

	private int topOfStack = -1;

	// Constructors
	TheStack(int size) {
		stackSize = size;

		stackArray = new String[size];

		Arrays.fill(stackArray, "-1");

	}

	// Class Methods
	public void push(String input) {

		if (topOfStack + 1 < stackSize) {

			topOfStack++;

			stackArray[topOfStack] = input;

			System.out.println("\nPUSH: " + input + " was added to the stack");

			displayTheStack();

		} else {
			System.out.println("\nSorry the Stack is full.");

			displayTheStack();

		}

	}

	public String pop() {
		if (topOfStack >= 0) {

			System.out.println("\nPOP: " + stackArray[topOfStack] + " was removed from the stack.");

			stackArray[topOfStack] = "-1";

			displayTheStack();

			String value = stackArray[topOfStack--];

			return value;

		} else {

			displayTheStack();

			System.out.println("\nSorry the Stack is empty");

			return "-1";

		}
	}

	public String peek() {

		System.out.println("\nPEEK: " + stackArray[topOfStack] + " Is at the top of the Stack");

		displayTheStack();

		return stackArray[topOfStack];

	}

	public void pushMany(String values) {

		String[] tempString = values.split(",");

		for (int i = 0; i < tempString.length; i++) {

			push(tempString[i]);

		}

	}

	public void clearStack(){

		
		for (int i = topOfStack; i >= 0 ; i--) {
			
			System.out.println("\n Top of Stack: " + topOfStack);

			pop();

		}

		displayTheStack();

	}

	public void displayTheStack() {

		for (int n = 0; n < 61; n++)
			System.out.print("-");

		System.out.println();

		for (int n = 0; n < stackSize; n++) {

			System.out.format("| %2s " + " ", n);

		}

		System.out.println("|");
		for (int n = 0; n < 61; n++)
			System.out.print("-");

		System.out.println();

		for (int n = 0; n < stackSize; n++) {

			if (stackArray[n].equals("-1"))
				System.out.print("|     ");

			else
				System.out.print(String.format("| %2s " + " ", stackArray[n]));

		}

		System.out.println("|");

		for (int n = 0; n < 61; n++)
			System.out.print("-");

		System.out.println();

	}

	

	// Main Method
	public static void main(String[] args) {

		TheStack stack = new TheStack(8);

		stack.pushMany("15,16,12,13,15,22,52,76,1,12,14,15");
		// stack.pop();
		// stack.pop();
		// stack.pop();
		// stack.peek();
		// stack.displayTheStack();
		stack.clearStack();

	}
}