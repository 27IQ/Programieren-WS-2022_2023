public class EmployeeTree {
	private EmployeeTreeNode root;

	public void insertEmployeeToTree(Employee newEmployee, EmployeeTreeNode node) {
		if (node == null || newEmployee == null) {
			return;
		}

		if (newEmployee.getYearOfBirth() <= node.getEmployee().getYearOfBirth()) {
			if (node.getLeftSuccessor() != null) {
				insertEmployeeToTree(newEmployee, node.getLeftSuccessor());
			} else {
				EmployeeTreeNode newLeftEmployeeTreeNode = new EmployeeTreeNode(newEmployee);
				node.setLeftSuccessor(newLeftEmployeeTreeNode);
			}
		} else {
			if (node.getRightSuccessor() != null) {
				insertEmployeeToTree(newEmployee, node.getRightSuccessor());
			} else {
				EmployeeTreeNode newRightEmployeeTreeNode = new EmployeeTreeNode(newEmployee);
				node.setRightSuccessor(newRightEmployeeTreeNode);
			}
		}
	}

	public EmployeeTreeNode getRoot() {
		return root;
	}

	public void setRoot(EmployeeTreeNode root) {
		this.root = root;
	}

	public int AelterAls(int GebJahr){
		return AelterAls(GebJahr, root);
	}

	private int AelterAls(int GebJahr, EmployeeTreeNode node){
		int counter=0;

		if(node==null)
		return counter;

		if(node.getLeftSuccessor()!=null)
		counter+=AelterAls(GebJahr, node.getLeftSuccessor());

		if(node.getRightSuccessor()!=null)
		counter+=AelterAls(GebJahr, node.getRightSuccessor());

		if(node.getEmployee().getYearOfBirth()<GebJahr){
			return counter+1;
		}else{
			return counter;
		}
	}
}