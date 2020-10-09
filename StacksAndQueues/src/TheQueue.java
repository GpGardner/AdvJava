import java.util.Arrays;

//Class
public class TheQueue {

	// Class Fields or Properties
	private String[] queueArray;
	private int queueSize;
	private int front = 0;
	private int rear = 0;
	private int numberOfItems = 0;

	// Constructor
	TheQueue(int size) {

		queueSize = size;

		queueArray = new String[size];

		Arrays.fill(queueArray, "-1");

	}

	// Methods
	public void insert(String input) {

		if (numberOfItems + 1 <= queueSize) {

			queueArray[rear] = input;

			System.out.println("\nINSERT: " + input + " to position " + rear);

			rear++;

			numberOfItems++;

		} else {

			System.out.println("\nSorry the Queue is full.");

		}

		displayTheQueue();

	}

	public void remove() {

		if (numberOfItems > 0) {
			System.out.println("\nREMOVED: " + queueArray[front]);

			queueArray[front] = "-1";

			front++;

			numberOfItems--;

			displayTheQueue();

		} else {
			System.out.println("\nSorry the Queue is full.");
		}

	}

	public void peek() {

		System.out.println("\nThe front of the Queue is: " + queueArray[front]);

	}

	public void priorityInsert(String input) {

		int i;

		if (numberOfItems == 0) {

			insert(input);

		} else if (numberOfItems == 1) {

			System.out.println("\nPRIORITY INSERT: " + input + "moved to position " + 1);

			queueArray[1] = input;

			rear++;

			numberOfItems++;

		} else {

			for (i = numberOfItems - 1; i >= 0; i--) {

				if (Integer.parseInt(input) > Integer.parseInt(queueArray[i])) {

					System.out.println("\nPRIORITY INSERT: " + input + " moved to position " + queueArray[i]);

					queueArray[i + 1] = queueArray[i];

				} else {
					break;
				}

			}
			queueArray[i + 1] = input;

			rear++;

			numberOfItems++;

		}

		displayTheQueue();

	}

	public void displayTheQueue() {

		for (int i = 0; i < 61; i++)
			System.out.print("-");

		System.out.println();

		for (int i = 0; i < queueSize; i++) {

			System.out.format("| %2s " + " ", i);

		}

		System.out.println("|");
		for (int i = 0; i < 61; i++)
			System.out.print("-");

		System.out.println();

		for (int i = 0; i < queueSize; i++) {

			if (queueArray[i].equals("-1"))
				System.out.print("|     ");

			else
				System.out.print(String.format("| %2s " + " ", queueArray[i]));

		}

		System.out.println("|");

		for (int n = 0; n < 61; n++)
			System.out.print("-");

		System.out.println();

	}

	// Main Method
	public static void main(String[] args) {

		TheQueue queue = new TheQueue(8);

		queue.priorityInsert("10");
		queue.priorityInsert("2");
		queue.priorityInsert("5");
		queue.priorityInsert("1");
		queue.priorityInsert("8");
		queue.priorityInsert("11");
		queue.remove();
		queue.remove();
		queue.remove();
		queue.peek();

	}

}
