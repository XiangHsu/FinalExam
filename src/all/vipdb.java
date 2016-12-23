package all;
public class vipdb {

	private String id,pw;
	
	public vipdb() {
	}
	public vipdb(String id1) {
		id = id1;
	}
	public vipdb(String id1, String pw1) {
		id = id1;
		pw = pw1;
	}
	
	public void setid(String id2) {
		id = id2;
	}
	public void setpw(String pw2) {
		pw = pw2;
	}
	public String getid() {return id;}
	public String getpw() {return pw;}
	public void showAll(){
		//System.out.println("- - - - - - - - - - - - - - - -");
		//System.out.println(id+"??��?�您??�入??�員??");
		//System.out.println("- - - - - - - - - - - - - - - -");
	}
}