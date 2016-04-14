package com.car._new.provider;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import com.car._new.Car;
import com.car._new.CarStoreProvider;

@WebService(name = "CarStoreProvider", serviceName = "CarStoreProviderService", 
portName = "CarStoreProviderServicePort", endpointInterface = "com.car._new.CarStoreProvider",
targetNamespace = "http://www.car.com/new", wsdlLocation = "/wsdl/car.wsdl")

@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public class CarStoreProviderImpl implements CarStoreProvider{

	@Override
	public String orderCar(Car carReq) {
		System.out.println("carReq = "+carReq.getBrand());
		System.out.println("carReq = "+carReq.getColor());
		System.out.println("carReq = "+carReq.getModel());
		System.out.println("carReq = "+carReq.getPrice());

		return "Order for your new car has been placed!";
	}
	

}
