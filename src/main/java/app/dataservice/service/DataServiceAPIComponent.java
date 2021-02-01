package app.dataservice.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.dataservice.repository.DataServiceAPIRepository;

import app.dataservice.entity.DataServiceApi;

@Service
public class DataServiceAPIComponent {
	static Long  recordId=1L;
	DataServiceAPIRepository dataServiceAPIRepository;
	@Autowired
	public DataServiceAPIComponent(DataServiceAPIRepository dataServiceAPIRepository) {
		super();
		this.dataServiceAPIRepository = dataServiceAPIRepository;
	}
public String saveData(JsonAppData jsonAppData)
{
	List<DataServiceApi> dataList=new ArrayList();
	processData(jsonAppData,dataList);
	String result=saveAll(dataList);
	return result;
}
	private void processData(JsonAppData jsonAppData, List<DataServiceApi> dataList) {
	// TODO Auto-generated method stub
		 Features[] features=jsonAppData.getFeatures();
		 for(int i=0;i<features.length;i++) {
			 Map<String,Object> f=features[i].getAttributes();
			 DataServiceApi record=new DataServiceApi();
			 record.setWK_ID(443);
			 record.setRECORD_ID(recordId++);
			 record.setCOUNTY_NAME((String)f.get("COUNTRY_NAME"));
			 record.setFULL_ADDRESS((String)f.get("FULL_ADDRESS"));
			 record.setADDR_HN((String)f.get("ADDR_HN"));
			 record.setADDR_PD((String)f.get("ADDR_PD"));
			 record.setADDR_PT((String)f.get("ADDR_PT"));
			 record.setADDR_SD((String)f.get("ADDR_SD"));
			 record.setADDR_SN((String)f.get("ADDR_SN"));
			 record.setADDR_ST((String)f.get("ADDR_ST"));
			 //if(f.get("APT_UNIT")!=null)record.setAPT_UNIT((int)f.get("APT_UNIT"));
			 
			// if(f.get("COMMUNITY")!=null) record.setCOMMUNITY((int)f.get("COMMUNITY"));
			 record.setCOORSYS((String)f.get("COORSYS"));
			 record.setCOUNTY_NAME((String)f.get("COUNTY_NAME"));
			 record.setDDLat((String)f.get("DDLat"));
			 record.setDDLon((String)f.get("DDLon"));
			 record.setENTRY_ID((String)f.get("ENTRY_ID"));
			 
			if( f.get("FIPS")!=null) record.setFIPS((int)f.get("FIPS"));
			
			 record.setFULL_ADDRESS((String)f.get("FULL_ADDRESS"));
			 
			 //record.setGEOMETRY_X((double)f.get("GEOMETRY_X"));
			// record.setGEOMETRY_Y((double)f.get("GEOMETRY_Y"));
			 record.setSTATE((String)f.get("STATE"));
			 if (f.get("OBJECTID")!=null) record.setOBJECTID((int)f.get("OBJECTID"));
			 record.setWK_ID(443);
			 record.setRECORD_ID(recordId++);
			
			/* record.setADDR_HN(f.getADDR_HN());
			 record.setADDR_PD(f.getADDR_PD());
			 record.setADDR_PT(f.getADDR_PT());
			 record.setADDR_SD(f.getADDR_SD());
			 record.setADDR_SN(f.getADDR_SN());
			 record.setADDR_ST(f.getADDR_ST());
			 record.setAPT_UNIT(f.getAPT_UNIT());
			 record.setCOMMUNITY(f.getCOMMUNITY());
			 record.setCOORSYS(f.getCOORSYS());
			 record.setCOUNTY_NAME(f.getCOUNTY_NAME());
			 record.setDDLat(f.getDDLat());
			 
			 record.setDDLon(f.getDDLon());
			 record.setENTRY_ID(f.getENTRY_ID());
			 record.setFIPS(f.getFIPS());
			 record.setFULL_ADDRESS(f.getFULL_ADDRESS());
			 
			 //record.setGEOMETRY_X(f.getGEOMETRY_X());
			// record.setGEOMETRY_Y(f.getGEOMETRY_Y());
			 record.setSTATE(f.getSTATE());
			 record.setOBJECTID(f.getOBJECTID());
			 record.setWK_ID(443);
			 record.setRECORD_ID(recordId++);
			 */
			 System.out.println("record::"+record.toString());
			 
			 
			 
			 dataList.add(record);
		 }
	
}
	public String saveAll(List<DataServiceApi> dataServiceApiList)
	{
		dataServiceApiList.forEach(record->dataServiceAPIRepository.save(record));
		return "SUCCESS";
	}
	public DataServiceApi getData(Long id) {
		 System.out.println("inside getData");
		// TODO Auto-generated method stub
		return dataServiceAPIRepository.findById(id).get();
	}

}
