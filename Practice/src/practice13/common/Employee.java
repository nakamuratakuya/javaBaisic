package practice13.common;

public class Employee extends Person {
	private String departmentNm;		//部署名//
	private int departmentCnt;			//部署の人数//

	public String getDepartmentNm() {
		return departmentNm;
	}

	public void setDepartmentNm(String departmentNm) {
		this.departmentNm = departmentNm;
	}

	public int getDepartmentCnt() {
		return departmentCnt;
	}

	public void setDepartmentCnt(int departmentCnt) {
		this.departmentCnt = departmentCnt;
	}

}
