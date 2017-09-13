import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		if(students==null)
		return null;
		else
		return students;
	}

	@Override
	public void setStudents(Student[] students) {
		
		if(students==null)
		throws new IllegalArgumentException();
		else
			for(int i=0;i<students.length;i++)
				this.students[i]=students[i];
	
		// Add your implementation here
	}

	@Override
	public Student getStudent(int index) {
		if(index<0 || index > (students.length)-1)
			throws new IllegalArgumentException();
		else
			return students[index];
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		if(student==null)
			throws new IllegalArgumentException();
		else
			students[index]=student;
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		if(student==null)
			throws new IllegalArgumentException();
		else
		{
			int x=students.length +1;
			Student[] student1=new Student[x];
			student1[0]=student;
			for(int i=1;i<student1.length;i++)
				student1[i]=students[i-1];
			students=student1;
		}
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		if(student==null)
			throws new IllegalArgumentException();
		else
		{
			int x=students.length +1;
			Student[] student1=new Student[x];
			student1[x-1]=student;
			for(int i=0;i<student1.length-1;i++)
				student1[i]=students[i];
			students=student1;
		}
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		if(student==null)
			throws new IllegalArgumentException();
		else
			students[index]=student;
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
				if(index<0 || index > (students.length)-1)
			throws new IllegalArgumentException();
		else{
		int x=students.length-1;
		Student[] student1=new Student[x];
		students[index]=0;
		for(i=0;students[i]!=0&&i< students.length;i++)
			student1[i]=students[i];
		int j=i+1;
		for(;i<student1.length;i++,j++)
			student1[i]=students[j];
		students=student1;
		}
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		if(student==null)
			throws new IllegalArgumentException();
		else
		{
			try
			{
			for(i=0;i<students.length;i++)
				if(students[i]==student)
				{
					flag=1;
					students[i]=0;
			    }
			int x=students.length-1;
		Student[] student1=new Student[x];
		
		for(i=0;students[i]!=0&&i< students.length;i++)
			student1[i]=students[i];
		int j=i+1;
		for(;i<student1.length;i++,j++)
			student1[i]=students[j];
	
			if(!flag)
				throw new IllegalArgumentException();
			}
				catch(Exception e)
				{
					System.out.println(e+"Student not exist");
				}
					students=student1;
			
			}
		
		
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		if(index<0 || index > (students.length)-1)
			throws new IllegalArgumentException();
		else{
		Student[] student1=new Student[index];
		for(int i=0;i<student1.length;i++)
			student1[i]=students[i];
		students=student1;
		}
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		if(student==null)
			throws new IllegalArgumentException();
		else
		{
			for(i=0;i<students.length;i++)
				if(students[i]==student)
				break;
			Student[] student1=new Student[i];
			for(int j=0;j<i;j++)
			student1[j]=students[j];
		students=student1;
			
		}
			
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		if(index<0 || index > (students.length)-1)
			throws new IllegalArgumentException();
		else
		{
			int x=students.length-index+1;
			Student[] student1=new Student[x];
			for(i=0;i<students.length;i++)
			{
				if(index==i)
				   student1[student1.length-i]=students[i];
			    else
					continue;
			}
			students=student1;
		}
		
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		if(student==null)
			throws new IllegalArgumentException();
		else
		{
			for(i=0;i<students.length;i++)
				if(students[i]==student)
				    break;
				int x=students.length-i+1;
			Student[] student1=new Student[x];
			for(j=0;j<students.length;j++)
			{
				if(j==i)
				   student1[student1.length-j]=students[j];
			    else
					continue;
			}
			students=student1;
						
			}
		
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		for(int i=0;i<students.length;i++)
			for(int j=i+1;j<students.length-1;j++)
				if(students[i].compareTo(students[j]>0)
				{
					temp=students[i];
				    students[i]=students[j];
					students[j]=temp;
				}
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		Student[] student1;
		if(date==null)
			throws new IllegalArgumentException();
		else
		{
			for(i=0;i<students.length;i++)
				if(students[i].getBirthDate() < date)
					student1[i]=student[i];
		}
		return student1;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}