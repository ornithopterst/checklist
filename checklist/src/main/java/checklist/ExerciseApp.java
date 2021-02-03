package checklist;

import java.awt.EventQueue;

import org.apache.commons.dbcp2.BasicDataSource;

import checklist.gui.MainScreen;
import checklist.model.ExerciseDAO;
import checklist.model.jdbc.JDBCExerciseDAO;

public class ExerciseApp {

//	private ExerciseDAO sampleDAO = null;
	
	public static void main(String[] args) {
//		ExerciseApp exerciseApp = new ExerciseApp();
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainScreen window = new MainScreen();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		System.out.println("hi");
	}
	
//	public ExerciseApp(){
//		// Sample definition for a PostgreSQL database named "sample" hosted on localhost at port 5432
//		BasicDataSource dataSource = new BasicDataSource();
//		dataSource.setUrl("jdbc:postgresql://localhost:5432/sample");
//		dataSource.setUsername("postgres");
//		dataSource.setPassword("postgres1");
//		
//		// Create an instance of the SampleDAO
//		sampleDAO = new JDBCExerciseDAO(dataSource);
//	}

}
