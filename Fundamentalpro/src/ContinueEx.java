
public class ContinueEx {

	public static void main(String[] args) {
		int lim=8;
		int sum=0;
		for(int i=1;i<=lim;i++)
		{
			if(i%4==0)
				continue;
			
		sum+=i;
	    }
	System.out.println(sum);

}
}
