package comp;
import javax.persistence.*;

@Embeddable
class Address{
	private String street;
	private String area;

	public String getStreet(){
	 return street;
	 }

	 public String getArea(){
	  return area;
	  }


	 public void setStreet(String street){
	    this.street=street;
	    }

	 public void setArea(String area){
	    this.area=area;
	    }
	 public String toString(){
		 return area+"   "+street;
	 }
}