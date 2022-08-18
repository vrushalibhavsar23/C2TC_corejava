
public class LabelledBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int len=3;
		int key=1;
		int k=0;
		out:
			for(int i=0;i<len;i++)
			{
				In:{
					for(int j=0;j<len;j++)
						if(i==key)
						{
							break out;
						}
					k+=1;
				}
			}
		System.out.println(k);

	}

}
