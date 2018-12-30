package comp;
import java.io.*;

import javax.persistence.*;

@Entity

@Table(name="Employees")

public class Emp implements Serializable{
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name = "street",
		column = @Column(name="STREET")),
		@AttributeOverride(name = "area",
		column = @Column(name="AREA"))
		})
	private Address locadd;

@Embedded
private Name ename=new Name();
private int empno;
private int sal;


public Name getEname() {
	return ename;
}

public void setEname(Name ename) {
	this.ename = ename;
}

public Address getLocadd() {
	return locadd;
}

public void setLocadd(Address locadd) {
	this.locadd = locadd;
}

public boolean equals(Object o)
{
	 return super.equals(o);
}

 public int hashCode()
 {
	 return super.hashCode();
 }
 @Id
 @Column(updatable=false, name="EMPNUM",nullable=false, length=6)
public int getEmpno(){
 return empno;
 }

public int getSal(){
  return sal;
  }

 public void setSal(int sal){
   this.sal=sal;
   }

public void setEmpno(int empno){
    this.empno=empno;
    }
}
