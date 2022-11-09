package Übungsblatt_4;

public class Train {
    private Coach firstCoach = null;
    private Coach lastCoach = null;

    public void append(Coach c) {
        if (c == null) {
            return;
        }

        if (firstCoach == null) {
            firstCoach = c;
            lastCoach = c;
        }else {
            lastCoach.setNext(c);
            lastCoach = c;
            }
        }

    public void remove() {
        if (firstCoach == null)
        return;
            
        if (firstCoach.getNext() == null) {
            lastCoach = null;
            firstCoach = null;

        }else {
            lastCoach = firstCoach;

            while(lastCoach.getNext().getNext() != null) {
                lastCoach = lastCoach.getNext();
            }
            lastCoach.setNext(null);
        }
    }

    public boolean checkAvailability(int[] passengers){

        if(passengers.length<=size()){
            for (int i = 0; i < passengers.length; i++) {
                if(getCoach(i+1).getNumberOfPassengers()+passengers[i]>50)
                return false;
            }
            return true;
        }
        return false;
    }

    public Coach getCoach(int i){
        if(i>0&&i<=size()){
            Coach current=firstCoach;

            for (int j = 1; j < i; j++) {
                current=current.getNext();
            }
            return current;
        }
        return null;
    }

    public int size(){
        int size=0;

        if(firstCoach!=null){
            Coach current =firstCoach;
            size++;
            
            while(current.getNext()!=null){
                current=current.getNext();
                size++;
            }
        }

        return size;
    }

    public void coupleCoach(Coach coach,int position){
        if(size()+1>=position){

            if(firstCoach==null){
                firstCoach=coach;
                return;
            }

            Coach current =firstCoach;
            
            for (int i = 0; i < position; i++) {
                current=current.getNext();
            }

            coach.setNext(current.getNext());
            current.setNext(coach);

            if(position==size()+1){
                lastCoach=coach;
            }
        }
    }

    public void uncoupleCoach(Coach coach){
        if(firstCoach!=null){
            Coach current =firstCoach;

            while(current!=coach&&current.getNext()!=coach&&current.getNext()!=null){
                current=current.getNext();
            }

            if(current.getNext()==coach){
               if(current.getNext().getNext()!=null){
                current.setNext(current.getNext().getNext());

               }else{
                lastCoach=current;
                current.setNext(null);
               }
            }

            if(current==firstCoach){
                firstCoach=current.getNext();
            }

        }

    }

    @Override
    public  String toString(){
        String s="first --> ";
        
        if(firstCoach!=null){
            Coach current =firstCoach;

            while(current.getNext()!=null){
                s+=current.getNumberOfPassengers()+" --> ";
                current=current.getNext();
            }

            s+=current.getNumberOfPassengers()+" --> null ";
        }

        return s;
    }

    public static void main(String[] args) {
        Train t=new Train();
        Coach z1=new Coach(30),z2=new Coach(10),z3=new Coach(40),z4=new Coach(50),z5=new Coach(45);

        t.append(z1);
        t.append(z2);
        t.append(z3);
        t.append(z4);
        t.append(z5);

        System.out.println(t.toString()); 
        int[] i={20,40,05};
        System.out.println(t.checkAvailability(i)+" should be true"); 
        int[] a={75};
        System.out.println(t.checkAvailability(a)+" should be false"); 
        int[] b={0,0,0,0,0,1};
        System.out.println(t.checkAvailability(b)+" should be false"); 
        int[] c={};
        System.out.println(t.checkAvailability(c)+" should be true"); 
        int[] d={20,40,10,0,5};
        System.out.println(t.checkAvailability(d)+" should be true"); 
        t.uncoupleCoach(z4);
        System.out.println(t.toString()); 



    }
}