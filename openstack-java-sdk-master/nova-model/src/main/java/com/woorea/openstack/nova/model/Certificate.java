package com.woorea.openstack.nova.model;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonRootName;
/**
 * @author Naresh
 * Class for JSON Root Name and access the data.
 */
@JsonRootName("certificate")
public class Certificate {
    /**
     * Private Variable data of type String.
     */
    private String data;
    /**
     * Access the JSON Property " private_key " 
     * Private Variable privateKey of type String.
     */
    @JsonProperty("private_key")
    private String privateKey;
    /**
     * @return the data which is got from the JSON.
     */
    public String getData() {
        return data;
    }
    /**
     * @return the privateKey which is got from the JSON.
     */
    public String getPrivateKey() {
        return privateKey;
    }
    /** 
     * @see java.lang.Object#toString()
     * Method to parse the JSON data.
     * @return the Certificate which has the data and Private Key.
     */
    @Override
    public String toString() {
        return "Certificate [data=" + data + ", privateKey=" + privateKey + "]";
    }
}
