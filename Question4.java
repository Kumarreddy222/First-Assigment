class Hello2
{
    public static void main(String args[])
    {
        int n = 14;

        for (int j = 0; j < n; j++)
        {
            for (int i = 0; i < n; i++)
            {
                if (i == 0  && j>=6|| i == n-1 &&j>=6 ||j==n-1 ||  j-i >= (n-2) / 2 || j+i >= (3*n-4)/2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }


    }


}

