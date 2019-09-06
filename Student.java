package student;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Student {

	private int stId;

	private String stName;

	private int stMarks;
	private Date stJoinDate;
	public Student() {
		
	}
	public int getStId() {
		return stId;
	}
	public void setStId(int stId) {
		this.stId = stId;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public int getStMarks() {
		return stMarks;
	}
	public void setStMarks(int stMarks) {
		this.stMarks = stMarks;
	}
	public Date getStJoinDate() {
		return stJoinDate;
	}
	public void setStJoinDate(Date stJoinDate) {
		this.stJoinDate=stJoinDate;
	}
	/*
	public void setStJoinDate(String strDate,SimpleDateFormat df) {
		try {
			this.stJoinDate = df.parse(strDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
	public String toString() {
		String str="id:"+stId+"\nName:"+stName+"\nMarks:"+stMarks+"\nstJoin"+stJoinDate;
		return str;
	}
}