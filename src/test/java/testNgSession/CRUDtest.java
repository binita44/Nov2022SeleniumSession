package testNgSession;

import org.testng.annotations.Test;

public class CRUDtest {
	public void creatuser() {
		System.out.println(" User created");
	}
	public void getuser() {
		System.out.println(" Get user info" );
	}
	public void updateuser() {
		System.out.println(" User updated");
	}
	public void deletuser() {
		System.out.println(" User deleted");
	}
	//It is best way to write cases that are dependent
	//Even it will not be a issue on parallel execution
	//
	
	@Test
	public void creatUserTest() {
		creatuser();
	}
	@Test
	public void getUserTest() {
		creatuser();
		getuser();
	}
	@Test
	public void updateUserTest() {
		creatuser();
		getuser();
		updateuser();
		getuser();
	}
	@Test
	public void deletUserTest() {
		creatuser();//post
		getuser();//get
		deletuser();//delete
		getuser();//get
	}
	
//	@Test
//	public void getusertesting() {
//		int userid = 123;
//		getuser(userid);
//	
//	}


}
