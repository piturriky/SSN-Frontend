package ssn.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.11.redhat-3
 * 2015-12-05T17:11:12.563+01:00
 * Generated source version: 2.7.11.redhat-3
 * 
 */
@WebServiceClient(name = "SSNWSService", 
                  wsdlLocation = "file:/C:/Users/Llu�s/workspace/SSN_WS/wsdl/SSNWSService.wsdl",
                  targetNamespace = "http://ws.ssn/") 
public class SSNWSService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://ws.ssn/", "SSNWSService");
    public final static QName SSNWSPort = new QName("http://ws.ssn/", "SSNWSPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/Llu�s/workspace/SSN_WS/wsdl/SSNWSService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(SSNWSService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/Llu�s/workspace/SSN_WS/wsdl/SSNWSService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public SSNWSService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SSNWSService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SSNWSService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SSNWSService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SSNWSService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SSNWSService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns SSNWS
     */
    @WebEndpoint(name = "SSNWSPort")
    public SSNWS getSSNWSPort() {
        return super.getPort(SSNWSPort, SSNWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SSNWS
     */
    @WebEndpoint(name = "SSNWSPort")
    public SSNWS getSSNWSPort(WebServiceFeature... features) {
        return super.getPort(SSNWSPort, SSNWS.class, features);
    }

}