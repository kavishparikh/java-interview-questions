// Question : Implement a class that can calculate the running average of a stream of 
//			  input numbers up to a maximum of N numbers ?

// Solution : I implemented an insertNumber(int n) function to add a new number to the 
// 			  stream, and the stream is represented as a std::queue<int>. When adding a 
// 			  new number to the stream, I added it to a runningTotal private variable. 
// 			  If the queue is at maximum capacity (N), i popped the oldest number off, 
// 			  subtracted it from runningTotal and continued with adding the new number 
// 			  as normal. I also implemented a calculateAvg() function, which simply 
// 			  returned runningTotal / runningCount, where runningCount is the current 
// 			  amount of numbers in the stream.