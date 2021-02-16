// While more effort is required to create these utility classes, creating them encourages a bit more design effort than just using a map, which can be a good thing. In this case, I realized that a bulk package is composed of a number of individual units, so I created the Pack class:

class Pack {
    private Unit unit;
    private int count;

    public Pack(String item, String brand, int unitCount, int packPrice) {
        this.unit = new Unit(item, brand, unitCount > 0 ? packPrice / unitCount : 0);
        this.count = unitCount;
    }

    public String getItem() { return unit.getItem(); }
    public String getBrand() { return unit.getBrand(); }
    public int getUnitPrice() { return unit.getPrice(); }
    public int getUnitCount() { return count; }
    public List<Unit> unpack() { return Collections.nCopies(count, unit); }


    @Override
    public String toString() { return String.format("item: %s brand: %s unitCount: %d unitPrice: %d",unit.getItem(),unit.getBrand(),count,unit.getPrice()); }
}

// OK! Time to move on and solve the problem. First, declare the purchased packs:

var packs = new Bought[] {
    new Bought(new Pack("Rice","Best Family",10,5650),1),
    new Bought(new Pack("Spaghetti","Best Family",1,327),10),
    new Bought(new Pack("Sardines","Fresh Caught",3,2727),3),
    new Bought(new Pack("Chickpeas","Southern Style",2,2600),5),
    new Bought(new Pack("Lentils","Southern Style",2,2378),5),
    new Bought(new Pack("Vegetable oil","Crafco",12,10020),1),
    new Bought(new Pack("UHT milk","Atlantic",6,4560),2),
    new Bought(new Pack("Flour","Neighbor Mills",10,5200),1),
    new Bought(new Pack("Tomato sauce","Best Family",1,190),10),
    new Bought(new Pack("Sugar","Good Price",1,565),10),
    new Bought(new Pack("Tea","Superior",5,2720),2),
    new Bought(new Pack("Coffee","Colombia Select",2,4180),5),
    new Bought(new Pack("Tofu","Gourmet Choice",1,1580),10),
    new Bought(new Pack("Bleach","Blanchite",5,3550),2),
    new Bought(new Pack("Soap","Sunny Day",6,1794),2)
};

// As in the Groovy and Java solutions, the final step is repacking the units into the hampers for distribution. Here's the code—it's not much wordier than the Groovy version (tiresome semicolons aside) nor really all that different:

var valueIdeal = 5000;
        var valueMax = Math.round(valueIdeal * 1.1);
        var rnd = new Random();
        var hamperNumber = 0;                         // [1]

        while (units.size() > 0) {                    // [2]
            hamperNumber++;
            var hamper = new ArrayList<Unit>();
            var value = 0;                            // [2.1]
            for (boolean canAdd = true; canAdd; ) {   // [2.2]
                var u = rnd.nextInt(units.size());            // [2.2.1]
                canAdd = false;                               // [2.2.2]
                for (int o = 0; o < units.size(); o++) {      // [2.2.3]
                    var uo = (u + o) % units.size();
                    var unit = units.get(uo);                      // [2.2.3.1]
                    if (units.size() < 3 ||
                            !hamper.contains(unit) &&
                            (value + unit.getPrice()) < valueMax) { // [2.2.3.2]
                        hamper.add(unit);
                        value += unit.getPrice();
                        units.remove(uo);                           // [2.2.3.3]
                        canAdd = units.size() > 0;
                        break;                                      // [2.2.3.4]
                    }
                }
            }                                                // [2.2.4]
            System.out.println();
            System.out.printf("Hamper %d value %d:\n",hamperNumber,value);
            hamper.forEach(unit -> {
                System.out.printf("%-25s%-25s%7d\n", unit.getItem(), unit.getBrand(),
                    unit.getPrice());
            });                                                      // [2.3]
            System.out.printf("Remaining units %d\n",units.size());  // [2.4]