/**
 * Created by abran on 08.11.2016.
 */
public class Rodent
{
    public String name="Rodent";
    public double weight,height;
    public int gender; // gender: 1 for male and 0 for female
    public int age;
    public int lifeExpect;

    public Rodent()
    {
        weight=height=(double)0;
        gender=1;
        age=0;
        lifeExpect=0;
    }

    public Rodent(double weight,double height,int gender,int age,int lifeExpect)
    {
        this.weight=weight;
        this.height=height;
        this.gender=gender;
        this.age=age;
        this.lifeExpect=lifeExpect;
    }

    public void foodPrint()
    {
        System.out.println("The rodent eats, in general grains.");
    }

    public void getDetails()
    {
        System.out.println("Name: "+ name);
        System.out.println("Weight "+ weight);
        System.out.println("Height  "+ height);
        if (gender==1)
        {
            System.out.println("Gender: male");
        }
        else
        {
            System.out.println("Gender: female");
        }
        System.out.println("Age: "+ age);
        System.out.println("Life Expectation: "+ lifeExpect);
    }
}
