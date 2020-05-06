import java.util.*;
class Solution
{
     static boolean degenerateTriangle(int a, int b, int c)
    {

        if(a+b <= c) return true;
        if(a+c <= b) return true;
        if(b+c <= a) return true;
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        {
            int n=sc.nextInt();
            Integer sticks[]=new Integer[n];
            for(int i = 0; i < n; i++)
            sticks[i] = sc.nextInt();
            Arrays.sort(sticks, Collections.reverseOrder());
             for(int i = 0; i < n-2; i++)
        {
            if(degenerateTriangle(sticks[i],sticks[i+1],sticks[i+2])==false)
            {
                System.out.println(sticks[i+2]+" "+sticks[i+1]+" "+sticks[i]);
                System.exit(0);
            }
        }
        System.out.println(-1);
    }

        }
    }
