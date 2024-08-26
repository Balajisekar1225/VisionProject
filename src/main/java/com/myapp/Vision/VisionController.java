package com.myapp.Vision;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VisionController {
	
//	normal curd project 
	@Autowired
	VisionService versionser;
	@PostMapping(value="add") 
	public String addvalue(@RequestBody Vision v) throws AgeException {
		return versionser.addvalue(v);
	}
	@GetMapping(value="getvalue")
	public List<Vision> getall() {		
		return versionser.getall();
	}
//	@PatchMapping(value="update/{id}")
//	public String update(@RequestBody Vision v, @PathVariable int id) {
//		return versionser.update(v,id);
	//}
	@PutMapping(value ="Updateall")
	public String updateall(@RequestBody Vision v) {
		return versionser.updateall(v);
	
		
	}
	@GetMapping(value="getbyids") 
	public List<Vision> getvisionbyids(@RequestParam List<Long> ids) {
		return versionser.getvisionbyids(ids);
	}
	@GetMapping(value="getcity")
	public List<Vision>getcityall() {
		return versionser.getcityall();
	}
}
