import java.net.InetAddress;
import java.net.UnknownHostException;

class GetIP {
    String ip(String hostname) {
        InetAddress address = null;
        try {
            address = InetAddress.getByName(hostname);
        } catch (UnknownHostException e) {
            System.exit(2);
        }
        return address.getHostAddress();
    }
}