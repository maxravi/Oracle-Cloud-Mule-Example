package com.javatransformertest;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;

import oracle.cloud.storage.CloudStorage;
import oracle.cloud.storage.CloudStorageConfig;
import oracle.cloud.storage.CloudStorageFactory;

public class myComponent {
	
	public String myMethod(String payload, String myVariable) throws IOException {
		
		 CloudStorageConfig myConfig = new CloudStorageConfig();
			
		 
		
		 //System.out.print("ffname "+ffname);
		    try {
				myConfig.setServiceName(“****”).setServiceUrl(“****”)
				.setUsername(“****”).setPassword(“****”.toCharArray());
				CloudStorage myConnection = CloudStorageFactory.getStorage(myConfig);
				FileInputStream fis = new FileInputStream("//tmp//"+myVariable);
				 myConnection.storeObject("filetest11", myVariable, "multipart/form-data", fis);
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		
		
		return null;
		}

}
