from.beverage import Beverage

class Espresso(Beverage):

    def get_cost(self) -> int:
        return 900

    def get_description(self) -> str:
        return '에소프레소'