package AdapterDesignPattern.com.pen;

public class PenAdapter implements Pen {
	// use composition
	PilotPen pp = new PilotPen();

	public void write(String str) {
		pp.mark(str);
	}

}
