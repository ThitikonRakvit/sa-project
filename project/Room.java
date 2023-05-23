abstract class Room
{
    protected String roomName;
    protected String roomDetail;
    protected String roomMap;
    protected String buildingName;
    protected Building building;
    protected int floor;

    public String getName() { return roomName; }
    public String getDetail() { return roomDetail; }
    public String getBuilding() { return buildingName; }
    public int getFloor() { return floor; }
    public abstract void showRoom();
}

class PhraChomKlao_321 extends Room
{
    public PhraChomKlao_321()
    {
        roomName = "พระจอมเกล้า 321";
        roomDetail = "ห้องบรรยาย";
        building = new PhraChomKlao();
        roomMap = building.getMap();
        floor = 3;
    }
    @Override
    public void showRoom(){
        System.out.println("     ___________________________________________________");
        System.out.println("     |         |---------|         |         |         |");
        System.out.println("     |         |---------|         |         |         |");
        System.out.println("     |         |---321---|   320   |   319   |   318   |");
        System.out.println("     |         |---------|         |         |         |");
        System.out.println("     |   322   |_________|_________|_________|_________|");
        System.out.println("     |         |                             |         |");
        System.out.println("     |         |                             |         |");
        System.out.println("  |-||         |       _______________       |         |");
        System.out.println("  |-||_________|      |               |      |         |");
        System.out.println("  |-||         |      |               |      |   317   |");
        System.out.println("  |-||   ลิฟต์   |      |               |      |         |");
        System.out.println("  |-||_________|      |_______________|      |         |");
        System.out.println("  |                                          |         |");
        System.out.println("  |                                          |         |");
        System.out.println("  |__________       __________________       |_________|");
        System.out.println("  |         |       |         |      |       |         |");
        System.out.println("  |         |       |         |      |       |         |");
        System.out.println("  |  ห้องน้ำ  |       |   313   |      |       |   316   |");
        System.out.println("  |         |       |         |      |       |         |");
        System.out.println("  |_________|       |_________|      |       |_________|");
        System.out.println("  |         |       |         |      |       |         |");
        System.out.println("  |         |       |         |      |       |         |");
        System.out.println("  |   312   |       |   314   |      |       |   315   |");
        System.out.println("  |         |       |         |      |       |         |");
        System.out.println("  |_________|       |_________|      |_______|_________|");
        System.out.println("            |-|-|-|-|");
    }

    @Override
    public String getBuilding(){
        return building.getName();   
    }
}

class PhraChomKlao_322 extends Room
{
    public PhraChomKlao_322()
    {
        roomName = "พระจอมเกล้า 322";
        roomDetail = "ห้องบรรยาย";
        building = new PhraChomKlao();
        roomMap = building.getMap();
        floor = 3;
    }

    @Override
    public void showRoom(){
        System.out.println("     ___________________________________________________");
        System.out.println("     |---------|         |         |         |         |");
        System.out.println("     |---------|         |         |         |         |");
        System.out.println("     |---------|   321   |   320   |   319   |   318   |");
        System.out.println("     |---------|         |         |         |         |");
        System.out.println("     |---322---|_________|_________|_________|_________|");
        System.out.println("     |---------|                             |         |");
        System.out.println("     |---------|                             |         |");
        System.out.println("  |-||---------|       _______________       |         |");
        System.out.println("  |-||_________|      |               |      |         |");
        System.out.println("  |-||         |      |               |      |   317   |");
        System.out.println("  |-||   ลิฟต์   |      |               |      |         |");
        System.out.println("  |-||_________|      |_______________|      |         |");
        System.out.println("  |                                          |         |");
        System.out.println("  |                                          |         |");
        System.out.println("  |__________       __________________       |_________|");
        System.out.println("  |         |       |         |      |       |         |");
        System.out.println("  |         |       |         |      |       |         |");
        System.out.println("  |  ห้องน้ำ  |       |   313   |      |       |   316   |");
        System.out.println("  |         |       |         |      |       |         |");
        System.out.println("  |_________|       |_________|      |       |_________|");
        System.out.println("  |         |       |         |      |       |         |");
        System.out.println("  |         |       |         |      |       |         |");
        System.out.println("  |   312   |       |   314   |      |       |   315   |");
        System.out.println("  |         |       |         |      |       |         |");
        System.out.println("  |_________|       |_________|      |_______|_________|");
        System.out.println("            |-|-|-|-|");
    }

    @Override
    public String getBuilding(){
        return building.getName();   
    }
}

class Chulabhorn_601_2 extends Room
{
    public Chulabhorn_601_2()
    {
        roomName = "จุฬาภรณฯ 601/2";
        roomDetail = "ห้องบรรยาย";
        building = new Chulabhorn();
        roomMap = building.getMap();
        floor = 6;
    }

    @Override
    public void showRoom(){

    }

    @Override
    public String getBuilding(){
        return building.getName();   
    }
}