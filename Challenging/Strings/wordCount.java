
public class wordCount {

	public void countWords(String sentence)
	{
		boolean boolIn = false;
		
		char[] str = sentence.toCharArray();
		int wc = 0;
		
		for(int i = 0;i<str.length;i++)
		{
			/*System.out.println(str[i]);
			System.out.println(boolIn);*/
			if(boolIn && (str[i]==' ' || str[i]=='\t' || str[i]=='\n'))
			{
				wc++;
				boolIn = false;
			}
			
			if(str[i]!=' ' || str[i]!='\t' || str[i]!='\n')
			{
				boolIn = true;
			}
		}
		
		if(str[str.length-1]==' ' || str[str.length-1]=='\t' || str[str.length-1]=='\n')
		System.out.println(wc);
		
		else
			System.out.println(wc+1);
	}
	
	public static void main(String[] args) {
		wordCount ob = new wordCount();
		ob.countWords("I am here");
		ob.countWords("I am here ");

	}

}
