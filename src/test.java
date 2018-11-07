import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;


public class test {

    private static boolean testip(String addr, int openport, int to) {
        try{
            try (Socket soc = new Socket()){
                int timeout = 5000;
                soc.connect(new InetSocketAddress(addr, openport), timeout);
            }
            return true;
        }catch (IOException ex){
            return false;
        }
    }

    public static void main(String[] args){
        GetIP get = new GetIP();
        String addr = "padmins.ru";
        int openport = 80;
        int to = 5000;
        boolean sdf = testip(addr, openport, to);
        System.out.println(get.ip(addr));
        System.out.println(sdf);
    }



}