public class MiembroToken {
    /* @brief       Classic java main, starting execution
     * @param       arg[0] = [id]
     * @param       arg[1] = [puerto]
     * @param       arg[2] = [isFirst]
     * @param       arg[3] = [isLast]
     */
    private static int id;
    private static int selfPort;
    private static boolean isFirst;
    private static boolean isLast;
    
    private static boolean hasToken;
    

// java MiembroToken.java id puerto isFirst isLast
    public static void main(String[] args) { 
        // Control cantidad params
        if (args.length != 4) {
            System.out.println("Parámetros incorrectos");
        } else {
            // Id [0]
            if (!args[0].equals("1") && !args[0].equals("2") && !args[0].equals("3")) {
                System.out.println("Id incorrecta");
                System.exit(-1);
            } else {
                id = Integer.parseInt(args[0]);
            }
            
            // puerto
            selfPort = Integer.parseInt(args[1]);//Control de errores del puerto posterior
            
            // Token inicio
            if (!args[2].equals("yes") && !args[2].equals("no")) {
                System.out.println("Valor erróneo parámetro 3");
                System.exit(-1);
            } else {
                if(args[2].equals("yes")){
                    isFirst=true;
                }else{
                    isFirst=false;
                }
            }
            // Token final
            if (!args[3].equals("yes") && !args[3].equals("no")) {
                System.out.println("Valor erróneo parámetro 4");
                System.exit(-1);
            } else {
                if(args[3].equals("yes")){
                    isLast=true;
                }else{
                    isLast=false;
                }
            }
        }
        
        // Una vez se hayan evaluado los parametros y establecido los atributos
        // evaluamos los atributos para realizar las ejecuciones acorde a los parametros
        // introducidos
        
        
        
        
        
        
        
        
        
        
        
    } // End of main()
} // End of class