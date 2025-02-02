/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
class chat 
{
	public static void main(String[] args) throws IOExpection {
     Socket S = new Socket("localhost",6666);
     DataOutputStream dout = new DataOutputStream(S.getOutputStream());
     dout.writeUTF("Hi");
     dout.flush();
     dout.close();
     s.close();
	   }
	  
   }
	