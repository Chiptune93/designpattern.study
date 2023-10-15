from.condiment import Condiment
from.beverage import Beverage

class Milk(Condiment):
    """
    Concrete Decorator
    """
    def __init__(self, beverage: Beverage):
        super().__init__(beverage)

    def get_cost(self) -> int:
        return super().get_cost() + 200

    def get_description(self) -> str:
        return super().get_description() + ' 우유'