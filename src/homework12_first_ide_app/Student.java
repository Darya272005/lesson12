package homework12_first_ide_app;

public class Student {
	private String fullName;
	private int groupNumber;
	private int[] grades;

	public Student(String fullName, int groupNumber, int[] grades) {
		this.fullName = fullName;
		this.groupNumber = groupNumber;
		this.grades = grades;
	}

	public String getFullName() {
		return fullName;
	}

	public int getGroupNumber() {
		return groupNumber;
	}

	public int[] getGrades() {
		return grades;
	}

	public boolean Marks() {
		for (int grade : grades) {
			if (grade < 9) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Student[] students = new Student[10];
		students[0] = new Student("Иванов И.И.", 1, new int[] { 10, 9, 10, 9, 10 });
		students[1] = new Student("Петров П.П.", 2, new int[] { 9, 8, 9, 10, 9 });
	

		System.out.println("Студенты с оценками 9 и 10:");
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i].Marks()) {
				System.out.println("Фамилия и инициалы: " + students[i].getFullName());
				System.out.println("Номер группы: " + students[i].getGroupNumber());
				System.out.println();
			}
		}
	}
}
