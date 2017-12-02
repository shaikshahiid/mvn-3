package devops-3

import org.apache.camel.{Consumer, Processor, Producer}
import org.apache.camel.impl.DefaultEndpoint

/**
 * Represents a PROJECT3 endpoint.
 */
class PROJECT3Endpoint(uri:String, component: PROJECT3Component) extends DefaultEndpoint(uri, component) {

  def createProducer() : Producer = {
    new PROJECT3Producer(this)
  }

  def createConsumer(processor: Processor) : Consumer = {
    new PROJECT3Consumer(this, processor)
  }

  def isSingleton() : Boolean = true

}
