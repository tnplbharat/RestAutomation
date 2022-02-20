package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FinalObjectForPOJO {
	@Test
	public void validatePojoStructure() {
		try {
			Skills sk = new Skills("Testing", "medium");
			List<String> mobile = new ArrayList<>(Arrays.asList("1234", "2345"));
			FirstJsonObjectForPOJO fstJobj = new FirstJsonObjectForPOJO(1, "Claire", "Demmer", "abc@gmail.com", "male",
					mobile, sk);
			System.out.println(fstJobj);
			
			List<String> certifications = new ArrayList<>(Arrays.asList("OCP1","OCP2"));
			
			SecondSkills sndSkill = new SecondSkills("Automation", "Medium");
			SecondSkills sndSkill2 = new SecondSkills("Java", "Medium", certifications);
			List<SecondSkills> addSkills = new ArrayList<>();
			addSkills.add(sndSkill);
			addSkills.add(sndSkill2);
			
			SecondObjectForPOJO sndJobj = new SecondObjectForPOJO(2,"Carlos","Magenta","bc@gmail.com","Female",addSkills);
			
			List<Object> payloadData = new ArrayList<>();
			payloadData.add(fstJobj);
			payloadData.add(sndJobj);
			
			ObjectMapper objMaper = new ObjectMapper();

			String objData = objMaper.writerWithDefaultPrettyPrinter().writeValueAsString(payloadData);
			System.out.println(objData);
			
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
