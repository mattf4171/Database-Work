
public class Demo {
	public static void main(String[] args) {
		// create tbl
		Table t = new Table();
		// add 5 instructors
		t.insert(new Instructor(123, "Lisa", "Comp. Sci.", 60000));
		t.insert(new Instructor(124, "Mark", "Mathmatics", 40000));
		t.insert(new Instructor(125, "Tahm", "Cinema", 50000));
		t.insert(new Instructor(126, "Kimberly", "Comp. Sci.", 65000));
		t.insert(new Instructor(127, "Alondra", "Physiology", 55000));
		
		// print out table
		System.out.println(t.toString());

		// delete an instructor
		t.delete(125); 

//		System.println()

		// print out table
		System.out.println(t.toString());
		
//		delete 12121:false
		t.delete(125); // shouldn't delete 

		System.out.println(t.lookup(127));
		
//		lookup 12121:null
		System.out.println(t.lookup(122)); // not found 
		
		System.out.println(t.eval("dept_name", "Comp. Sci."));

//		eval ID=19803
		System.out.println(t.eval("ID", 127));
//		Empty Table
		System.out.println(t.eval("ID", 140));
		
		
	}
}

