package app.dataservice.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="data_service_api_1")
public class DataServiceApi {
	
	public void test()
	{
		DataServiceApi test=new DataServiceApi();
		test.setADDR_HN("4463");
		test.setADDR_PD("");
		test.setADDR_PT("");
		test.setADDR_SD("");
		test.setADDR_SN("SPRINGBROOK");
		test.setADDR_ST("DRIVE");
		//test.setAPT_UNIT(null);
		//test.setCOMMUNITY(null);
		test.setCOORSYS("2264");
		test.setCOUNTY_NAME("ALAMANCE");
		test.setDDLat("35.98075N");
		test.setDDLon("079.44818W");
		test.setENTRY_ID("ALAMANCEPARCELS8304");
		test.setFIPS(1);
		test.setFULL_ADDRESS("4463 SPRINGBROOK DRIVE ");
		test.setGEOMETRY_X(-79.51763390447286);
		test.setGEOMETRY_Y(36.16701855937523);
		test.setOBJECTID(2);
		test.setPO_NAME("BURLINGTON");
		test.setPOINT_X(1867397.48117268);
		test.setPOINT_Y(812186.97817992);
		test.setPROCESS_ID("B");
		//test.setRECORD_ID(1);
		test.setRES_TYPE(" ");
		test.setSTATE("NC");
		test.setSTATE_ID(37);
	//	test.setSUB_HN(null);
		test.setUSNG("17S PV 39901 82926");
		test.setWK_ID(4326);
		test.setZIPCODE("27215");
		
		
		
	}
	public DataServiceApi() {
		
	}
@Id
private Long RECORD_ID;
private Long WK_ID;
private double GEOMETRY_X;
private double GEOMETRY_Y;
private int OBJECTID;

private String ENTRY_ID;
private String ADDR_HN;
private String ADDR_PD;
private String ADDR_PT;
private String ADDR_SN;
private String ADDR_ST;
private String ADDR_SD;
private String FULL_ADDRESS;
private int SUB_HN;
private int APT_UNIT;
private String RES_TYPE;
private int COMMUNITY;
private String ZIPCODE;
private String PO_NAME;
private String STATE;
private String COUNTY_NAME;
private int FIPS;
private int STATE_ID;
private String COORSYS;
private double POINT_X;
private double POINT_Y;
private String USNG;
private String DDLat;
private String DDLon;
private String PROCESS_ID;
private Date CREATION_DATE;
public DataServiceApi(Long rECORD_ID, Long wK_ID, double gEOMETRY_X, double gEOMETRY_Y, int oBJECTID, String eNTRY_ID,
		String aDDR_HN, String aDDR_PD, String aDDR_PT, String aDDR_SN, String aDDR_ST, String aDDR_SD,
		String fULL_ADDRESS, int sUB_HN, int aPT_UNIT, String rES_TYPE, int cOMMUNITY, String zIPCODE,
		String pO_NAME, String sTATE, String cOUNTY_NAME, int fIPS, int sTATE_ID, String cOORSYS,double pOINT_X,
		double pOINT_Y, String uSNG, String dDLat, String dDLon, String pROCESS_ID, Date cREATION_DATE, String cOMMENTS_1,
		String cOMMENTS_2, String cOMMENTS_3) {
	super();
	RECORD_ID = rECORD_ID;
	WK_ID = wK_ID;
	GEOMETRY_X = gEOMETRY_X;
	GEOMETRY_Y = gEOMETRY_Y;
	OBJECTID = oBJECTID;
	ENTRY_ID = eNTRY_ID;
	ADDR_HN = aDDR_HN;
	ADDR_PD = aDDR_PD;
	ADDR_PT = aDDR_PT;
	ADDR_SN = aDDR_SN;
	ADDR_ST = aDDR_ST;
	ADDR_SD = aDDR_SD;
	FULL_ADDRESS = fULL_ADDRESS;
	SUB_HN = sUB_HN;
	APT_UNIT = aPT_UNIT;
	RES_TYPE = rES_TYPE;
	COMMUNITY = cOMMUNITY;
	ZIPCODE = zIPCODE;
	PO_NAME = pO_NAME;
	STATE = sTATE;
	COUNTY_NAME = cOUNTY_NAME;
	FIPS = fIPS;
	STATE_ID = sTATE_ID;
	COORSYS = cOORSYS;
	POINT_X = pOINT_X;
	POINT_Y = pOINT_Y;
	USNG = uSNG;
	DDLat = dDLat;
	DDLon = dDLon;
	PROCESS_ID = pROCESS_ID;
	CREATION_DATE = cREATION_DATE;
	COMMENTS_1 = cOMMENTS_1;
	COMMENTS_2 = cOMMENTS_2;
	COMMENTS_3 = cOMMENTS_3;
}
public Long getRECORD_ID() {
	return RECORD_ID;
}
public void setRECORD_ID(Long rCORD_ID) {
	RECORD_ID = rCORD_ID;
}
public Long getWK_ID() {
	return WK_ID;
}
public void setWK_ID(int i) {
	WK_ID =(long) i;
}
public double getGEOMETRY_X() {
	return GEOMETRY_X;
}
public void setGEOMETRY_X(double gEOMETRY_X) {
	GEOMETRY_X = gEOMETRY_X;
}
public double getGEOMETRY_Y() {
	return GEOMETRY_Y;
}
public void setGEOMETRY_Y(double gEOMETRY_Y) {
	GEOMETRY_Y = gEOMETRY_Y;
}
public int getOBJECTID() {
	return OBJECTID;
}
public void setOBJECTID(int oBJECTID) {
	OBJECTID = oBJECTID;
}
public String getENTRY_ID() {
	return ENTRY_ID;
}
public void setENTRY_ID(String eNTRY_ID) {
	ENTRY_ID = eNTRY_ID;
}
public String getADDR_HN() {
	return ADDR_HN;
}
public void setADDR_HN(String aDDR_HN) {
	ADDR_HN = aDDR_HN;
}
public String getADDR_PD() {
	return ADDR_PD;
}
public void setADDR_PD(String aDDR_PD) {
	ADDR_PD = aDDR_PD;
}
public String getADDR_PT() {
	return ADDR_PT;
}
public void setADDR_PT(String aDDR_PT) {
	ADDR_PT = aDDR_PT;
}
public String getADDR_SN() {
	return ADDR_SN;
}
public void setADDR_SN(String aDDR_SN) {
	ADDR_SN = aDDR_SN;
}
public String getADDR_ST() {
	return ADDR_ST;
}
public void setADDR_ST(String aDDR_ST) {
	ADDR_ST = aDDR_ST;
}
public String getADDR_SD() {
	return ADDR_SD;
}
public void setADDR_SD(String aDDR_SD) {
	ADDR_SD = aDDR_SD;
}
public String getFULL_ADDRESS() {
	return FULL_ADDRESS;
}
public void setFULL_ADDRESS(String fULL_ADDRESS) {
	FULL_ADDRESS = fULL_ADDRESS;
}
public int getSUB_HN() {
	return SUB_HN;
}
public void setSUB_HN(int sUB_HN) {
	SUB_HN = sUB_HN;
}
public int  getAPT_UNIT() {
	return APT_UNIT;
}
public void setAPT_UNIT(int aPT_UNIT) {
	APT_UNIT = aPT_UNIT;
}
public String getRES_TYPE() {
	return RES_TYPE;
}
public void setRES_TYPE(String rES_TYPE) {
	RES_TYPE = rES_TYPE;
}
public int getCOMMUNITY() {
	return COMMUNITY;
}
public void setCOMMUNITY(int cOMMUNITY) {
	COMMUNITY = cOMMUNITY;
}
public String getZIPCODE() {
	return ZIPCODE;
}
public void setZIPCODE(String zIPCODE) {
	ZIPCODE = zIPCODE;
}
public String getPO_NAME() {
	return PO_NAME;
}
public void setPO_NAME(String pO_NAME) {
	PO_NAME = pO_NAME;
}
public String getSTATE() {
	return STATE;
}
public void setSTATE(String sTATE) {
	STATE = sTATE;
}
public String getCOUNTY_NAME() {
	return COUNTY_NAME;
}
public void setCOUNTY_NAME(String cOUNTY_NAME) {
	COUNTY_NAME = cOUNTY_NAME;
}
public int getFIPS() {
	return FIPS;
}
public void setFIPS(int fIPS) {
	FIPS = fIPS;
}
public int getSTATE_ID() {
	return STATE_ID;
}
public void setSTATE_ID(int sTATE_ID) {
	STATE_ID = sTATE_ID;
}
public String getCOORSYS() {
	return COORSYS;
}
public void setCOORSYS(String cOORSYS) {
	COORSYS = cOORSYS;
}
public double getPOINT_X() {
	return POINT_X;
}
public void setPOINT_X(double pOINT_X) {
	POINT_X = pOINT_X;
}
public double getPOINT_Y() {
	return POINT_Y;
}
public void setPOINT_Y(double pOINT_Y) {
	POINT_Y = pOINT_Y;
}
public String getUSNG() {
	return USNG;
}
public void setUSNG(String uSNG) {
	USNG = uSNG;
}
public String getDDLat() {
	return DDLat;
}
public void setDDLat(String dDLat) {
	DDLat = dDLat;
}
public String getDDLon() {
	return DDLon;
}
public void setDDLon(String dDLon) {
	DDLon = dDLon;
}
public String getPROCESS_ID() {
	return PROCESS_ID;
}
public void setPROCESS_ID(String pROCESS_ID) {
	PROCESS_ID = pROCESS_ID;
}
public Date getCREATION_DATE() {
	return CREATION_DATE;
}
public void setCREATION_DATE(Date cREATION_DATE) {
	CREATION_DATE = cREATION_DATE;
}
public String getCOMMENTS_1() {
	return COMMENTS_1;
}
public void setCOMMENTS_1(String cOMMENTS_1) {
	COMMENTS_1 = cOMMENTS_1;
}
public String getCOMMENTS_2() {
	return COMMENTS_2;
}
public void setCOMMENTS_2(String cOMMENTS_2) {
	COMMENTS_2 = cOMMENTS_2;
}
public String getCOMMENTS_3() {
	return COMMENTS_3;
}
public void setCOMMENTS_3(String cOMMENTS_3) {
	COMMENTS_3 = cOMMENTS_3;
}

private String COMMENTS_1;
private String COMMENTS_2;
private String COMMENTS_3;

public String toString()
{
	return "["+this.COUNTY_NAME+","+this.FULL_ADDRESS+"]";
}

}
