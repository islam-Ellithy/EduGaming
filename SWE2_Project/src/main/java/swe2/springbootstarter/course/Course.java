package swe2.springbootstarter.course;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import swe2.springbootstarter.game.Game;
import swe2.springbootstarter.user.Student;
import swe2.springbootstarter.user.Teacher;

@Entity
public class Course {
	
	@Id
	private String id;
	private String name;
	private String description;
	
	@ManyToOne
	@JoinColumn
	private Teacher teacher;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "course_student", joinColumns = @JoinColumn(name = "course_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "student_mail", referencedColumnName = "mail"))
	private Set<Student> students;
	
	

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	@OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
	
	private Set<Game> games;
	
	
	public Set<Game> getGames() {
		return games;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public void setGames(Set<Game> games) {
		this.games = games;
	}

	public Course() {
		
	}
	
	public Course(String name, String description, Teacher teacher) {
		super();
		this.name = name;
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Course(String id, String name, String description, Teacher teacher, Set<Student> studnet, Set<Game> games) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.teacher = teacher;
		this.students = studnet;
		this.games = games;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	

	
}
