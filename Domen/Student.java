public class Student extends Person implements Comparable<Student>
{
    private int idStudent;

    public Student(String name, Integer age, Integer idStudent) {
        super(name, age);
        this.idStudent = idStudent;
    }
    
    public int getIdStudent() {
        return idStudent;
    }

    @Override
    public String toString() {
        return "\nСтудент: " + super.getName() + ", возраст: " + super.getAge() + ", номер студенческого билета: " + idStudent;
    }


    @Override
    public int compareTo(Student o) {

        //System.out.println(super.getName()+" - "+o.getName());
        if(super.getAge()==o.getAge())
        {
            if(idStudent==o.idStudent)return 0 ;
            if(idStudent>o.idStudent)return 1;
            else return -1;
            //return 0;
        }

        if(super.getAge()>o.getAge())
        return 1;
        else
        return -1;        
    }
}
