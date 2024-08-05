class CmprStr
{
	public static void main(String args[])
	{
		String str="karan_kumar";
		char ch;
		int count=0;
		int count1=0;
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if(ch=='a' || ch== 'e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='I' || ch=='O' || ch=='E' || ch=='U')
			{
				count++;	
			}
			else
			{ 
				
				count1++;
			}
		}
		System.out.println("Vowels"+count);
			System.out.println("Consonants"+count1);
	}
}