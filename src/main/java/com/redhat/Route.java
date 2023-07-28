package com.redhat;
import org.apache.camel.builder.RouteBuilder;

public class Route extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        // Consume from the message broker queue
        from("jms:queue:orders")
            .log("received ${body} from JMS queue");


    }
}