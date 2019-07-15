import javax.swing.*;
import java.io.*;
import java.lang.*;
import java.io.FileOutputStream;

class readfile
{   
       String strFilePath = "";
	
	public void dry(String a,String b)
  {
	// strFilePath = "encrypted.txt";
          strFilePath = b+".txt";
       try//1
       {
			FileInputStream ob= new FileInputStream(a);
            String sd=""; int i=0; char ch2; int count=0; String se;int len; char ch; char[] arr = new char[100];
			 while((i=ob.read()) != -1)
			 {
			  ch2=((char)i);
                se=String.valueOf(ch2);
                len = se.length();
				
				for(int j=0; j<len; j++)
				{
				ch=se.charAt(j);
               char ch1;
            
            ch1=ch;
            if(ch=='a')
            {
                ch1='b';

            }
            else if(ch=='b')
            {
                ch1='c';

            }
            else if(ch=='c')
            {
                ch1='d';

            }
            else if(ch=='d')
            {
                ch1='e';

            }
            else if(ch=='e')
            {
                ch1='f';

            }
            else if(ch=='f')
            {
                ch1='g';

            }
            else if(ch=='g')
            {
                ch1='h';

            }
            else if(ch=='h')
            {
                ch1='i';

            }
            else if(ch=='i')
            {
                ch1='j';

            }
            else if(ch=='j')
            {
                ch1='k';

            }
            else if(ch=='k')
            {
                ch1='l';

            }
            else if(ch=='l')
            {
                ch1='m';

            }
            else if(ch=='m')
            {
                ch1='n';

            }else if(ch=='n')
            {
                ch1='o'; 

            
            
            }
            else if(ch=='o')
            {
                ch1='p';

            
            
            }else if(ch=='p')
            {
                ch1='q';

            
            
            }else if(ch=='q')
            {
                ch1='r';

            
            
            }else if(ch=='r')
            {
                ch1='s';

            
            
            }else if(ch=='s')
            {
                ch1='t';

            
            
            }else if(ch=='t')
            {
                ch1='u';

            
            
            }else if(ch=='u')
            {
                ch1='v';

            
            
            }else if(ch=='v')
            {
                ch1='w';

            
            
            }else if(ch=='w')
            {
                ch1='x';

            }else if(ch=='x')
            {
                ch1='y';
            
            }else if(ch=='y')
            {
                ch1='z';

            }else if(ch=='z')
            {
                ch1='a';      
            
            }
            else {
                System.out.println(" ");
            }
			arr[j] = ch1; 
			sd = sd + arr[j];
				}//for end
               
			 }//while end
			 
			 
 
 
 try //2
 {
 
 FileOutputStream fos = new FileOutputStream(strFilePath);
  DataOutputStream dos = new DataOutputStream(fos);
   System.out.println(sd);
	//dos.writeChars(sd);
	dos.writeBytes(sd);

        dos.close();
 
 }
 catch(Exception e)//2
 {
 System.out.println("IOException : " + e);
 }
 
 }
 catch(Exception e)//1
 {
 System.out.println("IOException : " + e);
 }
	
	
	 }
	
 public static void main(String args[])
 {
         
     readfile rd = new readfile();
	 System.out.println("Please enter the file name..");
        
	                String file= " "; String file1=" ";
			rd.dry(file,file1);
			//rd.dry();
	 }
	     
	 //System.out.println(args[rd.dry()]);
	 //rd.dry(args[]);
 
 
 
 }
