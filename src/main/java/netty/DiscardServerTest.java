package netty;

public class DiscardServerTest {
    public static void main(String[] args) throws Exception {
        int port;
        if (args.length > 0) {
            port = Integer.parseInt(args[0]);
        } else {
            port = 8080;
        }
        DiscardServer server= new DiscardServer(port);
        server.run();
        System.out.println("server:run()");


    }

}
