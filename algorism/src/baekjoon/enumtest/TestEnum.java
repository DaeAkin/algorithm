package baekjoon.enumtest;

public enum TestEnum {
	
	X("1",true) , Y("0",false);
	
	private String testValue;
	private Boolean testValue2;
	
	private TestEnum(String testValue, Boolean testValue2) {
		this.testValue = testValue;
		this.testValue2 = testValue2;
	}
	
	public String getTestValue() {
		return testValue;
	}
	
	public Boolean getTestValue2() {
		return testValue2;
	}
}
