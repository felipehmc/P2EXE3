package exe3.P2E3;

import java.lang.reflect.InvocationTargetException;

public class ControllerFactoryReflection {
	
	public static Controller buildController(String m, Teacher teacher, TeacherView view) {
		Controller controller = null;
		try {
			
			String firstLetter = m.substring(0, 1).toUpperCase();
			String rest = m.substring(1).toLowerCase();
			Class<?> ctrl = Class.forName("exe03."+firstLetter+rest+"Controller");
			controller = (Controller) ctrl.getDeclaredConstructor(Teacher.class, TeacherView.class).newInstance(teacher, view);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return controller;
	}
	
	public static Controller buildController(String m, Student student, StudentView view) {
		Controller controller = null;
		try {
			
			String firstLetter = m.substring(0, 1).toUpperCase();
			String rest = m.substring(1).toLowerCase();
			Class<?> ctrl = Class.forName("exe03."+firstLetter+rest+"Controller");
			controller = (Controller) ctrl.getDeclaredConstructor(Student.class, StudentView.class).newInstance(student, view);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return controller;
	}
}
