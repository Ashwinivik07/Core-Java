package com.xworkz.service;

import java.sql.SQLException;

import com.xworkz.dto.SPdto;
import com.xworkz.repository.SPRepo;
import com.xworkz.repository.SPRepoImpl;


public class SPServiceImpl implements SPService{

	SPRepo repo = new SPRepoImpl();
	
	@Override
	public boolean validateAndSave(SPdto dto) throws SQLException {
		if(dto !=null) {
			System.out.println("Dto is not null we can save the data");
			boolean save = repo.validateAndSave(dto);
			return true;
		}else {
			System.out.println("Dto is null we cant save the null values");
			return false;	
		}
	}

	public boolean onSearchByProductVersion(Double version) throws SQLException {
		boolean	search=false;
		if(version!=0) {
			search=repo.onSearchByProductVersion(version);
			return true;
		}
		return false;
}
	@Override
	public boolean onSearchById(int id) throws SQLException {
		boolean	search=false;
		if(id!=0) {
			search=repo.onSearchById(id);
			return true;
		}
		return false;
	}
	@Override
	public boolean onSearchBySoftwareName(String softwareName) throws SQLException {
		boolean	search=false;
		if(softwareName!=null) {
			search=repo.onSearchBySoftwareName(softwareName);
			return true;
		}
		return false;
	}
	@Override
	public boolean readAll() throws SQLException {
		boolean read=repo.readAll();
		return false;
	}
	@Override
	public boolean onDelete(String softwareName) throws SQLException {
		boolean delete=false;
		if(softwareName!=null) {
			delete=repo.onDelete(softwareName);
		
			return true;
		
		}else {
			return false;
		}
		
	}
	@Override
	public boolean onUpdateByOsVersion(double osVersion, double price) throws SQLException {
		boolean update=false;
		if(osVersion!=0 && price!=0) {
			update= repo.onUpdateByOsVersion(osVersion, price);
		return true;
		}else {
		return false;
	}

	}
	@Override
	public boolean onUpdate(double osVersion, double version) throws SQLException {
		boolean update=false;
		if(osVersion!=0 && version!=0) {
			update= repo.onUpdate(osVersion, version);
		return true;
		}else {
		return false;
	}
		
	}
	@Override
	public boolean onUpdate(int id, String userName, String email, long phoneNumber, String softwareName,
			double version, int DOE, String password, double price, double osVersion) throws SQLException {
		boolean isUpdated = false;
		if (id != 0 && userName!=null && email!=null && phoneNumber!=0 && softwareName!=null && version!=0 && DOE!=0 && password!=null && price!=0 && osVersion!=0) { 
		isUpdated = repo.onUpdate(id,userName,email,phoneNumber,softwareName,version,DOE,password,price,osVersion); 
			System.out.println(isUpdated);
			return true;	
		}else {
			return false;
		
	}
		
	}
}