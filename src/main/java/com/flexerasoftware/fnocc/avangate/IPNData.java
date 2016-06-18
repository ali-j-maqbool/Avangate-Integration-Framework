package com.flexerasoftware.fnocc.avangate;

import java.util.HashMap;

public class IPNData {

	
		
	public String getSALEDATE() {
		return SALEDATE;
	}

	public void setSALEDATE(String sALEDATE) {
		SALEDATE = sALEDATE;
		FieldsWithValue.put("SALEDATE" , sALEDATE);

	}

	public String getREFNO() {
		return REFNO;
	}

	public void setREFNO(String rEFNO) {
		REFNO = rEFNO;
		FieldsWithValue.put("REFNO" , rEFNO);

	}

	public String getREFNOEXT() {
		return REFNOEXT;
	}

	public void setREFNOEXT(String rEFNOEXT) {
		REFNOEXT = rEFNOEXT;
		FieldsWithValue.put("REFNOEXT" , rEFNOEXT);

	}

	public String getORDERNO() {
		return ORDERNO;
	}

	public void setORDERNO(String oRDERNO) {
		ORDERNO = oRDERNO;
		FieldsWithValue.put("ORDERNO" , oRDERNO);

	}

	public String getORDERSTATUS() {
		return ORDERSTATUS;
		
	}

	public void setORDERSTATUS(String oRDERSTATUS) {
		ORDERSTATUS = oRDERSTATUS;
		FieldsWithValue.put("ORDERSTATUS" , oRDERSTATUS);

	}

	public String getPAYMETHOD() {
		return PAYMETHOD;
	}

	public void setPAYMETHOD(String pAYMETHOD) {
		PAYMETHOD = pAYMETHOD;
		FieldsWithValue.put("PAYMETHOD" , pAYMETHOD);

	}

	public String getFIRSTNAME() {
		return FIRSTNAME;
	}

	public void setFIRSTNAME(String fIRSTNAME) {
		FIRSTNAME = fIRSTNAME;
		FieldsWithValue.put("FIRSTNAME" , fIRSTNAME);

	}

	public String getLASTNAME() {
		return LASTNAME;
	}

	public void setLASTNAME(String lASTNAME) {
		LASTNAME = lASTNAME;
		FieldsWithValue.put("LASTNAME" , lASTNAME);

	}

	public String getIDENTITY_NO() {
		return IDENTITY_NO;
	}

	public void setIDENTITY_NO(String iDENTITY_NO) {
		IDENTITY_NO = iDENTITY_NO;
		FieldsWithValue.put("IDENTITY_NO" , iDENTITY_NO);

	}

	public String getIDENTITY_ISSUER() {
		return IDENTITY_ISSUER;

	}

	public void setIDENTITY_ISSUER(String iDENTITY_ISSUER) {
		IDENTITY_ISSUER = iDENTITY_ISSUER;
		FieldsWithValue.put("IDENTITY_ISSUER" , iDENTITY_ISSUER);

	}

	public String getCOMPANY() {
		return COMPANY;
	}

	public void setCOMPANY(String cOMPANY) {
		COMPANY = cOMPANY;
		FieldsWithValue.put("COMPANY" , cOMPANY);

	}

	public String getREGISTRATIONNUMBER() {
		return REGISTRATIONNUMBER;
	}

	public void setREGISTRATIONNUMBER(String rEGISTRATIONNUMBER) {
		REGISTRATIONNUMBER = rEGISTRATIONNUMBER;
		FieldsWithValue.put("REGISTRATIONNUMBER" , rEGISTRATIONNUMBER);

	}

	public String getFISCALCODE() {
		return FISCALCODE;
	}

	public void setFISCALCODE(String fISCALCODE) {
		FISCALCODE = fISCALCODE;
		FieldsWithValue.put("FISCALCODE" , fISCALCODE);

	}

	public String getCBANKNAME() {
		return CBANKNAME;
	}

	public void setCBANKNAME(String cBANKNAME) {
		CBANKNAME = cBANKNAME;
		FieldsWithValue.put("CBANKNAME" , cBANKNAME);

	}

	public String getCBANKACCOUNT() {
		return CBANKACCOUNT;
	}

