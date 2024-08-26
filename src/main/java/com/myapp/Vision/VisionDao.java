package com.myapp.Vision;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;


@Repository
public class VisionDao {
	@Autowired
	VisionRepository  versionRepo;
	public String addvalue(Vision v) {
		versionRepo.save(v);
		return "successfully";
	}
	public List<Vision> getall() {
		return versionRepo.findAll();
	}
//	public String update(Vision v ,int id) {
//		Vision x = versionRepo.findById(id).get();
//		x.setAge(v.getAge());
//		versionRepo.save(x);
//		return "Successfully";
//	Vision x = versionRepo.findById(id).get();
//	x.setAge(x.getAge());
//	x.setCity(x.getCity());
//	x.setName(x.getName());
//	x.setSalary(x.getSalary());
//	return "Successfully";
//	}
	public String updateall(Vision v) {
		versionRepo.save(v);
		return "Successfully";
	}
	public List<Vision> getvisionbyids(List<Long> ids) {
		return versionRepo.findAllById(ids);
	}
	public List<Vision>getcityall() {
		List<Vision> x = versionRepo.findAll();
		return x.stream().filter(y->y.getCity().equals("Madurai")).toList();
		
	}
	
	}
	
