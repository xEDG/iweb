
package ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "DrawdedeWebService", targetNamespace = "http://ws/", wsdlLocation = "http://localhost:8080/Drawdede-war/DrawdedeWebService?wsdl")
public class DrawdedeWebService_Service
    extends Service
{

    private final static URL DRAWDEDEWEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException DRAWDEDEWEBSERVICE_EXCEPTION;
    private final static QName DRAWDEDEWEBSERVICE_QNAME = new QName("http://ws/", "DrawdedeWebService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Drawdede-war/DrawdedeWebService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        DRAWDEDEWEBSERVICE_WSDL_LOCATION = url;
        DRAWDEDEWEBSERVICE_EXCEPTION = e;
    }

    public DrawdedeWebService_Service() {
        super(__getWsdlLocation(), DRAWDEDEWEBSERVICE_QNAME);
    }

    public DrawdedeWebService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), DRAWDEDEWEBSERVICE_QNAME, features);
    }

    public DrawdedeWebService_Service(URL wsdlLocation) {
        super(wsdlLocation, DRAWDEDEWEBSERVICE_QNAME);
    }

    public DrawdedeWebService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, DRAWDEDEWEBSERVICE_QNAME, features);
    }

    public DrawdedeWebService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DrawdedeWebService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns DrawdedeWebService
     */
    @WebEndpoint(name = "DrawdedeWebServicePort")
    public DrawdedeWebService getDrawdedeWebServicePort() {
        return super.getPort(new QName("http://ws/", "DrawdedeWebServicePort"), DrawdedeWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DrawdedeWebService
     */
    @WebEndpoint(name = "DrawdedeWebServicePort")
    public DrawdedeWebService getDrawdedeWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws/", "DrawdedeWebServicePort"), DrawdedeWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (DRAWDEDEWEBSERVICE_EXCEPTION!= null) {
            throw DRAWDEDEWEBSERVICE_EXCEPTION;
        }
        return DRAWDEDEWEBSERVICE_WSDL_LOCATION;
    }

}
