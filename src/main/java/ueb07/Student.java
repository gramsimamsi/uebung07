package ueb07;

import java.util.Comparator;

class Student implements Comparable {
	private int matrikel;
	private String name;

	Student(int m, String n) {
		setMatrikel(m);
		setName(n);
	}

	public String getName() {
		return name;
	}

	public void setName(String n) {
		if (n == null)
			throw new IllegalArgumentException();
		name = n;
	}

	public int getMatrikel() {
		return matrikel;
	}

	public void setMatrikel(int m) {
		if (m <= 0)
			throw new IllegalArgumentException();
		matrikel = m;
	}

	@Override
	public String toString() {
		return name + " (" + matrikel + ")";
	}

	@Override
	public int compareTo(Object o) {
		Student compareStud = (Student) o;
		return this.matrikel - compareStud.matrikel;
	}

	static class StudentComparator implements Comparator<Student> {


		@Override
		public int compare(Student o1, Student o2) {
			return o1.name.compareTo(o2.name);
		}
	}

	static Comparator<Student> getComparator(){ return new StudentComparator(); }

	static class StudentComparatorComplex implements Comparator<Student> {


		@Override
		public int compare(Student o1, Student o2) {

			int compVal = o1.name.compareTo(o2.name);

			if(compVal != 0){
				return compVal;
			}
			else{
				return o1.matrikel - o2.matrikel;
			}
		}
	}

	static Comparator<Student> getComparatorComplex(){ return new StudentComparatorComplex(); }
}
