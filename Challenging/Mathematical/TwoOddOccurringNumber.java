import java.io.*;
import java.util.*;

/****
Given an array where every element appears twice except one element.
To find that element we need to do bitwise XOR operation for all elements
NOTE : this method works because XOR of two elements will result in 0, hence even occurrences will be neutralized
and provide only the odd occurrences
but the above method does not work when we need to identify more than 1 odd occurring number
Use HashMap and store the count of each element in it.
****/

