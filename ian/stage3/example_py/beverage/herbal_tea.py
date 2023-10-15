from .beverage import Beverage

class HerbalTea(Beverage):
    def get_cost(self) -> int:
        return 4000

    def get_description(self) -> str:
        return '허브티'
