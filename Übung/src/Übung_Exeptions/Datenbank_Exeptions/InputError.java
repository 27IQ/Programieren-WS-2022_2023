package Übung_Exeptions.Datenbank_Exeptions;

public class InputError extends Exception{
    public InputError(){
        super();
    }

    public InputError(String error){
        super(error);
    }
}
