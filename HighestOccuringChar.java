class HighestOccuringChar{

	public static void main(String args[]){
                String str="abdefgbabfba";
		int[] arrCunt=new int[26];
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			int num=0;
                        
			if(ch>='a'&&ch<='z')
			num=ch-'a';

			else
			   num=ch-'A';
			   arrCunt[num]++;
                       
		}
		int max=-1,ans=0;
		for(int i=0;i<26;i++){
			if(max<arrCunt[i]){
				ans=i;
				max=arrCunt[i];

			}
                       
		}
		System.out.println((char)('a'+ans)+"is"+ count);
	}
}