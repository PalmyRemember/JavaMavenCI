package com.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.main.Calculate;

import junit.framework.Assert;

public class CalculateTest {
public int score;
public Calculate cal;
@Before
public void initScoreZero() {
	this.score=0;
}
@Before
public void initCalculetClass() {
	this.cal = new Calculate();
}

	@Test
	public void getScoreFromSetScoreByScore100() {
		this.score=100;
		
		int expected=100;
		
		cal.setScore(this.score);
		int actual = cal.getScore();
		
		
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void getScoreFromSetScoreByScore0() {
		this.score=0;
		
		int expected=0;
		
		cal.setScore(this.score);
		int actual = cal.getScore();
		
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void gradeAFromSetScoreAndCalculatByScore100() {
		this.score=100;
		
		String expected="A";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void gradeBPulsFromSetScoreAndCalculatByScore79() {
		this.score=79;
		
		String expected="B+";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void gradeBFromSetScoreAndCalculatByScore74() {
		this.score=74;
		
		String expected="B";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void gradeCPlusFromSetScoreAndCalculatByScore65() {
		this.score=65;
		
		String expected="C+";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void gradeCFromSetScoreAndCalculatByScore64() {
		this.score=64;
		
		String expected="C";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void gradeDPulsFromSetScoreAndCalculatByScore55() {
		this.score=55;
		
		String expected="D+";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void gradeDFromSetScoreAndCalculatByScore50() {
		this.score=50;
		
		String expected="D";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void gradeFFromSetScoreAndCalculatByScore0() {
		this.score=0;
		
		String expected="F";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		
		Assert.assertEquals(expected, actual);
	}
	

}
