import javax.sound.midi.SysexMessage;

public class Main {

    public static void main(String[] args)
    {
        SpiralMatrix a=new SpiralMatrix();

        /**CHECK YOURSELF METHOD*/
        /*a.fillMatrix(41);
         a.getRatio();*/




       /**AUTO-CHECK METHOD*/
        int i=690;
        a.fillMatrix(i);
        while (a.getRatioInt() >=10)
        {
            i++;
            a=null;
            a=new SpiralMatrix();
            a.fillMatrix(i);
            System.out.println("Checking for i="+i+" ..............");
        }
        System.out.println();
        System.out.println("THE ANSWER IS >>>>>>> "+ i);


    }
}
