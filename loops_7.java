// Write a loop that reads positive integers from standard input, printing out those values that are greater than 100, each followed by a space, and that terminates when it reads an integer that is not positive.

// Declare any variables that are needed.

// Assume the availability of a variable, stdin, that references a Scanner object associated with standard input. That is, stdin = new Scanner(System.in); is given.



int number = 0;
while (stdin.hasNextInt() && number >= 0)
{
    number = stdin.nextInt();
    if (number > 100)
    System.out.print(number + " ");
}