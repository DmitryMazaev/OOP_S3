import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) 
    {

        Student st1 = new Student("Петр Иванов", 20, 101);
        Student st2 = new Student("Олег Головин", 21, 102);
        Student st3 = new Student("Артур Акопов", 18, 103);
        Student st4 = new Student("Вадим Назиров", 22, 104);
        Student st5 = new Student("Дмитрий Киселев", 23, 105);
        Student st6 = new Student("Ольга Горева", 20, 106);

        Student st7 = new Student("Максим Камышов", 19, 107);
        Student st8 = new Student("Глеб Чибисов", 18, 108);
        Student st9 = new Student("Илья Романов", 24, 109);
        Student st10 = new Student("Константин Кузьмин", 20, 110);

        Student st11 = new Student("Никита Семенов", 19, 111);
        Student st12 = new Student("Роман Орлов", 17, 112);
        Student st13 = new Student("Алексей Быстров", 16, 113);
        Student st14 = new Student("Анна Крылова", 20, 114);


        List<Student> list4580 = new ArrayList<Student>();

        list4580.add(st1);
        list4580.add(st2);
        list4580.add(st3);
        list4580.add(st4);
        list4580.add(st5);
        list4580.add(st6);

        List<Student> list5580 = new ArrayList<Student>();

        list5580.add(st7);
        list5580.add(st8);
        list5580.add(st9);
        list5580.add(st10);

        List<Student> list3580 = new ArrayList<Student>();

        list3580.add(st11);
        list3580.add(st12);
        list3580.add(st13);
        list3580.add(st14);

        StudentGroup group4580 = new StudentGroup(list4580, 4580);
        StudentGroup group5580 = new StudentGroup(list5580, 5580);
        StudentGroup group3580 = new StudentGroup(list3580, 3580);

        System.out.println("Группа " + group4580.getIdGroup());
        for (Student std : list4580) {
            System.out.println(std);
        }

        System.out.println("=========================================================");

        System.out.println("Группа " + group5580.getIdGroup());
        for (Student std : list5580) {
            System.out.println(std);
        }

        System.out.println("=========================================================");

        System.out.println("Группа " + group3580.getIdGroup());
        for (Student std : list3580) {
            System.out.println(std);
        }

        System.out.println("=========================================================");

        Collections.sort(group4580.getStudentList());
        
        System.out.println();
        System.out.printf("Сортировка группы %d по возрасту: \n", group4580.getIdGroup());
        for(Student std: group4580.getStudentList())
        {
            System.out.println(std);
        }

        System.out.println("=========================================================");

        Collections.sort(group5580.getStudentList());

        System.out.println();
        System.out.printf("Сортировка группы %d по возрасту: \n", group5580.getIdGroup());

        for(Student std: group5580.getStudentList())
        {
            System.out.println(std);
        }

        System.out.println("=========================================================");

        Collections.sort(group3580.getStudentList());

        System.out.println();
        System.out.printf("Сортировка группы %d по возрасту: \n", group3580.getIdGroup());

        for(Student std: group3580.getStudentList())
        {
            System.out.println(std);
        }

        System.out.println("=========================================================");

        
        List<StudentGroup> listTeam001 = new ArrayList<StudentGroup>();
        listTeam001.add(group4580);
        listTeam001.add(group5580);
        listTeam001.add(group3580);

        StudentTeam team001 = new StudentTeam(listTeam001, 1);

        Collections.sort(team001.getTeam());

        /* for(StudentGroup stg: team001.getTeam())
        {
            System.out.println(stg);
        } */

        System.out.println(team001);

    }
    
    
}