	public void setCBANKACCOUNT(String cBANKACCOUNT) {
		CBANKACCOUNT = cBANKACCOUNT;
		FieldsWithValue.put("CBANKACCOUNT" , cBANKACCOUNT);

	}

	public String getADDRESS1() {
		return ADDRESS1;
	}

	public void setADDRESS1(String aDDRESS1) {
		ADDRESS1 = aDDRESS1;
		FieldsWithValue.put("ADDRESS1" , aDDRESS1);

	}

	public String getADDRESS2() {
		return ADDRESS2;
	}

	public void setADDRESS2(String aDDRESS2) {
		ADDRESS2 = aDDRESS2;
		FieldsWithValue.put("ADDRESS2" , aDDRESS2);

	}

	public String getCITY() {
		return CITY;
	}

	public void setCITY(String cITY) {
		CITY = cITY;
		FieldsWithValue.put("CITY",cITY);

	}

	public String getSTATE() {
		return STATE;
	}

	public void setSTATE(String sTATE) {
		STATE = sTATE;
		FieldsWithValue.put("STATE",sTATE);

	}

	public String getZIPCODE() {
		return ZIPCODE;
	}

	public void setZIPCODE(String zIPCODE) {
		ZIPCODE = zIPCODE;
		FieldsWithValue.put("ZIPCODE",zIPCODE);

	}

	public String getCOUNTRY() {
		return COUNTRY;
	}

	public void setCOUNTRY(String cOUNTRY) {
		COUNTRY = cOUNTRY;
		FieldsWithValue.put("COUNTRY",cOUNTRY);

	}

	public String getPHONE() {
		return PHONE;
	}

	public void setPHONE(String pHONE) {
		PHONE = pHONE;
		FieldsWithValue.put("PHONE",pHONE);

	}

	public String getFAX() {
		return FAX;
	}

	public void setFAX(String fAX) {
		FAX = fAX;
		FieldsWithValue.put("FAX",fAX);
	}

	public String getCUSTOMEREMAIL() {
		return CUSTOMEREMAIL;
	}

	public void setCUSTOMEREMAIL(String cUSTOMEREMAIL) {
		CUSTOMEREMAIL = cUSTOMEREMAIL;
		FieldsWithValue.put("CUSTOMEREMAIL",cUSTOMEREMAIL);
	}

	public String getFIRSTNAME_D() {
		return FIRSTNAME_D;
	}

	public void setFIRSTNAME_D(String fIRSTNAME_D) {
		FIRSTNAME_D = fIRSTNAME_D;
		FieldsWithValue.put("FIRSTNAME_D",fIRSTNAME_D);
	}

	public String getLASTNAME_D() {
		return LASTNAME_D;
	}

	public void setLASTNAME_D(String lASTNAME_D) {
		LASTNAME_D = lASTNAME_D;
		FieldsWithValue.put("LASTNAME_D",lASTNAME_D);
	}

	public String getCOMPANY_D() {
		return COMPANY_D;
	}

	public void setCOMPANY_D(String cOMPANY_D) {
		COMPANY_D = cOMPANY_D;
		FieldsWithValue.put("COMPANY_D",cOMPANY_D);
	}

	public String getADDRESS1_D() {
		return ADDRESS1_D;
	}

	public void setADDRESS1_D(String aDDRESS1_D) {
		ADDRESS1_D = aDDRESS1_D;
		FieldsWithValue.put("ADDRESS1_D",aDDRESS1_D);
	}

	public String getADDRESS2_D() {
		return ADDRESS2_D;
	}

	public void setADDRESS2_D(String aDDRESS2_D) {
		ADDRESS2_D = aDDRESS2_D;
		FieldsWithValue.put("ADDRESS2_D",aDDRESS2_D);
	}

	public String getCITY_D() {
		return CITY_D;
	}

	public void setCITY_D(String cITY_D) {
		CITY_D = cITY_D;
		FieldsWithValue.put("CITY_D",cITY_D);	

	}

	public String getSTATE_D() {
		return STATE_D;
	}

	public void setSTATE_D(String sTATE_D) {
		STATE_D = sTATE_D;
		FieldsWithValue.put("STATE_D",sTATE_D);
	}

	public String getZIPCODE_D() {
		return ZIPCODE_D;
	}

