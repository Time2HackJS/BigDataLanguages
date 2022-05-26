public class Robot {
    private Leg legLeft;
    private Leg legRight;

    private Boolean lastLegLeft;

    public Robot() {
        this.legLeft = new Leg("Левая");
        this.legRight = new Leg("Правая");

        this.legLeft.start();
        this.legRight.start();

        this.lastLegLeft = null;
    }

    public void walk(String leg) {
        if (lastLegLeft == null) {
            switch (leg) {
                case "left":
                    this.legLeft.makeStep();
                    this.lastLegLeft = true;
                break;
            
                case "right":
                    this.legRight.makeStep();
                    this.lastLegLeft = false;
                break;

                default:
                    System.out.println("У робота нет такой ноги");
                break;
            }
        }
        else {
            if (leg.equals("left") && this.lastLegLeft == false) {
                this.legLeft.makeStep();
                this.lastLegLeft = true;
            }
            else if (leg.equals("right") && this.lastLegLeft == true) {
                this.legRight.makeStep();
                this.lastLegLeft = false;
            }
            else if (leg.equals("left") || leg.equals("right")) {
                System.out.println("Данная нога сделала шаг в прошлый раз");
            }
            else {
                System.out.println("У робота нет такой ноги");
            }
        }
    }

    public void stop() {
        this.legLeft.stopLeg();
        this.legRight.stopLeg();
    }
}
