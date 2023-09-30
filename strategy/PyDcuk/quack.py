from abc import abstractmethod, ABCMeta

class QuackBehavior(metaclass=ABCMeta):
    @abstractmethod
    def cry(self):
        pass


class Quack(QuackBehavior):
    def cry(self):
        print("꽥!!")


class MuteQuack(QuackBehavior):
    def cry(self):
        print("")


class Squack(QuackBehavior):
    def cry(self):
        print("삑")


class CryingContext:
    def __init__(self):
        self.__sound_strategy = None

    def cry(self):
        self.__sound_strategy.cry()

    @property
    def sound_strategy(self):
        return self.__sound_strategy

    @sound_strategy.setter
    def sound_strategy(self, strategy):
        self.__sound_strategy = strategy