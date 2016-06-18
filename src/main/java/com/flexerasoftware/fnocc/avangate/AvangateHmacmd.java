package com.flexerasoftware.fnocc.avangate;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;
 
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class AvangateHmacmd {

	private static String alg;
    private static String data;
    private static String key;
   
    private AvangateHmacmd() {
           alg = "HmacMD5";
           data = null;
           key = null;
    }

    protected String toHexString(byte[] bytes) {
           Formatter form = new Formatter();
           String result;
          
           for (byte b: bytes) {
                  form.format("%02x", b);
           }
          
           result =  form.toString();
           form.close();
           return result;
    }

    public static AvangateHmacmd getInstance() {
    	AvangateHmacmd md5 = new AvangateHmacmd();
           return md5;
    }
   
    public static AvangateHmacmd getInstance(String ds, String k) {
    	AvangateHmacmd md5 = new AvangateHmacmd();
           data = ds;
           key = k;
          
           return md5;
    }
   
    public String calculatehmac() throws NoSuchAlgorithmException, InvalidKeyException {
          
           if ((key == null)|| (data == null))
                  return null;
          
           SecretKeySpec secKey = new SecretKeySpec(key.getBytes(), alg);
           Mac mac = Mac.getInstance(alg);
           mac.init(secKey);
          
          
           return toHexString(mac.doFinal(data.getBytes()));
    }

    public String calculatehmac(String dt, String k) throws NoSuchAlgorithmException, InvalidKeyException {
          
           if ((dt == null) || (k == null))
                  return null;
          
           SecretKeySpec secKey = new SecretKeySpec(k.getBytes(), alg);
          
           Mac mac = Mac.getInstance(alg);
          
           mac.init(secKey);
          
           return toHexString(mac.doFinal(dt.getBytes()));
    }
}

