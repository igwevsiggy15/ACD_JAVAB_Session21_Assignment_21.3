package student;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import student.Student;


public class StudentClient {
	private static SessionFactory factory;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		factory = new Configuration().configure().buildSessionFactory();
		Student st  = new Student();
	
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
		//st.setStJoinDate("2018-01-20",df);
		try {
			st.setStJoinDate(df.parse("2018-07-05"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		st.setStMarks(25);
		st.setStName("Dale");
		//st.setStId(8);
		Session session =factory.openSession();
		 //factory.getCurrentSession();
		
		Transaction tnx = session.beginTransaction();
		Integer idInserted= (Integer)session.save(st);
		
		System.out.println("ID inserted is:"+idInserted);
		tnx.commit();
		session.close();
		
		
	}

}