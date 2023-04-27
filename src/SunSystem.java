package src;


public enum SunSystem {
    Mercury(0, 50,2440,"Venus",null),
    Venus(1, 42,6052,"Earth",Mercury),
    Earth(2,78,6371,"Mars",Venus),
    Mars(3,550,3390,"Jupiter",Earth),
    Jupiter(4,651,69911,"Saturn",Mars),
    Saturn(5,1446,58232,"Uranus",Jupiter),
    Uranus(6,1622,25362,"Neptune",Saturn),
    Neptune(7,0,15299,"null",Uranus);

    private final int orderNumber;
    private final int distanceToNextPlanet;
    private final int radiusOfPlanet;
    private final String nextPlanet;
    private final int distanceToSun;
    private final SunSystem previousPlanet;


    SunSystem(int orderNumber, int distanceToNextPlanet, int radiusOfPlanet, String nextPlanet,SunSystem previousPlanet){


        this.orderNumber = orderNumber;
        this.distanceToNextPlanet = distanceToNextPlanet;
        this.radiusOfPlanet = radiusOfPlanet;
        this.nextPlanet  = nextPlanet;
        this.previousPlanet = previousPlanet;


        int distanceFromSunToFirstPlanet = 58;

        if (orderNumber==0){
            this.distanceToSun = distanceFromSunToFirstPlanet;
        } else {
            this.distanceToSun =previousPlanet.getDistanceToSun()+ previousPlanet.distanceToNextPlanet;
        }
    }

    public int getDistanceToNextPlanet() {
        return distanceToNextPlanet;
    }

    public int getDistanceToSun() {
        return distanceToSun;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public int getRadiusOfPlanet() {
        return radiusOfPlanet;
    }

    public String getNextPlanet() {
        return nextPlanet;
    }
    public SunSystem getPreviousPlanet() {
        return previousPlanet;
    }

}
