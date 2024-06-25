import java.util.*;
class Series{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int c=1;
for(int i=0;i<=n;i++)
{
if(n%4!=0){
if(c%2==0){
System.out.print(-i+" ");
c++;
}
else{
System.out.print(i+" ");
c++;
}
}
}
}
}