	public void setZIPCODE_D(String zIPCODE_D) {
		ZIPCODE_D = zIPCODE_D;
		FieldsWithValue.put("ZIPCODE_D",zIPCODE_D);
	}

	public String getCOUNTRY_D() {
		return COUNTRY_D;
	}

	public void setCOUNTRY_D(String cOUNTRY_D) {
		COUNTRY_D = cOUNTRY_D;
		FieldsWithValue.put("COUNTRY_D",cOUNTRY_D);
	}

	public String getPHONE_D() {
		return PHONE_D;
	}

	public void setPHONE_D(String pHONE_D) {
		PHONE_D = pHONE_D;
		FieldsWithValue.put("PHONE_D",pHONE_D);
	}

	public String getIPADDRESS() {
		return IPADDRESS;
	}

	public void setIPADDRESS(String iPADDRESS) {
		IPADDRESS = iPADDRESS;
		FieldsWithValue.put("IPADDRESS",iPADDRESS);
	}

	public String getCURRENCY() {
		return CURRENCY;
	}

	public void setCURRENCY(String cURRENCY) {
		CURRENCY = cURRENCY;
		FieldsWithValue.put("CURRENCY",cURRENCY);
	}
	

	public String getIPN_PID() {
		return IPN_PID;
	}

	public void setIPN_PID(String iPN_PID) {
		IPN_PID = iPN_PID;
		FieldsWithValue.put("IPN_PID",iPN_PID);
	}

	public String getIPN_PNAME() {
		return IPN_PNAME;
	}

	public void setIPN_PNAME(String iPN_PNAME) {
		IPN_PNAME = iPN_PNAME;
		FieldsWithValue.put("IPN_PNAME",iPN_PNAME);
	}

	public String getIPN_PCODE() {
		return IPN_PCODE;
	}

	public void setIPN_PCODE(String iPN_PCODE) {
		IPN_PCODE = iPN_PCODE;
		FieldsWithValue.put("IPN_CODE",iPN_PCODE);
	}

	public String getIPN_INFO() {
		return IPN_INFO;
	}

	public void setIPN_INFO(String iPN_INFO) {
		IPN_INFO = iPN_INFO;
		FieldsWithValue.put("IPN_INFO",iPN_INFO);
	}

	public String getIPN_QTY() {
		return IPN_QTY;
	}

	public void setIPN_QTY(String iPN_QTY) {
		IPN_QTY = iPN_QTY;
		FieldsWithValue.put("IPN_QTY",iPN_QTY);

	}

	public String getIPN_PRICE() {
		return IPN_PRICE;
	}

	public void setIPN_PRICE(String iPN_PRICE) {
		IPN_PRICE = iPN_PRICE;
		FieldsWithValue.put("IPN_PRICE",iPN_PRICE);
	}

	public String getIPN_VAT() {
		return IPN_VAT;
	}

	public void setIPN_VAT(String iPN_VAT) {
		IPN_VAT = iPN_VAT;
		FieldsWithValue.put("IPN_VAT",iPN_VAT);
	}

	public String getIPN_VER() {
		return IPN_VER;
	}

	public void setIPN_VER(String iPN_VER) {
		IPN_VER = iPN_VER;
		FieldsWithValue.put("IPN_VER",iPN_VER);
	}

	public String getIPN_DISCOUNT() {
		return IPN_DISCOUNT;
	}

	public void setIPN_DISCOUNT(String iPN_DISCOUNT) {
		IPN_DISCOUNT = iPN_DISCOUNT;
		FieldsWithValue.put("IPN_DISCOUNT",iPN_DISCOUNT);
	}

	public String getIPN_PROMONAME() {
		return IPN_PROMONAME;
	}

	public void setIPN_PROMONAME(String iPN_PROMONAME) {
		IPN_PROMONAME = iPN_PROMONAME;
		FieldsWithValue.put("IPN_PROMONAME",iPN_PROMONAME);
	}

	public String getIPN_DELIVEREDCODES() {
		return IPN_DELIVEREDCODES;
	}

	public void setIPN_DELIVEREDCODES(String iPN_DELIVEREDCODES) {
		IPN_DELIVEREDCODES = iPN_DELIVEREDCODES;
		FieldsWithValue.put("IPN_DELIVEREDCODES",iPN_DELIVEREDCODES);
	}

