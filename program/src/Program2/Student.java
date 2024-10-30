package Program2;

public class Student {

	private String name; 
	private Long id ;
	private Double marks ;
	public Student() {
		super();
	}
	public Student(String name, Long id, Double marks) {
		super();
		this.name = name;
		this.id = id;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Double getMarks() {
		return marks;
	}
	public void setMarks(Double marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", marks=" + marks + "]";
	}
	
	

}
