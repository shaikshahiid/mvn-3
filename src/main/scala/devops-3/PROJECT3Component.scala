package devops-3


import org.apache.camel.Endpoint
import org.apache.camel.impl.DefaultComponent
import java.util.Map

/**
 * Represents the component that manages {@link PROJECT3Endpoint}.
 */
class PROJECT3Component extends DefaultComponent {

  protected def createEndpoint(uri: String, remaining: String, parameters: Map[String, Object]): Endpoint = {

    val endpoint = new PROJECT3Endpoint(uri, this)
    setProperties(endpoint, parameters)

    endpoint
  }
}
