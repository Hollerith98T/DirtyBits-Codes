//connessione uno a uno
import java.io.*;
import java.net.*;

public class BaseServer
{

    ServerSocket server = null;
    Socket socketClient = null;

    int porta = 6789; //porta server

    DataOutputStream out;
    DataInputStream in;

    public Socket attendi()
    {
        try
        {
            System.out.println("[0] - Avvio il server..");
            //inizializziamo il servizio
            server = new ServerSocket(porta);

            System.out.println("[1] - Server pronto, in ascolto sulla porta:" + porta);
            // attende la connessione del client
            socketClient = server.accept();

            //evitiamo connessioni multiple
            System.out.println("[2] - Connessione completa");
            server.close();
            in = new DataInputStream(socketClient.getInputStream());
            out = new DataOutputStream(socketClient.getOutputStream());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return socketClient;
    }



    public static void main(String[] args)
    {
        BaseServer s = new BaseServer();
        s.attendi();
    }
}
