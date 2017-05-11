package com.riaz.camel;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.spring.SpringRouteBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MyRouter extends SpringRouteBuilder {

    private static final Logger log = LoggerFactory.getLogger(MyRouter.class);


    @Produce(uri="activemq:queue:new_queue")
    ProducerTemplate primary;
    
	@Override
	public void configure() throws Exception {
		processEvents();
	}

	private void processEvents() {
		from("jetty:http://127.0.0.1:8881/test").process(new Processor() {
            public void process(Exchange exchange) throws Exception {
                String message = exchange.getIn().getBody(String.class);
                System.out.println("Hello Mr :" + message);
                exchange.getOut().setBody("Hello world Mr " + message);
            }
        });
		
		from("activemq:queue:test_queue").log("from queue");
	}
}
