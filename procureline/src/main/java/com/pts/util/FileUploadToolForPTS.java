package com.pts.util;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import javax.servlet.ServletContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import com.pts.procureline.serviceimpl.GenericServiceImpl;

public class FileUploadToolForPTS {
	
	private static final Logger logger = LoggerFactory.getLogger(GenericServiceImpl.class);	
	
	@Autowired
	static ServletContext c;
	
	public static  boolean saveFile(MultipartFile file,String pathtoupload)
	{
		
		
			if (!file.isEmpty()) {
				try {

					byte[] bytes = file.getBytes();

					// Creating the directory to store file
					String rootPath = System.getProperty("catalina.home");
					File dir = new File(rootPath + File.separator + "tmpFiles");
					if (!dir.exists())
						dir.mkdirs();

					// Create the file on server
					System.out.println(pathtoupload);
					File serverFile = new File(pathtoupload);
				
					BufferedOutputStream stream = new BufferedOutputStream(
					new FileOutputStream(serverFile));
					stream.write(bytes);
					stream.close();

					logger.info("Server File Location=" + serverFile.getAbsolutePath());

				} catch (Exception e) {
					System.out.println(e);
					
					
				}
			} 
			else {
			
			}
		
		return false;
	}

}
