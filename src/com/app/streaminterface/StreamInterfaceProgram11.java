package com.app.streaminterface;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

import com.app.models.Employee;

public class StreamInterfaceProgram11 {
	public static void main(String[] args) {
		List<Employee> employeeList = Employee.getEmployeesList();
		
		Consumer<Employee> employeeConsumer = new Consumer<Employee>() {
			@Override
			public void accept(Employee e) {
				System.out.println(e);
			}
		}; 
		
		Function<Employee, String> enameFunction = (e)->e.getEname();
		
		Consumer<String> enameConsumer = (en)->{System.out.println(en);};
		
		List<String> enameList = employeeList.stream()
				.peek(employeeConsumer)
				.filter(e->e.getAge()>25)
				.peek(employeeConsumer)
				.map(enameFunction)
				.peek(enameConsumer)
				.toList();
	}
}
