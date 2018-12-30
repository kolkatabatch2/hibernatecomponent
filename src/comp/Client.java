package comp;

import comp.EmpManager;


public class Client{

public static void main(String []a){
	EmpManager em1=new EmpManager();
	em1.insert(1001,"Smith","Bent",45000,2456,"aaaa","bbbb");
	em1.insert(1002,"Sam","Dan",45000,6578,"asdf","xcvb");
	em1.insert(1002,"Samsung","Rock",45000,6578,"asdf","xcvb");
	em1.list();

}
}
