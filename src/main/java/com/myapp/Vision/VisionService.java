package com.myapp.Vision;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class VisionService {
	@Autowired
	VisionDao visiondao;
	public String addvalue(Vision v) throws AgeException {
//		try {
//			if(v.getAge()>18) {
//				throw new AgeException("Age is valid");
//			}else {
//				return visiondao.addvalue(v);
//			}
//		}
//		catch (AgeException ae) {
//			return "invalid age";
//			
//		}
		try {
			if(v.getAge()>18) {
				throw new AgeException("Age is valid");
			}else {
				return visiondao.addvalue(v);
			}
		}
		catch (AgeException ae) {
			return "invalid age";
		}
	}
	public List<Vision> getall() {
		return visiondao.getall();
	}
//	public String update(Vision v, int id) {
//		return visiondao.update(v,id);
	//}
	public String updateall(Vision v) {
		return visiondao.updateall(v);
	
	}
	public List<Vision> getvisionbyids( List<Long> ids) {
		return  visiondao.getvisionbyids(ids);
	}
	public List<Vision>getcityall() {
		return visiondao.getcityall();
	
	}
}
