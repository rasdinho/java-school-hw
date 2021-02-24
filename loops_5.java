// Consider this data sequence: "3 11 5 5 5 2 4 6 6 7 3 -8".

// Any value that is the same as the immediately preceding value is considered a consecutive duplicate.

// In this example, there are three such consecutive duplicates: the 2nd and 3rd 5s and the second 6.

// Note that the last 3 is not a consecutive duplicate because it was preceded by a 7.

// Write some code that uses a loop to read such a sequence of non-negative integers, terminated by a negative number.

// When the code finishes executing, the number of consecutive duplicates encountered is printed. In this case, 3 would be printed.

// Assume the availability of a variable, stdin, that references a Scanner object associated with standard input. That is, stdin = new Scanner(System.in); is given.

int firstNumber, secondNumber, duplicates;
secondNumber = duplicates = 0;
firstNumber = stdin.nextInt();
while (stdin.hasNextInt() && firstNumber > -1 && secondNumber > -1)
{
    secondNumber = stdin.nextInt();
    if (firstNumber == secondNumber)
    {
        duplicates++;
    }
    firstNumber = secondNumber;
}
System.out.println(duplicates);