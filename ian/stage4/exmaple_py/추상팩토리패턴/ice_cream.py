from abc import ABCMeta, abstractmethod


class IceCream(metaclass=ABCMeta):
    @abstractmethod
    def ice_cream(self):
        pass


class CookieAndCream(IceCream):
    def ice_cream(self):
        return "쿠키 크림 맛 아이스크림 !!"


class NewYorkCheeseCake(IceCream):
    def ice_cream(self):
        return "뉴욕 치크 크림 맛 !1"
