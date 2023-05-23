public class Tester extends User {
    
    @Override
    protected void setUsername() {
        super.Username =  "63050067@kmitl.ac.th";
    }

    @Override
    protected void setPassword() {
        super.Password =  "12345678";
    }

    
    @Override
    protected void setBuilding() {
        Building building = new PhraChomKlao();
        super.building = building;
    }

    @Override
    protected void setRoom() {
        Room room = new PhraChomKlao_322();
        super.room = room;
    }
}
