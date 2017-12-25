package AdapterDesignPattern.Main;

import AdapterDesignPattern.com.pen.AssignmentWork;
import AdapterDesignPattern.com.pen.Pen;
import AdapterDesignPattern.com.pen.PenAdapter;

public class School {

	public static void main(String[] args) {
		// now we want to write the assignment using pen but pen dont write
		// implementation
		// so use pilot pen implementation to write using composition

		// get the pen using pen adapter
		Pen p = new PenAdapter();
		// write the assignment using Pen p
		AssignmentWork aw = new AssignmentWork();
		aw.setPen(p);
		aw.writeAssignment("i dont want to write assignment");

	}
}
