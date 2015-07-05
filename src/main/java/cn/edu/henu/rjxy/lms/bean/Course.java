package cn.edu.henu.rjxy.lms.bean;
// Generated 2014-8-19 18:46:30 by Hibernate Tools 3.6.0


import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Course generated by hbm2java
 */
@Entity
@Table(name="course"
    ,catalog="lms"
)
public class Course  implements java.io.Serializable {


     private Integer courseId;//课程id
     private String courseSn;//课程编号
     private String courseName;//课程名称
     private Byte courseCredit;//课程学分
     private String coursePreviousSn;//前导课程编号
     private String courseDescription;//课程描述
//     private Set<CourseCommon> courseCommons = new HashSet<CourseCommon>(0);//课程主体内容
//     private Set<RelCourseTeacher> relCourseTeachers = new HashSet<RelCourseTeacher>(0);//任课教师
//     private Set<NoticeBoard> noticeBoards = new HashSet<NoticeBoard>(0);//通知公告

    public Course() {
    }

    public Course(String courseSn, String courseName, Byte courseCredit,String coursePreviousSn, String courseDescription){//, Set<CourseCommon> courseCommons, Set<RelCourseTeacher> relCourseTeachers, Set<NoticeBoard> noticeBoards) {
       this.courseSn = courseSn;
       this.courseName = courseName;
       this.courseCredit = courseCredit;
       this.coursePreviousSn = coursePreviousSn;
       this.courseDescription = courseDescription;
//       this.courseCommons = courseCommons;
//       this.relCourseTeachers = relCourseTeachers;
//       this.noticeBoards = noticeBoards;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="course_id", unique=true, nullable=false)
    public Integer getCourseId() {
        return this.courseId;
    }
    
    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    
    @Column(name="course_sn")
    public String getCourseSn() {
        return this.courseSn;
    }
    
    public void setCourseSn(String courseSn) {
        this.courseSn = courseSn;
    }

    
    @Column(name="course_name", length=40)
    public String getCourseName() {
        return this.courseName;
    }
    
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    
    @Column(name="course_credit")
    public Byte getCourseCredit() {
        return this.courseCredit;
    }
    
    public void setCourseCredit(Byte courseCredit) {
        this.courseCredit = courseCredit;
    }

    
    @Column(name="course_previous_sn")
    public String getCoursePreviousSn() {
        return this.coursePreviousSn;
    }
    
    public void setCoursePreviousSn(String coursePreviousSn) {
        this.coursePreviousSn = coursePreviousSn;
    }

    
    @Column(name="course_description", length=65535)
    public String getCourseDescription() {
        return this.courseDescription;
    }
    
    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }
//
//@OneToMany(fetch=FetchType.LAZY, mappedBy="course")
//    public Set<CourseCommon> getCourseCommons() {
//        return this.courseCommons;
//    }
//    
//    public void setCourseCommons(Set<CourseCommon> courseCommons) {
//        this.courseCommons = courseCommons;
//    }
//
//@OneToMany(fetch=FetchType.LAZY, mappedBy="course")
//    public Set<RelCourseTeacher> getRelCourseTeachers() {
//        return this.relCourseTeachers;
//    }
//    
//    public void setRelCourseTeachers(Set<RelCourseTeacher> relCourseTeachers) {
//        this.relCourseTeachers = relCourseTeachers;
//    }
//
//@OneToMany(fetch=FetchType.LAZY, mappedBy="course")
//    public Set<NoticeBoard> getNoticeBoards() {
//        return this.noticeBoards;
//    }
//    
//    public void setNoticeBoards(Set<NoticeBoard> noticeBoards) {
//        this.noticeBoards = noticeBoards;
//    }




}


