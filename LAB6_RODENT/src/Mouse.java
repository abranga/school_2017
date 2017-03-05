/**
 * Created by abran on 08.11.2016.
 */
public class Mouse extends Rodent
{


    public Mouse()
    {
        super();
        name="Mouse";
    }

    public Mouse(double weighta,double heighta,int gendera,int agea,int lifeExpecta)
    {
        super(weighta,heighta,gendera,agea,lifeExpecta);
        name="Mouse";
    }

    public void foodPrint()
    {
        System.out.println("The mouse eats, in general grains and also eats some kinds of meat.");
    }



}
