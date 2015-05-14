// Question : Given a string, convert it into a palindrome with the lease number of insertions possible.

// Approach : Recursion.
// 			  For each string, if left char = right char, no need to insert, cut the two ends. 
// 			  If left != right, only no decision, insert the right char to left or insert the 
// 			  left char to right. Both increment the total insert by 1.


int FindMinInsert(string s, int l, int r) {
	if ( l >= r ) 
		return 0;
    if (s[l] == s[r]) 
    	return FindMinInsert(s, l+1, r-1);
		int insert_left = FindMinInsert(s, l, r-1) +1;
		int insert_right = FindMinInsert(s, l+1, r) +1;
		return min(insert_left, insert_right);
}