public class Arrayjava0
{
    public static void main(String[] args0)
    {
       int multi0[]=new int[9];
       int multi1[]=new int[9];

        for (int i=1; i<multi0.length; i++)
        {
            multi0[i]=i+1;
            System.out.println(multi0[i]);
            for (int j=0; j<multi1.length; j++)
            {
                multi1[j]=j+1;
                System.out.println(multi0[i]*multi1[j]);
            }
            System.out.println("================================");
        }
    }
    
}