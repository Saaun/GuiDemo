
import org.codehaus.jackson.map.ObjectMapper;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ittraining
 */
public class JsonUtil {
 public static void main(String[] args){
     ObjectMapper mapper = new ObjectMapper();
     String JsonData="{\"name\":\"Saaun\",\"address\":\"sanepa\"}"; 
     try{
     }         
     catch(Exception e){
    
 
}

 }   
}
class Student{
    private String name;
    private String address;

    public Student() {
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
