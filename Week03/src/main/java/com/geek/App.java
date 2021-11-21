package com.geek;

import com.geek.inbound.HttpInboundServer;

import java.util.Collections;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        String proxyPort = System.getProperty("proxyPort","8888");

        String proxyServer = System.getProperty("proxyServer","http://localhost:8080");

        int port = Integer.parseInt(proxyPort);
        System.out.println( "GATEWAY starting...");
        HttpInboundServer server = new HttpInboundServer(port, Collections.singletonList(proxyServer));
        System.out.println("GATEWAY  started at http://localhost:" + port + " for server:" + server.toString());
        try {
            server.run();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
