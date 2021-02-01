package app.dataservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.dataservice.entity.DataServiceEntity;
import app.dataservice.repository.DataServiceRepository;

@Service
public class DataServiceComponent {
	DataServiceRepository dataRepository;
	
@Autowired
	public DataServiceComponent(DataServiceRepository dataRepository) {
	//	super();
		this.dataRepository = dataRepository;
	}
	public Long saveData(DataServiceEntity record){
		System.out.println("::::::savedata START::::::::");
		Long id=dataRepository.save(record).getId();
		System.out.println("::::::savedata END::::::::");
		return id;
	}
	public String saveAll()
	{
		return "SUCCESS";
	}

}
