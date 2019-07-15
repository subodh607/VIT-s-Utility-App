import java.util.*;
import java.io.*;
//package com.myjava.string;

 

public class unzip
{  
         //String strFilePath = b+".txt";         
         //Scanner sc = new Scanner(System.in);
         int len;
         char ch;
         char ch1, ch2;
         char num;
         String str1="";
         String str="";
          int result = 0;
         String se="";
         String sr="";
         String st="";
         int g;
         
         void repeat(String str1, int result)
        {

        for(int k =0; k < result; k++)
          {
            System.out.print(str1);
            str = str +str1;
          }
        }
  
               
         void dcomp(String a,String b)
         {
             String strFilePath = b+".txt";         
         Scanner sc = new Scanner(System.in);
            try 
            {
			             FileInputStream ob= new FileInputStream(a);
		                 while((g=ob.read()) != -1)
                        {
                            ch2=((char)g);
                             sr=sr + String.valueOf(ch2);
                        }
	                    len = sr.length();
	                    System.out.println(sr +"The length :" + len);
	                    char i;
	           
		            for (int j=0;j<len;j++)
	            	{
                        ch =  sr.charAt(j); //varible
                        if(j%2 == 0)
                        {
                         ch1=ch;
                        
                         str1=String.valueOf(ch1);
                        }
                         else
                        {
                         num=ch;
                        se=String.valueOf(num);
                        result = Integer.parseInt(se);
                        repeat (str1,result);
                         }
                         st = st+str1;
                    }
                    		
                 
            }
                   
                      
        
   
		catch(Exception e)
        {
            System.out.println(e);
        }
    
       
	  try 
    {
    
    FileOutputStream fos = new FileOutputStream(strFilePath);
     DataOutputStream dos = new DataOutputStream(fos);
      //System.out.println(st);
      // dos.writeChars(st);
       dos.writeBytes(str);
 
      dos.close();
     // System.out.println(se1);	 
    
    }
    catch(Exception e)//2
    {
    System.out.println("IOException : " + e);
    }
}
    public static void main(String []args)
	  {
		  unzip up= new unzip();
                  String file = " ";String file1 = " ";
          up.dcomp(file,file1);
         
	  }
}
		   
              
		  
		
		
		
	
	
	
	
	
	
