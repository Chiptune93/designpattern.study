from abc import ABCMeta, abstractmethod
class Beverage(metaclass=ABCMeta):
    @abstractmethod
    def get_cost(self) -> int:
        pass

    @abstractmethod
    def get_description(self) -> str:
        pass