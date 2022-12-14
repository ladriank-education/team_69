/**
 * @file MiembroToken.java
 *
 * @brief Solución para la actividad evaluable de la UA3.
 * @date 14/12/2022
 * @author Nombre Apellidos Miembro 1 - github@email (dev_A)
 * @author Nombre Apellidos Miembro 2 - github@email (dev_B)
 * @author Nombre Apellidos Miembro 3 - github@email (dev_C)
 * @author Nombre Apellidos Miembro 4 - github@email (dev_D)
 *
 * @note ¡Pero qué diablos!
 * @note
 * https://docs.google.com/presentation/d/e/2PACX-1vQzxbSl2IXLxelLggksAWEQd2tDT-5sNqETQCpIHCnNBqjoSmbvlJdCcOfu_rjQLz_BN6lsoOjimqSO/pub?start=false&loop=false&delayms=3000
 */

/*
* @class    MiembroToken
* @brief    Clase para simular el comportamiento de una red token ring
*
* @todo FR1 [5 puntos]: Implementa la clase MiembroToken con la funcionalidad descrita previamente. Para comprobar la correcta ejecución del sistema, la clase MiembroToken debe imprimir por pantalla la suficiente información para ver el estado de cada Miembro de la red.
* @todo FR2 [2,5 puntos]: Mejora la clase MiembroToken para poder ejecutar su funcionalidad, en este caso, dormir una cantidad de tiempo determinada, como un hilo.
* @todo FR4 [1 punto]: Mejora la clase MiembroToken para crear una red token ring de anillo doble, es decir, se puede tener otro token en otro anillo virtual, en sentido contrario.
 */
public class MiembroToken {

    /* @brief       Classic java main, starting execution
     * @param       arg[0] = [id]
     * @param       arg[1] = [puerto]
     * @param       arg[2] = [token_al_inicio]
     * @param       arg[3] = [soy_el_ultimo]
     */
    private static int id;
    private static String port;
    private static boolean token_al_inicio;
    private static boolean soy_el_ultimo;

    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Parámetros incorrectos");
        } else {
            if (args[1].equals("1") == false && args[1].equals("2") == false && args[1].equals("3") == false) {
                System.out.println("Id incorrecta");
                System.exit(-1);
            } else {
                id = Integer.parseInt(args[1]);
            }
            
            port = args[2];//Control de errores del puerto posterior
            
            if (args[3].equals("yes") == false && args[3].equals("no")) {
                System.out.println("Valor erróneo parámetro 3");
                System.exit(-1);
            } else {
                if(args[3].equals("yes")){
                    token_al_inicio=true;
                }else{
                    token_al_inicio=false;
                }
            }
            
            if (args[4].equals("yes") == false && args[4].equals("no")) {
                System.out.println("Valor erróneo parámetro 4");
                System.exit(-1);
            } else {
                if(args[4].equals("yes")){
                    soy_el_ultimo=true;
                }else{
                    soy_el_ultimo=false;
                }
            }
            
            
        }
    } // End of main()

} // End of class
