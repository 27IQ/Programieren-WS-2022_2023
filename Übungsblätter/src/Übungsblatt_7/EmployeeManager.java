public class EmployeeManager {

    int currentYear=2022;
    EmployeeTree t;

    public EmployeeManager(EmployeeTree t){
        this.t=t;
    }

    public EmployeeTree getTree(){
        return t;
    }

    @Override
    public String toString(){
        return toStringRec(getTree().getRoot());
    }

    private String toStringRec(EmployeeTreeNode node){
        if(node==null)
        return "";

        String s="";

        if(node.getLeftSuccessor()!=null)
        s+=toStringRec(node.getLeftSuccessor());

        s+=node.getEmployee().getName();

        if(node.getRightSuccessor()!=null)
        s+=toStringRec(node.getRightSuccessor());

        return s+" ";
    }

    public String levelOrder(){
        String s="";
        for(int i=0;i<=getHeight();i++){
            s+=levelOrder(getTree().getRoot(),i)+" ";
        }

        return s;
    }

    private String levelOrder(EmployeeTreeNode node,int level){
        if(node==null)
        return "";

        if(level==0)
        return "("+node.getEmployee().getName()+","+(currentYear-node.getEmployee().getYearOfBirth())+") ";

        String s="";

        if(node.getLeftSuccessor()!=null)
        s+=levelOrder(node.getLeftSuccessor(),level-1);

        if(node.getRightSuccessor()!=null)
        s+=levelOrder(node.getRightSuccessor(),level-1);

        return s;
    }

    public int getHeight(){
        return getHeight(getTree().getRoot(),0);
    }

    private int getHeight(EmployeeTreeNode node,int height){
        int left=0,right=0;
        
        if(node==null)
        return height;

        if(node.getLeftSuccessor()!=null)
        left=getHeight(node.getLeftSuccessor(),height+1);

        if(node.getRightSuccessor()!=null)
        right=getHeight(node.getRightSuccessor(),height+1);

        if(left==0&&right==0)
        return height;

        if(left>right){
            return left;  
        }else{
            return right;
        }
        
    }


    public static void main(String[] args) {
        EmployeeManager m=new EmployeeManager(new EmployeeTree());
        Employee person1=new Employee("sus", 2003);
        Employee person2=new Employee("sus1", 2002);
        Employee person3=new Employee("zuz", 2004);
        Employee person4=new Employee("ses", 2000);

        m.getTree().setRoot(new EmployeeTreeNode(person1));
        m.getTree().insertEmployeeToTree(person2, m.getTree().getRoot());
        m.getTree().insertEmployeeToTree(person3, m.getTree().getRoot());
        m.getTree().insertEmployeeToTree(person4, m.getTree().getRoot());

        System.out.println(m.getTree().AelterAls(2003));
    }
}
