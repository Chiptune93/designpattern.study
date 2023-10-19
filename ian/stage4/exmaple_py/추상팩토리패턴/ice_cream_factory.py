from abc import ABCMeta, abstractmethod
from ice_cream import CookieAndCream, NewYorkCheeseCake
from cup import WaffleCone, WaffleCup


class IceCreamFactory(metaclass=ABCMeta):
    @abstractmethod
    def create_ice_cream(self):
        pass

    @abstractmethod
    def create_cup(self):
        pass


# ConcreateFactory
class Haagendazs(IceCreamFactory):
    def create_ice_cream(self):
        return CookieAndCream().ice_cream()

    def create_cup(self):
        return WaffleCone().cup()


class baskinrobbins(IceCreamFactory):
    def create_ice_cream(self):
        return NewYorkCheeseCake().ice_cream()

    def create_cup(self):
        return WaffleCup().cup()
