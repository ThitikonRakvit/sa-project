abstract class Building
{
    protected String buildingName;
    protected String buildingDetail;
    protected String buildingMap;

    public String getName() { return buildingDetail; }
    public String getMap() { return buildingMap; }
}

class PhraChomKlao extends Building
{
    public PhraChomKlao()
    {
        buildingName = "phraChomKlao";
        buildingDetail = "อาคารพระจอมเกล้า";
        buildingMap = "https://goo.gl/maps/ZpFFRdjg8y3qfyT56";
    }
}

class Chulabhorn extends Building
{
    public Chulabhorn()
    {
        buildingName = "chulabhorn";
        buildingDetail = "อาคารจุฬาภรณฯ";
        buildingMap = "https://goo.gl/maps/dpP5YBywFVVW1RBo8";
    }
}