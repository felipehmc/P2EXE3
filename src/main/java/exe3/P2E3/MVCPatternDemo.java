package exe3.P2E3;

public class MVCPatternDemo {
	public static void main(String[] args) {

		// fetch student record based on his roll no from the database
		Student smodel = retriveStudentFromDatabase();
		
		// Create a view : to write student details on console
		StudentView sview = new StudentView();
		
		//ControllerFactoryReflection
		ControllerFactoryReflection cf = new ControllerFactoryReflection();

		//StudentController controller = new StudentController(model, view);
		Controller scontroller = cf.buildController("student", smodel, sview);
		
		//controller.setTecaherName("Jake");
		scontroller.updateView();
		scontroller.setName("Paul");
		scontroller.updateView();
		
		// fetch teacher record based on his roll no from the database
		Teacher tmodel = retriveTeacherFromDatabase();
				
		// Create a view : to write teacher details on console
		TeacherView tview = new TeacherView();

		//TeacherController controller = new TeacherController(model, view);
		Controller tcontroller = cf.buildController("teacher", tmodel, tview);
				
		//controller.setTecaherName("Jake");
		tcontroller.updateView();
		tcontroller.setName("Jake");
		tcontroller.updateView();

	}

	private static Student retriveStudentFromDatabase() {
		Student student = new Student();
		student.setName("Robert");
		student.setRollNo("10");
		return student;
	}
	
	private static Teacher retriveTeacherFromDatabase() {
		Teacher teacher = new Teacher();
		teacher.setName("Galbert");
		teacher.setRollNo("32");
		return teacher;
	}

}
