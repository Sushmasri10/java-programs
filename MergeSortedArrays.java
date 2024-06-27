import java.util.*;
class MergeSorted{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

int n1=sc.nextInt();
int a[]=new int[n];

int b[]=new int[n1];
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}
for(int i=0;i<n1;i++){
b[i]=sc.nextInt();
}
int[] c=new int[n+n1];
int i=0,j=0,k=0;
while(i<n &&j<n1){
if(a[i]<b[j]){
c[k]=a[i];
i++;
k++;
}
else{
c[k]=b[j];
j++;
k++;
}
}
while(i<n){
c[k]=a[i];
k++;
i++;
}
while(j<n1){
c[k]=b[j];
k++;
j++;
}
for(i=0;i<c.length;i++){
System.out.print(c[i]+" ");
}
}
}

