import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by abran on 22.11.2016.
 */
public class UniqueID {
  /*  private static UUID uid;
    private static ArrayList<UUID> uidlist = null;*/
/*
    private static boolean exists(UUID uid)
    {
        for (UUID u:uidlist
             ) {
            if (u.equals(uid))
            {
                return true;
            }

        }
        return false;
    }*/

    public static UUID getID()
    {
        /*uid=UUID.randomUUID();
        while(exists(uid))
        {
            uid=UUID.randomUUID();
        }
        uidlist.add(uid);
        return uid;*/
        return UUID.randomUUID();
    }

}
