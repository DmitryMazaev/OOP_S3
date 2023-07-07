import java.util.Iterator;
import java.util.List;

public class StudentTeam implements Iterable<StudentGroup>
{
    private List<StudentGroup> team;
    private int idTeam;

    public StudentTeam (List<StudentGroup> team, Integer idTeam)
    {
        this.team = team;
        this.idTeam = idTeam;
    }
    public List<StudentGroup> getTeam() {
        return team;
    }
    public int getIdTeam() {
        return idTeam;
    }
    
    @Override
    public String toString() {
        //return "Поток: " + team + ", номер потока: "+ idTeam;
        return "Номер потока: " + idTeam + " , количество групп в потоке: " + getTeam().size() + "\n"+ team + "\n";
    }
    @Override
    public Iterator<StudentGroup> iterator() 
    {
        return new Iterator<StudentGroup>() 
       {

        private int counter;

        @Override
        public boolean hasNext() 
        {

            if(counter<team.size())
            {
                return true;
            }
            else
            {
                return false;
            }            
        }

        @Override
        public StudentGroup next() 
        {            
            return team.get(counter++);
        }
        
       };
    }
    




}
