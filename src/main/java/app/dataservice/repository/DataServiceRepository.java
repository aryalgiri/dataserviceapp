package app.dataservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.dataservice.entity.DataServiceEntity;

public interface DataServiceRepository extends JpaRepository<DataServiceEntity,Long>{

}
