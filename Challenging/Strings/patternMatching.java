
public class patternMatching {
	
	
	public char[] matchPattern(String input)
	{
		int j = 0;
		boolean flagA = false;
		char[] str = input.toCharArray();
		
		//System.out.println(str);
		
		for(int i = 0;i<str.length;i++)
		{
			
			if(!flagA && str[i]!='b' && str[i]!='a')
			{
				str[j]=str[i];
				j++;
			}

			
			if (flagA) 
			{
				flagA = false;
				if (str[i] != 'c') // prev char was 'a' so check if current is
									// not c
				{
					
					// current character is not c , it could be 'a' or 'b' so
					// need to check for pattern
					str[j] = 'a';// since the pattern is not ac copy the prev
									// 'a' to string

					j++; // the conditions below will check if current char is
							// 'a' or 'b'

				}
				
				if(str[i]!='b' && str[i]!='a' && str[i]!='c')
				{
					str[j]=str[i];
					j++;
				}

				if(str[i]=='a')
				{
					flagA = true;
				}

			}
			
			if(str[i]=='a' && !flagA)
			{
				flagA = true;
			}
			
		}
		
		for(int i = j;i<str.length;i++)
			str[i] = '\0';
		
		return str;
	}

	public static void main(String[] args) {
		patternMatching ob = new patternMatching();
		System.out.println(ob.matchPattern("acdac"));
		System.out.println(ob.matchPattern("bbbc"));
		System.out.println(ob.matchPattern("ababac"));
		System.out.println(ob.matchPattern("aaac"));
	}

}
