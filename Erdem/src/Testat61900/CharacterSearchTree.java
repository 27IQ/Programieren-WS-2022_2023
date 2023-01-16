package Testat61900;

public class CharacterSearchTree
{

    //--- hier ergaenzen ---
    public int apply( int i ){
        if(content==null)
        return 0;

        int counter=0;

        if(leftChild!=null&&!leftChild.isEmpty())
        counter+=leftChild.apply(i);

        if(rightChild!=null&&!rightChild.isEmpty())
        counter+=rightChild.apply(i);

        if(isLeaf())
        return counter;

        if(content.getQuantity()>i)
        counter+=content.getQuantity();

        return counter;

    }


    
// --- Vorgaben ---
private HuffmanTriple content;
private CharacterSearchTree leftChild, rightChild;

public CharacterSearchTree() 
{
content = null;
leftChild = null;
rightChild = null;
}

public HuffmanTriple getContent()
{
if ( !isEmpty() )
{
return content;
} else {
throw new RuntimeException();
}
}

public boolean isEmpty() 
{
return content == null;
}

public boolean isLeaf() 
{
return !isEmpty() && leftChild.isEmpty() && rightChild.isEmpty();
}

public void iterativeAdd( char t ){

    CharacterSearchTree current = this;

    while ( !current.isEmpty() && current.content.getToken() != t ){
        if ( current.content.getToken() > t ){
            current = current.leftChild;
        }else{
            current = current.rightChild;
        }
    }
            
    if ( current.isEmpty() ) {
        current.content = new HuffmanTriple( t );
        current.leftChild = new CharacterSearchTree();
        current.rightChild = new CharacterSearchTree();
    }else{
        current.content.incrementQuantity();
    }
}

public void show()
{
if ( !isEmpty() ) 
{
leftChild.show();
System.out.println( content.toString() );
rightChild.show();
}
}

}
