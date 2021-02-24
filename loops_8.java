// Given a Scanner reference variable named input that has been associated with an input source consisting of a sequence of lines, write the code necessary to read in every line and print them all out on a single line, separated by a space.

// Hint: Use input.nextLine() to read a line and use input.hasNextLine() to test if the input has a next line available to read.


if (input.hasNext())
System.out.print(input.nextLine());
while (input.hasNext()){
   System.out.print(" " + input.nextLine());
}