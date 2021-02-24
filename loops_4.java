// Write a loop that reads positive integers from standard input and that terminates when it reads an integer that is not positive.

// After the loop terminates, it prints out, on a line by itself and separated by spaces,

// the sum of all the even integers read,
// the sum of all the odd integers read,
// a count of the number of even integers read, and
// a count of the number of odd integers read,
// all separated by at least one space.

// Declare any variables that are needed.

// Assume the availability of a variable, stdin, that references a Scanner object associated with standard input. That is, stdin = new Scanner(System.in); is given.

// first try

int number = 1;
int oddTotal, evenTotal, oddCount, evenCount;
oddTotal = evenTotal = oddCount = evenCount = 0;
while (stdin.hasNextInt() && number > 0)
{
    number = stdin.nextInt();
    if (number % 2 == 0 && number > 0)
    {
        evenTotal += number;
        evenCount += 1;
    }
    if (number % 2 != 0 && number > 0)
    {
        oddTotal += number;
        oddCount += 1;
    }
}
System.out.println(evenTotal + " " + oddTotal + " " + evenCount + " " + oddCount);

// second method



