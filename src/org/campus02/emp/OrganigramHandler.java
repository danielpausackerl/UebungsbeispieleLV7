package org.campus02.emp;

public class OrganigramHandler {

	public static String getChainOfCommand(Employee employee) {

		String chain = employee.getName() + "[" + employee.getRole() + "]";

		if (employee.getSuperior() == null) {
			return chain;
		}
		return chain + " -> " + getChainOfCommand(employee.getSuperior());
	}
	
	public static String processHierarchy(Employee emp) {
		
		}
}
