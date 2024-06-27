import java.util.*;
class SquaresArray{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
int sq[]=new int[n];
for(int i=0;i<n;i++){
a[i]=s.nextInt();
}
for(int i=0;i<n;i++){
  int b=a[i]*a[i];
sq[i]=b;
}
Arrays.sort(sq);
for(int i=0;i<n;i++){
System.out.print(sq[i]+" ");
}
}
}
