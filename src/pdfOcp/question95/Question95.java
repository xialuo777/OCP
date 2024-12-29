package pdfOcp.question95;

public abstract class Question95 {
    public abstract void checkValue(Object value) throws IllegalArgumentException;

    public boolean isValueNumber(Object val){
        if (val instanceof Number){
            return true;
        }else {
            try {
                Double.parseDouble(val.toString());
                return true;
            }catch (NumberFormatException e){
                return false;
            }
        }
    }
}
