
class Question1
{
	public static void main(String args[])
	{
		System.out.println();
		int n=10;
		
		
		    for(int j=0;j<n;j++)
		    {
		       for(int i = 0 ;i<n;i++)
		       {
		    	if(i==0)
		          System.out.print("*  ");
		    	else
		    	  System.out.print("");
		    	
		        }
		          
		          System.out.print(" ");
		            
		            
		        for(int i = 0 ;i<n;i++)
				{
				  if( i==0 ||i==n-1||j==i)
				    System.out.print("* ");
				  else
				    System.out.print("  ");
				    	
			    }
		                 
		           System.out.print(" ");
		            
		        for(int i = 0 ;i<n;i++)
				{
				 if(i==0||j==0||j==n-1||j==(n-1)/2)
				    System.out.print("* ");
				 else
				    System.out.print("  ");
				    	
				}
		                  System.out.print(" ");
				   
		         for(int i = 0 ;i<n;i++)
			     {
				  if(i==0 && j!=9 || i == n-1 && j!=9 || j==n-1  && i!=0 && i!=n-1)
				    System.out.print("* ");
				  else
					System.out.print("  ");
					    	
			     }
			             System.out.print(" ");
			                  
			     for(int i = 0 ;i<n;i++)
				 {
				  if(j==0 && i<=7 || i==0 ||  i==8 && j ==1 || j==2&&i==9 || j==3&& i ==9|| j==4&& i==8 ||j==5 &&i==6 ||j==5 && i<=7 ||j==6 
					&& i==6 || j==7 && i==7 || j==8 && i==8 || j==9 && i==9)
					System.out.print("* ");
				 else
				    System.out.print("  ");
						    	
			     }
				    System.out.print(" ");   
				                  
				  for(int i = 0 ;i<n;i++)
				  {
				   if(j==0&& i>=2 && i<=7 || i==0 && j>=2 && j<=7 || j==n-1 && i>=2 && i<=7 || i==n-1 && j>=2 && j<=7|| i==1 && j==1 || j==8
					  && i==1 || j==1 && i==8 || j==8 && i==8 )
					 System.out.print("* ");
				   else
					 System.out.print("  ");
				  }
					     System.out.print(" ");
					                  
			     for(int i = 0 ;i<n;i++)
				 {
				  if( i==0 ||i==n-1||j==i)
					System.out.print("* ");
				  else
					System.out.print("  ");
				}
					System.out.print(" ");
			                  
			         System.out.println();
		     }
		
	}
	
}
