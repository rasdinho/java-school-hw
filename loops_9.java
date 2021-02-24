// Given a Scanner reference variable named input that has been associated with an input source consisting of a sequence of strings and two int variables, count and longest, write the code necessary to examine all the strings in the input source and determine how long the longest string (or strings are).

// That value should be assigned to longest.
// The number ﻿of strings that are of that length should be assigned to count.


count = 0;
longest =0;
String myString = new String();
while (input.hasNext()){
   myString = input.next();
   if (myString.length() == longest) count++;
   else
      if (myString.length() > longest){
         longest = myString.length();
         count = 1;
      }
}