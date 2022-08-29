public class ContinueNestedForLoop {

public static void main(String[] args) {

for(int i=1;i<=3;i++){

for(int j=1;j<=3;j++){

if(i==2&&j==2){

continue;

}

System.out.println(i+" "+j);//11 12 13 21 23 31 31 33

}

}

}

}