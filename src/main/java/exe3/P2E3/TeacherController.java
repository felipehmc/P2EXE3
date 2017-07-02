package exe3.P2E3;

public class TeacherController extends Controller{
	private Teacher model;
	private TeacherView view;

	public TeacherController(Teacher model, TeacherView view) {
		super();
		this.model = model;
		this.view = view;
	}

	@Override
	public void updateView() {
		view.printTeacherDetails(model.getName(), model.getRollNo());
	}

	@Override
	public void setName(String name) {
		model.setName(name);
		
	}

	@Override
	public void setRollNo(String rollNo) {
		model.setRollNo(rollNo);
	}

	@Override
	public String getName() {
		return model.getName();
	}

	@Override
	public String getRollNo() {
		return model.getRollNo();
	}

}