	public String getIPN_TOTAL() {
		return IPN_TOTAL;
	}

	public void setIPN_TOTAL(String iPN_TOTAL) {
		IPN_TOTAL = iPN_TOTAL;
		FieldsWithValue.put("IPN_TOTAL",iPN_TOTAL);
	}

	public String getIPN_TOTALGENERAL() {
		return IPN_TOTALGENERAL;
	}

	public void setIPN_TOTALGENERAL(String iPN_TOTALGENERAL) {
		IPN_TOTALGENERAL = iPN_TOTALGENERAL;
		FieldsWithValue.put("IPN_TOTALGENERAL",iPN_TOTALGENERAL);
	}

	public String getIPN_SHIPPING() {
		return IPN_SHIPPING;
	}

	public void setIPN_SHIPPING(String iPN_SHIPPING) {
		IPN_SHIPPING = iPN_SHIPPING;
		FieldsWithValue.put("IPN_SHIPPING",iPN_SHIPPING);
	}

	public String getIPN_COMMISSION() {
		return IPN_COMMISSION;
	}

	public void setIPN_COMMISSION(String iPN_COMMISSION) {
		IPN_COMMISSION = iPN_COMMISSION;
		FieldsWithValue.put("IPN_COMMISSION", iPN_COMMISSION);
	}

	public String getIPN_DATE() {
		return IPN_DATE;
	}

	public void setIPN_DATE(String iPN_DATE) {
		IPN_DATE = iPN_DATE;
		FieldsWithValue.put("IPN_DATE",iPN_DATE);
		
	}

	public String getHASH() {
		return HASH;
	}

	public void setHASH(String hASH) {
		HASH = hASH;
	}
	

	private String SALEDATE = "";

	private String REFNO= "";
	
	private String REFNOEXT= "";
	
	private String ORDERNO= "";
	
	private String ORDERSTATUS= "";
	
	private String PAYMETHOD= " ";
	
	private String FIRSTNAME= "";
	
	private String LASTNAME= "";
	
	private String IDENTITY_NO= "";
	
	private String IDENTITY_ISSUER= "";
	
	private String COMPANY= "";
	
	private String REGISTRATIONNUMBER= "";
	
	private String FISCALCODE= "";
	
	private String CBANKNAME= "";
	
	private String CBANKACCOUNT= "";
	
	private String ADDRESS1=  "";
	
	private String ADDRESS2= "";
	
	private String CITY= "";
	
	private String STATE= "";
	
	private String ZIPCODE= "";
	
	private String COUNTRY= "";
	
	private String PHONE= "";
	
	private String FAX= "";
	
	private String CUSTOMEREMAIL= "";
	
	private String FIRSTNAME_D= "";
	
	private String LASTNAME_D= "";
	
	private String COMPANY_D= "";
	
	private String ADDRESS1_D= "";
	
	private String ADDRESS2_D= "";
	
	private String CITY_D= "";
	
	private String STATE_D= "";
	
	private String ZIPCODE_D= "";
	
	private String COUNTRY_D= "";
	
	private String PHONE_D= "";
	
	private String IPADDRESS= "";
	
	private String CURRENCY= "";
	
	private String IPN_PID= "";
	
	private String IPN_PNAME= "";
	
	private String IPN_PCODE= "";
	
	private String IPN_INFO= "";
	
	private String IPN_QTY= "";
	
	private String IPN_PRICE= "";
	
	private String IPN_VAT= "";
	
	private String IPN_VER= "";
	
	private String IPN_DISCOUNT= "";
	
	private String IPN_PROMONAME= "";
	
	private String IPN_DELIVEREDCODES= "";
	
	private String IPN_TOTAL= "";
	
	private String IPN_TOTALGENERAL= "";
	
	private String IPN_SHIPPING= "";
	
	private String IPN_COMMISSION= "";
	
	private String IPN_DATE= "";
	
	private String HASH="";
	
	private HashMap<String, String> FieldsWithValue = new HashMap<String, String>();

	public void setIPNData(String key, String value) {
		FieldsWithValue.put(key, value);
	}

	public HashMap<String, String> getFieldsWithValue() {
		return FieldsWithValue;
	}
	
	

	
}
