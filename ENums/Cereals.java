package ENums;

public enum Cereals {
    CAPTAIN_CRUNCH(50, 260.00),
    FROOT_LOOPS(60, 255.00),
    REESES_PUFFS(100, 300.00),
    COCOA_PUFFS(75, 180.00),
    CHOCHOS(65, 200.00),
    KELOGGS(55, 175.00);

    final int levelOfDeliciousness;
    final double priceInRupees;
    Cereals (int levelOfDeliciousness, double priceInRupees) {
        this.levelOfDeliciousness = levelOfDeliciousness ;
        this.priceInRupees = priceInRupees;
    }
}
