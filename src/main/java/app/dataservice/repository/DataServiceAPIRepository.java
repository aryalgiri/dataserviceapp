package app.dataservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.dataservice.entity.DataServiceApi;

public interface DataServiceAPIRepository extends JpaRepository<DataServiceApi,Long>{ 

}
