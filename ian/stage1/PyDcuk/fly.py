from abc import abstractmethod, ABCMeta


class FlyBehavior(metaclass=ABCMeta):
    @abstractmethod
    def do(self):
        pass


class Fly(FlyBehavior):
    def do(self):
        print("나는 날어")


class NoFly(FlyBehavior):
    def do(self):
        print("나는 못날어")


class CryingContext:
    def __init__(self):
        self.__fly_strategy = None

    def do(self):
        self.__fly_strategy.do()

    @property
    def fly_strategy(self):
        return self.__fly_strategy

    @fly_strategy.setter
    def fly_strategy(self, strategy):
        self.__fly_strategy = strategy