package com.xworkz.Controller;

import java.sql.SQLException;

import com.xworkz.dto.SPdto;
import com.xworkz.service.SPService;
import com.xworkz.service.SPServiceImpl;


public class SPRunner {
	
	public static void main(String[] args) throws SQLException {
		SPdto dto=new SPdto();
		
		dto.setId(3);
		dto.setUserName("Vikranth");
		dto.setEmail("vikki034@gmail.com");
		dto.setPhoneNumber(8970007165l);
		dto.setSoftwareName("Civil3D");
		dto.setVersion(5.0);
		dto.setDoe(2024);
		dto.setPassword("Vikki@123");
		dto.setPrice(5000.00);
		dto.setOsVersion(11.2);
		System.out.println(dto.toString());
		
		SPService service=new SPServiceImpl();
		//service.validateAndSave(dto);
		//service.onSearchByProductVersion(8.2);
		//service.onSearchById(6);
		//service.onSearchBySoftwareName("Autocad");
		//service.readAll();
		//service.onDelete("Civil3D");
		//service.onUpdateByOsVersion(11.2, 5500.0);
		//service.onUpdate(11.2, 10.0);
		service.onUpdate(1, "Kushi", "Kushi12@gmail.com",9740322295l, "3DxMax", 4.1, 01-2024, "setha", 1000, 5.1);
			}

}
