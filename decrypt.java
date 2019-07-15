import java.io.*;
import java.util.*;
import java.lang.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;

class decrypt
{
    String strFilePath = "";

    public void decryp(String a,String b)
    {  
        strFilePath = b+".txt"; 
        try
        {
        
         String sd =" ";int i=0; char ch2; int count=0; String se;int len; char ch; char[] arr =new char[100];
            FileInputStream ob= new FileInputStream(a);
                //  int i=0; char ch2; int count=0; String se;int len; char ch;
            while((i=ob.read()) != -1)
            {
                
                ch2=((char)i);
                se=String.valueOf(ch2);
                len = se.length();
               
                
               // System.out.println("\n"+ch)     
                for(int j=0; j<len; j++)
          {       
            ch=se.charAt(j);
               char ch1;
            
            ch1=ch;
            if(ch=='a')
            {
                ch1='z';

            }
            else if(ch=='b')
            {
                ch1='a';

            }
            else if(ch=='c')
            {
                ch1='b';

            }
            else if(ch=='d')
            {
                ch1='c';

            }
            else if(ch=='e')
            {
                ch1='d';

            }
            else if(ch=='f')
            {
                ch1='e';

            }
            else if(ch=='g')
            {
                ch1='f';

            }
            else if(ch=='h')
            {
                ch1='g';

            }
            else if(ch=='i')
            {
                ch1='h';

            }
            else if(ch=='j')
            {
                ch1='i';

            }
            else if(ch=='k')
            {
                ch1='j';

            }
            else if(ch=='l')
            {
                ch1='k';

            }
            else if(ch=='m')
            {
                ch1='l';

            }else if(ch=='n')
            {
                ch1='m'; 

            
            
            }
            else if(ch=='o')
            {
                ch1='n';

            
            
            }else if(ch=='p')
            {
                ch1='o';

            
            
            }else if(ch=='q')
            {
                ch1='p';

            
            
            }else if(ch=='r')
            {
                ch1='q';

            
            
            }else if(ch=='s')
            {
                ch1='r';

            
            
            }else if(ch=='t')
            {
                ch1='s';

            
            
            }else if(ch=='u')
            {
                ch1='t';

            
            
            }else if(ch=='v')
            {
                ch1='u';

            
            
            }else if(ch=='w')
            {
                ch1='v';

            }else if(ch=='x')
            {
                ch1='w';
            
            }else if(ch=='y')
            {
                ch1='x';

            }else if(ch=='z')
            {
                ch1='y';      
            
            }
            else {
                System.out.println(" ");
            }
			arr[j] = ch1;
			sd = sd + arr[j];
		  }            //for ends
			}        // while ends
           
		               //System.out.print(ch1);
                  //sd=String.valueOf(ch1);
                // System.out.println(sd);      
           try
           {  
             
             FileOutputStream fos = new FileOutputStream(strFilePath);
            
             
             
              DataOutputStream dos = new DataOutputStream(fos);
              System.out.println(sd);
               dos.writeBytes(sd);
              
               
                dos.close();
               
           }
           catch (Exception e)
           {
             System.out.println("IOException : " + e);
           }    
        }     //try ends
		  catch(Exception e)//1
         {
          System.out.println("IOException : " + e);
           }
         
            }     //end of function
             
              
    
    
public static void main(String args[])
 {
 
     decrypt dc = new decrypt();
	 System.out.println("Please enter the file name..");
	 if(args.length > 0) {
		 
            String file = new String(args[0]);
            String file1 = " ";
			System.out.println(args[0]);
			dc.decryp(file,file1);
			//rd.dry();
	 }


    }
}



