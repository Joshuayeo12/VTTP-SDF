package calc;

import java.io.Console;

public class CalculatorMark2 {

   public static void main(String[] args) {


      //Constant
      public static final int CMD_POS = 0;


      // declare an accumulator
      float acc = 0;
      float value = 0;


      boolean stop = false;

      Console cons = System.console();

      while (!stop) {

         // Read a line and trim it
         String cmd = cons.readLine("CMD> ").trim();

         switch (cmd) {
            // ADD 5 6 7 9
            case "ADD":
               cmd = cons.readLine("VAL> ").trim();
               value = Float.parseFloat(cmd);
               acc += value;
               break;

            // SUB 5 6 7 9
            case "SUB":
               cmd = cons.readLine("VAL> ").trim();
               value = Float.parseFloat(cmd);
               acc -= value;
               break;

            // MUL 5 6 7 9
            case "MUL":
               cmd = cons.readLine("VAL> ").trim();
               value = Float.parseFloat(cmd);
               acc *= value;
               break;

            // DIV 4
            case "DIV":
               cmd = cons.readLine("VAL> ").trim();
               value = Float.parseFloat(cmd);
               acc /= value;
               break;

            // initializes the accumulator to 0
            case "INIT":
               acc = 0;
               break;

            case "BRK":
               stop = true;
               break;

            case "SHOW":
               System.out.printf("> .3f\n", acc);
               break;

            default:

         }

      }

   }

}
