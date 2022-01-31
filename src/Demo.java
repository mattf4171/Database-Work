package src;

public class Demo {
	public static void main(String[] args) {
		// create tbl
		Table t = new Table();
		// add 5 instructors
		t.insert(new Instructor(123, "Lisa", "Computer Science", 60000));
		t.insert(new Instructor(124, "Mark", "Mathmatics", 40000));
		t.insert(new Instructor(125, "Tahm", "Cinema", 50000));
		t.insert(new Instructor(126, "Kimberly", "Biology", 65000));
		t.insert(new Instructor(127, "Alondra", "Physiology", 55000));
		
		// print out table
		System.out.println(t.toString());
		// print out table
		System.out.println(t.toString());
		// delete an instructor
		t.delete(126);
	}
}

