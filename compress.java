import java.util.*;
import java.io.*;
//package com.myjava.string;

 public class compress
{  
         
 
      
               //String strFilePath = b+".txt";         
		 //Scanner sc = new Scanner(System.in);
   //String sr = "pppphhhhhh";
   //System.out.println("The program begins");
   
   //declaring variables to be used 
   
   String st = "";
   int count,j,len; char ch;int[] arr=new int[26]; int z; int small; int[] west= new int[26];
   String sr=" ";   
				int g;	char ch2;
			public void comp(String a,String b)
			{
                            String strFilePath = b+".txt";         
		 Scanner sc = new Scanner(System.in);
		try {
			FileInputStream ob= new FileInputStream(a);
		while((g=ob.read()) != -1)
            {
                
                ch2=((char)g);
                sr=sr + String.valueOf(ch2);
                
            }
		
					len = sr.length();
	   
	   System.out.println(sr +"The length :" + len);
	   char i;
	   for(i='a';i<='z';i++)
	  {
		count = 0;   
		for (j=0;j<len;j++)
		{
		 ch =  sr.charAt(j);
		 if(ch ==  i){
		 	 count++;         //incrementing the count if alphabet found
		   if(count>2)
			System.out.println(String.valueOf(i) +  Integer.toString(count));
		    
		    //sr.replace(i,"no");
		 }
		}           //closing of normal for loop
				 if(count>0)
				 {
                     arr[i-97]=count;                   //feeding frequencies of characters in the array
				  
						System.out.println("Character is " + i + " Its frequency is:" + count +"");
		                 //System.out.println(sr);
			 //System.out.println("arr:"+arr[i-97]);
                     st = st+(String.valueOf(i)+Integer.toString(count));			 
				 }
	  }
	  
	  try //2
    {
    
    FileOutputStream fos = new FileOutputStream(strFilePath);
     DataOutputStream dos = new DataOutputStream(fos);
      System.out.println(st);
      // dos.writeChars(st);
       dos.writeBytes(st);
 
      dos.close();
    
    }
    catch(Exception e)//2
    {
    System.out.println("IOException : " + e);
    }
    
      System.out.println(st);	  
		}
         catch(Exception e)
		 {
			 System.out.println(e);
		 }		
					
			}
	  
	  public static void main(String args[])
	  {
		  compress c= new compress();
                  System.out.println("Please enter the file name..");
        
                   String file = " ";	String file1 = " ";
		  c.comp(file,file1);
	  }
	  }
		   
              
		  
		
		
		
	
	
	
	
	
	
