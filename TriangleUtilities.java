 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String output = "";
        for(int i = 0;i < numberOfStars;i++){
            output= output +"*";
        }
        return output;
    }
    
    public static String getTriangle(int numberOfRows) {
        String output= "";
        
        for(int i = 0;i < numberOfRows;i++){
            for (int j = 0; j<=i;j++){
             output= output +"*";
            }
            output = output + '\n';
        }
        //System.out.println("start" + output + "end");
        return output;
    }


    public static String getSmallTriangle() {
           String output= "";

       for(int i = 0;i < 4;i++){
            for (int j = 0; j<=i;j++){
             output= output +"*";
            }
            output = output + '\n';
        }
        return output;
    }

      
    

    public static String getLargeTriangle() {
        String output= "";
        for(int i=0;i < 9; i++){
               for(int j=0;j<=i;j++){
                output = output + "*";
                }
                output = output + '\n';
            }
        
        return output;
    }
    }
