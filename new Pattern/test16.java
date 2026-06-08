/*

    * 
   **
  ***
 ****
*****
 ****
  ***
   **
    *

*/
	    class test16{
     public static void main(String[] args) {
          int n=5;

          for(int i=1;i<=5;i++) {
     
               for(int sp =5;sp>=i;sp--) {
                    System.out.print(" ");
               }

               for(int j=1;j<=i;j++) {
                    System.out.print("*");          
          }    
          System.out.println();
          }


          for(int i=1;i<=5;i++) {
               
               for(int sp=0;sp<=i;sp++) {
                    System.out.print(" ");
               }

               for(int j=4;j>=i;j--) {
                    System.out.print("*");
               }
               System.out.println();
          }

               
	
}}