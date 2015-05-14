// Question : 	How would you determine if someone has won a game of tic-tac-toe on a board of any size? 

// Approach : 	I think maybe this question is worded a bit wrong, because given a tic-tac-toe board you 
//				would need to read in at least some of the values on the board to figure out if someone has won, and 
//				this would be impossible to do in constant time (the larger the board, the more values you would have 
//					to read).
//				I think they must mean how can you determine if someone has won during a game in real time, as in 
//				checking after every move. This can be solved with a strategy in constant time.
//				My solution would be: Create an array of size 2n+2 at the beginning of the game and fill it with zeros. 
//				Each spot in the array will be a sum of X's or O's horizontally (the first n places in the array), 
//				vertically (the second n places in the array) and diagonally (the last 2 places). Then with every move, 
//				you add 1 to the 2 places (or 3 if on a diagnol) of the array if X, and subtract 1 if its an O. After 
//				adding you check and see if the value of the array is equal to n or -n, if it is, n mean X has won and 
//				-n means O has won.