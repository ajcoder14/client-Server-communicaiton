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

// It is server side java code
import java.net.*;
import java.io.*;

class Server
{
    public static void main(String arg[]) throws Exception
    {
        System.out.println("Server Application is runnng...");
        ServerSocket ssobj=new ServerSocket(2100);
        System.out.println("Server is running at part no: 2100");

        Socket s=ssobj.accept();
        System.out.println("Server and client connection is succesful");

        PrintStream ps = new PrintStream(s.getOutputStream());

        BufferedReader br1 =new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedReader br2 =new BufferedReader(new InputStreamReader(System.in));

        System.out.println("chat messager started...");
        String str1,str2;
        while((str1=br1.readLine()) !=null)
        {
            System.out.println("Client says: "+str1);
            System.out.println("Enter message for client:");
            str2=br2.readLine();
            ps.println(str2);
        }
        System.out.println("Thank you for using chat messanger...");
    }
}
