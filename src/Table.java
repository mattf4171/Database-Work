
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Represents a table contains rows of Instructor
 *
 */
public class Table implements Iterable<Instructor> {
	
	private ArrayList<Instructor> instructors = new ArrayList<>();
	
	/**
	 * Add an instructor object to the table.
	 * If the ID of the instructor already exists in the table, then 
	 * do not add and return false.  Otherwise add the instructor object
	 * and return true.
	 * @param  Instructor object to be added to table
	 * @return
	 */
	public boolean insert(Instructor inst) {
		for(int i =0; i< instructors.size()-1; i++) {
			if(instructors.get(i).getID() == inst.getID()) { return false; } // case where ID is present in tbl
			else { 
				instructors.add(inst);
				return true; 
			}
		}
	}
	
	/**
	 * Remove the instructor object with ID value
	 * from the table.  Return false if no such object
	 * exists, other return true.
	 * @param ID
	 */
	public boolean delete(int ID) {
		for(int i=0; i<instructors.size()-1; i++) {
			if(instructors.get(i).getID() == ID) { // case where ID is found in tbl
				instructors.remove(i); // remove the ith object from tbl
				return true;
			} else { return false; } // no such object exists in tbl
		}
//		if(instructors.contains(ID)) {
//			instructors.remove(ID);
//			return true;
//		}else return false;
	}
	
	/**
	 * Return the Instructor object with the value ID,
	 * Return null if no such object exists in the table
	 * @param ID
	 */
	public Instructor lookup(int ID) {
		for(int i = 0; i < instructors.size(); i++) {
			if(instructors.get(i).getID() == ID) {
				Instructor in = instructors.get(i);
				return new Instructor(in.getID(), in.getName(), in.getDept_name(), in.getSalary());
			}else { return null; }
		}
	}
	
	/**
	 * Return a Table of Instructor objects filtered by the 
	 * predicate  attrName = value 
	 * @param attrName can be ID, name, dept_name or salary
	 * @param search value of data type int or String.
	 */
	public Table eval(String attrName, Object value) {
		// TO DO complete this method
		// may use switch statement
		Table tbl = new Table(); // instantiate new table obj
		// handle int or string types
		switch(attrName) {
		case(attrName == "ID"):
			for(int i=0; i<instructors.size(); i++) {
				if(instructors.get(i).getID() == (int) value) {
					Instructor in = instructors.get(i);
					tbl.insert(new Instructor(in.getID(), in.getName(), in.getDept_name(), in.getSalary()));
				}
			}
		case(attrName == "name"):
			for (int i = 0; i < instructors.size(); i++) {
				if( instructors.get(i).getName() == value) {
					Instructor in = instructors.get(i);
					tbl.insert(new Instructor(in.getID(), in.getName(), in.getDept_name(), in.getSalary()));
				}
			}
		case(attrName == "dept_name"):
			for (int i = 0; i < instructors.size(); i++) {
				if( instructors.get(i).getDept_name() == value) {
					Instructor in = instructors.get(i);
					tbl.insert(new Instructor(in.getID(), in.getName(), in.getDept_name(), in.getSalary()));
				}
			}
		case(attrName == "salary"):
			
			for (int i = 0; i < instructors.size(); i++) {
				if( instructors.get(i).getSalary() == (int) value) {
					Instructor in = instructors.get(i);
					tbl.insert(new Instructor(in.getID(), in.getName(), in.getDept_name(), in.getSalary()));
				}
			}
		return tbl;
		}
	}
	
	public Iterator<Instructor> iterator() {
		return instructors.iterator();
	}
	
	public String toString() {
		if (instructors.isEmpty()) {
			return "Empty Table";
		} else {
			StringBuilder sb = new StringBuilder();
			for (Instructor t : this) {
				sb.append(t.toString());
				sb.append("\n");
			}
			return sb.toString();
		}
	}

}

