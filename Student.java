class Student {
	String index;
	String firstName;
	String lastName;


	List<Integer>labPoints = new ArrayList();
	//TODO constructor

	public Student(String index, String firstName, String lastName, List<Integer> labPoints) {
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
		this.labPoints = labPoints;
	}

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Integer> getLabPoints() {
		return labPoints;
	}

	public void setLabPoints(List<Integer> labPoints) {
		this.labPoints = labPoints;
	}
	//TODO seters & getters


	public double getAverage() {
		//TODO
		int sum = 0;
		for (int i=0; i< labPoints.size(); i++) {
			sum += labPoints[i];
		}
		return sum / labPoints.size();
	}
	}

	public boolean hasSignature() {
		//TODO
		for (Student s:labPoints){
			if(s.length() > 8){
				return  true;
			}
			else
			return false;

	}
	class  Course {
		List<Student>studentList = new ArrayList();
		public addStudent(Student s){
			studentList(s).add;
		}
		
	}
}
