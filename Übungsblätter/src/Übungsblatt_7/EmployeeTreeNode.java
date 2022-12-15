public class EmployeeTreeNode {
	private Employee emp;
	private EmployeeTreeNode leftSuccessor = null; // linker Teilbaum
	private EmployeeTreeNode rightSuccessor = null;// rechter Teilbaum

	public EmployeeTreeNode(Employee emp) {
		this.emp = emp;
	}

	public Employee getEmployee() {
		return emp;
	}

	public EmployeeTreeNode getLeftSuccessor() {
		return leftSuccessor;
	}

	public void setLeftSuccessor(EmployeeTreeNode leftSuccessor) {
		this.leftSuccessor = leftSuccessor;
	}

	public EmployeeTreeNode getRightSuccessor() {
		return rightSuccessor;
	}

	public void setRightSuccessor(EmployeeTreeNode rightSuccessor) {
		this.rightSuccessor = rightSuccessor;
	}
}
