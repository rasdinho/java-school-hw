// Given an int variable n that has been initialized to a positive value and, in addition, int variables k and total that have already been declared, use a for loop to compute the sum of the cubes of the first n whole numbers, and store this value in total.

// Use no variables other than n, k, and total.


k = 0 ; total = 0;
while (k <= n){
    total = total + (k*k*k);
    k++;
}