package main.java.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.java.daopackage.DAOClass;


@Service(value="serviceclass")
public class ServiceClassImpl implements ServiceClass {

	@Autowired
	private DAOClass daoClass;
	
	@Override
	public String getData(int id) {
		//DAOClass daoClass = new DAOClassImpl();
		//Don't use new. Because at dao class, there's autowiring injection for namedparameterjdbc template
		//It fails if I use new here, because Spring dont know to autowire it.
		//Or use @Configurable
		//Details here:
		//http://stackoverflow.com/questions/19896870/why-is-my-spring-autowired-field-null
		String data = daoClass.getData();
		return "This is sample data coming from server. + " + data;
	}

	@Override
	public String getDataWithoutDB(int id) {
		return "success data" + id;
	}

}
