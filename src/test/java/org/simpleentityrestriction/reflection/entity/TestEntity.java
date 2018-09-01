package org.simpleentityrestriction.reflection.entity;

import java.util.List;

import org.simpleentityrestriction.reflection.annotation.RestrictionHideAll;
import org.simpleentityrestriction.reflection.annotation.RestrictionShowField;

@RestrictionHideAll
public class TestEntity {

	@RestrictionShowField
	private int id; 
	@RestrictionShowField 
	private String name; 
	@RestrictionShowField
	private Integer age;
	private List<String> belongings;
	
	public TestEntity() {
		
	}
	
	public TestEntity(int id, String name, Integer age, List<String> belongings) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.belongings = belongings;
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TestEntity [id=" + id + ", name=" + name + ", age=" + age + ", belongings=" + belongings + "]";
	}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}
	/**
	 * @return the belongings
	 */
	public List<String> getBelongings() {
		return belongings;
	}
	/**
	 * @param belongings the belongings to set
	 */
	public void setBelongings(List<String> belongings) {
		this.belongings = belongings;
	}
	
	
}
