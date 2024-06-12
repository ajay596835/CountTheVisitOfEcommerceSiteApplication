package Entites;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class StudentSubjectMarks {
    @Id
    private Long rollno;


    //1-Subject wise topper name
    //2-Topper name

//    select subject, Max(marks) from studentsubjectmarks group by subject;

//    select m.roll, m.marks, s.name from studentsubjectmarks as m inner join student as s on s.rollno=m.rollno
//    group by m.subject having max(marks)=(select max(marks) from studentsubjectmarks group by subject);
//
//    select name from student where roll=(select roll from studentsubjectmarks
//    where group by rollno having sum(marks)=(select sum(marks) from studentsubjectmarks group by roll));
//Class Student{ int rollNo;String name;}
//    ClassStudentSubjectMarks{int rollNo;String  name; double marks}

}
