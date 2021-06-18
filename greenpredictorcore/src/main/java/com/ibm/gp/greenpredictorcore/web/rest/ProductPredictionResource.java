package com.ibm.gp.greenpredictorcore.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class ProductPredictionResource {
	
	private final Logger log = LoggerFactory.getLogger(ProductPredictionResource.class);

	 @GetMapping("/status")
	    public ResponseEntity<String> status() {
	        
	        return new ResponseEntity<String>("Hello",HttpStatus.OK);
	    }

    @GetMapping("/pridictioninfo")
    public ResponseEntity<String> getPridictioninfo(@RequestParam("product") String productname) {
        log.debug("REST request to get Pridictioninfo : {}", productname);
        String json = getJSONPredictionResponse(productname);
        System.out.println("json: "+json);
        return new ResponseEntity<String>(getJSONPredictionResponse(productname),HttpStatus.OK);
    }
    
    
    private String getJSONPredictionResponse(String productCode) {
    	String jsonresponse = "{\r\n" + 
    			"    \"productname\": "+productCode+",\r\n" + 
    			"    \"product category\": \"fruit\",\r\n" + 
    			"    \"forcastinfo\": {\r\n" + 
    			"        \"yoy\": {\r\n" + 
    			"            \"startdate\": \"01-apr-2020\",\r\n" + 
    			"            \"enddate\": \"31-mar-2021\",\r\n" + 
    			"            \"forecast\": \"29.0%\",\r\n" + 
    			"            \"actual\": \"24.6%\",\r\n" + 
    			"            \"previous\": \"42.4%\",\r\n" + 
    			"            \"status\": \"declined\",\r\n" + 
    			"            \"change%\": \"-1%\"\r\n" + 
    			"        },\r\n" + 
    			"        \"mom\": {\r\n" + 
    			"            \"startdate\": \"01-apr-2020\",\r\n" + 
    			"            \"enddate\": \"31-mar-2021\",\r\n" + 
    			"            \"forecast\": \"29.0%\",\r\n" + 
    			"            \"actual\": \"24.6%\",\r\n" + 
    			"            \"previous\": \"42.4%\",\r\n" + 
    			"            \"status\": \"declined\",\r\n" + 
    			"            \"change%\": \"-1%\"\r\n" + 
    			"        },\r\n" + 
    			"        \"wow\": {\r\n" + 
    			"            \"startdate\": \"01-apr-2020\",\r\n" + 
    			"            \"enddate\": \"31-mar-2021\",\r\n" + 
    			"            \"forecast\": \"29.0%\",\r\n" + 
    			"            \"actual\": \"24.6%\",\r\n" + 
    			"            \"previous\": \"42.4%\",\r\n" + 
    			"            \"status\": \"declined\",\r\n" + 
    			"            \"change%\": \"-1%\"\r\n" + 
    			"        },\r\n" + 
    			"        \"top10suppliers\": [\r\n" + 
    			"            {\r\n" + 
    			"                \"suppliers\": [\r\n" + 
    			"                    {\r\n" + 
    			"                        \"supplier1\": {\r\n" + 
    			"                            \"suppliername\": \"abc\",\r\n" + 
    			"                            \"address\": \"xyz\",\r\n" + 
    			"                            \"items\": [\r\n" + 
    			"                                {\r\n" + 
    			"                                    \"item\": {\r\n" + 
    			"                                        \"itemname\": \"mango\",\r\n" + 
    			"                                        \"itemcode\": \"mang-in-badam\",\r\n" + 
    			"                                        \"available qty\": \"5mt\",\r\n" + 
    			"                                        \"cost\": {\r\n" + 
    			"                                            \"cost item per unit\": \"1000rs\",\r\n" + 
    			"                                            \"unit size\": \"1quintal\"\r\n" + 
    			"                                        }\r\n" + 
    			"                                    }\r\n" + 
    			"                                }\r\n" + 
    			"                            ]\r\n" + 
    			"                        }\r\n" + 
    			"                    }\r\n" + 
    			"                ]\r\n" + 
    			"            }\r\n" + 
    			"        ]\r\n" + 
    			"    }\r\n" + 
    			"}";
    	
    	return jsonresponse;
    }

}
