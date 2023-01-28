package Übung_Exeptions.Datenbank_Exeptions;

public class LagerError extends Exception {
	public LagerError(){
        super();
    }

    public LagerError(String Error){
        super(Error);
    }
}