package cn.edu.henu.rjxy.lms.bean;
// Generated 2014-8-12 13:22:52 by Hibernate Tools 3.6.0

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Teacher generated by hbm2java
 */
@Entity
@Table(name = "teacher", catalog = "lms"
)
public class Teacher implements java.io.Serializable {

    private Integer teacherId;
    private College college;
    private Depart depart;
    private Position position;
    private Integer teacherSn;
    private String teacherName;
    private String teacherIdcard;
    private String teacherSex;
    private Date teacherBirthday;
    private String teacherTel;
    private String teacherQq;
    private String teacherEmail;
    private String teacherPwd;
    private Date teacherEnrolling;
    private Long teacherRoleValue;

    public Teacher() {
    }

    public Teacher(String name, Integer sn) {
        this.teacherName = name;
        this.teacherSn = sn;
    }

    public Teacher(College college, Depart depart, Position position, Integer teacherSn, String teacherName, String teacherIdcard, String teacherSex, Date teacherBirthday, String teacherTel, String teacherQq, String teacherEmail, String teacherPwd, Date teacherEnrolling) {
        this.college = college;
        this.depart = depart;
        this.position = position;
        this.teacherSn = teacherSn;
        this.teacherName = teacherName;
        this.teacherIdcard = teacherIdcard;
        this.teacherSex = teacherSex;
        this.teacherBirthday = teacherBirthday;
        this.teacherTel = teacherTel;
        this.teacherQq = teacherQq;
        this.teacherEmail = teacherEmail;
        this.teacherPwd = teacherPwd;
        this.teacherEnrolling = teacherEnrolling;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "teacher_id", unique = true, nullable = false)
    public Integer getTeacherId() {
        return this.teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "teacher_college_id")
    public College getCollege() {
        return this.college;
    }

    public void setCollege(College college) {
        this.college = college;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "teacher_depart_id")
    public Depart getDepart() {
        return this.depart;
    }

    public void setDepart(Depart depart) {
        this.depart = depart;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "teacher_position_id")
    public Position getPosition() {
        return this.position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Column(name = "teacher_sn")
    public Integer getTeacherSn() {
        return this.teacherSn;
    }

    public void setTeacherSn(Integer teacherSn) {
        this.teacherSn = teacherSn;
    }

    @Column(name = "teacher_name", length = 40)
    public String getTeacherName() {
        return this.teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    @Column(name = "teacher_idcard", length = 18)
    public String getTeacherIdcard() {
        return this.teacherIdcard;
    }

    public void setTeacherIdcard(String teacherIdcard) {
        this.teacherIdcard = teacherIdcard;
    }

    @Column(name = "teacher_sex")
    public String getTeacherSex() {
        return this.teacherSex;
    }

    public void setTeacherSex(String teacherSex) {
        this.teacherSex = teacherSex;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "teacher_birthday", length = 10)
    public Date getTeacherBirthday() {
        return this.teacherBirthday;
    }

    public void setTeacherBirthday(Date teacherBirthday) {
        this.teacherBirthday = teacherBirthday;
    }

    @Column(name = "teacher_tel", length = 20)
    public String getTeacherTel() {
        return this.teacherTel;
    }

    public void setTeacherTel(String teacherTel) {
        this.teacherTel = teacherTel;
    }

    @Column(name = "teacher_qq", length = 20)
    public String getTeacherQq() {
        return this.teacherQq;
    }

    public void setTeacherQq(String teacherQq) {
        this.teacherQq = teacherQq;
    }

    @Column(name = "teacher_email", length = 40)
    public String getTeacherEmail() {
        return this.teacherEmail;
    }

    public void setTeacherEmail(String teacherEmail) {
        this.teacherEmail = teacherEmail;
    }

    @Column(name = "teacher_pwd")
    public String getTeacherPwd() {
        return this.teacherPwd;
    }

    public void setTeacherPwd(String teacherPwd) {
        this.teacherPwd = teacherPwd;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "teacher_enrolling", length = 19)
    public Date getTeacherEnrolling() {
        return this.teacherEnrolling;
    }

    public void setTeacherEnrolling(Date teacherEnrolling) {
        this.teacherEnrolling = teacherEnrolling;
    }

    @Column(name = "teacher_role_value")
    public Long getTeacherRoleValue() {
        return this.teacherRoleValue;
    }

    public void setTeacherRoleValue(Long teacherRoleValue) {
        this.teacherRoleValue = teacherRoleValue;
    }

}
