class student
{
    double mark1;
    double mark2;
    double mark3;

    
    student(double m1,double m2,double m3)
    {
        System.out.println("Assigning values through Constructor");
        mark1=m1;
        mark2=m2;
        mark3=m3;
    }

    double score()
    {
        double tot=mark1+mark2+mark3;
        double avg=tot/3;
        return avg;
    }
}
public class Main
{
    public static void main(String [] args)
    {
        student s1=new student(90,91,94);
        student s2=new student(31,39,34);
        
        System.out.println("Average of student 1 is:"+s1.score())
        System.out.println("Average of student 2 is:"+s2.score())
    }
}