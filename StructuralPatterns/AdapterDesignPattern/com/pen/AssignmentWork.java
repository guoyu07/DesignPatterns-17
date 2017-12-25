package AdapterDesignPattern.com.pen;

public class AssignmentWork {

	private Pen pen;

	public Pen getPen() {
		return pen;
	}

	public void setPen(Pen p) {
		this.pen = p;
	}
	
	public void writeAssignment(String str){
		pen.write(str);
		
	}
}
