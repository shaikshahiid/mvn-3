package devops-3

import org.apache.camel.Exchange
import org.apache.camel.impl.DefaultProducer


/**
 * The PROJECT3 producer.
 */
class PROJECT3Producer(endpoint: PROJECT3Endpoint) extends DefaultProducer(endpoint) {

  def process(exchange: Exchange) : Unit = {
    println(exchange.getIn().getBody())
  }

}
