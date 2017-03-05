import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.UUID;

/**
 * Created by abran on 22.11.2016.
 */
public abstract class Employee implements Employee_I
{
    private final UUID employeeID;
    private String name;
    private String address;
    private boolean atWork;

    public Employee()
    {
        employeeID=UniqueID.getID();
        this.name="DEFAULT";
        this.address="DEFAULT";
        this.atWork=false;
    }

    public Employee(String name,String address,boolean atWork)
    {
        employeeID=UniqueID.getID();
        this.atWork=atWork;
        this.address=address;
        this.name=name;
    }

    public void logIn(UUID userId)
    {
        System.out.println("USER: " + userId + " successfully loged in!");
    }

    @Override
    public abstract void viewClasses();

    public void leaveWorkplace()
    {
        if (atWork)
        {
            System.out.println(name + " has left work!");
        }
        else
        {
            System.out.println(name + " not at work!");
        }
    }

    public void enterWorkplace()
    {
        if (!atWork)
        {
            System.out.println(name + " came to work!");
        }
        else
        {
            System.out.println(name + " already at work!");
        }
    }

    public String getName()
    {
        return name;
    }

    public String getAddress()
    {
        return address;
    }

}
