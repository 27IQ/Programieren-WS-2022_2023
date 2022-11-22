package Binärer_Baum_mit_integern;

public class BinaryTree {

	BinaryTreeNode top,todelete,tmp;


	public BinaryTree() {
		top = null;
		todelete = null;
	}

	/*
	 * BEGINN des zu implementierenden Bereichs
	 */

	// Aufgabe 1
	public void insert(int number) {
		if(top==null){
			top=new BinaryTreeNode(number);
			return;
		}

		insertRecuesive(top, number);

	}

	public void insertRecuesive(BinaryTreeNode node, int number){
		if(number<node.getNumber()){
			if(node.getSmaller()==null){
				node.setSmaller(new BinaryTreeNode(number));
				return;
			}

			insertRecuesive(node.getSmaller(), number);
			return;
		}

		if(node.getLarger()==null){
			node.setLarger(new BinaryTreeNode(number));
			return;
		}

		insertRecuesive(node.getLarger(), number);

	}

	// Aufgabe 2
	public int maxDepth() {
		if(top==null)
		return 0;

		return maxDepthRecursive(top,0);
	}

	public int maxDepthRecursive(BinaryTreeNode node,int depth){
		int smaller=depth,larger=depth;
		
		if(node.getSmaller()!=null){
			smaller=maxDepthRecursive(node.getSmaller(), depth);
		}

		if(node.getLarger()!=null){
			larger=maxDepthRecursive(node.getLarger(), depth);
		}

		if(smaller>larger){
			return smaller+1;
		}

		return larger+1;
	}

	// Aufgabe 3
	public int sumOfElements() {

		if(top==null)
		return 0;

		return sumOfElementsRecursive(top);
	}

	public int sumOfElementsRecursive(BinaryTreeNode node){
		int sum=0;

		if(node.getSmaller()!=null)
		sum+=sumOfElementsRecursive(node.getSmaller());

		sum+=node.getNumber();

		if(node.getLarger()!=null)
		sum+=sumOfElementsRecursive(node.getLarger());

		return sum;
	}

	// Aufgabe 4
	public void deleteNumber(int number) {
		if(top==null)
		return;

		if(top.getSmaller()==null&&top.getLarger()==null){
			top=null;
			return;
		}

		if(top.getNumber()==number){
			if(top.getLarger()!=null){
				if(top.getSmaller()!=null){
					tmp=top.getSmaller();
				}
				top=top.getLarger();
				reconstructRecursive(tmp);
			}else{
				top=top.getSmaller();
			}
			return;
		}

		deleteNumberRecursive(top, number);
		if(todelete!=null)
		reconstructRecursive(todelete);
	}

	public void deleteNumberRecursive(BinaryTreeNode node,int number){
		if(node.getSmaller()!=null){
			if(node.getSmaller().getNumber()==number){
				todelete=node.getSmaller();
				node.setSmaller(null);
				return;
			}
			deleteNumberRecursive(node.getSmaller(), number);
		}

		if(node.getLarger()!=null){
			if(node.getLarger().getNumber()==number){
				todelete=node.getLarger();
				node.setLarger(null);
				return;
			}
			deleteNumberRecursive(node.getLarger(), number);
		}
	}

	public void reconstructRecursive(BinaryTreeNode node){
		if(node.getSmaller()!=null)
		reconstructRecursive(node.getSmaller());

		if(node.getLarger()!=null)
		reconstructRecursive(node.getLarger());

		if(node!=todelete){
			insert(node.getNumber());
		}else{
			todelete=null;
		}
			
	}

	/*
	 * ENDE des zu implementierenden Bereichs
	 */

	public static void main(String[] args) {
		BinaryTree z=new BinaryTree();
		z.insert(5);
		z.insert(2);
		z.insert(17);
		z.insert(8);
		z.insert(20);
		z.insert(-3);

		System.out.println("should be |-3||2||5||8||17||20|: "+z.startinorder());

		z.insert(4);

		System.out.println("should be |-3||2||4||5||8||17||20|: "+z.startinorder());

		System.out.println("should be 3: "+z.maxDepth());

		System.out.println("should be 53: "+z.sumOfElements());

		z.deleteNumber(17);

		System.out.println("should be |-3||2||4||5||8||20|: "+z.startinorder());

		z.deleteNumber(4);

		System.out.println("should be |-3||2||5||8||20|: "+z.startinorder());

		z.deleteNumber(-3);

		System.out.println("should be |2||5||8||20|: "+z.startinorder());

		z.deleteNumber(8);

		System.out.println("should be |2||5||20|: "+z.startinorder());

		z.deleteNumber(20);

		System.out.println("should be |2||5|: "+z.startinorder());

		z.deleteNumber(5);

		System.out.println("should be |2|: "+z.startinorder());

		z.deleteNumber(2);

		System.out.println("should be : "+z.startinorder());

	}


	public String startinorder(){
		if(top==null)
		return "";

		return inorder(top);
	}

	public static String inorder(BinaryTreeNode node){
		String s="";

		if(node.getSmaller()!=null)
		s+=inorder(node.getSmaller());

		s+="|"+node.getNumber()+"|";

		if(node.getLarger()!=null)
		s+=inorder(node.getLarger());

		return s;
	}
}
