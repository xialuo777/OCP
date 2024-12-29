package pdfOcp.question161;

public interface Question161 {
    public default double tare(String units){
        return toUnit();
    }

    private static double toUnit(){
        return 1;
    }
}
