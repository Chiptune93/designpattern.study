from abc import abstractmethod
from .beverage import Beverage
class Condiment(Beverage):
    def __init__(self, beverage: Beverage):
        self.__beverage = beverage

    @abstractmethod
    def get_cost(self) -> int:
        return self.__beverage.get_cost()

    @abstractmethod
    def get_description(self) -> str:
        return self.__beverage.get_description()