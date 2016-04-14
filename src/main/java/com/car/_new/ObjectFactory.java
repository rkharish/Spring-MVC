
package com.car._new;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.car._new package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CarResponse_QNAME = new QName("http://www.car.com/new", "carResponse");
    private final static QName _CarRequest_QNAME = new QName("http://www.car.com/new", "carRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.car._new
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Car }
     * 
     */
    public Car createCar() {
        return new Car();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.car.com/new", name = "carResponse")
    public JAXBElement<String> createCarResponse(String value) {
        return new JAXBElement<String>(_CarResponse_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Car }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.car.com/new", name = "carRequest")
    public JAXBElement<Car> createCarRequest(Car value) {
        return new JAXBElement<Car>(_CarRequest_QNAME, Car.class, null, value);
    }

}
