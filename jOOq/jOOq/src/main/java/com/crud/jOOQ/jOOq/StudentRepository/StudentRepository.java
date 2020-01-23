package com.crud.jOOQ.jOOq.StudentRepository;

import com.crud.jOOQ.jOOq.Model.tables.pojos.Student;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.crud.jOOQ.jOOq.Model.Tables.STUDENT;


@Repository
public class StudentRepository {
    private final DSLContext db;

    public StudentRepository(DSLContext db) {
        this.db = db;
    }

    public List<Student> getDetails() {
        return db.selectFrom(STUDENT).fetchInto(Student.class);
    }
    public Student getById(int id){
        return db.selectFrom(STUDENT)
                .where(STUDENT.ID.eq(id))
                .fetchOneInto(Student.class);
    }

    public void update(Student student) {
        db.insertInto(STUDENT, STUDENT.ID, STUDENT.NAME, STUDENT.DOD, STUDENT.DEPARTMENT,
                STUDENT.COLLEGE_NAME, STUDENT.PLACE)
                .values(student.getId(), student.getName(), student.getDod(), student.getDepartment(),
                        student.getCollegeName(), student.getPlace())

                .execute();
    }

    public void setStudent(Student student, int id) {
        db.update(STUDENT)
                .set(STUDENT.NAME, student.getName())
                .set(STUDENT.DOD, student.getDod())
                .set(STUDENT.DEPARTMENT, student.getDepartment())
                .set(STUDENT.COLLEGE_NAME, student.getCollegeName())
                .set(STUDENT.PLACE, student.getPlace())
                .where(STUDENT.ID.eq(id))
                .execute();
    }
    public void delete(Student student, int id){
        db.delete(STUDENT)
                .where(STUDENT.ID.eq(id))
                .execute();
    }

}
        

