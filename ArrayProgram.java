package array;

public class ArrayProgram {
    public static void main(String[] args) {
        int sum=0;
        int n=5;
        int[] scores={10,20,30,40,50};
    for(int i=0;i<n;i++)
{
    sum+=scores[i];
}  
System.out.println("The sum of scores is"+sum);
int avg=sum/5;
System.out.println("The average of scores is"+avg);
}
}
    

