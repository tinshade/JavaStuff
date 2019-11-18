package extendedeuclid;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ExtendedEuclid {
    public static void main(String[] args) throws IOException {
        int [] ans = new int[3];
        int a,b;
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter the first non negative number :");
        a=Integer.parseInt(br.readLine());
        System.out.println("Enter the second non negative number:");
        b=Integer.parseInt(br.readLine());
        ans=Euclid(a,b);
        System.out.println("GCD of" +a+ "and" +b+ ";");
        System.out.println("\n gcd ("+a+","+b+")="+ans[0]+"\n");
        System.out.println("Extended form :\n");
        System.out.println(" d="+ans[0]+" s="+ans[1]+" t="+ans[2]+"");
    }
    public static int[]Euclid(int a, int b)
    {
        int[]ans=new int[3];
        int q;
        if(b==0)
        {
            ans[0]=a;
            ans[1]=1;
            ans[2]=0;
        }
        else{
            q=a/b;
            ans=Euclid(b,a%b);
            int temp=ans[1]-ans[2]*q;
            ans[1]=ans[2];
            ans[2]=temp;
        }
        return ans;
    }
}
