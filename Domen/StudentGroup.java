import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup>
{
    private List<Student> studentList;
    private int idGroup;

    public StudentGroup(List<Student> studentList, int idGroup)
    {
        this.studentList = studentList;
        this.idGroup = idGroup;

    }

    public List<Student> getStudentList() {
        return studentList;
    }
    public int getIdGroup() {
        return idGroup;
    }

    @Override
    public String toString() {
        //return "Группа: " + studentList + ", номер группы: "+ idGroup;
        return "\nНомер группы: " + idGroup + " , количество студентов в группе: " + getStudentList().size() + ", список студентов: \n" + studentList;
    }

    @Override
    public Iterator<Student> iterator() 
    {
       return new Iterator<Student>() 
       {

        private int counter;

        @Override
        public boolean hasNext() 
        {

            if(counter<studentList.size())
            {
                return true;
            }
            else
            {
                return false;
            }            
        }

        @Override
        public Student next() 
        {            
            return studentList.get(counter++);
        }
        
       };
    }

    @Override
    public int compareTo(StudentGroup o) {
        if(getStudentList().size()==o.getStudentList().size())
        {
            if(idGroup==o.idGroup)return 0 ;
            if(idGroup>o.idGroup)return 1;
            else return -1;
            //return 0;
        }

        if(getStudentList().size()>o.getStudentList().size())
        return 1;
        else
        return -1;   
    }
}
