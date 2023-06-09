////////////////////////////////////////////////////////////////////////////////////////////////
//                                                                                            //
//  Program Name :clinet-server communication                                                 //
//                                                                                            //
//  Description :  This application performs communicaiton between client and server it just  //
//                 over view of it.                                                           //
//  Author :     Aniket Dattatray Jadhav.                                                     //
//  Date :         22-04-2023                                                                 //
//                                                                                            //
////////////////////////////////////////////////////////////////////////////////////////////////  

// It is client side java code
import java.net.*;
import java.io.*;

class Client
{
    public static void main(String arg[]) throws Exception
    {
        System.out.println("Client Application is runnng...");

        System.out.println("Client is waiting for connection");
        Socket s=new Socket("localhost",2100);

        PrintStream ps=new PrintStream(s.getOutputStream());

        BufferedReader br1 =new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedReader br2 =new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Chat messaner started...");
        String str1,str2;
        System.out.println("Enter message for server");

        while(!(str1=br2.readLine()).equals("end"))
        {
            ps.println(str1);
            str2=br1.readLine();
            System.out.println("Enter message for server");
            System.out.println("Server says: "+str2);
        }
        System.out.println("Thank you for using chat messanger...");

    }
}
