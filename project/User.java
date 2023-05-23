abstract class User
{
    protected String Username;
    protected String Password;
    protected Building building;
    protected Room room;

    public User()
    {
        setUsername();
        setPassword();
        setBuilding();
        setRoom();
    }

    protected abstract void setUsername();      
    protected abstract void setPassword();      
    public final String getUsername() {return this.Username;}
    public final String getPassword() {return this.Password;}

    protected abstract void setBuilding();
    protected abstract void setRoom();

    public final void showSelection()
    {
        if (Username == null)   
        {
            System.out.println("You haven't entered your username yet.");
        }

        if (Password == null)   
        {
            System.out.println("You haven't entered your password yet.");
        }

        if (room == null)
        {
            System.out.println("You haven't selected a room yet.");
        }

        if (building == null)
        {
            System.out.println("You haven't selected a building yet.");
        }
        else 
        {
            System.out.println("                       "+room.getName());
            room.showRoom();
            System.out.println("ชั้น  "+room.getFloor());
            System.out.println(room.getBuilding());
            System.out.println("ประเภท  "+room.getDetail());
            System.out.println("นำทางไป"+room.getBuilding()+"  "+room.roomMap);
        }
    }


}