package app;

import tv.centrala.ws.TvCentralWS;

import javax.xml.ws.Endpoint;

public class CentralaApp {

    public static void main(String[] argv) {
        Object implementor = new TvCentralWS();
        String address = "http://localhost:8082/centrala";
        Endpoint.publish(address, implementor);
    }
}
